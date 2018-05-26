package org.tura.platform.repository.spa;

import org.tura.platform.repository.spa.merge.rules.DeleteMergeRule;
import org.tura.platform.repository.spa.merge.rules.InsertMergeRule;
import org.tura.platform.repository.spa.merge.rules.MergeRule;
import org.tura.platform.repository.spa.merge.rules.UpdateMergeRule;

public enum OperationLevel {
	UPDATE( new UpdateMergeRule()),
	INSERT(new InsertMergeRule()),
	DELETE( new DeleteMergeRule());
	
	private MergeRule rule;
	
	OperationLevel(MergeRule rule){
		this.rule = rule;
	}

	public MergeRule getRule() {
		return rule;
	}
	

}
