CREATE TABLE zen_health_counter (  counter_id varchar2(64) NOT NULL ,  server_Instance_Id number(10) NOT NULL,  http_Status varchar2(256) NOT NULL,  server_Ip_Address varchar2(256) NOT NULL,  service_Name varchar2(32) NOT NULL,  scheduled_DateTime timestamp(0) NOT NULL,  status_Count number(10) NOT NULL,  method_Name varchar2(100) NOT NULL,  counter_Type number(10) NOT NULL,  PRIMARY KEY (counter_id))  ;

exit

