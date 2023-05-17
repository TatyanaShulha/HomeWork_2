package HW_5;

public class Calculator {



    public static int plus (int a, int b){
        return a + b;
    }

    public static int minus (int a, int b){
        return a - b;
    }

    public static double division (double a, double b){
        if (a == 0){
            return 0;
        } else {
            return a / b;
        }
    }

    public static int multiplication (int a, int b){
        return a * b;
    }

}
