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
		String userHome = System.getProperty("user.home");
		String turaSourceHome = System.getenv("TURA_SOURCE_HOME");

		pu.uploader(turaSourceHome , userHome);
	}

	public void uploader(String turaSourceHome, String userHome) {
		Pattern patterns = null;

		try {

			FileInputStream f = new FileInputStream(new File(turaSourceHome + "/platform/implementation/primefaces-ws/transformator/src/main/resources/pattern.xml"));
			patterns = JaxbUtils.readDocument(Pattern.class, f);

			// Register implementation pattern
			Iterator<ImplementationPattern> itr0 = patterns
					.getImplementationPattern().getImplementationPattern()
					.iterator();

			while (itr0.hasNext()) {
				ImplementationPattern ptrn = itr0.next();
				File dirPath = new File(userHome
						+ "/implPattern/ImplementationPetternRoot/"
						+ ptrn.getImplementationPatternPath());
				File fl = new File(ptrn.getFile().replaceAll("\\$\\{user.dir\\}", turaSourceHome+"/platform/implementation/primefaces-ws/transformator"));
				FileUtils.copyFileToDirectory(fl, dirPath);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
