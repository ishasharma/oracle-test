CREATE TABLE art_table_details (
  table_id varchar2(64) NOT NULL,
  entity_name varchar2(256) NOT NULL,
  table_name varchar2(256) NOT NULL,
  display_entity_name varchar2(256) NOT NULL,
  table_type varchar2(2) DEFAULT 'M' NOT NULL,
  domain varchar2(256) DEFAULT NULL,
  project_id varchar2(256) NOT NULL,
  app_creator_id varchar2(256) DEFAULT NULL,
  project_version_id varchar2(256) DEFAULT NULL,
  created_by varchar2(64) DEFAULT NULL,
  created_date timestamp(0) DEFAULT NULL,
  updated_by varchar2(64) DEFAULT NULL,
  updated_date timestamp(0) DEFAULT NULL,
  version_id number(10) DEFAULT NULL,
  active_status number(3) DEFAULT '1',
  PRIMARY KEY (table_id)
);

exit

