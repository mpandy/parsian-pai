package ir.parsianinsurance.he.domain.model;

/**
 * Created by 8119 on 8/15/2017.
 */
public class NamayandeFactory {

    public static Vahed newNamayande(){
        Vahed vahed = new Vahed();
        return vahed;
    }

    public static Vahed newNamayandeForAdminPanel(){
        Vahed vahed = new Vahed();
        vahed.setVahedSequence(NamayandeSequenceFactory.newSequeneForInitialization());
        return vahed;
    }

    public static Vahed rootNamayande(){
        Vahed vahed = new Vahed();
        vahed.setVahedSequence(NamayandeSequenceFactory.newSequeneForInitialization());
        vahed.setCode("0000");
        vahed.setSarparast(vahed);
        return vahed;
    }

}
