package service;

/**
 * Created by Mohammad on 10/19/2017.
 */
public class SideEffectFree {

    String method1(int input1, int input2){
        int max = Math.max(input1, input2);
        String result = "Maximum value is "+max;
        return result;
    }
    public static void main(String[] args) {
        SideEffectFree sideEffect = new SideEffectFree();
        System.out.println(sideEffect.method1(4, 9));
        //        ...
        int max = Math.max(4, 9);
        String result = "Maximum value is "+max;
        System.out.println(result);

        System.out.println(sideEffect.method1(4, 9));
        //        ...
        System.out.println(sideEffect.method1(4, 9));
        //        ...
    }
}

