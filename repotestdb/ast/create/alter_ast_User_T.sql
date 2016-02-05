

ALTER TABLE ast_User_T ADD CONSTRAINT fk_0a891bde8 FOREIGN KEY (userAccessLevelId) REFERENCES ast_UserAccessLevel_M(userAccessLevelId);



ALTER TABLE ast_User_T ADD CONSTRAINT fk_c625cea3e FOREIGN KEY (userAccessDomainId) REFERENCES ast_UserAccessDomain_M(userAccessDomainId);



exit;