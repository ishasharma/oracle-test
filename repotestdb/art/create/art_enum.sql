CREATE TABLE art_enum (
  enum_id number(10) DEFAULT '0' NOT NULL,
  enum_code varchar2(20) DEFAULT NULL,
  enum_desc varchar2(100) DEFAULT NULL,
  PRIMARY KEY (enum_id)
) ;

exit

