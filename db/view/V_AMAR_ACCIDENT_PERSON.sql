create view V_AMAR_ACCIDENT_PERSON as

select
        
        b.shomare as POLICYNO,
        bimegozar.id as InsuredID,
		bimeshode.id as MainInsuredID,
		concat(concat(bimeshode_shakhs.name, ' '),nvl(bimeshode_shakhs.name_khanevadegi, '')) as MainInsured,
		shoghl.name as job,
        shoghl.defaulttabaghekhatar as JobDangerGroup,
        bimegozar_shakhs.tarikhe_tavalod as BirthDate,
		bimegozar_shakhs.jensiat as Gender,
        bimeshode_shakhs.kode_meli as InsuredNationalID,
		bimeshode_shakhs.MAHALE_TAVALOD as BirthCity,
		bimeshode_shakhs.ADDRESS as Address,
		bimeshode_shakhs.telefon as Phone,
		bimeshode_shakhs.mobile as Mobile		

from

dmn_bimename b join dmn_pishnahad p on b.pishnahadefaal_id = p.id
left join dmn_bimegozar bimegozar on bimegozar.id = p.bimegozar_id
left join dmn_bimeshode bimeshode on bimeshode.id = p.bimeshode_id
left join dmn_shakhs bimegozar_shakhs on bimegozar_shakhs.id = bimegozar.shakhs_id
left join dmn_shakhs bimeshode_shakhs on bimeshode_shakhs.id = bimeshode.shakhsehaghighi_id
left join dmn_shoghl shoghl on shoghl.id = bimeshode.shoghl_id

where b.VAZIATEBIMENAME='DAEM';