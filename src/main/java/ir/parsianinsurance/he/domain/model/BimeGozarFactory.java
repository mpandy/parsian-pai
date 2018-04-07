package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.domain.model.enums.NoeShakhs;
import ir.parsianinsurance.he.infrastructure.util.DateUtil;
import ir.parsianinsurance.he.interfaces.webservice.model.AgencyBimenameInfo;

/**
 * Created by 8119 on 7/17/2017.
 */
public class BimeGozarFactory {
    public static BimeGozar copyBimegozarForElhaghiye(BimeGozar originalbimeGozar, NoeShakhs noeBimegozar) {

        BimeGozar copyBimegozar = new BimeGozar();

        EttelaateTamas ettelaateTamas = new EttelaateTamas();
        ettelaateTamas.setCode_posti(originalbimeGozar.getShakhs().getEttelaateTamas().getCode_posti());
        ettelaateTamas.setPoste_electronic(originalbimeGozar.getShakhs().getEttelaateTamas().getPoste_electronic());
        ettelaateTamas.setMobile(originalbimeGozar.getShakhs().getEttelaateTamas().getMobile());
        ettelaateTamas.setAddress(originalbimeGozar.getShakhs().getEttelaateTamas().getAddress());
        ettelaateTamas.setTelefon(originalbimeGozar.getShakhs().getEttelaateTamas().getTelefon());

        if(noeBimegozar.equals(NoeShakhs.HAGHIGHI))
        {
            ShakhseHaghighi shakhseHaghighi = new ShakhseHaghighi();
            shakhseHaghighi.setPishvand(originalbimeGozar.getShakhs().getPishvand());
            shakhseHaghighi.setName(originalbimeGozar.getShakhs().getName());
            shakhseHaghighi.setName_khanevadegi(((ShakhseHaghighi)originalbimeGozar.getShakhs()).getName_khanevadegi());
            shakhseHaghighi.setName_pedar(((ShakhseHaghighi) originalbimeGozar.getShakhs()).getName_pedar());
            shakhseHaghighi.setShomare_shenasname(((ShakhseHaghighi) originalbimeGozar.getShakhs()).getShomare_shenasname());
            shakhseHaghighi.setShahre_mahale_sodoor(((ShakhseHaghighi) originalbimeGozar.getShakhs()).getShahre_mahale_sodoor());
            shakhseHaghighi.setMahale_tavalod(((ShakhseHaghighi) originalbimeGozar.getShakhs()).getMahale_tavalod());
            shakhseHaghighi.setTarikhe_tavalod(((ShakhseHaghighi) originalbimeGozar.getShakhs()).getTarikhe_tavalod());
            shakhseHaghighi.setKode_meli(((ShakhseHaghighi) originalbimeGozar.getShakhs()).getKode_meli());
            shakhseHaghighi.setJensiat(((ShakhseHaghighi) originalbimeGozar.getShakhs()).getJensiat());
            shakhseHaghighi.setMelliat(((ShakhseHaghighi)originalbimeGozar.getShakhs()).getMelliat());
            shakhseHaghighi.setEttelaateTamas(ettelaateTamas);
            copyBimegozar.setShakhs(shakhseHaghighi);
        }

        else
        {
            ShakhseHoghooghi shakhseHoghooghi = new ShakhseHoghooghi();
            shakhseHoghooghi.setPishvand(originalbimeGozar.getShakhs().getPishvand());
            shakhseHoghooghi.setName(originalbimeGozar.getShakhs().getName());
            shakhseHoghooghi.setCode_eghtesadi(((ShakhseHoghooghi) originalbimeGozar.getShakhs()).getCode_eghtesadi());
            shakhseHoghooghi.setShenase_meli(((ShakhseHoghooghi) originalbimeGozar.getShakhs()).getShenase_meli());
            shakhseHoghooghi.setEttelaateTamas(ettelaateTamas);
            copyBimegozar.setShakhs(shakhseHoghooghi);
        }

        copyBimegozar.setCreatedDate(DateUtil.now());
        return copyBimegozar;
    }

    public static BimeGozar newBimegozarForAgencyWebservice(AgencyBimenameInfo info) {
        ShakhseHaghighi shakhs = ShakhsFactory.newShakhsForTravellingWebService(info);
        BimeGozar bimeGozar = new BimeGozar();
        bimeGozar.setShakhs(shakhs);
        bimeGozar.setCreatedDate(DateUtil.now());
        return bimeGozar;
    }
}
