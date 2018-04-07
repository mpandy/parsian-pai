create or replace FUNCTION MEDICALRATE 
(
  PISHNAHADID IN NUMBER 
) RETURN NUMBER AS 

returnvalue number;

BEGIN

select nerkh_taahod into returnvalue
from dmn_taahodbimegar 
where 
pishnahad_id = PISHNAHADID and 
noetaahod = 'HAZINE_PEZESHKI';

dbms_output.put_line(returnvalue);

  RETURN returnvalue;
END MEDICALRATE;