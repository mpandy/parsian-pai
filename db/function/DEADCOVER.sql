create or replace FUNCTION DEADCOVER 
(
  PISHNAHADID IN NUMBER 
) RETURN NUMBER AS 

returnvalue number;

BEGIN
dbms_output.put_line(PISHNAHADID);

select sum(sarmaye_taahod) into returnvalue
from dmn_taahodbimegar 
where 
pishnahad_id = PISHNAHADID and noetaahod = 'FOT';

dbms_output.put_line(returnvalue);

  RETURN returnvalue;
END DEADCOVER;