create view V_AMAR_ACCIDENT_PORTFODETAIL as

select
        '2610' as POLICYBRANCHID,
        n.codenamayandegi as AGENCYID,
        issuance.codenamayandegi as ISSUANCEID,
        b.shomare as POLICYNO_ENDORSENO,
		    b.bimegare_ghabli as PrevCompanyID,
		    '-' as PrevPolicyID,
		    concat(concat(bimeshode_shakhs.name, ' '),nvl(bimeshode_shakhs.name_khanevadegi, '')) as InsuredName,
        bimegozar.id as InsuredID,
		    p.noebimegozar as InsureType,
        bimegozar_shakhs.jensiat as GovernType,
        nvl(bimegozar_shakhs.kode_meli, bimegozar_shakhs.code_eghtesadi) as EconomicCode_NationalID,
		    bimegozar_shakhs.telefon as Phone,
		    bimegozar_shakhs.mobile as Mobile,
        b.tarikhesodoor as ISSUANCEDATE,
		    p.aztarikh as BeginDate,
        p.tatarikh as EndDate,
		    bz.realName as MarketerName,
		    'haghighi' as MarketerType,
        '' as MarketerGender,
        bz.codeBazaryab as MarketerID,
        '' as MarketerNatiID,
        '1' as Recordtypeid,
        '' as PolicyLen,
        MedicalCover(p.id) as MedicalCover,
        DeadCover(p.id) as DeadCover,
        null as DailyCover,
        null as HospitalCover,
        MedicalRate(p.id) as MedicalRate,
        DeadRate(p.id) as DeadRate,
        null as DailyRate,
        null as HospitalRate,
        NVL2(p.isKarmandi, p.takhfife_goroohi, 0) as EmployeeDiscount,
        null as EmployeeDiscountAmnt,
        '-' as AgreementDiscount,
        '-' as AgreementDiscounAmnt,
		    gh.name as ContractName,
        gh.shomare as ConteractNo,		
		    p.nahveMohasebe as PrmCalc,
		    '1' as Num,
		    p.haghe_bime_notRounded as Allprm,
		    p.haghe_bime_khales as Netprm,
        p.maliat as Tax,
		    null as CreatorID

from

dmn_bimename b join dmn_pishnahad p on b.pishnahadefaal_id = p.id
left join dmn_vahed n on n.id = p.vahed_id
left join dmn_vahed issuance on issuance.id = b.VAHEDESODOOR_ID
left join infra_user bz on bz.id = p.bazaryab_id
left join dmn_gharardad gh on gh.id = p.gharardad_id
left join dmn_bimegozar bimegozar on bimegozar.id = p.bimegozar_id
left join dmn_bimeshode bimeshode on bimeshode.id = p.bimeshode_id
left join dmn_shakhs bimegozar_shakhs on bimegozar_shakhs.id = bimegozar.shakhs_id
left join dmn_shakhs bimeshode_shakhs on bimeshode_shakhs.id = bimeshode.shakhsehaghighi_id



where b.VAZIATEBIMENAME='DAEM'

union 

select
        '2610' as POLICYBRANCHID,
        n.codenamayandegi as AGENCYID,
        issuance.codenamayandegi as ISSUANCEID,
        e.shomareElhaghiye as POLICYNO_ENDORSENO,
		    b.bimegare_ghabli as PrevCompanyID,
		    '-' as PrevPolicyID,
		    concat(concat(bimeshode_shakhs.name, ' '),nvl(bimeshode_shakhs.name_khanevadegi, '')) as InsuredName,
        bimegozar.id as InsuredID,
		    p.noebimegozar as InsureType,
        bimegozar_shakhs.jensiat as GovernType,
        nvl(bimegozar_shakhs.kode_meli, bimegozar_shakhs.code_eghtesadi) as EconomicCode_NationalID,
        bimegozar_shakhs.telefon as Phone,
        bimegozar_shakhs.mobile as Mobile,
        b.tarikhesodoor as ISSUANCEDATE,
		    p.aztarikh as BeginDate,
        p.tatarikh as EndDate,
		    bz.realName as MarketerName,
		    'haghighi' as MarketerType,
		    '' as MarketerGender,
		    bz.codeBazaryab as MarketerID,
        '' as MarketerNatiID,
        RECORDTYPEID_DETAILS(e.id) as Recordtypeid,
        '' as PolicyLen,
        MedicalCover(p.id) as MedicalCover,
        DeadCover(p.id) as DeadCover,
        null as DailyCover,
        null as HospitalCover,
        MedicalRate(p.id) as MedicalRate,
        DeadRate(p.id) as DeadRate,
        null as DailyRate,
        null as HospitalRate,
        NVL2(p.isKarmandi, p.takhfife_goroohi, 0) as EmployeeDiscount,
        null as EmployeeDiscountAmnt,
        '-' as AgreementDiscount,
        '-' as AgreementDiscounAmnt,
		    gh.name as ContractName,
        gh.shomare as ConteractNo,		
		    p.nahveMohasebe as PrmCalc,
		    '0' as Num,
	      p.haghe_bime_notRounded as Allprm,
		    p.haghe_bime_khales as Netprm,
        p.maliat as Tax,
		    null as CreatorID
from

dmn_elhaghiye e join dmn_bimename b on e.bimename_id = b.id
left join dmn_pishnahad p on b.pishnahadefaal_id = p.id
left join dmn_vahed n on n.id = p.vahed_id
left join dmn_vahed issuance on issuance.id = b.VAHEDESODOOR_ID
left join infra_user bz on bz.id = p.bazaryab_id
left join dmn_gharardad gh on gh.id = p.gharardad_id
left join dmn_bimegozar bimegozar on bimegozar.id = p.bimegozar_id
left join dmn_bimeshode bimeshode on bimeshode.id = p.bimeshode_id
left join dmn_shakhs bimegozar_shakhs on bimegozar_shakhs.id = bimegozar.shakhs_id
left join dmn_shakhs bimeshode_shakhs on bimeshode_shakhs.id = bimeshode.shakhsehaghighi_id

where b.VAZIATEBIMENAME='DAEM';

