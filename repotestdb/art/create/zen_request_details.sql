CREATE TABLE zen_request_details (
  requestId varchar2(46) NOT NULL,
  class_Name varchar2(150) DEFAULT NULL,
  ip_Address varchar2(45) DEFAULT NULL,
  request_Time timestamp(0) DEFAULT NULL,
  request_Method varchar2(45) DEFAULT NULL,
  http_Status varchar2(45) DEFAULT NULL,
  return_Status varchar2(45) DEFAULT NULL,
  execution_Time binary_double DEFAULT NULL,
  method_Name varchar2(45) DEFAULT NULL,
  start_time timestamp(0) NOT NULL,
  end_Time timestamp(0) NOT NULL,
  typeofClass varchar2(11) DEFAULT NULL,
  callSeqId number(10) DEFAULT NULL,
  exceptionId number(10) DEFAULT NULL,
  userId varchar2(45) DEFAULT NULL,
  appSessionId varchar2(45) DEFAULT NULL
);

exit

