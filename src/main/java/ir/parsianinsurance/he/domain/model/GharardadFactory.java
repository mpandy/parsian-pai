package ir.parsianinsurance.he.domain.model;

/**
 * Created by 8119 on 8/8/2017.
 */
public class GharardadFactory {
    public static Gharardad newgharardad(){
        Gharardad gharardad = new Gharardad();
        return gharardad;
    }

    public static Gharardad newSearchGharardad() {
        Gharardad gharardad = new Gharardad();
        return gharardad;
    }

    public static Gharardad newgharardad(String name, String goroohs, String shomare){
        Gharardad gharardad = new Gharardad();
        gharardad.setName(name);
        gharardad.setGoroohs(goroohs);
        gharardad.setShomare(shomare);
        return gharardad;
    }
}
