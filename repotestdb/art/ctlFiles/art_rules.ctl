load data infile '/tmp/applifire/db/5VJPOC7D2FDIKLMY2RVZ3Q/6BE6DB6D-9D38-4A34-8DE5-68F3A79FF98C/art/data/art_rules.csv' "str '#appfirenewline#'" into table art_rules FIELDS TERMINATED BY '#appfire#' (rule_id,rule_name,rule_drl,updated_by,updated_date TIMESTAMP 'yyyy-mm-dd hh24:mi:ss',created_by,created_date TIMESTAMP 'yyyy-mm-dd hh24:mi:ss',version_id,active_status,project_id,project_version_id,app_creator_id)
