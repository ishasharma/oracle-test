load data infile '/tmp/applifire/db/5VJPOC7D2FDIKLMY2RVZ3Q/6BE6DB6D-9D38-4A34-8DE5-68F3A79FF98C/ast/data/Region.csv' into table ast_Region_M FIELDS TERMINATED BY '#appfire#' (regionId,countryId,stateId,regionName,regionCode1,regionCodeChar2,regionDescription CHAR(1000) "decode(:regionDescription, '\\N', null, :regionDescription)",regionFlag CHAR(1000) "decode(:regionFlag, '\\N', null, :regionFlag)",regionLatitude CHAR(1000) "decode(:regionLatitude, '\\N', null, :regionLatitude)",regionLongitude CHAR(1000) "decode(:regionLongitude, '\\N', null, :regionLongitude)",createdBy CHAR(1000) "decode(:createdBy, '\\N', null, :createdBy)",createdDate TIMESTAMP 'yyyy-mm-dd hh24:mi:ss',updatedBy CHAR(1000) "decode(:updatedBy, '\\N', null, :updatedBy)",updatedDate TIMESTAMP 'yyyy-mm-dd hh24:mi:ss',versionId CHAR(1000) "decode(:versionId, '\\N', null, :versionId)",activeStatus CHAR(1000) "decode(:activeStatus, '\\N', null, :activeStatus)",txnAccessCode CHAR(1000) "decode(:txnAccessCode, '\\N', null, :txnAccessCode)")

