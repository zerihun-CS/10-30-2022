import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {


        ArrayList<String> members= new ArrayList<>();

        members.add("hanna");
        members.add("able");
        members.add("Eden");
        members.add("dav");
        members.add("haliu");

        System.out.println(members);
        System.out.println("out lucky member is "+ luckyMember(members));
      //  System.out.println("Hello world!"); '
//        Scanner input = new Scanner(System.in);
//        System.out.println("hello Sir/Madam Please insert your name");
//        String name = input.nextLine();
//
//        options(name);
    }


    static String luckyMember(ArrayList<String> members){
        int number = members.size();

        Random random = new Random();

        System.out.println( random.nextInt(3,34));
    return members.get(random.nextInt(number));


    }
    static void options(String customerName){
        Scanner input = new Scanner(System.in);
        System.out.println("Dear "+customerName+"for service information press 1");
        System.out.println("for loan options press 2");

        int userInput = input.nextInt();

        switch (userInput){

            case 1:
                information(customerName);
            case 2:
                loan(customerName);

        }


    }




    static void information(String name){

        System.out.println("dear  "+name+" for a car loan with an interest of 14.5 %");
        System.out.println("for a House loan with an interest of 15 %");
        System.out.println("for a Business loan with an interest of 10 %");

        options(name);
    }


   static  void loan(String name){
       Scanner input = new Scanner(System.in);
        System.out.println("dear "+name+" for a car loan press 1 ");
        System.out.println("for a House loan press 2 ");
        System.out.println("for a Business loan press 3 ");
        int loanUserInput  = input.nextInt();
        System.out.println("please insert amount of loan");
        float amount = input.nextFloat();

        switch (loanUserInput){
            case 1:
                System.out.print("total loan with an interest rate for a car is  "+(amount+(0.145*amount)));
                break;
            case 2:
                System.out.print("total loan with an interest rate for a house is  "+(amount+(0.15*amount)));
                break;
            case 3:
                System.out.print("total loan with an interest rate for a Business is  "+(amount+(0.10*amount)));
                break;

        }

       options(name);
       System.out.println(" ");


    }

}