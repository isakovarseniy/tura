package org.elsoft.platform.metamodel.processor.artifactcalculator.modelbuilder;

import org.elsoft.platform.metamodel.MetamodelPlatformLevel;
import org.elsoft.platform.metamodel.PlatformPrimetiveTypes;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.objects.type.TypeDAO;
import org.elsoft.platform.metamodel.objects.type.TypeMappingDAO;
import org.elsoft.platform.metamodel.processor.datasource.model.IndependentType;

public class MappedType extends IndependentType {
	private String resPackageName;
	private String resTypeName;
	private String artifactName;
	private String groupName;
	private String artifactVersion;
	private String technology;

	public MappedType(TypeDAO type, String domain, String functionalDomain,
			String application, MetamodelPlatformLevel level,
			RepositoryFactory rf) throws Exception {
		super(type);

		TypeMappingDAO typemap = rf.getTypeMappingHandler().cleanSearch()
				.searchString("targetDomain", domain)
				.searchString("targetFunctionalDomain", functionalDomain)
				.searchString("targetApplication", application)
				.searchString("targetLayer", level.name())
				.searchLong("typeReference", type.getObjId()).getObject();

		if (typemap == null) {
			// looking for primitive type
			typemap = rf
					.getTypeMappingHandler()
					.cleanSearch()
					.searchString("targetDomain",
							PlatformPrimetiveTypes.NA.name())
					.searchString("targetFunctionalDomain",
							PlatformPrimetiveTypes.NA.name())
					.searchString("targetApplication",
							PlatformPrimetiveTypes.NA.name())
					.searchString("targetLayer",
							PlatformPrimetiveTypes.NA.name())
					.searchLong("typeReference", type.getObjId())
					.getObject();

		}
		if (typemap == null){
			throw new Exception(type.getDomain()+"."+type.getFunctionalDomain()+"."+type.getApplication()+"."+type.getTypeName()+"  is not mapped to "+domain+"."+functionalDomain+"."+application);
		}

		this.resPackageName = typemap.getResPackageName();
		this.resTypeName = typemap.getResTypeName();
		this.artifactName = typemap.getArtifactName();
		this.groupName = typemap.getGroupName();
		this.artifactVersion = typemap.getArtifactVersion();
		this.setTechnology(typemap.getTechnology());

	}

	public String getArtifactName() {
		return artifactName;
	}

	public void setArtifactName(String artifactName) {
		this.artifactName = artifactName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getArtifactVersion() {
		return artifactVersion;
	}

	public void setArtifactVersion(String artifactVersion) {
		this.artifactVersion = artifactVersion;
	}

	public String getResPackageName() {
		return resPackageName;
	}

	public void setResPackageName(String resPackageName) {
		this.resPackageName = resPackageName;
	}

	public String getResTypeName() {
		return resTypeName;
	}

	public void setResTypeName(String resTypeName) {
		this.resTypeName = resTypeName;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

}
