package components;

import java.util.Scanner;

public class BasicOperations{

    public static double[] totalNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("HOW MANY NUMBERS WILL YOU OPERATE?");
        int quantity = sc.nextInt();

        double[] numbers = new double[quantity];

        for (int i = 0; i < quantity; i++){
            System.out.println("NUMBER " + (i + 1) + ": ");
            numbers[i] = sc.nextDouble();
        }

        return numbers;
    }

    public static double add(double... numbers){
        double res = 0;
        for (double num : numbers){
            res += num;
        }
        return res;
    }

    public static double minus(double... numbers) {
        if (numbers.length == 0) return 0;
        double res = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            res -= numbers[i];
        }
        return res;
    }

    public static double divide(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("INSERT AT LEAST ONE NUMBER");
            return 0;
        }

        double res = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                System.out.println("CAN'T DIVIDE BY ZERO");
                return 0;
            }
            res /= numbers[i];
        }
        return res;
    }
    public static double multiplicate(double... numbers){
        double res = 1;
        for (double num : numbers){
            res *= num;
        }
        return res;
    }

    public static double percentagesOf(double x, double y){
        double res = (x == 0 || y == 0) ? 0 : y * ((x/100) / 100);
        return res;
    }

    public static double power(double x, double y){
        if (x == 0 && y == 0){
            System.out.println("IS AN INDEFINITED RESOLUTION");
            return 0;
        }else if(x <= 0 || (y % 1 != 0)){
            System.out.println("IS AN IMAGINARY RESOLUTION");
            return 0;
        }else{
            double result = Math.pow(x,y);
            return result;
        }
    }

}
