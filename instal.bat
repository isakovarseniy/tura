
set eclipse_sirius=C:\Users\isako\tura5\sirius\site\org.tura.metamodel.site-definition\target\products\tura.product\win32\win32\x86_64

mvn install:install-file  -Dfile=%eclipse_sirius%/plugins/org.eclipse.ocl.ecore_3.9.0.v20180611-1119.jar -DgroupId=org.eclipse.ocl  -DartifactId=org.eclipse.ocl.ecore -Dversion=3.9.0.v20180611-1119 -Dpackaging=jar

mvn install:install-file -Dfile=%eclipse_sirius%/plugins/org.eclipse.ocl.common_1.4.300.v20180611-1119.jar -DgroupId=org.eclipse.ocl  -DartifactId=org.eclipse.ocl.common -Dversion=1.4.300.v20180611-1119 -Dpackaging=jar

mvn install:install-file -Dfile=%eclipse_sirius%/plugins/org.eclipse.emf.validation_1.8.0.201805030717.jar -DgroupId=org.eclipse.ocl  -DartifactId=org.eclipse.emf.validation.ocl -Dversion=1.8.0.201805030717 -Dpackaging=jar

mvn install:install-file -Dfile=%eclipse_sirius%/plugins/org.eclipse.ocl_3.9.0.v20180611-1119.jar -DgroupId=org.eclipse.ocl -DartifactId=org.eclipse.ocl -Dversion=3.9.0.v20180611-1119 -Dpackaging=jar

mvn install:install-file -Dfile=%eclipse_sirius%/plugins/lpg.runtime.java_2.0.17.v201004271640.jar -DgroupId=org.eclipse.ocl -DartifactId=lpg.runtime.java -Dversion=2.0.17.v201004271640 -Dpackaging=jar

