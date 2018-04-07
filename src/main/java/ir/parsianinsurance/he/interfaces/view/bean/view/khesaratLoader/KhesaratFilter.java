package ir.parsianinsurance.he.interfaces.view.bean.view.khesaratLoader;

/**
 * Created by 8119 on 11/5/2017.
 */
public class KhesaratFilter {

    private boolean tarikhhadese;

    public static KhesaratFilter init(){
        KhesaratFilter khesaratFilter = new KhesaratFilter(true);
        return khesaratFilter;
    }

    public KhesaratFilter(boolean tarikhhadese) {
        this.tarikhhadese = tarikhhadese;
    }

    public KhesaratFilter disableTarikhhadese() {
        this.tarikhhadese = false;
        return this;
    }

    public KhesaratFilter enableTarikhhadese() {
        this.tarikhhadese = true;
        return this;
    }

    public boolean isTarikhhadese() {
        return tarikhhadese;
    }
}
