CREATE TABLE art_table_entity_relation (
  id varchar2(64) NOT NULL ,
  relation_type varchar2(256) DEFAULT NULL,
  direction_type varchar2(256) DEFAULT NULL,
  cascade_type varchar2(256) DEFAULT NULL,
  fetch_type varchar2(256) DEFAULT NULL,
  owning_cascade varchar2(256) DEFAULT NULL,
  owning_table_id varchar2(64) NOT NULL ,
  owning_key_id varchar2(64) NOT NULL ,
  reff_table_id varchar2(64) NOT NULL ,
  reff_key_id varchar2(64) NOT NULL ,
  project_id varchar2(256) DEFAULT NULL,
  project_version_id varchar2(256) DEFAULT NULL,
  app_creator_id varchar2(256) DEFAULT NULL,
  created_by varchar2(64) DEFAULT NULL,
  created_date timestamp(0) DEFAULT NULL,
  updated_by varchar2(64) DEFAULT NULL,
  updated_date timestamp(0) DEFAULT NULL,
  version_id number(10) DEFAULT NULL,
  active_status number(3) DEFAULT '1',
  owing_entity number(3) DEFAULT NULL,
  PRIMARY KEY (id)
 ,
  CONSTRAINT fk_art_table_entity_relation_1 FOREIGN KEY (owning_table_id) REFERENCES art_table_details (table_id) 
);

exit

