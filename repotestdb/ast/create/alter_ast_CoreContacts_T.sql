

ALTER TABLE ast_CoreContacts_T ADD CONSTRAINT fk_f54f51ba5 FOREIGN KEY (timeZoneId) REFERENCES ast_Timezone_M(timeZoneId);



ALTER TABLE ast_CoreContacts_T ADD CONSTRAINT fk_0ac07e0b3 FOREIGN KEY (genderId) REFERENCES ast_Gender_M(genderId);



ALTER TABLE ast_CoreContacts_T ADD CONSTRAINT fk_3999fae65 FOREIGN KEY (titleId) REFERENCES ast_Title_M(titleId);



ALTER TABLE ast_CoreContacts_T ADD CONSTRAINT fk_4b6c93ac2 FOREIGN KEY (nativeLanguageCode) REFERENCES ast_Language_M(languageId);



exit;