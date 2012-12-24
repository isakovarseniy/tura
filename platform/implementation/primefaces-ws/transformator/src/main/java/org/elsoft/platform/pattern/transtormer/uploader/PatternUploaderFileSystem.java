package org.elsoft.platform.pattern.transtormer.uploader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.elsoft.platform.JaxbUtils;

public class PatternUploaderFileSystem {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PatternUploaderFileSystem pu = new PatternUploaderFileSystem();
		pu.uploader(
				     "/home/platform/GITRepo/tura/platform/implementation/primefaces-ws/transformator/src/main/resources/pattern.xml"
				   , "/home/platform/implPattern/ImplementationPetternRoot/"
				   );
	}

	public void uploader(String file, String dir) {
		Pattern patterns = null;

		try {

			FileInputStream f = new FileInputStream(new File(file));
			patterns = JaxbUtils.readDocument(Pattern.class, f);
			
			// Register implementation pattern
			Iterator<ImplementationPattern> itr0 = patterns
					.getImplementationPattern().getImplementationPattern()
					.iterator();
			
			
			while (itr0.hasNext()) {
				ImplementationPattern ptrn = itr0.next();
				File dirPath = new File (dir+ptrn.getImplementationPatternPath());
				File fl = new File(ptrn.getFile());
				FileUtils.copyFileToDirectory(fl,dirPath);  
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
