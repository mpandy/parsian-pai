create view V_AMAR_ACCIDENT_PORTFOLIO as

select
        '2610' as POLICYBRANCHID,
        n.codenamayandegi as AGENCYID,
        issuance.codenamayandegi as ISSUANCEID,
        b.shomare as POLICYNO_ENDORSENO,
        b.tarikhesodoor as ISSUANCEDATE,
        '1' as recordtypeid,
        '1' as Num,
        p.haghe_bime_notRounded as Allprm,
        p.haghe_bime_khales as Netprm,
		    p.maliat as Tax,
        p.haghe_bime_ghabelepardakht as RoundPrm
from

dmn_bimename b join dmn_pishnahad p on b.pishnahadefaal_id = p.id
left join dmn_vahed n on n.id = p.vahed_id
left join dmn_vahed issuance on issuance.id = b.VAHEDESODOOR_ID

where b.VAZIATEBIMENAME='DAEM'

union 

select
        '2610' as POLICYBRANCHID,
        n.codenamayandegi as AGENCYID,
        issuance.codenamayandegi as ISSUANCEID,
        e.shomareelhaghiye as POLICYNO_ENDORSENO,
        e.tarikh_sodoor_elhaghie as ISSUANCEDATE,
        RECORDTYPEID(e.id) as recordtypeid,
        '0' as Num,
        null as Allprm,
        null as Netprm,
        null as Tax,
        null as RoundPrm
from

dmn_elhaghiye e join dmn_bimename b on e.bimename_id = b.id
left join dmn_vahed n on n.id = e.vahed_id
left join dmn_vahed issuance on issuance.id = b.VAHEDESODOOR_ID

where b.VAZIATEBIMENAME='DAEM';

