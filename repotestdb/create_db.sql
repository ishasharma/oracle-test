
connect sys/oracle as sysdba
create tablespace repotest DATAFILE '/u01/app/oracle/oradata/repotest.dbf' SIZE 100M EXTENT MANAGEMENT LOCAL AUTOALLOCATE;
declare
userexist integer;
begin
select count(*) into userexist from dba_users where username='REPOTEST';
if (userexist = 0) then
execute immediate 'create user repotest identified by repotest default tablespace repotest';
end if;
end;
/
ALTER USER "REPOTEST" DEFAULT TABLESPACE "REPOTEST" TEMPORARY TABLESPACE "TEMP" ACCOUNT UNLOCK ;
exit;