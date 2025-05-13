package components;

import java.util.Scanner;

public class BasicOperations{

    public static Double[] totalNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("HOW MANY NUMBERS WILL YOU OPERATE?");
        int quantity = sc.nextInt();

        Double[] numbers = new Double[quantity];

        for (int i = 0; i < quantity; i++){
            System.out.println("NUMBER " + (i + 1) + ": ");
            numbers[i] = sc.nextDouble();
        }

        return numbers;
    }

    public static Double add(Double... numbers){
        double res = 0;
        for (double num : numbers){
            res += num;
        }
        return res;
    }

    public static Double minus(Double... numbers) {
        if (numbers.length == 0)
            return null;
        double res = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            res -= numbers[i];
        }
        return res;
    }

    public static Double divide(Double... numbers) {
        if (numbers.length == 0) {
            System.out.println("INSERT AT LEAST ONE NUMBER");
            return null;
        }

        double res = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                System.out.println("CAN'T DIVIDE BY ZERO");
                return null;
            }
            res /= numbers[i];
        }
        return res;
    }
    public static Double multiplicate(Double... numbers){
        double res = 1;
        for (double num : numbers){
            res *= num;
        }
        return res;
    }

    public static Double percentagesOf(Double x, Double y){
        double res = (x == 0 || y == 0) ? 0 : y * ((x/100) / 100);
        return res;
    }

    public static Double power(Double base, Double exponent){
        if (base == 0 && exponent == 0){
            System.out.println("IS AN INDEFINITED RESOLUTION");
            return null;
        }else if(base <= 0 || (exponent % 1 != 0)){
            System.out.println("IS AN IMAGINARY RESOLUTION");
            return null;
        }else{
            double result = Math.pow(base, exponent);
            return result;
        }
    }

    public static Double root(Double radicand, Double radiand_exponent, Double index){
        Double result;

        if (index == 0
                || (radicand == 0 && radiand_exponent / index <= 0)
                || (radicand < 0 && index % 2 == 0)){
            System.out.println(
                    index == 0 ? "CAN'T DIVIDE BY 0" :
                            (radicand == 0 && radiand_exponent / index <= 0) ?
                                    "0 CAN'T BE RAISED TO 0 OR NEGATIVE NUMBER":
                                            "EVEN ROOT OF A NEGATIVE NUMBER RESULTS IN A COMPLEX NUMBER"

            );
            return null;
        }else if (radicand < 0 && index % 2 != 0){
            result = -Math.pow(-radicand, radiand_exponent/index);
            return result;
        }else{
            result = Math.pow(radicand,radiand_exponent/index);
            return result;
        }
    }


}
