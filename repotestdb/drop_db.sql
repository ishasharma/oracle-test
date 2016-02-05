connect sys/oracle as sysdba
declare
v_exists integer;
begin
SELECT count(*) INTO v_exists FROM dba_tablespaces WHERE tablespace_name = 'REPOTEST';
if(v_exists>0) then
execute immediate 'DROP TABLESPACE repotest INCLUDING CONTENTS AND DATAFILES';
end if;
end;
/
exit;
