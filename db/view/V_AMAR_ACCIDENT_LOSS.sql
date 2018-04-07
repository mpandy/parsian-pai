create view V_AMAR_ACCIDENT_LOSS as

select

bim.shomare as PolicyNo,
masoolvahed.codeNamayandegi as BranchID,
khes.shomare_parvande as LossID,
havkhes.shomareHavale as TransferNo,
havkhes.tarikhSodoorHavale as DocumnetDate,
khes.tarikh_elam_khesarat as LossAdviceDate,
khes.tarikhe_hadese as LossDate,
khes.tarikhe_tashkil_parvande as LossfileCreateDate,
khescase.noe_khesarat as LossType,
khescase.mablagh_khesarate_taeedshode as LossPayable,
concat(concat(shakhs.name, ' '), shakhs.name_khanevadegi) as LossReceiver,
shakhs.kode_meli as ReceiverNationID,
khescase.noehadese as LossDesc,
pishvahed.codeNamayandegi as AgencyID,
bimesodoor.codeNamayandegi as IssuanceID

from

dmn_bimename bim join dmn_pishnahad pish on bim.pishnahadefaal_id = pish.id
left join dmn_khesarat khes on bim.id = khes.bimename_id
left join dmn_khesaratcase khescase on khes.id = khescase.khesarat_id
left join dmn_havalekhesarat havkhes on khes.id = havkhes.khesarat_id
left join dmn_bimeshode bimeshode on pish.bimeshode_id = bimeshode.id
left join dmn_shakhs shakhs on shakhs.id = bimeshode.shakhsehaghighi_id
left join infra_user masoolparvande on khes.masool_parvande_id = masoolparvande.id
left join dmn_vahed masoolvahed on masoolvahed.id = masoolparvande.vahed_id
left join dmn_vahed pishvahed on pishvahed.id = pish.vahed_id
left join dmn_vahed bimesodoor on bimesodoor.id = bim.vahedeSodoor_id;

