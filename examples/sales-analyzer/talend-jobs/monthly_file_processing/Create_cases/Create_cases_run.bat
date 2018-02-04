%~d0
cd %~dp0
java -Xms256M -Xmx1024M -cp .;../lib/routines.jar;../lib/dom4j-1.6.1.jar;../lib/log4j-1.2.16.jar;../lib/rules-commons-1.0.0-SNAPSHOT.jar;../lib/talend_file_enhanced_20070724.jar;../lib/talendcsv.jar;create_cases_0_1.jar; etl.create_cases_0_1.Create_cases --context=Default %* 