

ALTER TABLE ast_Login_T ADD CONSTRAINT fk_bb32e456d FOREIGN KEY (contactId) REFERENCES ast_CoreContacts_T(contactId);



ALTER TABLE ast_Login_T ADD CONSTRAINT fk_636eb52ac FOREIGN KEY (userId) REFERENCES ast_User_T(userId);



exit;