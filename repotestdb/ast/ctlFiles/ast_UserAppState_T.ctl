load data infile '/tmp/applifire/db/5VJPOC7D2FDIKLMY2RVZ3Q/6BE6DB6D-9D38-4A34-8DE5-68F3A79FF98C/ast/data/UserAppState.csv' into table ast_UserAppState_T FIELDS TERMINATED BY '#appfire#' (appStateId,AppSessionId,TabId,isActive,sessionDataType CHAR(1000) "decode(:sessionDataType, '\\N', null, :sessionDataType)",sessionData CHAR(1000) "decode(:sessionData, '\\N', null, :sessionData)",createdBy CHAR(1000) "decode(:createdBy, '\\N', null, :createdBy)",createdDate TIMESTAMP 'yyyy-mm-dd hh24:mi:ss',updatedBy CHAR(1000) "decode(:updatedBy, '\\N', null, :updatedBy)",updatedDate TIMESTAMP 'yyyy-mm-dd hh24:mi:ss',versionId CHAR(1000) "decode(:versionId, '\\N', null, :versionId)",activeStatus CHAR(1000) "decode(:activeStatus, '\\N', null, :activeStatus)",txnAccessCode CHAR(1000) "decode(:txnAccessCode, '\\N', null, :txnAccessCode)")

