%~d0
cd %~dp0
java -Xms256M -Xmx1024M -cp .;../lib/routines.jar;../lib/advancedPersistentLookupLib-1.0.jar;../lib/commons-collections-3.2.2.jar;../lib/dom4j-1.6.1.jar;../lib/jboss-serialization.jar;../lib/json_simple-1.1.jar;../lib/jsonpath.jar;../lib/log4j-1.2.15.jar;../lib/log4j-1.2.16.jar;../lib/talendcsv.jar;../lib/trove.jar;generate_data_for_period_0_1.jar;generate_monthly_file_0_1.jar; etl.generate_data_for_period_0_1.Generate_data_for_period --context=Default %* 