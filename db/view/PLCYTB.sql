create view PLCYTB as

select
bm.shomare as "CmpDocNo",
'2610' as "MapFldDtlCod",
sodoor.code as "MapBrnchCod",
sodoor.vahedtype as "MapBrnchT",
pish.noebimegozar as "MapPrsnTypCod",
CONCAT(CONCAT(gozarshakhs.NAME , ' '), gozarshakhs.NAME_KHANEVADEGI) as "InsNam",
gozarshakhs.kode_meli as "NtnlId",
gozarshakhs.TELEFON as "Tel",
gozarshakhs.mobile as "Mob",
gozarshakhs.code_posti as "ZipCod",
bm.tarikhesodoor as  "IsuDte",	      
pish.aztarikh as  "BgnDte",	      
pish.tatarikh as "EndDte",	      
pish.haghe_bime_khales as "Prm",	      
taahodfot.sarmaye_taahod as "Cptl",
pish.tarikh_pishnahad as "RegDte",
pish.maliat as "Tax",
pish.karmozd as "Wag"


 from  DMN_BIMENAME bm join
          DMN_VAHED sodoor on bm.VAHEDESODOOR_ID = sodoor.id join
          DMN_PISHNAHAD pish on bm.PISHNAHADEFAAL_ID = pish.id join
          dmn_bimeshode shode on shode.id = pish.bimeshode_id join
          DMN_BIMEGOZAR gozar on gozar.id = pish.BIMEGOZAR_ID join 
          DMN_SHAKHS gozarshakhs on gozarshakhs.id = gozar.SHAKHS_ID join
          DMN_TAAHODBIMEGAR taahodfot on taahodfot.pishnahad_id = pish.id
          
   where taahodfot.noetaahod = 'FOT';      
         