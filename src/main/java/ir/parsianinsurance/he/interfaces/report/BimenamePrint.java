package ir.parsianinsurance.he.interfaces.report;

import ir.parsianinsurance.he.domain.model.*;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by 8119 on 4/27/2017.
 */
public class BimenamePrint {

    private JRDataSource khatarateEzafi;
    private JRDataSource taahodateBimegar;
    private JRDataSource zinafha;
    private ShakhseHaghighi bimegozarShakhsHaghighi;
    private ShakhseHoghooghi bimegozarShakhsHoghooghi;
    private Bimename bimename;

    public JRDataSource getKhatarateEzafi() {
        return khatarateEzafi;
    }

    public void setKhatarateEzafi(JRDataSource khatarateEzafi) {
        this.khatarateEzafi = khatarateEzafi;
    }

    public Bimename getBimename() {
        return bimename;
    }

    public void setBimename(Bimename bimename) {
        this.bimename = bimename;
    }

    public JRDataSource getTaahodateBimegar() {

        Set<TaahodBimegar> taahodBimegarList = (Set<TaahodBimegar>) ((JRBeanCollectionDataSource)taahodateBimegar).getData();
        List<TaahodBimegar> returnTaahodBimegarList = new ArrayList<>();
        returnTaahodBimegarList.add(new TaahodBimegar());
        returnTaahodBimegarList.add(new TaahodBimegar());
        returnTaahodBimegarList.add(new TaahodBimegar());
        returnTaahodBimegarList.add(new TaahodBimegar());
        returnTaahodBimegarList.add(new TaahodBimegar());

        for (TaahodBimegar taahodBimegar : taahodBimegarList) {
            switch (taahodBimegar.getNoetaahod())
            {
                case HAZINE_PEZESHKI:
                    returnTaahodBimegarList.set(2, taahodBimegar);
                    if(taahodBimegar.getNerkh_taahod()!= null)
                        taahodBimegar.setNerkh_taahod(taahodBimegar.getNerkh_taahod()*100);
                    taahodBimegar.setHagh_bime_khataratezafi(null);
                    break;

                case GHERAMAT_ROOZANE_BASTARI:
                    returnTaahodBimegarList.set(4, taahodBimegar);
                    taahodBimegar.setHagh_bime_khataratezafi(null);
                    taahodBimegar.setNerkh_khatareEzafi(null);
                    break;

                case FOT:
                    if(taahodBimegar.getNerkh_taahod()!= null)
                        taahodBimegar.setNerkh_taahod((taahodBimegar.getNerkh_taahod()*1000)/2);
                    if(taahodBimegar.getHagh_bime_khataratezafi() != null)
                        taahodBimegar.setHagh_bime_khataratezafi(taahodBimegar.getHagh_bime_khataratezafi() / 2);
                    if(taahodBimegar.getHagh_bime_taahod()!= null)
                        taahodBimegar.setHagh_bime_taahod(taahodBimegar.getHagh_bime_taahod()/2);
                    returnTaahodBimegarList.set(0, taahodBimegar);
                    returnTaahodBimegarList.set(1, taahodBimegar);
                    break;

                case NAGHSOZV_AZKAROFTADEGI:
                    if(taahodBimegar.getNerkh_taahod()!= null)
                        taahodBimegar.setNerkh_taahod((taahodBimegar.getNerkh_taahod()*1000)/2);
                    if(taahodBimegar.getHagh_bime_khataratezafi() != null)
                        taahodBimegar.setHagh_bime_khataratezafi(taahodBimegar.getHagh_bime_khataratezafi() / 2);
                    if(taahodBimegar.getHagh_bime_taahod()!= null)
                    taahodBimegar.setHagh_bime_taahod(taahodBimegar.getHagh_bime_taahod()/2);
                    returnTaahodBimegarList.set(0, taahodBimegar);
                    returnTaahodBimegarList.set(1, taahodBimegar);
                    break;
            }
        }
        return new JRBeanCollectionDataSource(returnTaahodBimegarList);
    }

    public void setTaahodateBimegar(JRDataSource taahodateBimegar) {
        this.taahodateBimegar = taahodateBimegar;
    }

    public JRDataSource getZinafha() {
        return zinafha;
    }

    public void setZinafha(JRDataSource zinafha) {
        this.zinafha = zinafha;
    }

    public JRDataSource getzinaf() {
        List<Zinaf> zinafList = (List<Zinaf>)((JRBeanCollectionDataSource)zinafha).getData();
        return new JRBeanCollectionDataSource(zinafList);

    }

    public ShakhseHaghighi getBimegozarShakhsHaghighi() {
        return bimegozarShakhsHaghighi;
    }

    public void setBimegozarShakhsHaghighi(ShakhseHaghighi bimegozarShakhsHaghighi) {
        this.bimegozarShakhsHaghighi = bimegozarShakhsHaghighi;
    }

    public ShakhseHoghooghi getBimegozarShakhsHoghooghi() {
        return bimegozarShakhsHoghooghi;
    }

    public void setBimegozarShakhsHoghooghi(ShakhseHoghooghi bimegozarShakhsHoghooghi) {
        this.bimegozarShakhsHoghooghi = bimegozarShakhsHoghooghi;
    }


}
