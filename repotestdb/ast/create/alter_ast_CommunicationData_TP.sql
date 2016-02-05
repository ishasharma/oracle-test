

ALTER TABLE ast_CommunicationData_TP ADD CONSTRAINT fk_0868945da FOREIGN KEY (commGroupId) REFERENCES ast_CommunicationGroup_M(commGroupId);



ALTER TABLE ast_CommunicationData_TP ADD CONSTRAINT fk_e5b97b32b FOREIGN KEY (commType) REFERENCES ast_CommunicationType_M(commType);



exit;