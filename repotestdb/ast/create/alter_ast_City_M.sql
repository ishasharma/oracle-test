

ALTER TABLE ast_City_M ADD CONSTRAINT fk_d04981d94 FOREIGN KEY (countryId) REFERENCES ast_Country_M(countryId);



ALTER TABLE ast_City_M ADD CONSTRAINT fk_4b95dc066 FOREIGN KEY (stateId) REFERENCES ast_State_M(stateId);



exit;