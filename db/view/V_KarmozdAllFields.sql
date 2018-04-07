create view V_KarmozdAllFields as
select  b.shomare as POLICYNO, 
        e.shomareelhaghiye as ENDORSENO, 
        b.tarikhesodoor as ISSUANCEDATE, 
        n.codenamayandegi as AGENCYID, 
        p.haghe_bime_ghabelepardakht*0.28 as AMOUNT,
        1 as TYPE,
        '9' as SUBSYSTEM,
        1 as STATE,
        '' as DESCRIPTION,
        p.haghe_bime_ghabelepardakht as PRM,
        regexp_instr(e.noe_elhaghie ,'TAGHIRECODENAMAYANDEGI') as TAGHEERCODE,
        bz.codebazaryab as BAZARYAB, 
        gh.name as GHARARDAD
from dmn_bimename b
left join dmn_pishnahad p on b.pishnahadefaal_id = p.id
left join dmn_elhaghiye e on e.id = p.elhaghiye_id
left join dmn_vahed n on n.id = p.vahed_id
left join infra_user bz on bz.id = p.bazaryab_id
left join dmn_gharardad gh on gh.id = p.gharardad_id
where b.shomare is not null;