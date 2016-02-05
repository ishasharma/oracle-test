Ext.define('Repotest.repotest.web.repotest.view.organizationboundedcontext.location.LanguageMain', {
     "extend": "Ext.tab.Panel",
     "customWidgetType": "vdTabLayout",
     "autoScroll": false,
     "controller": "LanguageMainController",
     "restURL": "/Language",
     "defaults": {
          "split": true
     },
     "requires": ["Repotest.repotest.shared.repotest.model.organizationboundedcontext.location.LanguageModel", "Repotest.repotest.web.repotest.controller.organizationboundedcontext.location.LanguageMainController", "Repotest.repotest.shared.repotest.viewmodel.organizationboundedcontext.location.LanguageViewModel"],
     "communicationLog": [],
     "tabPosition": "bottom",
     "items": [{
          "title": "Data Browser",
          "layout": "border",
          "defaults": {
               "split": true
          },
          "autoScroll": false,
          "customWidgetType": "vdBorderLayout",
          "items": [{
               "xtype": "tabpanel",
               "customWidgetType": "vdTabLayout",
               "margin": "5 0 5 5",
               "border": 1,
               "style": {
                    "borderColor": "#f6f6f6",
                    "borderStyle": "solid",
                    "borderWidth": "1px"
               },
               "displayName": "Language",
               "name": "LanguageTreeContainer",
               "itemId": "LanguageTreeContainer",
               "restURL": "/Language",
               "autoScroll": false,
               "collapsible": true,
               "titleCollapse": true,
               "collapseMode": "header",
               "collapsed": false,
               "items": [{
                    "xtype": "treepanel",
                    "customWidgetType": "vdTree",
                    "title": "Browse",
                    "useArrows": true,
                    "rootVisible": false,
                    "itemId": "LanguageTree",
                    "listeners": {
                         "select": "treeClick"
                    },
                    "tbar": [{
                         "xtype": "triggerfield",
                         "customWidgetType": "vdTriggerField",
                         "emptyText": "Search",
                         "triggerCls": "",
                         "listeners": {
                              "change": "onTriggerfieldChange",
                              "buffer": 250
                         }
                    }, "->", {
                         "xtype": "tool",
                         "type": "refresh",
                         "tooltip": "Refresh Tree Data",
                         "handler": "onTreeRefreshClick"
                    }]
               }, {
                    "title": "Advance Search",
                    "xtype": "form",
                    "customWidgetType": "vdFormpanel",
                    "itemId": "queryPanel",
                    "dockedItems": [{
                         "xtype ": "toolbar",
                         "customWidgetType": "vdBBar",
                         "dock": "bottom",
                         "isDockedItem": true,
                         "items": [{
                              "xtype": "tbfill",
                              "customWidgetType": "vdTbFill"
                         }, {
                              "xtype": "button",
                              "customWidgetType": "vdButton",
                              "text": "Filter",
                              "handler": "onFilterClick"
                         }]
                    }],
                    "items": []
               }],
               "region": "west",
               "width": "20%"
          }, {
               "region": "center",
               "layout": "border",
               "defaults": {
                    "split": true
               },
               "customWidgetType": "vdBorderLayout",
               "items": [{
                    "customWidgetType": "vdFormpanel",
                    "viewModel": "LanguageViewModel",
                    "xtype": "form",
                    "displayName": "Language",
                    "title": "Language",
                    "name": "Language",
                    "itemId": "Language",
                    "bodyPadding": 10,
                    "items": [{
                         "name": "languageId",
                         "itemId": "languageId",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Language Id",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Language Id<font color='red'> *<\/font>",
                         "fieldId": "EF302506-B0A5-4C6A-942E-575CB7304801",
                         "minLength": "0",
                         "maxLength": "64",
                         "hidden": true,
                         "value": "",
                         "bindable": "languageId",
                         "bind": "{languageId}"
                    }, {
                         "name": "language",
                         "itemId": "language",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Language",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Language<font color='red'> *<\/font>",
                         "allowBlank": false,
                         "fieldId": "5593921A-B416-4777-8481-C45A62EF0AEB",
                         "minLength": "0",
                         "maxLength": "256",
                         "bindable": "language",
                         "bind": "{language}",
                         "columnWidth": 0.5
                    }, {
                         "name": "languageType",
                         "itemId": "languageType",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Language Type",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Language Type",
                         "fieldId": "7B410489-19AC-4795-9768-3C7DF18DE6FD",
                         "minLength": "0",
                         "maxLength": "32",
                         "bindable": "languageType",
                         "bind": "{languageType}",
                         "columnWidth": 0.5
                    }, {
                         "name": "languageDescription",
                         "itemId": "languageDescription",
                         "xtype": "textareafield",
                         "customWidgetType": "vdTextareafield",
                         "displayName": "Description",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Description",
                         "fieldId": "2A3C2D9E-8C1E-442E-8863-D125DED0908C",
                         "bindable": "languageDescription",
                         "bind": "{languageDescription}",
                         "columnWidth": 0.5
                    }, {
                         "name": "languageIcon",
                         "itemId": "languageIcon",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Icon",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Icon",
                         "fieldId": "86415091-3FE2-4B72-B90A-27D81F0E0564",
                         "minLength": "0",
                         "maxLength": "128",
                         "bindable": "languageIcon",
                         "bind": "{languageIcon}",
                         "columnWidth": 0.5
                    }, {
                         "name": "alpha2",
                         "itemId": "alpha2",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Alpha 2",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Alpha 2",
                         "fieldId": "33C041A0-0A6F-4F70-A77C-B42202E26877",
                         "minLength": "0",
                         "maxLength": "2",
                         "bindable": "alpha2",
                         "bind": "{alpha2}",
                         "columnWidth": 0.5
                    }, {
                         "name": "alpha3",
                         "itemId": "alpha3",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Alpha 3",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Alpha 3",
                         "fieldId": "43E305C0-0742-4CCC-8CA6-BCA6475215BA",
                         "minLength": "0",
                         "maxLength": "3",
                         "bindable": "alpha3",
                         "bind": "{alpha3}",
                         "columnWidth": 0.5
                    }, {
                         "name": "alpha4",
                         "itemId": "alpha4",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Alpha 4",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Alpha 4",
                         "fieldId": "D0D0105A-084F-412C-B798-702AEEC5E7B8",
                         "minLength": "0",
                         "maxLength": "4",
                         "bindable": "alpha4",
                         "bind": "{alpha4}",
                         "columnWidth": 0.5
                    }, {
                         "name": "alpha4parentid",
                         "itemId": "alpha4parentid",
                         "xtype": "numberfield",
                         "customWidgetType": "vdNumberfield",
                         "displayName": "Aplha4 Parent Id",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Aplha4 Parent Id",
                         "fieldId": "2FA95410-E47A-4D60-85B8-DA32D300EF1E",
                         "minValue": "0",
                         "maxValue": "11",
                         "bindable": "alpha4parentid",
                         "bind": "{alpha4parentid}",
                         "columnWidth": 0.5
                    }, {
                         "name": "versionId",
                         "itemId": "versionId",
                         "xtype": "numberfield",
                         "customWidgetType": "vdNumberfield",
                         "displayName": "versionId",
                         "margin": "5 5 5 5",
                         "value": "-1",
                         "fieldLabel": "versionId",
                         "fieldId": "263EF7C1-BF0A-48E4-9E35-E72E3D08747D",
                         "bindable": "versionId",
                         "bind": "{versionId}",
                         "hidden": true
                    }],
                    "layout": "column",
                    "defaults": {
                         "columnWidth": 0.5,
                         "labelAlign": "left",
                         "labelWidth": 200
                    },
                    "autoScroll": true,
                    "dockedItems": [{
                         "xtype ": "toolbar",
                         "customWidgetType": "vdBBar",
                         "dock": "bottom",
                         "ui": "footer",
                         "isDockedItem": true,
                         "parentId": 1,
                         "customId": 762,
                         "items": [{
                              "xtype": "tbfill",
                              "customWidgetType": "vdTbFill",
                              "parentId": 762,
                              "customId": 729
                         }, {
                              "customWidgetType": "vdButton",
                              "xtype": "button",
                              "margin": "0 5 0 5",
                              "text": "Save",
                              "hiddenName": "button",
                              "canHaveParent": false,
                              "itemId": "saveFormButton",
                              "parentId": 762,
                              "customId": 730,
                              "listeners": {
                                   "click": "saveForm"
                              }
                         }, {
                              "customWidgetType": "vdButton",
                              "xtype": "button",
                              "margin": "0 5 0 5",
                              "text": "Reset",
                              "hiddenName": "button",
                              "canHaveParent": false,
                              "itemId": "resetFormButton",
                              "parentId": 762,
                              "customId": 731,
                              "listeners": {
                                   "click": "resetForm"
                              }
                         }],
                         "defaults": {}
                    }],
                    "listeners": {
                         "scope": "controller"
                    },
                    "tools": [{
                         "type": "help",
                         "tooltip": "Console",
                         "handler": "onConsoleClick"
                    }, {
                         "type": "refresh",
                         "tooltip": "Refresh Tab",
                         "handler": "init"
                    }],
                    "extend": "Ext.form.Panel",
                    "region": "center"
               }, {
                    "xtype": "gridpanel",
                    "customWidgetType": "vdGrid",
                    "displayName": "Language",
                    "title": "Details Grid",
                    "name": "LanguageGrid",
                    "itemId": "LanguageGrid",
                    "restURL": "/Language",
                    "store": [],
                    "bodyPadding": 10,
                    "columns": [{
                         "header": "Language Id",
                         "dataIndex": "languageId",
                         "hidden": true,
                         "flex": 1
                    }, {
                         "header": "primaryDisplay",
                         "dataIndex": "primaryDisplay",
                         "hidden": true
                    }, {
                         "header": "primaryKey",
                         "dataIndex": "primaryKey",
                         "hidden": true
                    }, {
                         "header": "Language",
                         "dataIndex": "language",
                         "flex": 1
                    }, {
                         "header": "Language Type",
                         "dataIndex": "languageType",
                         "flex": 1
                    }, {
                         "header": "Description",
                         "dataIndex": "languageDescription",
                         "flex": 1
                    }, {
                         "header": "Icon",
                         "dataIndex": "languageIcon",
                         "flex": 1
                    }, {
                         "header": "Alpha 2",
                         "dataIndex": "alpha2",
                         "flex": 1
                    }, {
                         "header": "Alpha 3",
                         "dataIndex": "alpha3",
                         "flex": 1
                    }, {
                         "header": "Alpha 4",
                         "dataIndex": "alpha4",
                         "flex": 1
                    }, {
                         "header": "Aplha4 Parent Id",
                         "dataIndex": "alpha4parentid",
                         "flex": 1
                    }, {
                         "header": "createdBy",
                         "dataIndex": "createdBy",
                         "hidden": true,
                         "flex": 1
                    }, {
                         "header": "createdDate",
                         "dataIndex": "createdDate",
                         "hidden": true,
                         "flex": 1
                    }, {
                         "header": "updatedBy",
                         "dataIndex": "updatedBy",
                         "hidden": true,
                         "flex": 1
                    }, {
                         "header": "updatedDate",
                         "dataIndex": "updatedDate",
                         "hidden": true,
                         "flex": 1
                    }, {
                         "header": "versionId",
                         "dataIndex": "versionId",
                         "hidden": true,
                         "flex": 1
                    }, {
                         "header": "activeStatus",
                         "dataIndex": "activeStatus",
                         "hidden": true,
                         "flex": 1
                    }, {
                         "header": "txnAccessCode",
                         "dataIndex": "txnAccessCode",
                         "hidden": true,
                         "flex": 1
                    }, {
                         "xtype": "actioncolumn",
                         "customWidgetType": "vdActionColumn",
                         "width": 30,
                         "sortable": false,
                         "menuDisable": true,
                         "items": [{
                              "icon": "images/delete.gif",
                              "tooltip": "Delete Record",
                              "handler": "onDeleteActionColumnClickMainGrid"
                         }]
                    }],
                    "listeners": {
                         "itemclick": "onGridItemClick"
                    },
                    "tools": [{
                         "type": "refresh",
                         "tooltip": "Refresh Grid Data",
                         "handler": "onGridRefreshClick"
                    }],
                    "collapsible": true,
                    "titleCollapse": true,
                    "collapseMode": "header",
                    "region": "south",
                    "height": "40%"
               }]
          }]
     }, {
          "title": "Add New",
          "itemId": "addNewForm",
          "layout": "border",
          "customWidgetType": "vdBorderLayout",
          "autoScroll": false,
          "items": [{
               "customWidgetType": "vdFormpanel",
               "viewModel": "LanguageViewModel",
               "xtype": "form",
               "displayName": "Language",
               "title": "Language",
               "name": "Language",
               "itemId": "Language",
               "bodyPadding": 10,
               "items": [{
                    "name": "languageId",
                    "itemId": "languageId",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Language Id",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Language Id<font color='red'> *<\/font>",
                    "fieldId": "EF302506-B0A5-4C6A-942E-575CB7304801",
                    "minLength": "0",
                    "maxLength": "64",
                    "hidden": true,
                    "value": "",
                    "bindable": "languageId",
                    "bind": "{languageId}"
               }, {
                    "name": "language",
                    "itemId": "language",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Language",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Language<font color='red'> *<\/font>",
                    "allowBlank": false,
                    "fieldId": "5593921A-B416-4777-8481-C45A62EF0AEB",
                    "minLength": "0",
                    "maxLength": "256",
                    "bindable": "language",
                    "bind": "{language}",
                    "columnWidth": 0.5
               }, {
                    "name": "languageType",
                    "itemId": "languageType",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Language Type",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Language Type",
                    "fieldId": "7B410489-19AC-4795-9768-3C7DF18DE6FD",
                    "minLength": "0",
                    "maxLength": "32",
                    "bindable": "languageType",
                    "bind": "{languageType}",
                    "columnWidth": 0.5
               }, {
                    "name": "languageDescription",
                    "itemId": "languageDescription",
                    "xtype": "textareafield",
                    "customWidgetType": "vdTextareafield",
                    "displayName": "Description",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Description",
                    "fieldId": "2A3C2D9E-8C1E-442E-8863-D125DED0908C",
                    "bindable": "languageDescription",
                    "bind": "{languageDescription}",
                    "columnWidth": 0.5
               }, {
                    "name": "languageIcon",
                    "itemId": "languageIcon",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Icon",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Icon",
                    "fieldId": "86415091-3FE2-4B72-B90A-27D81F0E0564",
                    "minLength": "0",
                    "maxLength": "128",
                    "bindable": "languageIcon",
                    "bind": "{languageIcon}",
                    "columnWidth": 0.5
               }, {
                    "name": "alpha2",
                    "itemId": "alpha2",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Alpha 2",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Alpha 2",
                    "fieldId": "33C041A0-0A6F-4F70-A77C-B42202E26877",
                    "minLength": "0",
                    "maxLength": "2",
                    "bindable": "alpha2",
                    "bind": "{alpha2}",
                    "columnWidth": 0.5
               }, {
                    "name": "alpha3",
                    "itemId": "alpha3",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Alpha 3",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Alpha 3",
                    "fieldId": "43E305C0-0742-4CCC-8CA6-BCA6475215BA",
                    "minLength": "0",
                    "maxLength": "3",
                    "bindable": "alpha3",
                    "bind": "{alpha3}",
                    "columnWidth": 0.5
               }, {
                    "name": "alpha4",
                    "itemId": "alpha4",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Alpha 4",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Alpha 4",
                    "fieldId": "D0D0105A-084F-412C-B798-702AEEC5E7B8",
                    "minLength": "0",
                    "maxLength": "4",
                    "bindable": "alpha4",
                    "bind": "{alpha4}",
                    "columnWidth": 0.5
               }, {
                    "name": "alpha4parentid",
                    "itemId": "alpha4parentid",
                    "xtype": "numberfield",
                    "customWidgetType": "vdNumberfield",
                    "displayName": "Aplha4 Parent Id",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Aplha4 Parent Id",
                    "fieldId": "2FA95410-E47A-4D60-85B8-DA32D300EF1E",
                    "minValue": "0",
                    "maxValue": "11",
                    "bindable": "alpha4parentid",
                    "bind": "{alpha4parentid}",
                    "columnWidth": 0.5
               }, {
                    "name": "versionId",
                    "itemId": "versionId",
                    "xtype": "numberfield",
                    "customWidgetType": "vdNumberfield",
                    "displayName": "versionId",
                    "margin": "5 5 5 5",
                    "value": "-1",
                    "fieldLabel": "versionId",
                    "fieldId": "263EF7C1-BF0A-48E4-9E35-E72E3D08747D",
                    "bindable": "versionId",
                    "bind": "{versionId}",
                    "hidden": true
               }],
               "layout": "column",
               "defaults": {
                    "columnWidth": 0.5,
                    "labelAlign": "left",
                    "labelWidth": 200
               },
               "autoScroll": true,
               "dockedItems": [{
                    "xtype ": "toolbar",
                    "customWidgetType": "vdBBar",
                    "dock": "bottom",
                    "ui": "footer",
                    "isDockedItem": true,
                    "parentId": 1,
                    "customId": 762,
                    "items": [{
                         "xtype": "tbfill",
                         "customWidgetType": "vdTbFill",
                         "parentId": 762,
                         "customId": 729
                    }, {
                         "customWidgetType": "vdButton",
                         "xtype": "button",
                         "margin": "0 5 0 5",
                         "text": "Save",
                         "hiddenName": "button",
                         "canHaveParent": false,
                         "itemId": "saveFormButton",
                         "parentId": 762,
                         "customId": 730,
                         "listeners": {
                              "click": "saveForm"
                         }
                    }, {
                         "customWidgetType": "vdButton",
                         "xtype": "button",
                         "margin": "0 5 0 5",
                         "text": "Reset",
                         "hiddenName": "button",
                         "canHaveParent": false,
                         "itemId": "resetFormButton",
                         "parentId": 762,
                         "customId": 731,
                         "listeners": {
                              "click": "resetForm"
                         }
                    }],
                    "defaults": {}
               }],
               "listeners": {
                    "scope": "controller"
               },
               "tools": [{
                    "type": "help",
                    "tooltip": "Console",
                    "handler": "onConsoleClick"
               }, {
                    "type": "refresh",
                    "tooltip": "Refresh Tab",
                    "handler": "init"
               }],
               "extend": "Ext.form.Panel",
               "region": "center"
          }]
     }]
});