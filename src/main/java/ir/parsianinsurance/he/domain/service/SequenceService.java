package ir.parsianinsurance.he.domain.service;

import ir.parsianinsurance.he.domain.model.Vahed;
import ir.parsianinsurance.he.domain.model.VahedSequence;
import ir.parsianinsurance.he.infrastructure.repository.VahedRepository;
import ir.parsianinsurance.he.infrastructure.util.DateUtil;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import java.util.List;

import static ir.parsianinsurance.he.infrastructure.util.DateUtil.getJalaliCurrentDate;

/**
 * Created by Mohammad on 9/2/2017.
 */

@Singleton
@Startup
public class SequenceService implements ISequenceService {

    @Inject
    VahedRepository vahedRepository;

    private List<Vahed> vaheds;

    @PostConstruct
    public void init(){

        vaheds = vahedRepository.findAll();
        System.out.println("TOTAL NAMAYANDEGAN COUNT: "+namayandeganCount());
        System.out.println("*****************************************************************");
    }

    @Override
    public String nextShomarePishnahad(Vahed vahedeSodoor) {

        int vahedeSodoorIndex = vaheds.indexOf(vahedeSodoor);
        if(vahedeSodoorIndex != -1) {

            VahedSequence vahedSequence = vaheds.get(vahedeSodoorIndex).getVahedSequence();
            int currentShomarePishnahad = vahedSequence.getPishnahad_count().intValue();
            int nextShomarePishnahad = currentShomarePishnahad + 1;
            vahedSequence.setPishnahad_count(nextShomarePishnahad);
            vahedeSodoor.setVahedSequence(vahedSequence);
            vahedRepository.save(vahedeSodoor);

            return "2619/"+
                    vahedeSodoor.getCode()+"/"+
                    DateUtil.extractTwoDigitYear(getJalaliCurrentDate())+"/"+
                    String.format("%06d", nextShomarePishnahad);
        }
        return null;

    }

    @Override
    public String nextShomareBimename(Vahed vahedeSodoor) {

        int vahedeSodoorIndex = vaheds.indexOf(vahedeSodoor);
        if(vahedeSodoorIndex != -1) {

            VahedSequence vahedSequence = vaheds.get(vahedeSodoorIndex).getVahedSequence();
            int currentShomareBimename = vahedSequence.getBimename_count().intValue();
            int nextShomareBimename = currentShomareBimename + 1;
            vahedSequence.setBimename_count(nextShomareBimename);
            vahedeSodoor.setVahedSequence(vahedSequence);
            vahedRepository.save(vahedeSodoor);

            return "2630/"+
                    vahedeSodoor.getCode()+"/"+
                    DateUtil.extractTwoDigitYear(getJalaliCurrentDate())+"/"+
                    String.format("%06d", nextShomareBimename);
        }
        return null;

    }

    @Override
    public String nextParvandeKhesarat(Vahed vahedeSodoor) {
        int vahedeSodoorIndex = vaheds.indexOf(vahedeSodoor);
        if(vahedeSodoorIndex != -1) {

            VahedSequence vahedSequence = vaheds.get(vahedeSodoorIndex).getVahedSequence();
            int currentShomareKhesarat = vahedSequence.getKhesarat_count().intValue();
            int nextShomareKhesarat = currentShomareKhesarat + 1;
            vahedSequence.setKhesarat_count(nextShomareKhesarat);
            vahedeSodoor.setVahedSequence(vahedSequence);
            vahedRepository.save(vahedeSodoor);

            return "2611/"+
                    vahedeSodoor.getCode()+"/"+
                    DateUtil.extractTwoDigitYear(getJalaliCurrentDate())+"/"+
                    String.format("%06d", nextShomareKhesarat);
        }
        return null;
    }

    @Override
    public void addNamayandeToMemory(Vahed vahed) {
        if(!vaheds.contains(vahed))
            vaheds.add(vahed);
    }

    @Override
    public int namayandeganCount() {
        return vaheds.size();
    }


}
