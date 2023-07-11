/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.commons;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.UUID;

import javax.crypto.KeyGenerator;

import org.apache.commons.lang.StringUtils;
import org.apache.felix.gogo.jline.command.TuraCommand;
import org.apache.felix.gogo.jline.utils.LogUtil;
import org.apache.felix.gogo.jline.utils.OSHelper;
import org.eclipse.epsilon.egl.EglTemplate;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.egl.output.OutputBuffer;
import org.eclipse.epsilon.eol.execute.context.ExtendedProperties;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.Model;
import org.eclipse.epsilon.eol.models.ModelRepository;
import org.eclipse.epsilon.eol.types.EolClasspathNativeTypeDelegate;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeDataControl;
import org.tura.model.designer.repository.serialized.artifact.GenerationHintWithNickName;
import org.tura.model.designer.repository.serialized.artifact.TechLeaf;
import org.tura.model.designer.repository.serialized.form.ArtificialField;
import org.tura.model.designer.repository.serialized.form.DataControl;
import org.tura.model.designer.repository.serialized.form.DataScroller;
import org.tura.model.designer.repository.serialized.form.Form;
import org.tura.model.designer.repository.serialized.form.FullCalendar;
import org.tura.model.designer.repository.serialized.form.Table;
import org.tura.model.designer.repository.serialized.form.TimeLine;
import org.tura.model.designer.repository.serialized.form.Tree;
import org.tura.model.designer.repository.serialized.mapper.JavaScriptMapper;
import org.tura.model.designer.repository.serialized.mapper.MappingLayer;
import org.tura.model.designer.repository.serialized.mapper.PackageMapper;
import org.tura.model.designer.repository.serialized.mapper.TypeMapper;
import org.tura.model.designer.repository.serialized.recipe.Ingredient;
import org.tura.model.designer.repository.serialized.recipe.JavaComponent;
import org.tura.model.designer.repository.serialized.recipe.JavaScriptComponent;
import org.tura.model.designer.repository.serialized.recipe.MappingTecnologiy;
import org.tura.model.designer.repository.serialized.recipe.ModelMapper;
import org.tura.model.designer.repository.serialized.recipe.Query;
import org.tura.model.designer.repository.serialized.recipe.QueryVariable;
import org.tura.model.designer.repository.serialized.type.Attribute;
import org.tura.model.designer.repository.serialized.type.Link;
import org.tura.model.designer.repository.serialized.type.TypeElement;
import org.tura.model.designer.repository.serialized.type.TypeGroup;
import org.tura.platform.datacontrol.commons.Reflection;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

public class Util {

	private Model model = null;

	public static String pathConverter( String property) {
		if ( OSHelper.isWindows()) {
			if ( property.matches("^[a-zA-Z]:\\\\[\\\\\\S|*\\S]?.*$")) {
				//This is Windows path
				property = property.replaceAll("\\\\", "/");
			}
		}
		return property;
	}
	
	
	public static String turaLocation() {
		try {
			Path path = Paths.get(System.getProperty("user.home") + "/.tura/turaLink");
			return Files.readString(path, Charset.defaultCharset());
		} catch (Exception e) {
			LogUtil.log(e);
			return System.getProperty("user.home");
		}
	}

	public long serialVersionUID() {
		return Calendar.getInstance().getTimeInMillis();
	}

	public static String bracketRemover(String str) {
		if (str.length() < 2)
			return str;

		if ("#{".equals(str.substring(0, 2))) {
			str = str.substring(2);
			str = str.substring(0, str.length() - 1);
		}
		return str;
	}

	private  long time;

	public  void initTimestamp() {
		time = System.currentTimeMillis();
	}

	public  long timeDiff() {
		long i = System.currentTimeMillis();
		long j = i - time;
		time = i;
		return j;
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
		if (dc.getBaseType() != null) {
			return dc.getBaseType().getTypeRef();
		}
		return null;
	}

	public boolean ifDataControlIsTreeRoot(DataControl dc, Form frm) throws Exception {

		QueryHelper helper = new QueryHelper(model);
		for (TreeDataControl tdc : helper.findTreeRootControls(frm)) {
			if (tdc.getDc().equals(dc)) {
				return true;
			}
		}

		return false;

	}
	
	
	public String[] splitTech( String tech ) {
		String h[] = tech.split("\\.");
		for ( int i =0; i< h.length; i++) {
			h[i] = h[i].replace(";;", ".");
		}
		return h;
	}

	public Object findTech(Object obj, List<String> h, Integer depth) {
		QueryHelper helper = new QueryHelper(model);
		String r[] = new String[depth+1];
		if ( depth> h.size()) {
			throw new RuntimeException(  String.format("Wrong depth %s for %s", depth, obj));
		}
		
		System.arraycopy(h.toArray(),0,r,0,depth+1);
		
		return helper.findTech(obj, 0, r );
	}	
	
	public Object findTech(Object obj,  String tech) {
		String h[] = splitTech(tech);
		return findTech(obj, Arrays.asList(h), h.length-1 );
	}	
	
	
	public  boolean ifDataControlIsTreeRoot(DataControl dc) throws Exception {
		QueryHelper helper = new QueryHelper(model);
		Form frm = helper.getForm(dc);
		for (TreeDataControl tdc : helper.findTreeRootControls(frm)) {
			if (tdc.getDc().equals(dc)) {
				return true;
			}
		}
		return false;
	}

	public boolean ifInternalElement(Object element) {

		Object top = getContainer(element);
		if (top == null)
			return false;
		if (top instanceof Table)
			return true;
		if (top instanceof Tree)
			return true;
		if (top instanceof DataScroller)
			return true;
		if (top instanceof TimeLine)
			return true;
		if (top instanceof FullCalendar)
			return true;
		
		return ifInternalElement(top);

	}

	public Object findSourcePointer(Object element) {
		Object top = getContainer(element);
		if (top == null)
			return null;
		if (top instanceof Table)
			return top;
		if (top instanceof Tree)
			return top;
		if (top instanceof DataScroller)
			return top;
		if (top instanceof TimeLine)
			return top;

		return findSourcePointer(top);
	}

	public static void move(String src, String dst) throws IOException {
		Path srcPath = FileSystems.getDefault().getPath(src);
		Path dstPath = FileSystems.getDefault().getPath(dst);

		Files.move(srcPath, dstPath, REPLACE_EXISTING);

	}

	private static int powerN(int base, int n) {
		int result = 1;
		for (int i = 0; i < n; i++) {
			result *= base;
		}

		return result;
	}

	private static int makeMask(List<MappingLayer> layers) {
		int i = 0;
		for (MappingLayer layer : layers) {
			i = i + powerN(2, layer.getOrder());
			;
		}
		return i;
	}

	private static int ingredientMask(Ingredient ingredient, String maskType) {
		int mask = 0;
		if ("ALL".equals(maskType) || "VIEW".equals(maskType)) {
			mask = mask | makeMask(ingredient.getVewLayer());
		}

		if ("ALL".equals(maskType) && ingredient.getControllerLayer() != null) {
			mask = mask | powerN(2, ingredient.getControllerLayer().getOrder());
		}

		if ("ALL".equals(maskType) || "MODEL".equals(maskType)) {
			mask = mask | makeMask(ingredient.getModelLayer());
		}
		return mask;
	}

	public static TypeMapper jsMapperWrapper(JavaScriptMapper mapper) throws Exception {
		return new TypeMapperWrapper(mapper);
	}

	public static TypeMapper mapType(Collection<TypeMapper> mappers, Ingredient ingredient, TypeElement typeElement,
			String maskType) throws Exception {

		int ingredientMask = ingredientMask(ingredient, maskType);

		for (TypeMapper mapper : mappers) {

			int mapperMask = makeMask(mapper.getLayers());

			if ((mapper.getTypeRef().getUid() == typeElement.getUid()) && ((ingredientMask & mapperMask) != 0)) {
				return new TypeMapperWrapper(mapper);
			}
		}
		return null;
	}

	public static PackageMapper mapPackage(Collection<PackageMapper> mappers, Ingredient ingredient, TypeGroup pkg,
			String maskType) throws Exception {

		int ingredientMask = ingredientMask(ingredient, maskType);

		for (PackageMapper mapper : mappers) {

			int mapperMask = makeMask(mapper.getLayers());

			if ((mapper.getPackageRef().getUid() == pkg.getUid()) && ((ingredientMask & mapperMask) != 0)) {
				return new PackageMapperWrapper(mapper);
			}
		}
		return null;
	}

	public static String getComponentRoot(String root, HashMap<String, Object> configuration) {
		for (String key : configuration.keySet()) {
			if (configuration.get(key) instanceof String) {
				String value = pathConverter((String) configuration.get(key));
				root = root.replace("${" + key + "}", value);
			}
		}
		root = root.replace("${HOME}", pathConverter(System.getProperty("user.home")));
		return root;
	}

	public static Object runQuery(Query query) throws Exception {
		String strQuery = query.getQueryRef().getQuery();
		for (QueryVariable var : query.getVariables()) {
			strQuery = strQuery.replaceAll("\\$\\{" + var.getQueryParamRef().getName() + "\\}", var.getValue());
		}

		ModelMapper mapper = (ModelMapper) getContainer(query);

		for (GenerationHintWithNickName hintRef : mapper.getArtifactRef().getHints()) {
			strQuery = strQuery.replaceAll("\\@\\{" + hintRef.getName() + "\\}", hintRef.getHint().getUid());
		}
		traceIfDebug("Query", strQuery);
		return executeQuery(strQuery);
	}

	public static void traceIfDebug(String type, String str) {

		if (GeneratotPreferences.debigging) {
			GeneratotPreferences.wrapper.logInfo(type + " : " + str);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List<?> runQuery(ModelMapper mapper, String queryName, Object eobj) throws Exception {
		ArrayList result = new ArrayList<>();
		for (Query query : mapper.getQueries()) {
			if (query.getQueryRef().getName().equals(queryName)) {
				Collection<?> ls = (Collection<?>) runQuery(query);
				result.addAll(ls);
			}
		}

		return result;

	}

	private static Object executeQuery(String strQuery) throws Exception {
		Object obj = new QueryHelper(TuraCommand.model).executeQuery(strQuery);
		return obj;
	}

	public static String mergeAndCapitalize(String name) {
		if (name != null) {
			name = name.replace("_", " ");
			String[] ls = StringUtils.split(name, " ");
			for (int i = 0; i < ls.length; i++) {
				ls[i] = StringUtils.capitalize(ls[i]);
			}
			return StringUtils.join(ls);
		} else {
			return "Error !!!";
		}
	}

	public static String mergeAndUnCapitalize(String name) {
		if (name != null) {
			name = name.replace("_", " ");
			String[] ls = StringUtils.split(name, " ");
			for (int i = 0; i < ls.length; i++) {
				ls[i] = StringUtils.capitalize(ls[i]);
			}
			return StringUtils.uncapitalize(StringUtils.join(ls));
		} else {
			return "Error !!!";
		}
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

		if (obj instanceof ArtificialField)
			return createTreeControlAccess(dc, (ArtificialField) obj);

		throw new Exception(
				"Method createTreeControlAccess for parameter " + obj.getClass().getName() + " is not implemented");
	}

	private ArtificialContextValue createControlAccess(DataControl dc, Object obj) throws Exception {
		if (obj == null)
			return createControlAccess(dc);
		if (obj instanceof Attribute)
			return createControlAccess(dc, (Attribute) obj);
		if (obj instanceof ArtificialField)
			return createControlAccess(dc, (ArtificialField) obj);

		throw new Exception(
				"Method createControlAccess for parameter " + obj.getClass().getName() + " is not implemented");
	}

	private ArtificialContextValue createTreeControlAccess(DataControl dc, ArtificialField attr) {

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
		ex.setExpressionType("ArtificialFieldImpl");
		cv.getExpression().add(ex);

		return cv;

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
		cv.setValue("Tree data controls.TreeControl." + mergeAndCapitalize(dc.getName()));

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

	private ArtificialContextValue createControlAccess(DataControl dc, ArtificialField attribute) {
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
		ex.setExpressionType("ArtificialFieldImpl");
		cv.getExpression().add(ex);

		return cv;
	}

	private ArtificialContextValue createControlAccess(DataControl dc, Attribute attribute) {
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

	public static void saveFile(String path, String fileName, String in) throws IOException {
		saveFile(path, fileName, in, "UTF-8");
	}

	public static void saveFile(String path, String fileName, String in, String charset) throws IOException {

		File f = new File(path);
		f.mkdirs();

		FileOutputStream out = new FileOutputStream(new File(f, fileName), false);

		final OutputStreamWriter writer = new OutputStreamWriter(out, Charset.forName(charset));

		writer.write(in);
		writer.flush();
		writer.close();
		out.close();
	}

	public static void println(Object obj) {
		System.out.println(obj);
	}

	public static void populateTechnologies(EglTemplate template, ModelMapper mapper) {
		if (mapper == null || mapper.getTechnologies() == null)
			return;

		for (MappingTecnologiy tech : mapper.getTechnologies()) {
			template.populate(tech.getTechRef().getName().replace(' ', '_'), tech.getValueRef().getValue());
		}

		template.populate("OS", getOS());

	}

	private static String getOS() {
		if (OSHelper.isWindows()) {
			return "OS/Win";
		} else if (OSHelper.isMac()) {
			return "OS/Unix";
		} else if (OSHelper.isUnix()) {
			return "OS/Unix";
		}
		return "";
	}

	public static void populateTechnologies(Map<String, Object> hash, ModelMapper mapper) {
		if (mapper == null || mapper.getTechnologies() == null)
			return;

		for (MappingTecnologiy tech : mapper.getTechnologies()) {
			String path = buildTechnologiesString(tech.getValueRef().getValue());
			hash.put(tech.getTechRef().getName().replace(' ', '_'), path);
		}
		hash.put("OS", getOS());
	}

	public static String buildTechnologiesString(TechLeaf tech) {
		TechLeaf root = tech;
		Stack<String> s = new Stack<String>();
		do {
			s.push(root.getName());
			Object container = getContainer(root);
			if (container instanceof TechLeaf) {
				root = (TechLeaf) container;
			} else {
				root = null;
			}

		} while (root != null);

		String path = "";
		boolean first = true;
		while (!s.isEmpty()) {
			if (!first) {
				path = path + "/";
			}
			first = false;
			path = path + s.pop();
		}
		return path;
	}

	
	public static String loadTemplate(  String templateFile, HashMap<String, Object> parameters  ) throws Exception{
		
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

		if (GeneratotPreferences.logTemlates) {
			GeneratotPreferences.wrapper.logInfo("Template" + templateFile + " : \n" + writer.toString());
		}
		return writer.toString();
	}
	

	public static EglTemplate loadTemplate(String templateFile, HashMap<String, Object> parameters,
			EglTemplateFactory factory, HashMap<String, Object> templateStore) throws Exception {
		
		EglTemplate template = (EglTemplate) templateStore.get(templateFile);
		if (template == null) {
			template = loadTemplate(templateFile, parameters, factory);
			templateStore.put(templateFile, template);
		} else {
		    ExtendedProperties  exp =  factory.getContext().getExtendedProperties();
		    factory.getContext().setExtendedProperties(null);
			template.reset();
		    factory.getContext().setExtendedProperties(exp);
			for (String key : parameters.keySet()) {
				template.populate(key, parameters.get(key));
			}
		}
		return template;
	}

	public static EglTemplate loadTemplate(String templateFile, HashMap<String, Object> parameters,
			EglTemplateFactory factory) throws Exception {
		
	    ExtendedProperties  exp =  factory.getContext().getExtendedProperties();
		PrintStream err  = factory.getContext().getErrorStream();
		PrintStream out  = factory.getContext().getOutputStream();
		List<IModel> models =  factory.getContext().getModelRepository().getModels();
	    
	    
		EglTemplateFactory newFactory = new EglTemplateFactory();

		ModelRepository modelRepo = newFactory.getContext().getModelRepository();
		newFactory.getContext().getNativeTypeDelegates().add(new EolClasspathNativeTypeDelegate());
		newFactory.getContext().setErrorStream(err);
		newFactory.getContext().setOutputStream(out);
		modelRepo.addModels(models);
	    
		
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

		if (GeneratotPreferences.logTemlates) {
			GeneratotPreferences.wrapper.logInfo("Template" + templateFile + " : \n" + writer.toString());
		}

		EglTemplateFactoryModuleAdapter module = new EglTemplateFactoryModuleAdapter(newFactory);
		module.parse(writer.toString());

		if (!module.getParseProblems().isEmpty()) {
				GeneratotPreferences.wrapper
						.logInfo("Error during pursing template" + templateFile + " : \n" + writer.toString());
			throw new Exception(module.getParseProblems().toString());
		}

		for (Iterator<String> itr = parameters.keySet().iterator(); itr.hasNext();) {
			String key = itr.next();
			module.getCurrentTemplate().populate(key, parameters.get(key));
		}
		module.getTemplateFactory().getContext().setExtendedProperties(exp);
		return module.getCurrentTemplate();
	}

	public static String getHint(ModelMapper mapper, String hintNickName) throws Exception {
		if (hintNickName == null) {
			throw new Exception("Hint is undifined");
		}
		for (GenerationHintWithNickName hintRef : mapper.getArtifactRef().getHints()) {
			if (hintRef.getName().equals(hintNickName)) {
				return hintRef.getHint().getUid();
			}
		}
		throw new Exception("Hint " + hintNickName + " is undifined in " + mapper.getArtifactRef().getName());
	}

	public static String splitByCapitalLatter(String s) {
		String ss = mergeAndCapitalize(s);
		String[] r = ss.split("(?<=.)(?=\\p{Lu})");
		String result = r[0];
		if (r.length > 1) {
			for (int i = 1; i < r.length; i++) {
				result = result + "_" + r[i];
			}
		}
		return result;
	}

	public static String splitByCapitalLatterAndCapitalize(String s) {
		return splitByCapitalLatter(s).toUpperCase();
	}

	public static String unEscapeString(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++)
			switch (s.charAt(i)) {
			case '\'':
				sb.append("\\\'");
				break;
			default:
				sb.append(s.charAt(i));
			}
		return sb.toString();
	}

	public void saveArtifactExecution(ModelMapper mapper, String execution) throws IOException {
		String path = System.getProperty("user.home") + "/.tura/artifactexecution";
		saveFile(path, mapper.getUid(), execution, "UTF-8");
	}

	public String getArtifactExecution(ModelMapper mapper) throws IOException {
		String path = System.getProperty("user.home") + "/.tura/artifactexecution/" + mapper.getUid();
		FileInputStream in = new FileInputStream(new File(path));
		byte[] buffer = new byte[in.available()];
		in.read(buffer);
		return new String(buffer, "UTF-8");
	}

	public String key() throws NoSuchAlgorithmException {
		KeyGenerator keyGen = KeyGenerator.getInstance("AES");
		keyGen.init(256); // Use 128 for 16bit key.
		String key = Base64.getEncoder().encodeToString(keyGen.generateKey().getEncoded());
		return key;
	}

	public String generateUUID() {
		return UUID.randomUUID().toString().replaceAll("\\-", "_");
	}

	public JavaComponent getComponent(JavaComponent component) {
		return new JavaComponentWrapper(component);
	}

	public JavaScriptComponent getComponent(JavaScriptComponent component) {
		return new JavaScriptComponentWrapper(component);
	}

	public void cleanBuffer(OutputBuffer buffer, String replase) throws Exception {
		Method m = OutputBuffer.class.getDeclaredMethod("replaceContentsWith", new Class<?>[] { String.class });
		m.setAccessible(true);
		m.invoke(buffer, replase);
	}

	public String fixArtifField(String field) {
		if (field != null) {
			if (field.lastIndexOf(".") != -1) {
				field = field.substring(field.indexOf(".") + 1);
			}
		}
		return field;
	}

	public static Object getContainer(Object obj) {
		try {
			return Reflection.call(obj, "eContainer");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
}