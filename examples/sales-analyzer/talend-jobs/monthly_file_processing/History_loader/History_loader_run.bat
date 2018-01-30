%~d0
cd %~dp0
java -Xms256M -Xmx1024M -cp .;../lib/routines.jar;../lib/dom4j-1.6.1.jar;../lib/jakarta-oro-2.0.8.jar;../lib/log4j-1.2.16.jar;../lib/postgresql-9.4-1201.jdbc41.jar;../lib/talend_file_enhanced_20070724.jar;../lib/talendcsv.jar;history_loader_0_1.jar;monthly_file_validation_0_1.jar; etl.history_loader_0_1.History_loader --context=Default %* 