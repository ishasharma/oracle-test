load data infile '/tmp/applifire/db/5VJPOC7D2FDIKLMY2RVZ3Q/6BE6DB6D-9D38-4A34-8DE5-68F3A79FF98C/art/data/art_table_entity_relation.csv' "str '#appfirenewline#'" into table art_table_entity_relation FIELDS TERMINATED BY '#appfire#' (id,relation_type,direction_type,cascade_type,fetch_type,owning_cascade,owning_table_id,owning_key_id,reff_table_id,reff_key_id,project_id,project_version_id,
app_creator_id,created_by,created_date TIMESTAMP 'yyyy-mm-dd hh24:mi:ss',updated_by,updated_date TIMESTAMP 'yyyy-mm-dd hh24:mi:ss',version_id,active_status,owing_entity)

