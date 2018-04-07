package mypackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Mohammad on 7/23/2017.
 */
public class Test {

    public void x(Collection<Rapper> singers)
    {
        System.out.println("HAHA");
    }

    public static void main(String[] args) {
        Test test = new Test();
        List<Rapper> rapperList = new ArrayList<>();
        test.x(rapperList);
    }
}
