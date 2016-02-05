

ALTER TABLE ast_District_M ADD CONSTRAINT fk_d104af5ae FOREIGN KEY (countryId) REFERENCES ast_Country_M(countryId);



ALTER TABLE ast_District_M ADD CONSTRAINT fk_6b8d617ed FOREIGN KEY (regionId) REFERENCES ast_Region_M(regionId);



ALTER TABLE ast_District_M ADD CONSTRAINT fk_7b1c3da8c FOREIGN KEY (stateId) REFERENCES ast_State_M(stateId);



exit;