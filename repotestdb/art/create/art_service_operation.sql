CREATE TABLE art_service_operation (
  operation_id varchar2(64) NOT NULL ,
  service_id varchar2(64) NOT NULL ,
  operation_name varchar2(256) NOT NULL,
  dao_class varchar2(256) NOT NULL,
  operation_json clob,
  source_details clob,
  project_id varchar2(256) DEFAULT NULL,
  app_creator_id varchar2(256) DEFAULT NULL,
  project_version_id varchar2(256) DEFAULT NULL,
  created_by varchar2(64) DEFAULT NULL,
  created_date timestamp(0) DEFAULT NULL,
  updated_by varchar2(64) DEFAULT NULL,
  updated_date timestamp(0) DEFAULT NULL,
  version_id number(10) DEFAULT NULL,
  active_status number(3) DEFAULT '1',
  dao_id varchar2(64) DEFAULT NULL,
  dao_operation_id varchar2(64) DEFAULT NULL,
  operation_type varchar2(11) DEFAULT NULL,
  PRIMARY KEY (operation_id)
); 

exit

