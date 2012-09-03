package org.elsoft.platform.metamodel.processor.uicontainer.model;

import java.util.HashMap;

import org.elsoft.platform.metamodel.objects.type.PropertyDAO;
import org.elsoft.platform.metamodel.objects.type.TypeDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.datasource.model.Field;

public class ArtifitialField extends Field {

	private String artifitialFieldName;
	private String defaultValue;

	public ArtifitialField(PropertyDAO property, TypeDAO type,
			HashMap<String, Object> context, String datalinkUUID) {
		super(property, type, context, datalinkUUID);
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


	protected void serialize(CommandHandler ch) throws Exception {
	}

}
