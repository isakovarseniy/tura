package org.tura.example.ui.tree2tree.triggers;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;

import org.elsoft.platform.hr.objects.FileDAO;
import org.tura.example.ui.hrmanager.tree2tree.datacontrol.IFilesArtifitialFields;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.annotations.PostQuery;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.PostQueryTrigger;
import org.tura.platform.datacontrol.commons.TuraException;

@Alternative
@Priority(10)
@Selector("hrmanager.tree2tree")
@PostQuery("files")
public class FilesPostQueryTrigger  implements PostQueryTrigger{

	@Override
	public void execute(DataControl<?> datacontrol, Object obj)
			throws TuraException {
		FileDAO file = (FileDAO) obj;
		IFilesArtifitialFields af = (IFilesArtifitialFields) obj;
		af.setNameArtf(file.getFileName());
		
	}

}