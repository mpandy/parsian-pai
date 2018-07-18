create view DOCLOSTB as

select
shomare_parvande as "CmpDocNo",
'2610' as "MapFldDtlCod",
bm.shomare as "PlcyCmpDocNo",
vhd.code as "MapBrnchCod",
vhd.vahedtype as "MapBrnchT",
kh.TARIKHE_TASHKIL_PARVANDE as "FleDte",
kh.TARIKHE_HADESE as "OcrDate",
kh.TARIKH_ELAM_KHESARAT as "AncDte"

 from DMN_KHESARAT kh join
      dmn_bimename bm on kh.bimename_id = bm.id join
      DMN_VAHED vhd on kh.vahed_id = vhd.id
 