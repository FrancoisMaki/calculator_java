package components;

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
                    System.out.println("MINGITO PON LO QUE TE PIDO NO ME SEAS NENAZA");
            }

        }while (option!=3);

    }

    public void menuBasicOperations(){
        do {
            System.out.println("------------------------------------------------");
            System.out.println("SELECT ONE OPERATION");
            System.out.println("1. ADD");
            System.out.println("2. MINUS");
            System.out.println("3. DIVIDE");
            System.out.println("4. MULTIPLICATE");
            System.out.println("5. SOLVE ECUATION 2nd GRADE");
            System.out.println("5. SOLVE ECUATION 2nd GRADE");
            System.out.println("5. SOLVE ECUATION 2nd GRADE");
            System.out.println("5. EXIT");
            System.out.println("------------------------------------------------");

            option = sc.nextInt();

            switch (option){
                case 1:
                    menuBasicOperations();
                    break;

                case 2:
                    break;

                default:
                    System.out.println("MINGITO PON LO QUE TE PIDO NO ME SEAS NENAZA");
            }

        }while (option!=3);

    }

    public void menuFinishedOperation(boolean option){
        if (option==true){
            System.out.println("WANT TO DO ANY OTHER OPERATION?");
        }else{
            System.out.println("GOODBYE");
        }
    }
}
