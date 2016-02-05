load data infile '/tmp/applifire/db/5VJPOC7D2FDIKLMY2RVZ3Q/6BE6DB6D-9D38-4A34-8DE5-68F3A79FF98C/ast/data/Login.csv' into table ast_Login_T FIELDS TERMINATED BY '#appfire#' (loginPk,loginId,serverAuthImage CHAR(1000) "decode(:serverAuthImage, '\\N', null, :serverAuthImage)",serverAuthText CHAR(1000) "decode(:serverAuthText, '\\N', null, :serverAuthText)",userId,contactId,failedLoginAttempts CHAR(1000) "decode(:failedLoginAttempts, '\\N', null, :failedLoginAttempts)",createdBy CHAR(1000) "decode(:createdBy, '\\N', null, :createdBy)",createdDate TIMESTAMP 'yyyy-mm-dd hh24:mi:ss',updatedBy CHAR(1000) "decode(:updatedBy, '\\N', null, :updatedBy)",updatedDate TIMESTAMP 'yyyy-mm-dd hh24:mi:ss',versionId CHAR(1000) "decode(:versionId, '\\N', null, :versionId)",activeStatus CHAR(1000) "decode(:activeStatus, '\\N', null, :activeStatus)",txnAccessCode CHAR(1000) "decode(:txnAccessCode, '\\N', null, :txnAccessCode)")
