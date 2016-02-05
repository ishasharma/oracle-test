




ORACLE_HOME=/u01/app/oracle/product/11.2.0/xe
ORACLE_SID=XE
PATH=$PATH:$ORACLE_HOME/bin:$ORACLE_SID
export ORACLE_HOME
export ORACLE_SID
export PATH
OSNAME=`uname -s`
ART_DATA_PATH=/tmp/applifire/db/5VJPOC7D2FDIKLMY2RVZ3Q/6BE6DB6D-9D38-4A34-8DE5-68F3A79FF98C/art/data
AST_DATA_PATH=/tmp/applifire/db/5VJPOC7D2FDIKLMY2RVZ3Q/6BE6DB6D-9D38-4A34-8DE5-68F3A79FF98C/ast/data
ART_CTL_PATH=/tmp/applifire/db/5VJPOC7D2FDIKLMY2RVZ3Q/6BE6DB6D-9D38-4A34-8DE5-68F3A79FF98C/art/ctlFiles
ART_CTL_LOG_PATH=/tmp/applifire/db/5VJPOC7D2FDIKLMY2RVZ3Q/6BE6DB6D-9D38-4A34-8DE5-68F3A79FF98C/art/ctlLogs
AST_CTL_PATH=/tmp/applifire/db/5VJPOC7D2FDIKLMY2RVZ3Q/6BE6DB6D-9D38-4A34-8DE5-68F3A79FF98C/ast/ctlFiles
AST_CTL_LOG_PATH=/tmp/applifire/db/5VJPOC7D2FDIKLMY2RVZ3Q/6BE6DB6D-9D38-4A34-8DE5-68F3A79FF98C/ast/ctlLogs


APPLFIREUSER=root
APPLFIREPASSWORD=root
APPLFIREHOST=localhost



DB_NAME=repotest
USER=repotest
PASSWORD=repotest
PORT=1521
HOST=localhost


echo 'load ART data starts....'#appfirenewline#echo 'load AST data ends....'#appfirenewline#echo ' load ART data starts....'
sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_query.ctl log=$ART_CTL_LOG_PATH/art_query.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_enum.ctl log=$ART_CTL_LOG_PATH/art_enum.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_enum_details.ctl log=$ART_CTL_LOG_PATH/art_enum_details.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_report_ui.ctl log=$ART_CTL_LOG_PATH/art_report_ui.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_table_details.ctl log=$ART_CTL_LOG_PATH/art_table_details.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_table_field_details.ctl log=$ART_CTL_LOG_PATH/art_table_field_details.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_table_entity_relation.ctl log=$ART_CTL_LOG_PATH/art_table_entity_relation.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_database_aggregate.ctl log=$ART_CTL_LOG_PATH/art_database_aggregate.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_database_function.ctl log=$ART_CTL_LOG_PATH/art_database_function.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_database_operators.ctl log=$ART_CTL_LOG_PATH/art_database_operators.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_component_config.ctl log=$ART_CTL_LOG_PATH/art_component_config.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_log_severity_m.ctl log=$ART_CTL_LOG_PATH/art_log_severity_m.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_log_events_t.ctl log=$ART_CTL_LOG_PATH/art_log_events_t.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_chart_json.ctl log=$ART_CTL_LOG_PATH/art_chart_json.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_chart_category.ctl log=$ART_CTL_LOG_PATH/art_chart_category.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_chart_type.ctl log=$ART_CTL_LOG_PATH/art_chart_type.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_chart_data_field_json.ctl log=$ART_CTL_LOG_PATH/art_chart_data_field_json.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_lang_master.ctl log=$ART_CTL_LOG_PATH/art_lang_master.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_chart_properties.ctl log=$ART_CTL_LOG_PATH/art_chart_properties.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_chart_prop_language.ctl log=$ART_CTL_LOG_PATH/art_chart_prop_language.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_chart_template.ctl log=$ART_CTL_LOG_PATH/art_chart_template.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_report_builder_details.ctl log=$ART_CTL_LOG_PATH/art_report_builder_details.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_service.ctl log=$ART_CTL_LOG_PATH/art_service.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_service_operation.ctl log=$ART_CTL_LOG_PATH/art_service_operation.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_log_config_m.ctl log=$ART_CTL_LOG_PATH/art_log_config_m.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_log_config_attributes.ctl log=$ART_CTL_LOG_PATH/art_log_config_attributes.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_log_connector_m.ctl log=$ART_CTL_LOG_PATH/art_log_connector_m.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_log_connector_attributes_m.ctl log=$ART_CTL_LOG_PATH/art_log_connector_attributes_m.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_log_module.ctl log=$ART_CTL_LOG_PATH/art_log_module.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_app_alarm.ctl log=$ART_CTL_LOG_PATH/art_app_alarm.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_password_algorithm.ctl log=$ART_CTL_LOG_PATH/art_password_algorithm.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_password_policy.ctl log=$ART_CTL_LOG_PATH/art_password_policy.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_health_scheduler_config_m.ctl log=$ART_CTL_LOG_PATH/art_health_scheduler_config_m.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_health_status_config_m.ctl log=$ART_CTL_LOG_PATH/art_health_status_config_m.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/cloud_drive_file_content_type.ctl log=$ART_CTL_LOG_PATH/cloud_drive_file_content_type.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/cloud_drive_tags.ctl log=$ART_CTL_LOG_PATH/cloud_drive_tags.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_rules.ctl log=$ART_CTL_LOG_PATH/art_rules.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_external_integration.ctl log=$ART_CTL_LOG_PATH/art_external_integration.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_job_details.ctl log=$ART_CTL_LOG_PATH/art_job_details.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_scheduler_details.ctl log=$ART_CTL_LOG_PATH/art_scheduler_details.log

sqlldr $USER/$PASSWORD control=$ART_CTL_PATH/art_schedule_config.ctl log=$ART_CTL_LOG_PATH/art_schedule_config.log

echo 'load ART data ends....'

echo 'load AST data starts....'
sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_Timezone_M.ctl log=$AST_CTL_LOG_PATH/ast_Timezone_M.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_Language_M.ctl log=$AST_CTL_LOG_PATH/ast_Language_M.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_Country_M.ctl log=$AST_CTL_LOG_PATH/ast_Country_M.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_Currency_M.ctl log=$AST_CTL_LOG_PATH/ast_Currency_M.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_State_M.ctl log=$AST_CTL_LOG_PATH/ast_State_M.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_Region_M.ctl log=$AST_CTL_LOG_PATH/ast_Region_M.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_District_M.ctl log=$AST_CTL_LOG_PATH/ast_District_M.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_City_M.ctl log=$AST_CTL_LOG_PATH/ast_City_M.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_Taluka_M.ctl log=$AST_CTL_LOG_PATH/ast_Taluka_M.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_Village_M.ctl log=$AST_CTL_LOG_PATH/ast_Village_M.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_AddressType_M.ctl log=$AST_CTL_LOG_PATH/ast_AddressType_M.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_Address_T.ctl log=$AST_CTL_LOG_PATH/ast_Address_T.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_AddressExtended_TP.ctl log=$AST_CTL_LOG_PATH/ast_AddressExtended_TP.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_ContactType_M.ctl log=$AST_CTL_LOG_PATH/ast_ContactType_M.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_CommunicationGroup_M.ctl log=$AST_CTL_LOG_PATH/ast_CommunicationGroup_M.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_CommunicationType_M.ctl log=$AST_CTL_LOG_PATH/ast_CommunicationType_M.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_Gender_M.ctl log=$AST_CTL_LOG_PATH/ast_Gender_M.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_Title_M.ctl log=$AST_CTL_LOG_PATH/ast_Title_M.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_CoreContacts_T.ctl log=$AST_CTL_LOG_PATH/ast_CoreContacts_T.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_AddressMap_B.ctl log=$AST_CTL_LOG_PATH/ast_AddressMap_B.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_CommunicationData_TP.ctl log=$AST_CTL_LOG_PATH/ast_CommunicationData_TP.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_CommunicationMap_B.ctl log=$AST_CTL_LOG_PATH/ast_CommunicationMap_B.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_UserAccessLevel_M.ctl log=$AST_CTL_LOG_PATH/ast_UserAccessLevel_M.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_UserAccessDomain_M.ctl log=$AST_CTL_LOG_PATH/ast_UserAccessDomain_M.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_User_T.ctl log=$AST_CTL_LOG_PATH/ast_User_T.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_Login_T.ctl log=$AST_CTL_LOG_PATH/ast_Login_T.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_LoginSession_T.ctl log=$AST_CTL_LOG_PATH/ast_LoginSession_T.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_UserAppState_T.ctl log=$AST_CTL_LOG_PATH/ast_UserAppState_T.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_PassRecovery_TP.ctl log=$AST_CTL_LOG_PATH/ast_PassRecovery_TP.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_UserData_TP.ctl log=$AST_CTL_LOG_PATH/ast_UserData_TP.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_SessionData_T.ctl log=$AST_CTL_LOG_PATH/ast_SessionData_T.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_Roles_T.ctl log=$AST_CTL_LOG_PATH/ast_Roles_T.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/ast_UserRoleBridge_T.ctl log=$AST_CTL_LOG_PATH/ast_UserRoleBridge_T.log

echo 'load AST data ends....'

echo 'load AST data starts....'
sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/AppMenus.ctl log=$AST_CTL_LOG_PATH/ast_AppMenus_M.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/RoleMenuBridge.ctl log=$AST_CTL_LOG_PATH/ast_RoleMenuBridge_TP.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/PasswordPolicy.ctl log=$AST_CTL_LOG_PATH/ast_PasswordPolicy_M.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/Question.ctl log=$AST_CTL_LOG_PATH/ast_Question_M.log

sqlldr $USER/$PASSWORD control=$AST_CTL_PATH/PasswordAlgo.ctl log=$AST_CTL_LOG_PATH/ast_PasswordAlgo_M.log

echo 'load AST data ends....'
