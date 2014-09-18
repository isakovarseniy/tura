package org.tura.metamodel.commons.properties.selections.dropdown;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.validation.internal.modeled.model.validation.Constraint;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.tura.metamodel.commons.properties.selections.dropdown.impl.DomainMapperQueryRef;

import domain.DomainPackage;

public class QueryPropertySelection extends AbstractEnumerationPropertySection {

	protected String getLabelText() {
		return "Query name";//$NON-NLS-1$
	}

	protected void init() {
		dropDownDataSupplier = new DomainMapperQueryRef();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected HashMap<String, Object> getEnumerationFeatureValues() {

		if (values == null) {
			values = new LinkedHashMap<String, Object>();

			Diagram diagram = (Diagram) editPart.getRoot().getContents()
					.getModel();
			EObject types = (EObject) diagram.getElement();

			if ((((domain.ModelMapper) (((domain.Query) getModel())
					.eContainer())).getDomainArtifactRef() == null)
					|| (((domain.ModelMapper) (((domain.Query) getModel())
							.eContainer())).getArtifactRef() == null))
				return values;

			OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
					.createOCLHelper();
			helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Types"));

			try {
				OCLExpression<EClassifier> query = helper
						.createQuery("domain::DomainArtifact.allInstances()->select(r|r.oclAsType(domain::DomainArtifact).uid='"
								+ ((domain.ModelMapper) (((domain.Query) getModel())
										.eContainer())).getDomainArtifactRef()
										.getUid()
								+ "').oclAsType(domain::DomainArtifact).artifact.artifacts->select(r|r.oclIsKindOf(domain::Artifact) and  r.oclAsType(domain::Artifact).uid = '"
								+ ((domain.ModelMapper) (((domain.Query) getModel())
										.eContainer())).getArtifactRef()
										.getUid()
								+ "').oclAsType(domain::Artifact).modelQuery");

				Collection<domain.ModelQuery> map = (Collection<domain.ModelQuery>) ocl
						.evaluate(types, query);

				for (Iterator<domain.ModelQuery> i = map.iterator(); i
						.hasNext();) {
					domain.ModelQuery p = i.next();
					values.put(p.getName(), p);
				}

				// Validate current query set
				EditingDomain editingDomain = ((DiagramEditor) getPart())
						.getEditingDomain();

				for (Iterator<domain.Query> itr = ((domain.ModelMapper) (((domain.Query) getModel())
						.eContainer())).getQueries().iterator(); itr.hasNext();) {
					domain.Query q = itr.next();
					if (q.getQueryRef() != null) {
						query = helper
								.createQuery("domain::DomainArtifact.allInstances()->select(r|r.oclAsType(domain::DomainArtifact).uid='"
										+ ((domain.ModelMapper) (((domain.Query) getModel())
												.eContainer()))
												.getDomainArtifactRef()
												.getUid()
										+ "').oclAsType(domain::DomainArtifact).artifact.artifacts->select(r|r.oclIsKindOf(domain::Artifact) and  r.oclAsType(domain::Artifact).uid = '"
										+ ((domain.ModelMapper) (((domain.Query) getModel())
												.eContainer()))
												.getArtifactRef().getUid()
										+ "').oclAsType(domain::Artifact).modelQuery->select(r|r.oclAsType(domain::ModelQuery).uid= '"
										+ q.getQueryRef().getUid() + "')");

						map = (Collection<domain.ModelQuery>) ocl.evaluate(
								types, query);
						if (map.size() == 0) {
							editingDomain
									.getCommandStack()
									.execute(
											SetCommand
													.create(editingDomain,
															((domain.Query) getModel()),
															DomainPackage.eINSTANCE
																	.getQuery_QueryRef(),
															null));

							for (Iterator<domain.QueryVariable> itr1 = ((domain.Query) getModel())
									.getVariables().iterator(); itr1.hasNext();) {
								editingDomain.getCommandStack().execute(
										RemoveCommand.create(editingDomain,
												((domain.Query) getModel()),
												DomainPackage.eINSTANCE
														.getQuery_Variables(),
												itr1.next()));
							}

						}
					}
				}

			} catch (Exception e) {
				LogUtil.log(e);
			}
		}

		return values;
	}

	@Override
	public EObject getModel() {
		return getEObject();
	}

	@Override
	public EObject getModel(EStructuralFeature feature) {
		return getEObject();
	}

}
