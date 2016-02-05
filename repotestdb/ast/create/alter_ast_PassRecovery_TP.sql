

ALTER TABLE ast_PassRecovery_TP ADD CONSTRAINT fk_7f904f0cd FOREIGN KEY (questionId) REFERENCES ast_Question_M(questionId);



ALTER TABLE ast_PassRecovery_TP ADD CONSTRAINT fk_e28611365 FOREIGN KEY (userId) REFERENCES ast_User_T(userId);



exit;