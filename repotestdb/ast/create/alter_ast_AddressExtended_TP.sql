

ALTER TABLE ast_AddressExtended_TP ADD CONSTRAINT fk_333fcf12b FOREIGN KEY (talukaId) REFERENCES ast_Taluka_M(talukaId);



ALTER TABLE ast_AddressExtended_TP ADD CONSTRAINT fk_72e1c0055 FOREIGN KEY (regionId) REFERENCES ast_Region_M(regionId);



ALTER TABLE ast_AddressExtended_TP ADD CONSTRAINT fk_63223ffce FOREIGN KEY (districtId) REFERENCES ast_District_M(districtId);



ALTER TABLE ast_AddressExtended_TP ADD CONSTRAINT fk_79e5a6538 FOREIGN KEY (addressId) REFERENCES ast_Address_T(addressId);



ALTER TABLE ast_AddressExtended_TP ADD CONSTRAINT fk_ad1be69f0 FOREIGN KEY (villageId) REFERENCES ast_Village_M(villageId);



exit;