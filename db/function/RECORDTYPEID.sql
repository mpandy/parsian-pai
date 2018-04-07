create or replace FUNCTION RECORDTYPEID 
(
  ELHAGHIYEID IN NUMBER 
) RETURN VARCHAR2 AS 

returnvalue VARCHAR2(1);
noeelhaghiye VARCHAR2(255);
mablagheelhaghiye number;

BEGIN

select mablagheelhaghiye, noe_elhaghie 
into mablagheelhaghiye, noeelhaghiye
from dmn_elhaghiye;

if(noeelhaghiye='TAGHIR') then
  
  if(mablagheelhaghiye=0) then
    return '4';
  end if;
  
  if(mablagheelhaghiye > 0) then
    return '2';
  end if;
  
   if(mablagheelhaghiye < 0) then
    return '3';
  end if;
  
end if;

  RETURN 'N/A';
END RECORDTYPEID;