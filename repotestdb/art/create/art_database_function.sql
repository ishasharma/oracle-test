CREATE TABLE art_database_function (
  id varchar2(64) NOT NULL ,
  name varchar2(256) DEFAULT NULL,
  json clob NOT NULL,
  active_status number(10) DEFAULT '1',
  version_id number(10) DEFAULT '-1',
  updated_date timestamp(0) DEFAULT TO_TIMESTAMP('1900-01-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS.FF'),
  updated_by varchar2(64) DEFAULT '-1',
  created_date timestamp(0) DEFAULT TO_TIMESTAMP('1900-01-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS.FF'),
  created_by varchar2(64) DEFAULT '-1',
  PRIMARY KEY (id)
 );

exit

