%~d0
cd %~dp0
java -Xms256M -Xmx3G -cp .;../lib/routines.jar;../lib/dom4j-1.6.1.jar;../lib/log4j-1.2.16.jar;../lib/postgresql-9.4-1201.jdbc41.jar;../lib/talend_file_enhanced_20070724.jar;../lib/talendcsv.jar;load_monthly_data_0_1.jar; etl.load_monthly_data_0_1.Load_Monthly_Data --context=Default %* 