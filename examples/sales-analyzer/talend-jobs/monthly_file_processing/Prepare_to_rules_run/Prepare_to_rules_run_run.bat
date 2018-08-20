%~d0
cd %~dp0
java -Xms256M -Xmx3024M -cp .;../lib/routines.jar;../lib/dom4j-1.6.1.jar;../lib/external_sort.jar;../lib/log4j-1.2.16.jar;../lib/postgresql-9.4-1201.jdbc41.jar;../lib/talend_file_enhanced_20070724.jar;../lib/talendcsv.jar;prepare_to_rules_run_0_1.jar; etl.prepare_to_rules_run_0_1.Prepare_to_rules_run --context=Default %* 