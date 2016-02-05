

ALTER TABLE ast_Region_M ADD CONSTRAINT fk_48f987a49 FOREIGN KEY (countryId) REFERENCES ast_Country_M(countryId);



ALTER TABLE ast_Region_M ADD CONSTRAINT fk_e6063e185 FOREIGN KEY (stateId) REFERENCES ast_State_M(stateId);



exit;