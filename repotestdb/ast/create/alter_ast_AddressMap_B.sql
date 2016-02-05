

ALTER TABLE ast_AddressMap_B ADD CONSTRAINT fk_da77ee8d1 FOREIGN KEY (contactId) REFERENCES ast_CoreContacts_T(contactId);



ALTER TABLE ast_AddressMap_B ADD CONSTRAINT fk_038e7944a FOREIGN KEY (addressId) REFERENCES ast_Address_T(addressId);



exit;