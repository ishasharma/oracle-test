CREATE TABLE art_service (
  service_id varchar2(64) NOT NULL ,
  service_name varchar2(256) NOT NULL,
  service_class varchar2(256) NOT NULL,
  service_json clob,
  source_details clob,
  status varchar2(1) DEFAULT 'I',
  project_id varchar2(256) DEFAULT NULL,
  app_creator_id varchar2(256) DEFAULT NULL,
  project_version_id varchar2(256) DEFAULT NULL,
  created_by varchar2(64) DEFAULT NULL,
  created_date timestamp(0) DEFAULT NULL,
  updated_by varchar2(64) DEFAULT NULL,
  updated_date timestamp(0) DEFAULT NULL,
  version_id number(10) NOT NULL,
  active_status number(3) DEFAULT '1' NOT NULL,
  dao_id varchar2(64) DEFAULT NULL,
  PRIMARY KEY (service_id)
) ;

exit

