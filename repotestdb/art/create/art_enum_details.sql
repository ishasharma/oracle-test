CREATE TABLE art_enum_details (
  enum_id number(10) NOT NULL,
  type_id number(10) NOT NULL,
  type_value varchar2(100) DEFAULT NULL,
  type_desc varchar2(1000) DEFAULT NULL,
  PRIMARY KEY (enum_id,type_id)
) ;
 
 CREATE INDEX enum_id ON art_enum_details (enum_id);

exit

