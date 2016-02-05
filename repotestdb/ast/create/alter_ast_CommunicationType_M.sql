

ALTER TABLE ast_CommunicationType_M ADD CONSTRAINT fk_d2235ed99 FOREIGN KEY (commGroupId) REFERENCES ast_CommunicationGroup_M(commGroupId);



exit;