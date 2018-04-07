package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.domain.model.enums.Jensiat;
import ir.parsianinsurance.he.infrastructure.util.DateUtil;
import ir.parsianinsurance.he.interfaces.webservice.model.AgencyBimenameInfo;

/**
 * Created by Mohammad on 6/13/2017.
 */
public class ShakhsFactory {

    public static ShakhseHaghighi newShakhseHaghighi(){
        EttelaateTamas ettelaateTamas = new EttelaateTamas();
        ShakhseHaghighi shakhseHaghighi = new ShakhseHaghighi();
        shakhseHaghighi.setEttelaateTamas(ettelaateTamas);
        shakhseHaghighi.setPishvand("");
        shakhseHaghighi.setJensiat(Jensiat.EMPTY);
        shakhseHaghighi.setName("");
        shakhseHaghighi.setName_khanevadegi("");
        shakhseHaghighi.setCreatedDate(DateUtil.now());
        return shakhseHaghighi;
    }

    public static ShakhseHoghooghi newShakhseHoghooghi(){
        EttelaateTamas ettelaateTamas = new EttelaateTamas();
        ShakhseHoghooghi shakhseHoghooghi = new ShakhseHoghooghi();
        shakhseHoghooghi.setEttelaateTamas(ettelaateTamas);
        shakhseHoghooghi.setPishvand("");
        shakhseHoghooghi.setName("");
        shakhseHoghooghi.setCreatedDate(DateUtil.now());
        return shakhseHoghooghi;
    }

    public static ShakhseHaghighi newShakhsForTravellingWebService(AgencyBimenameInfo info) {
        ShakhseHaghighi shakhs = new ShakhseHaghighi();
        shakhs.setName(info.getName());
        shakhs.setName_khanevadegi(info.getNamekhanavadegi());
        shakhs.setKode_meli(info.getCodemelli());
        shakhs.setTarikhe_tavalod(info.getTarikhtavalod());
        shakhs.setShomare_shenasname(info.getShomareshenasname());
        shakhs.setName_pedar(info.getNamepedar());
        EttelaateTamas ettelaateTamas = new EttelaateTamas();
        ettelaateTamas.setMobile(info.getMobile());
        ettelaateTamas.setAddress(info.getShahr());
        shakhs.setEttelaateTamas(ettelaateTamas);
        return shakhs;
    }
}
