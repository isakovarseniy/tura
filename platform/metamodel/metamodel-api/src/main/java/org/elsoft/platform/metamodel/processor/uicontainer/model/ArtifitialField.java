package org.elsoft.platform.metamodel.processor.uicontainer.model;

import org.elsoft.platform.metamodel.PersistentInterface;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.objects.command.form.datasource.CreateArtifitialFieldsDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.datasource.model.IndependentType;
import org.elsoft.platform.metamodel.types.TypeDefinitionHandler;

public class ArtifitialField extends PersistentInterface {

	private String artifitialFieldName;
	private String defaultValue;
	private IndependentType type;

	public ArtifitialField(CreateArtifitialFieldsDAO command,
			RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler().clean()
				.searchLong("objId", command.getRefType()).seek();
		type = new IndependentType(tdh.getObject());
		defaultValue=command.getDefaultValue();
		artifitialFieldName = command.getArtifitialFieldName();
	}

	public String getArtifitialFieldName() {
		return artifitialFieldName;
	}

	public void setArtifitialFieldName(String artifitialFieldName) {
		this.artifitialFieldName = artifitialFieldName;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public IndependentType getType() {
		return type;
	}

	public void setType(IndependentType type) {
		this.type = type;
	}

	protected void serialize(CommandHandler ch) throws Exception {
	}

}
