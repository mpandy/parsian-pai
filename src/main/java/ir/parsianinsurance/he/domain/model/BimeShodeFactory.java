package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.infrastructure.util.DateUtil;

/**
 * Created by Mohammad on 6/13/2017.
 */
public class BimeShodeFactory {
    public static BimeShode copyBimeshodeForElhaghiye(BimeShode originalBimeshode){

        Shoghl shoghl = new Shoghl();

        shoghl.setId(originalBimeshode.getShoghl().getId());
        shoghl.setName(originalBimeshode.getShoghl().getName());
        shoghl.setDefaultTabagheKhatar(originalBimeshode.getShoghl().getDefaultTabagheKhatar());

        Shakhs shakhs = new ShakhseHaghighi();
        shakhs.setPishvand(originalBimeshode.getShakhseHaghighi().getPishvand());
        shakhs.setName(originalBimeshode.getShakhseHaghighi().getName());
        ((ShakhseHaghighi)shakhs).setMelliat(originalBimeshode.getShakhseHaghighi().getMelliat());
        ((ShakhseHaghighi)shakhs).setName_khanevadegi(originalBimeshode.getShakhseHaghighi().getName_khanevadegi());
        ((ShakhseHaghighi)shakhs).setName_pedar(originalBimeshode.getShakhseHaghighi().getName_pedar());
        ((ShakhseHaghighi)shakhs).setJensiat(originalBimeshode.getShakhseHaghighi().getJensiat());
        ((ShakhseHaghighi)shakhs).setShomare_shenasname(originalBimeshode.getShakhseHaghighi().getShomare_shenasname());
        ((ShakhseHaghighi)shakhs).setKode_meli(originalBimeshode.getShakhseHaghighi().getKode_meli());
        ((ShakhseHaghighi)shakhs).setTarikhe_tavalod(originalBimeshode.getShakhseHaghighi().getTarikhe_tavalod());
        ((ShakhseHaghighi)shakhs).setMahale_tavalod(originalBimeshode.getShakhseHaghighi().getMahale_tavalod());
        ((ShakhseHaghighi)shakhs).setShahre_mahale_sodoor(originalBimeshode.getShakhseHaghighi().getShahre_mahale_sodoor());

        EttelaateTamas ettelaateTamas = new EttelaateTamas();

        ettelaateTamas.setAddress(originalBimeshode.getShakhseHaghighi().getEttelaateTamas().getAddress());
        ettelaateTamas.setTelefon(originalBimeshode.getShakhseHaghighi().getEttelaateTamas().getTelefon());
        ettelaateTamas.setMobile(originalBimeshode.getShakhseHaghighi().getEttelaateTamas().getMobile());
        ettelaateTamas.setCode_posti(originalBimeshode.getShakhseHaghighi().getEttelaateTamas().getCode_posti());
        ettelaateTamas.setPoste_electronic(originalBimeshode.getShakhseHaghighi().getEttelaateTamas().getPoste_electronic());

        shakhs.setEttelaateTamas(ettelaateTamas);

        BimeShode bimeShode = new BimeShode();
        bimeShode.setShoghl(shoghl);
        bimeShode.setShakhseHaghighi((ShakhseHaghighi)shakhs);
        bimeShode.setCreatedDate(DateUtil.now());

        return bimeShode;
    }

    public static BimeShode copyFromBimegozar(BimeGozar bimeGozar){
        BimeShode bimeShode = new BimeShode();
        bimeShode.setShakhseHaghighi((ShakhseHaghighi) bimeGozar.getShakhs());
        bimeShode.setShoghl(ShoghlFactory.newshoghl());
        bimeShode.setCreatedDate(DateUtil.now());
        return bimeShode;
    }


}
