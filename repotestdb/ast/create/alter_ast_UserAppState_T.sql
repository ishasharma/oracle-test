

ALTER TABLE ast_UserAppState_T ADD CONSTRAINT fk_fa2d6eee4 FOREIGN KEY (AppSessionId) REFERENCES ast_LoginSession_T(AppSessionId);



exit;