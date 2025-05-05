package components;

import java.io.Console;
import java.sql.SQLOutput;
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
            System.out.println("5. POWERS");
            System.out.println("5. EXPONENTS");
            System.out.println("5. EXIT");
            System.out.println("------------------------------------------------");

            option = sc.nextInt();
            double[] numbersToOperate = BasicOperations.totalNum();
            switch (option){
                case 1:
                    double resultAdd = BasicOperations.add(numbersToOperate);
                    System.out.println("RESULT OF ADDITION: " + resultAdd);
                    break;

                case 2:
                    break;

                default:
                    System.out.println("PLEASE SELECT A VALID OPTION");
            }

        }while (option!=3);

    }

}
