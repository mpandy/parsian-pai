create view LOSTB as

select
kh.shomare_parvande as "DocLosCmpDocNo",
h_kh.shomareHavale as "LosCmpDocNo",
'2610' as "MapFldDtlCod",
bm.shomare as "PlcyCmpDocNo",
vhd.code as "MapBrnchCod",
vhd.vahedtype as "MapBrnchT",
h_kh.tarikhSodoorHavale as "PayDte",
h_kh.mablaghhavale as "Amnt",
h_kh.name_daryaft_konande as "LosRcv",
h_kh.kodemelli_daryaft_konande as "LosRcvNtnlId"

 from     DMN_HAVALEKHESARAT h_kh join
          DMN_KHESARAT kh on h_kh.khesarat_id = kh.id join
          dmn_bimename bm on kh.bimename_id = bm.id join
          DMN_VAHED vhd on kh.vahed_id = vhd.id;
