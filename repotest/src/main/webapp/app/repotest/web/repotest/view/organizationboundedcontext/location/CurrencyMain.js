Ext.define('Repotest.repotest.web.repotest.view.organizationboundedcontext.location.CurrencyMain', {
     "extend": "Ext.tab.Panel",
     "customWidgetType": "vdTabLayout",
     "autoScroll": false,
     "controller": "CurrencyMainController",
     "restURL": "/Currency",
     "defaults": {
          "split": true
     },
     "requires": ["Repotest.repotest.shared.repotest.model.organizationboundedcontext.location.CurrencyModel", "Repotest.repotest.web.repotest.controller.organizationboundedcontext.location.CurrencyMainController", "Repotest.repotest.shared.repotest.model.organizationboundedcontext.location.CountryModel", "Repotest.repotest.shared.repotest.viewmodel.organizationboundedcontext.location.CurrencyViewModel"],
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
               "displayName": "Currency",
               "name": "CurrencyTreeContainer",
               "itemId": "CurrencyTreeContainer",
               "restURL": "/Currency",
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
                    "itemId": "CurrencyTree",
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
                    "items": [{
                         "name": "currencyId",
                         "itemId": "currencyId",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Currency Code",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Currency Code",
                         "fieldId": "FF79FB6D-2165-47A5-81F6-CA912AC01AEB",
                         "minLength": "0",
                         "maxLength": "64",
                         "hidden": true,
                         "value": ""
                    }, {
                         "name": "countryId",
                         "itemId": "countryId",
                         "xtype": "combo",
                         "customWidgetType": "vdCombo",
                         "displayName": "Country Code",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Country Code",
                         "fieldId": "04B272E1-7FB8-4568-AC1B-9E18A6C7246C",
                         "restURL": "Country",
                         "displayField": "primaryDisplay",
                         "valueField": "primaryKey",
                         "typeAhead": true,
                         "queryMode": "local",
                         "minChars": 2,
                         "store": {
                              "data": [],
                              "model": "Repotest.repotest.shared.repotest.model.organizationboundedcontext.location.CountryModel"
                         }
                    }]
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
                    "viewModel": "CurrencyViewModel",
                    "xtype": "form",
                    "displayName": "Currency",
                    "title": "Currency",
                    "name": "Currency",
                    "itemId": "Currency",
                    "bodyPadding": 10,
                    "items": [{
                         "name": "currencyId",
                         "itemId": "currencyId",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Currency Code",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Currency Code<font color='red'> *<\/font>",
                         "fieldId": "FF79FB6D-2165-47A5-81F6-CA912AC01AEB",
                         "minLength": "0",
                         "maxLength": "64",
                         "hidden": true,
                         "value": "",
                         "bindable": "currencyId",
                         "bind": "{currencyId}"
                    }, {
                         "name": "countryId",
                         "itemId": "countryId",
                         "xtype": "combo",
                         "customWidgetType": "vdCombo",
                         "displayName": "Country Code",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Country Code<font color='red'> *<\/font>",
                         "allowBlank": false,
                         "fieldId": "04B272E1-7FB8-4568-AC1B-9E18A6C7246C",
                         "restURL": "Country",
                         "displayField": "primaryDisplay",
                         "valueField": "primaryKey",
                         "typeAhead": true,
                         "queryMode": "local",
                         "minChars": 2,
                         "store": {
                              "data": [],
                              "model": "Repotest.repotest.shared.repotest.model.organizationboundedcontext.location.CountryModel"
                         },
                         "bindable": "countryId",
                         "bind": "{countryId}",
                         "columnWidth": 0.5
                    }, {
                         "name": "currencyCode",
                         "itemId": "currencyCode",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Currency",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Currency",
                         "fieldId": "C6DB42A3-6CC8-4C9A-B63A-2D7FB60E1916",
                         "minLength": "0",
                         "maxLength": "128",
                         "bindable": "currencyCode",
                         "bind": "{currencyCode}",
                         "columnWidth": 0.5
                    }, {
                         "name": "unicodeDecimal",
                         "itemId": "unicodeDecimal",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Unicode Descimal",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Unicode Descimal",
                         "fieldId": "D532D648-4022-4741-BB14-473F07E10D72",
                         "minLength": "0",
                         "maxLength": "128",
                         "bindable": "unicodeDecimal",
                         "bind": "{unicodeDecimal}",
                         "columnWidth": 0.5
                    }, {
                         "name": "unicodeHex",
                         "itemId": "unicodeHex",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "unicode Hex",
                         "margin": "5 5 5 5",
                         "fieldLabel": "unicode Hex",
                         "fieldId": "F76CB51D-C25E-482E-9BDC-A0D56D5349AE",
                         "minLength": "0",
                         "maxLength": "128",
                         "bindable": "unicodeHex",
                         "bind": "{unicodeHex}",
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
                         "fieldId": "0B96DC7A-82AF-4FF1-B982-25D9FC99A0E8",
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
                         "customId": 261,
                         "items": [{
                              "xtype": "tbfill",
                              "customWidgetType": "vdTbFill",
                              "parentId": 261,
                              "customId": 976
                         }, {
                              "customWidgetType": "vdButton",
                              "xtype": "button",
                              "margin": "0 5 0 5",
                              "text": "Save",
                              "hiddenName": "button",
                              "canHaveParent": false,
                              "itemId": "saveFormButton",
                              "parentId": 261,
                              "customId": 977,
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
                              "parentId": 261,
                              "customId": 978,
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
                    "displayName": "Currency",
                    "title": "Details Grid",
                    "name": "CurrencyGrid",
                    "itemId": "CurrencyGrid",
                    "restURL": "/Currency",
                    "store": [],
                    "bodyPadding": 10,
                    "columns": [{
                         "header": "Currency Code",
                         "dataIndex": "currencyId",
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
                         "header": "Country Code",
                         "dataIndex": "countryId",
                         "renderer": "renderFormValue",
                         "flex": 1
                    }, {
                         "header": "Currency",
                         "dataIndex": "currencyCode",
                         "flex": 1
                    }, {
                         "header": "Unicode Descimal",
                         "dataIndex": "unicodeDecimal",
                         "flex": 1
                    }, {
                         "header": "unicode Hex",
                         "dataIndex": "unicodeHex",
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
               "viewModel": "CurrencyViewModel",
               "xtype": "form",
               "displayName": "Currency",
               "title": "Currency",
               "name": "Currency",
               "itemId": "Currency",
               "bodyPadding": 10,
               "items": [{
                    "name": "currencyId",
                    "itemId": "currencyId",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Currency Code",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Currency Code<font color='red'> *<\/font>",
                    "fieldId": "FF79FB6D-2165-47A5-81F6-CA912AC01AEB",
                    "minLength": "0",
                    "maxLength": "64",
                    "hidden": true,
                    "value": "",
                    "bindable": "currencyId",
                    "bind": "{currencyId}"
               }, {
                    "name": "countryId",
                    "itemId": "countryId",
                    "xtype": "combo",
                    "customWidgetType": "vdCombo",
                    "displayName": "Country Code",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Country Code<font color='red'> *<\/font>",
                    "allowBlank": false,
                    "fieldId": "04B272E1-7FB8-4568-AC1B-9E18A6C7246C",
                    "restURL": "Country",
                    "displayField": "primaryDisplay",
                    "valueField": "primaryKey",
                    "typeAhead": true,
                    "queryMode": "local",
                    "minChars": 2,
                    "store": {
                         "data": [],
                         "model": "Repotest.repotest.shared.repotest.model.organizationboundedcontext.location.CountryModel"
                    },
                    "bindable": "countryId",
                    "bind": "{countryId}",
                    "columnWidth": 0.5
               }, {
                    "name": "currencyCode",
                    "itemId": "currencyCode",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Currency",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Currency",
                    "fieldId": "C6DB42A3-6CC8-4C9A-B63A-2D7FB60E1916",
                    "minLength": "0",
                    "maxLength": "128",
                    "bindable": "currencyCode",
                    "bind": "{currencyCode}",
                    "columnWidth": 0.5
               }, {
                    "name": "unicodeDecimal",
                    "itemId": "unicodeDecimal",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Unicode Descimal",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Unicode Descimal",
                    "fieldId": "D532D648-4022-4741-BB14-473F07E10D72",
                    "minLength": "0",
                    "maxLength": "128",
                    "bindable": "unicodeDecimal",
                    "bind": "{unicodeDecimal}",
                    "columnWidth": 0.5
               }, {
                    "name": "unicodeHex",
                    "itemId": "unicodeHex",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "unicode Hex",
                    "margin": "5 5 5 5",
                    "fieldLabel": "unicode Hex",
                    "fieldId": "F76CB51D-C25E-482E-9BDC-A0D56D5349AE",
                    "minLength": "0",
                    "maxLength": "128",
                    "bindable": "unicodeHex",
                    "bind": "{unicodeHex}",
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
                    "fieldId": "0B96DC7A-82AF-4FF1-B982-25D9FC99A0E8",
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
                    "customId": 261,
                    "items": [{
                         "xtype": "tbfill",
                         "customWidgetType": "vdTbFill",
                         "parentId": 261,
                         "customId": 976
                    }, {
                         "customWidgetType": "vdButton",
                         "xtype": "button",
                         "margin": "0 5 0 5",
                         "text": "Save",
                         "hiddenName": "button",
                         "canHaveParent": false,
                         "itemId": "saveFormButton",
                         "parentId": 261,
                         "customId": 977,
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
                         "parentId": 261,
                         "customId": 978,
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