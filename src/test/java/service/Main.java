package service;

import java.util.function.Supplier;

/**
 * Created by Mohammad on 7/3/2017.
 */
public class Main {

    public static <E> void printArray( E[] inputArray ) {
        // Display array elements
        for(E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }


    public void supply(Supplier<Object> supplier)
    {

        System.out.println(supplier.get());
    }


    public static void main(String args[]) {


        System.out.println(System.getProperties().get("java.version"));
//        String tarikhElame = "1395/01/29";
//        String tarikhhades = "1396/02/5";
//        System.out.println(tarikhElame.compareTo(tarikhhades) == -1);


//        System.out.println(DateUtil.getTimeDifferenceByDayCount("1398/10/11", "1399/10/11"));
//        System.out.println(DateUtil.getTimeDifferenceByDayCount("1399/10/11", "1400/10/11"));

//            int[] majmoozarayebOlaviate = new int[4];
//            System.out.println(majmoozarayebOlaviate[0]);
//
//        String s = null;
//        String n = "f";
//
//        System.out.println(s+n);
//
//        Long l = null;
//
//        String shoro = "1396/01/10";
//        String sodoor = "1396/01/20";
//        System.out.println(shoro.compareTo(sodoor));
//
//        Integer x = 8;
//        System.out.println(x.toString());
//
//        Main main = new Main();
//        main.supply(() -> 5);
//        main.supply(() -> 6);
//        main.supply(() -> new Main());

        // Create arrays of Integer, Double and Character
//        Integer[] intArray = { 1, 2, 3, 4, 5 };
//        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
//        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
//        Main[] mains = {new Main(), new Main(), new Main(), new Main()};
//
//        System.out.println("Array integerArray contains:");
//        printArray(intArray);   // pass an Integer array
//
//        System.out.println("\nArray doubleArray contains:");
//        printArray(doubleArray);   // pass a Double array
//
//        System.out.println("\nArray characterArray contains:");
//        printArray(charArray);   // pass a Character array
//
//        System.out.println("\nArray Main contains:");
//        printArray(mains);   // pass a Character array
    }
}
