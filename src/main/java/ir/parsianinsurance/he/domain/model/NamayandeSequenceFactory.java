package ir.parsianinsurance.he.domain.model;

/**
 * Created by Mohammad on 9/2/2017.
 */
public class NamayandeSequenceFactory {

    public static VahedSequence newSequeneForInitialization(){

        VahedSequence vahedSequence = new VahedSequence();
        vahedSequence.setPishnahad_count(0);
        vahedSequence.setBimename_count(0);
        vahedSequence.setKhesarat_count(0);

        return vahedSequence;
    }
}
