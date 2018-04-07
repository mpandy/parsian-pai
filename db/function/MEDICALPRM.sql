create or replace FUNCTION MEDICALPRM 
(
  PISHNAHADID IN NUMBER 
) RETURN NUMBER AS 

returnvalue number;

BEGIN

select hagh_bime_taahod into returnvalue
from dmn_taahodbimegar 
where 
pishnahad_id = PISHNAHADID and 
noetaahod = 'HAZINE_PEZESHKI';

  RETURN returnvalue;
END MEDICALPRM;