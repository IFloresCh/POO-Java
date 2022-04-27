package cat.institutmvm.applicacio.utils;

import java.util.Random;

public class MyMath {

    public static final double PI = 3.1415926535;
    public static final double E = 2.71828;
    public static final double PHI = (1+ Math.sqrt(5)) / 2;
    public static final Random RND = new Random();


    //evitemos instancias de la clase estatica

    private MyMath() {
    }

    //isEven
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }
    //isOdd
    public static boolean isOdd(int value) {
        return !isEven(value);
    }

    public static int nextInt(int bound){
        return (int)(Math.random() * bound);
    }

    public static int abs(int a){
        return Math.abs(a);
    }

    public static int abs1(int value){
        return value < 0 ? -value : value;
    }

    public static double avg(double...ops){
        var suma = 0;
        for (var op :ops){
            suma += op;
        }
        return suma / ops.length;
    }

    //calcular minimo y maximo
    public static int min(int...ops){
        var min = ops[0];
        for (var op :ops){
            if (op < min){
                min = op;
            }
        }
        return min;
    }

    public static int max(int...ops){
        var max = ops[0];
        for (var op :ops){
            if (op > max){
                max = op;
            }
        }
        return max;
    }

}
