CREATE TABLE ast_UserAccessLevel_M ( userAccessLevelId VARCHAR2(64)  NOT NULL, userAccessLevel NUMBER(11)  NOT NULL, levelName VARCHAR2(256)  NOT NULL, levelDescription VARCHAR2(256)  NOT NULL, levelHelp VARCHAR2(2048)  DEFAULT NULL, levelIcon VARCHAR2(256)  DEFAULT NULL, createdBy VARCHAR2(64)  DEFAULT '-1', createdDate TIMESTAMP  DEFAULT '11-nov-01', updatedBy VARCHAR2(64)  DEFAULT '-1', updatedDate TIMESTAMP  DEFAULT '11-nov-01', versionId NUMBER(11)  DEFAULT '-1', activeStatus NUMBER(1)  DEFAULT '1', txnAccessCode NUMBER  DEFAULT NULL, PRIMARY KEY (userAccessLevelId),CONSTRAINT UNQ_198dfd6 UNIQUE(userAccessLevel));

exit;