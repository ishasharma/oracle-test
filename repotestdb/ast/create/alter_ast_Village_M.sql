

ALTER TABLE ast_Village_M ADD CONSTRAINT fk_8359b6bff FOREIGN KEY (countryId) REFERENCES ast_Country_M(countryId);



ALTER TABLE ast_Village_M ADD CONSTRAINT fk_1111f46a7 FOREIGN KEY (regionId) REFERENCES ast_Region_M(regionId);



ALTER TABLE ast_Village_M ADD CONSTRAINT fk_d24721dbe FOREIGN KEY (talukaaId) REFERENCES ast_Taluka_M(talukaId);



ALTER TABLE ast_Village_M ADD CONSTRAINT fk_96af8ed7d FOREIGN KEY (districtId) REFERENCES ast_District_M(districtId);



ALTER TABLE ast_Village_M ADD CONSTRAINT fk_e8d13682c FOREIGN KEY (stateId) REFERENCES ast_State_M(stateId);



exit;