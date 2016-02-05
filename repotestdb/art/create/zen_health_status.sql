CREATE TABLE zen_health_status (  healthId varchar2(64) NOT NULL ,  scheduled_DateTime timestamp(0) NOT NULL,  free_Space binary_double NOT NULL,  status varchar2(256) NOT NULL,  server_Instance_Id number(10) NOT NULL,  used_Space binary_double NOT NULL,  server_Ip_Address varchar2(30) NOT NULL,  total_Space binary_double NOT NULL,  PRIMARY KEY (healthId)) ;

exit

