

ALTER TABLE ast_Address_T ADD CONSTRAINT fk_94695bbed FOREIGN KEY (countryId) REFERENCES ast_Country_M(countryId);



ALTER TABLE ast_Address_T ADD CONSTRAINT fk_49da6411a FOREIGN KEY (addressTypeId) REFERENCES ast_AddressType_M(addressTypeId);



ALTER TABLE ast_Address_T ADD CONSTRAINT fk_a6b586725 FOREIGN KEY (cityId) REFERENCES ast_City_M(cityId);



ALTER TABLE ast_Address_T ADD CONSTRAINT fk_1d41ac962 FOREIGN KEY (stateId) REFERENCES ast_State_M(stateId);



exit;