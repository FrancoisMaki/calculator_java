package components;

import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);
    int option;

    public void menuSelectOperationsType(){
        do {
            System.out.println("------------------------------------------------");
            System.out.println("SELECT ONE TYPE");
            System.out.println("1. BASICS OPERATIONS");
            System.out.println("2. ADVANCED OPERATIONS");
            System.out.println("3. EXIT");
            System.out.println("------------------------------------------------");

            option = sc.nextInt();

            switch (option){
                case 1:
                    menuBasicOperations();
                    break;

                case 2:
                    break;

                default:
                    System.out.println("PLEASE SELECT A VALID OPTION");
            }

        }while (option!=3);

    }

    private void menuBasicOperations(){
        do {
            System.out.println("------------------------------------------------");
            System.out.println("SELECT ONE OPERATION");
            System.out.println("1. ADD");
            System.out.println("2. SUBSTRACTING");
            System.out.println("3. DIVIDING");
            System.out.println("4. MULTIPLYING");
            System.out.println("5. PERCENTAGES");
            System.out.println("6. POWERS");
            System.out.println("7. EXPONENTS");
            System.out.println("5. EXIT");
            System.out.println("------------------------------------------------");

            option = sc.nextInt();
            double[] numbersToOperate;
            double result;
            double x;
            double y;
            switch (option){
                case 1:
                    numbersToOperate = BasicOperations.totalNum();
                    result = BasicOperations.add(numbersToOperate);
                    System.out.println("RESULT OF ADDITION: " + result);
                    break;

                case 2:
                    numbersToOperate = BasicOperations.totalNum();
                    result = BasicOperations.minus(numbersToOperate);
                    System.out.println("RESULT OF MINUS: " + result);
                    break;

                case 3:
                    numbersToOperate = BasicOperations.totalNum();
                    result = BasicOperations.divide(numbersToOperate);
                    System.out.println("RESULT OF DIVIDE: " + result);
                    break;

                case 4:
                    numbersToOperate = BasicOperations.totalNum();
                    result = BasicOperations.multiplicate(numbersToOperate);
                    System.out.println("RESULT OF MULTIPLICATE: " + result);
                    break;

                case 5:
                    System.out.println("INSERT THE PORCENTAGE");
                    x = sc.nextDouble();
                    System.out.println("INSERT THE INITIAL QUANTITY");
                    y = sc.nextDouble();
                    result = BasicOperations.percentagesOf(x, y);
                    System.out.println("RESULT OF MULTIPLICATE: " + (result*100) + "%");
                    break;

                case 6:
                    System.out.println("INSERT THE BASE");
                    x = sc.nextDouble();
                    System.out.println("INSERT THE POWER");
                    y = sc.nextDouble();
                    result = BasicOperations.power(x, y);
                    System.out.println("RESULT OF POWER: " + result);
                    break;

                case 7:
                    System.out.println("INSERT THE PORCENTAGE");
                    x = sc.nextDouble();
                    System.out.println("INSERT THE INITIAL QUANTITY");
                    y = sc.nextDouble();
                    result = BasicOperations.percentagesOf(x, y);
                    System.out.println("RESULT OF MULTIPLICATE: " + (result*100) + "%");
                    break;

                default:
                    System.out.println("PLEASE SELECT A VALID OPTION");
            }

        }while (option!=3);

    }

}
