package org.tura.metamodel.commons;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.epsilon.egl.EglTemplate;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.tura.metamodel.commons.preferences.IPreferenceConstants;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeDataControl;

import artifact.GenerationHintWithNickName;
import artifact.TechLeaf;
import form.ArtificialField;
import form.DataControl;
import form.Form;
import form.Table;
import form.Tree;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import mapper.Mapper;
import mapper.PackageMapper;
import mapper.TypeMapper;
import recipe.Ingredient;
import recipe.MappingTecnologiy;
import recipe.ModelMapper;
import recipe.Query;
import recipe.QueryVariable;
import type.Attribute;
import type.Link;
import type.TypeElement;
import type.TypeGroup;

public class Util {
	public static String bracketRemover(String str) {
		if (str.length() < 2)
			return str;

		if ("#{".equals(str.substring(0, 2))) {
			str = str.substring(2);
			str = str.substring(0, str.length() - 1);
		}
		return str;
	}

	public static String apostropheRemover(String str) {
		if (str.length() < 1)
			return str;

		if ("'".equals(str.substring(0, 1))) {
			str = str.substring(1);
			str = str.substring(0, str.length() - 1);
		}
		return str;

	}

	public static TypeElement getBase(DataControl dc) {
		if (dc.getBaseType() != null){
		    return dc.getBaseType().getTypeRef();
		}
		return null;
	}

	public static boolean ifDataControlIsTreeRoot(DataControl dc,DiagramImpl diagram) throws Exception {

		QueryHelper helper = new QueryHelper();
		Form frm = helper.getForm(diagram);
		for (TreeDataControl tdc : helper.findTreeRootControls(frm)) {
			if (tdc.getDc().equals(dc)) {
				return true;
			}
		}

		return false;

	}

	public static boolean ifDataControlIsTreeRoot(DataControl dc)
			throws Exception {
		QueryHelper helper = new QueryHelper();
		Form frm = helper.getForm(dc);
		for (TreeDataControl tdc : helper.findTreeRootControls(frm)) {
			if (tdc.getDc().equals(dc)) {
				return true;
			}
		}
		return false;
	}

	public boolean ifInternalElement(EObject element) {

		EObject top = element.eContainer();
		if (top == null)
			return false;
		if (top instanceof Table)
			return true;
		if (top instanceof Tree)
			return true;

		return ifInternalElement(top);

	}

	public static void move(String src, String dst) throws IOException {
		Path srcPath = FileSystems.getDefault().getPath(src);
		Path dstPath = FileSystems.getDefault().getPath(dst);

		Files.move(srcPath, dstPath, REPLACE_EXISTING);

	}

	public static boolean mapperRecognizer(Set<Mapper> mappers,Ingredient ingredient) {

		for (Mapper mapper : mappers) {

			int ui = mapper.isUiLayer() ? 1 : 0;
			int s = mapper.isServiceLayer() ? 1 : 0;
			int ingr = ingredient.getLayer().getValue();

			if ((((ui << 1) + s) & ingr) != 0)
				return true;
		}
		return false;
	}

	public static TypeMapper mapType(Set<TypeMapper> mappers,Ingredient ingredient, TypeElement typeElement)
			throws Exception {

		for (TypeMapper mapper : mappers) {

			int ui = mapper.isUiLayer() ? 1 : 0;
			int s = mapper.isServiceLayer() ? 1 : 0;
			int ingr = ingredient.getLayer().getValue();

			if (((((ui << 1) + s) & ingr) != 0)
					&& (mapper.getTypeRef().getUid() == typeElement.getUid())) {
				return mapper;
			}
		}
		return null;
	}

	public static PackageMapper mapPackage(Set<PackageMapper> mappers,Ingredient ingredient, TypeGroup pkg)
			throws Exception {

		for (PackageMapper mapper : mappers) {

			int ui = mapper.isUiLayer() ? 1 : 0;
			int s = mapper.isServiceLayer() ? 1 : 0;
			int ingr = ingredient.getLayer().getValue();

			if (((((ui << 1) + s) & ingr) != 0)
					&& (mapper.getPackageRef().getUid() == pkg.getUid())) {
				return mapper;
			}
		}
		return null;
	}

	
	
	
	public static Object runQuery(Query query, EObject eobj)
			throws Exception {
		String strQuery = query.getQueryRef().getQuery();
		for (QueryVariable var : query.getVariables()) {
			strQuery = strQuery.replaceAll("\\$\\{"
					+ var.getQueryParamRef().getName() + "\\}", var.getValue());
		}
		
		ModelMapper mapper = (ModelMapper) query.eContainer();
		
		for (   GenerationHintWithNickName hintRef : mapper.getArtifactRef().getHints()){
			strQuery = strQuery.replaceAll("\\@\\{"
					+ hintRef.getName() + "\\}", hintRef.getHint().getUid());
		}
		traceIfDebug("Query", strQuery);
		return executeQuery(strQuery, eobj);
	}

	public static void traceIfDebug(String type, String str) {
		IEclipsePreferences pref = InstanceScope.INSTANCE
				.getNode("org.tura.metamodel.commons.preferences");

		if ("true".equals(pref.get(IPreferenceConstants.DEBUGING, "false"))) {
			LogUtil.logInfo(type + " : " + str);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List<?> runQuery(ModelMapper mapper, String queryName,EObject eobj) throws Exception {
		ArrayList result = new ArrayList<>();
		for (Query query  : mapper.getQueries()) {
			if (query.getQueryRef().getName().equals(queryName)) {
				Collection<?> ls = (Collection<?>) runQuery(query, eobj);
				result.addAll(ls);
			}
		}

		return result;

	}

	private static Object executeQuery(String strQuery, EObject eobj)
			throws Exception {

		Object obj = new QueryHelper().executeQuery(strQuery, eobj);

		return obj;
	}

	public static String mergeAndCapitalize(String name) {
		String[] ls = StringUtils.split(name, " ");
		for (int i = 0; i < ls.length; i++) {
			ls[i] = StringUtils.capitalize(ls[i]);
		}
		return StringUtils.join(ls);
	}

	public static String mergeAndUnCapitalize(String name) {
		String[] ls = StringUtils.split(name, " ");
		for (int i = 0; i < ls.length; i++) {
			ls[i] = StringUtils.capitalize(ls[i]);
		}
		return StringUtils.uncapitalize(StringUtils.join(ls));
	}

	public static String dashmergeAndUnCapitalize(String name) {
		String[] ls = StringUtils.split(name, " ");
		for (int i = 0; i < ls.length; i++) {
			ls[i] = ls[i].toLowerCase();
		}
		return StringUtils.join(ls, '-');
	}

	public ArtificialContextValue createArtificialContextValue(DataControl dc, DataControl root, Object obj)
			throws Exception {

		if (ifDataControlIsTreeRoot(root)) {
			return createTreeControlAccess(dc, obj);
		} else {
			return createControlAccess(dc, obj);
		}
	}

	private ArtificialContextValue createTreeControlAccess(DataControl dc, Object obj) throws Exception {
		if (obj == null)
			return createTreeControlAccess(dc);

		if (obj instanceof Link)
			return createTreeControlAccess(dc, (Link) obj);

		if (obj instanceof Attribute)
			return createTreeControlAccess(dc, (Attribute) obj);

		throw new Exception("Method createTreeControlAccess for parameter "
				+ obj.getClass().getName() + " is not implemented");
	}

	private ArtificialContextValue createControlAccess(DataControl dc,Object obj) throws Exception {
		if (obj == null)
			return createControlAccess(dc);
		if (obj instanceof Attribute)
			return createControlAccess(dc, (Attribute) obj);
		if ( obj instanceof ArtificialField )
			return createControlAccess(dc, (ArtificialField) obj);
		

		throw new Exception("Method createControlAccess for parameter "
				+ obj.getClass().getName() + " is not implemented");
	}

	private ArtificialContextValue createTreeControlAccess(DataControl dc, Attribute attr) {

		ArtificialContextValue cv = createTreeControlAccess(dc);

		cv.setValue(cv.getValue() + ".currentObject." + attr.getName());

		ArtificialExpressionPart ex = new ArtificialExpressionPart();
		ex.setOrder(3);
		ex.setExpressionType("DataControlFakeMethod");
		cv.getExpression().add(ex);

		ex = new ArtificialExpressionPart();
		ex.setOrder(4);
		ex.setExpressionType("ExtendedType");
		cv.getExpression().add(ex);

		ex = new ArtificialExpressionPart();
		ex.setOrder(5);
		ex.setObjRef(attr);
		ex.setExpressionType("AttributeImpl");
		cv.getExpression().add(ex);

		return cv;

	}

	private ArtificialContextValue createTreeControlAccess(DataControl dc, Link lnk) {
		ArtificialContextValue cv = createTreeControlAccess(dc);

		cv.setValue(cv.getValue() + ".currentObject." + lnk.getMasterField());

		ArtificialExpressionPart ex = new ArtificialExpressionPart();
		ex.setOrder(3);
		ex.setExpressionType("DataControlFakeMethod");
		cv.getExpression().add(ex);

		ex = new ArtificialExpressionPart();
		ex.setOrder(4);
		ex.setExpressionType("ExtendedType");
		cv.getExpression().add(ex);

		ex = new ArtificialExpressionPart();
		ex.setOrder(5);
		ex.setObjRef(lnk.getMasterField());
		ex.setExpressionType("AttributeImpl");
		cv.getExpression().add(ex);

		return cv;

	}

	private ArtificialContextValue createTreeControlAccess(DataControl dc) {
		ArtificialContextValue cv = new ArtificialContextValue();
		cv.setValue("Tree data controls.TreeControl."
				+ mergeAndCapitalize(dc.getName()));

		ArtificialExpressionPart ex = new ArtificialExpressionPart();
		ex.setOrder(0);
		ex.setExpressionType("TreeRootDataControlHolder");
		cv.getExpression().add(ex);

		ex = new ArtificialExpressionPart();
		ex.setOrder(1);
		ex.setExpressionType("TreeDataControl");
		cv.getExpression().add(ex);

		ex = new ArtificialExpressionPart();
		ex.setOrder(2);
		ex.setExpressionType("DataControlImpl");
		ex.setObjRef(dc);
		cv.getExpression().add(ex);

		return cv;
	}

	private ArtificialContextValue createControlAccess(DataControl dc) {
		ArtificialContextValue cv = new ArtificialContextValue();
		cv.setValue("Data controls." + mergeAndUnCapitalize(dc.getName()));

		ArtificialExpressionPart ex = new ArtificialExpressionPart();
		ex.setOrder(0);
		ex.setExpressionType("DataControlHolder");
		cv.getExpression().add(ex);

		ex = new ArtificialExpressionPart();
		ex.setOrder(1);
		ex.setExpressionType("DataControlImpl");
		ex.setObjRef(dc);
		cv.getExpression().add(ex);

		return cv;
	}

	
	private ArtificialContextValue createControlAccess(DataControl dc,ArtificialField attribute) {
		ArtificialContextValue cv = createControlAccess(dc);

		cv.setValue(cv.getValue() + ".currentObject." + attribute.getName());

		ArtificialExpressionPart ex = new ArtificialExpressionPart();
		ex.setOrder(2);
		ex.setExpressionType("DataControlFakeMethod");
		cv.getExpression().add(ex);

		ex = new ArtificialExpressionPart();
		ex.setOrder(3);
		ex.setExpressionType("ExtendedType");
		cv.getExpression().add(ex);

		ex = new ArtificialExpressionPart();
		ex.setOrder(4);
		ex.setObjRef(attribute);
		ex.setExpressionType("AttributeImpl");
		cv.getExpression().add(ex);

		return cv;
	}	
	
	
	private ArtificialContextValue createControlAccess(DataControl dc,Attribute attribute) {
		ArtificialContextValue cv = createControlAccess(dc);

		cv.setValue(cv.getValue() + ".currentObject." + attribute.getName());

		ArtificialExpressionPart ex = new ArtificialExpressionPart();
		ex.setOrder(2);
		ex.setExpressionType("DataControlFakeMethod");
		cv.getExpression().add(ex);

		ex = new ArtificialExpressionPart();
		ex.setOrder(3);
		ex.setExpressionType("ExtendedType");
		cv.getExpression().add(ex);

		ex = new ArtificialExpressionPart();
		ex.setOrder(4);
		ex.setObjRef(attribute);
		ex.setExpressionType("AttributeImpl");
		cv.getExpression().add(ex);

		return cv;
	}

	public static void saveFile(String path, String fileName, String in)
			throws IOException {
		saveFile(path, fileName, in,"UTF-8");
	}

	public static void saveFile(String path, String fileName, String in,
			String charset) throws IOException {

		File f = new File(path);
		f.mkdirs();

		FileOutputStream out = new FileOutputStream(new File(f, fileName),
				false);

		final OutputStreamWriter writer = new OutputStreamWriter(out,
				Charset.forName(charset));
		
		writer.write(in);
		writer.flush();
		writer.close();
		out.close();
	}

	public static void println(Object obj) {
		System.out.println(obj);
	}

	public static void populateTechnologies(EglTemplate template,ModelMapper mapper) {
		if (mapper == null || mapper.getTechnologies() == null)
			return;
		
		for (MappingTecnologiy tech : mapper.getTechnologies()) {
			template.populate(tech.getTechRef().getName()
					.replace(' ', '_'), tech.getValueRef().getValue());
		}
	}

	public static void populateTechnologies(Map<String, Object> hash,ModelMapper mapper) {
		if (mapper == null || mapper.getTechnologies() == null)
			return;

		for (MappingTecnologiy tech : mapper.getTechnologies()) {
			String path = buildTechnologiesString(tech.getValueRef().getValue());
			hash.put(tech.getTechRef().getName().replace(' ', '_'), path);
		}
	}

	
	public static String buildTechnologiesString(TechLeaf tech){
		TechLeaf root = tech;
		Stack<String> s = new Stack<String>();
		do{
			s.push(root.getName());
			if (root.eContainer() instanceof TechLeaf){
				root = (TechLeaf) root.eContainer();
			}else{
				root = null;
			}
				
		}while(root != null);
		
		String path = "";
		boolean first = true;
		while(!s.isEmpty()){
			if (!first){
				path = path +"/";				
			}
			first = false;
			path = path +s.pop();
		}
		return path;
	}
	
	public int message(String header, String message){
		MessageBox dialog = 
				  new MessageBox(Display.getCurrent().getActiveShell(), SWT.ICON_QUESTION | SWT.OK| SWT.CANCEL);
				dialog.setText(header);
				dialog.setMessage(message);

				return dialog.open(); 		
	}
	
	public static EglTemplate loadTemplate(String templateFile,
			HashMap<String, Object> parameters, EglTemplateFactory factory)
			throws Exception {

		/* Create and adjust the configuration */
		Configuration cfg = new Configuration();

		cfg.setObjectWrapper(new DefaultObjectWrapper());
		cfg.setDefaultEncoding("UTF-8");
		cfg.setTemplateExceptionHandler(TemplateExceptionHandler.HTML_DEBUG_HANDLER);
		cfg.setTemplateLoader(new FreeMarkeResourceLoader());
		cfg.setLocalizedLookup(false);

		Template t = cfg.getTemplate(templateFile);

		StringWriter writer = new StringWriter();
		t.process(parameters, writer);

		IEclipsePreferences pref = InstanceScope.INSTANCE
				.getNode("org.tura.metamodel.commons.preferences");
		if ("true"
				.equals(pref.get(IPreferenceConstants.LOG_TEMPLATES, "false"))) {
			LogUtil.logInfo("Template" + templateFile + " : \n"
					+ writer.toString());
		}

		EglTemplate egltemplate = factory.prepare(writer.toString());

		if (egltemplate == null || !egltemplate.getParseProblems().isEmpty()) {
			if (egltemplate != null)
				LogUtil.logInfo("Error during pursing template" + templateFile
						+ " : \n" + writer.toString());
			throw new Exception(egltemplate.getParseProblems().toString());
		}

		for (Iterator<String> itr = parameters.keySet().iterator(); itr
				.hasNext();) {
			String key = itr.next();
			egltemplate.populate(key, parameters.get(key));
		}
		return egltemplate;
	}

}
