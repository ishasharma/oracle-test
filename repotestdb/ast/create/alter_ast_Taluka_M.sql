

ALTER TABLE ast_Taluka_M ADD CONSTRAINT fk_21c6c5274 FOREIGN KEY (countryId) REFERENCES ast_Country_M(countryId);



ALTER TABLE ast_Taluka_M ADD CONSTRAINT fk_ca8955683 FOREIGN KEY (regionId) REFERENCES ast_Region_M(regionId);



ALTER TABLE ast_Taluka_M ADD CONSTRAINT fk_c21b0953c FOREIGN KEY (districtId) REFERENCES ast_District_M(districtId);



ALTER TABLE ast_Taluka_M ADD CONSTRAINT fk_a0a2de0d2 FOREIGN KEY (stateId) REFERENCES ast_State_M(stateId);



exit;