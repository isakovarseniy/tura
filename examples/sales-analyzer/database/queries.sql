select * from sales_analyzer.product_group_history where history_date = to_date('20171101','YYYYMMDD');

delete from sales_analyzer.product_group_history where history_date = to_date('20171101','YYYYMMDD');
delete from sales_analyzer.product_history where history_date = to_date('20171101','YYYYMMDD');

