




DB_PATH=/tmp/applifire/db/5VJPOC7D2FDIKLMY2RVZ3Q/6BE6DB6D-9D38-4A34-8DE5-68F3A79FF98C
ORACLE_HOME=/u01/app/oracle/product/11.2.0/xe
ORACLE_SID=XE
PATH=$PATH:$ORACLE_HOME/bin:$ORACLE_SID
export ORACLE_HOME
export ORACLE_SID
export PATH
USER=repotest
PASSWORD=repotest
HOST=localhost

echo 'drop db starts....'
sqlplus $USER/$PASSWORD @$DB_PATH/drop_db.sql;
sqlplus $USER/$PASSWORD @$DB_PATH/dropSequence.sql;
echo 'drop db ends....'

