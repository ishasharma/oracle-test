CREATE TABLE zen_health_gauge (  gauge_id varchar2(64) NOT NULL ,  scheduled_DateTime timestamp(0) NOT NULL,  method_Hit_Count binary_double NOT NULL,  server_Instance_Id number(10) NOT NULL,  method_Hit_Time binary_double NOT NULL,  server_Ip_Address varchar2(256) NOT NULL,  service_Name varchar2(256) NOT NULL,  method_Name varchar2(32) NOT NULL,  PRIMARY KEY (gauge_id))  ;

exit

