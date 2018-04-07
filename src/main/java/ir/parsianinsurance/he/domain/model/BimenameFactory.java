package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.domain.model.enums.VaziateBimename;
import ir.parsianinsurance.he.infrastructure.util.DateUtil;
import ir.parsianinsurance.he.interfaces.webservice.model.AgencyBimenameInfo;

/**
 * Created by 8119 on 5/17/2017.
 */
public class BimenameFactory {

    public static Bimename newBimenameForSodoor(){
        Bimename bimename = new Bimename();
        Pishnahad pishnahad = PishnahadFactory.newPishnahadForSodooor();
        pishnahad.tarikhshoroo(DateUtil.getJalaliCurrentDate());
        pishnahad.tarikhpayan(DateUtil.addOneYear(DateUtil.getJalaliCurrentDate()));
        bimename.setCreatedDate(DateUtil.now());
        bimename.pishnahad(pishnahad);

        return bimename;
    }

    public static Bimename newBimenameForAgency(AgencyBimenameInfo info) {

        Bimename bimename = new Bimename();
        bimename.vaziat(VaziateBimename.DAEM)
                .pishnahad(PishnahadFactory.newPishnahadForAgency(info))
                .tarikhsodoor(DateUtil.getJalaliCurrentDate());
        return bimename;
    }

    public static Bimename newBimenameForBordroBimename(){
        BimeShode bimeShode = new BimeShode();
        bimeShode.setShoghl(new Shoghl());
        Pishnahad pishnahad = new Pishnahad();
        pishnahad.setBimeShode(bimeShode);;
        Bimename bimename = new Bimename();
        bimename.pishnahad(pishnahad);
        return bimename;
    }

    }
