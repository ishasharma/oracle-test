

ALTER TABLE ast_CommunicationMap_B ADD CONSTRAINT fk_499802d2f FOREIGN KEY (contactId) REFERENCES ast_CoreContacts_T(contactId);



ALTER TABLE ast_CommunicationMap_B ADD CONSTRAINT fk_1def8fa06 FOREIGN KEY (commDataId) REFERENCES ast_CommunicationData_TP(commDataId);



exit;