CREATE TABLE art_rules (rule_id VARCHAR2(64) NOT NULL,rule_name VARCHAR2(256) NOT NULL, rule_drl CLOB DEFAULT NULL,updated_by VARCHAR2(64) DEFAULT NULL,updated_date TIMESTAMP(0) DEFAULT NULL,created_by VARCHAR2(64) DEFAULT NULL,created_date TIMESTAMP(0) DEFAULT NULL,version_id NUMBER(10) DEFAULT NULL,active_status NUMBER(3) DEFAULT '1',project_id VARCHAR2(256) ,project_version_id VARCHAR2(256),app_creator_id VARCHAR2(256) DEFAULT NULL, PRIMARY KEY (rule_id));

exit

