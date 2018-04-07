create or replace FUNCTION RECORDTYPEID_DETAILS 
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

if(noeelhaghiye='FASKHAZTARAFEBIMEGAR') then
    return '5';
  end if;

if(noeelhaghiye='FASKHAZTARAFEBIMEGOZAR') then
    return '6';
  end if;

if(noeelhaghiye='EBTAL') then
    return '7';
  end if;

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

--dbms_output.put_line(returnvalue);

  RETURN null;
END RECORDTYPEID_DETAILS;