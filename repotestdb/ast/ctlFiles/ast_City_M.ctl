load data infile '/tmp/applifire/db/5VJPOC7D2FDIKLMY2RVZ3Q/6BE6DB6D-9D38-4A34-8DE5-68F3A79FF98C/ast/data/City.csv' into table ast_City_M FIELDS TERMINATED BY '#appfire#' (cityId,countryId,stateId,cityName,cityCodeChar2,cityCode,cityDescription CHAR(1000) "decode(:cityDescription, '\\N', null, :cityDescription)",cityFlag CHAR(1000) "decode(:cityFlag, '\\N', null, :cityFlag)",cityLatitude CHAR(1000) "decode(:cityLatitude, '\\N', null, :cityLatitude)",cityLongitude CHAR(1000) "decode(:cityLongitude, '\\N', null, :cityLongitude)",createdBy CHAR(1000) "decode(:createdBy, '\\N', null, :createdBy)",createdDate TIMESTAMP 'yyyy-mm-dd hh24:mi:ss',updatedBy CHAR(1000) "decode(:updatedBy, '\\N', null, :updatedBy)",updatedDate TIMESTAMP 'yyyy-mm-dd hh24:mi:ss',versionId CHAR(1000) "decode(:versionId, '\\N', null, :versionId)",activeStatus CHAR(1000) "decode(:activeStatus, '\\N', null, :activeStatus)",txnAccessCode CHAR(1000) "decode(:txnAccessCode, '\\N', null, :txnAccessCode)")
