

ALTER TABLE ast_RoleMenuBridge_TP ADD CONSTRAINT fk_7f6de235a FOREIGN KEY (roleId) REFERENCES ast_Roles_T(roleId);



ALTER TABLE ast_RoleMenuBridge_TP ADD CONSTRAINT fk_139490a1a FOREIGN KEY (menuId) REFERENCES ast_AppMenus_M(menuId);



exit;