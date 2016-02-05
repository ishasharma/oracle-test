

ALTER TABLE ast_UserRoleBridge_T ADD CONSTRAINT fk_d0a1cbf01 FOREIGN KEY (roleId) REFERENCES ast_Roles_T(roleId);



ALTER TABLE ast_UserRoleBridge_T ADD CONSTRAINT fk_ac875a2c8 FOREIGN KEY (userId) REFERENCES ast_User_T(userId);



exit;