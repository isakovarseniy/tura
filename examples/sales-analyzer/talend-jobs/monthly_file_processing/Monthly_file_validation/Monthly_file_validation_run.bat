%~d0
cd %~dp0
java -Xms256M -Xmx1024M -cp .;../lib/routines.jar;../lib/dom4j-1.6.1.jar;../lib/log4j-1.2.16.jar;../lib/talend_file_enhanced_20070724.jar;../lib/talendcsv.jar;monthly_file_validation_0_1.jar; etl.monthly_file_validation_0_1.Monthly_file_validation --context=Default %* 