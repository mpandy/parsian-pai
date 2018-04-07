create or replace FUNCTION MEDICALCOVER 
(
  PISHNAHADID IN NUMBER 
) RETURN NUMBER AS 

returnvalue number;

BEGIN

select sarmaye_taahod into returnvalue
from dmn_taahodbimegar 
where 
pishnahad_id = PISHNAHADID and 
noetaahod = 'HAZINE_PEZESHKI';

  RETURN returnvalue;
END MEDICALCOVER;