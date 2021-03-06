Ext.define('Repotest.repotest.shared.repotest.model.aaaboundedcontext.authentication.SessionDataModel', {
     "extend": "Ext.data.Model",
     "fields": [{
          "name": "primaryKey",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "dataId",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "customerId",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "userId",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "sessionKey",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "dataType",
          "type": "int",
          "defaultValue": ""
     }, {
          "name": "numberValue",
          "type": "int",
          "defaultValue": ""
     }, {
          "name": "dateTimeValue",
          "type": "auto",
          "defaultValue": ""
     }, {
          "name": "stringValue",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "booleanValue",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "jsonValue",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "appSessionId",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "versionId",
          "type": "int",
          "defaultValue": ""
     }, {
          "name": "entityAudit",
          "reference": "EntityAudit"
     }, {
          "name": "primaryDisplay",
          "type": "string",
          "defaultValue": ""
     }]
});