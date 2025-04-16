package components;

public class BasicOperations {

    public double add(double... numbers){
        double res = 0;
        for (double num : numbers){
            res += num;
        }
        return res;
    }

    public double minus(double... numbers){
        double res = 0;
        for (double num : numbers){
            res -= num;
        }
        return res;
    }

    public double divide(double... numbers){
        double res = numbers[0];

        if (numbers.length == 0){
            System.out.println("INSERT AT LEAST ONE NUMBER");
        }

        for (int i = 0; i<numbers.length;i++){
            if (numbers[0]==0){
                System.out.println("CAN'T DIVIDE TO ZERO");
            }else{
                res /= numbers[i];
            }
        }
        return res;
    }

    public double multiplicate(double... numbers){
        double res = 1;
        for (double num : numbers){
            res *= num;
        }
        return res;
    }




}
