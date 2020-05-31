/*
For this project, you are going to write a program that asks the user for some information about an international trip they are taking.
Based on the information you need to do some conversions, using the correct data types to tell them some information to help them plan
their trip.
 */
import java.util.Scanner;

public class VacationPlanner {
//    Scanner input = new Scanner(System.in); //takes in user inputs. It is declared global so it is accessible by all classes in the program

    //main method
    public static void main(String[] args) {

        // calling methods
        intro();
        budget();
        time();
        distance();
    }

//        Part 1 - takes in user name & destination
        public static void intro() {
            Scanner input = new Scanner(System.in);
            System.out.println();//Spacing
            System.out.println("Welcome to Vacation Planner!");
            System.out.println();//Spacing
            System.out.println("What is your name?");
            String name = input.nextLine();//String
            System.out.print("Nice to meet you, " + name + ". Where are you travelling to? ");
            String dest = input.nextLine();//String
            System.out.println("Great. " + dest + " sounds like a great trip.");
            System.out.println("******************************************");
        }

//        Part 2 - method for days planned on trips, allowance, & converting info
        public static void budget() {
            Scanner input = new Scanner(System.in);
            System.out.println("How many days are you going to spend travelling? ");
            int days = input.nextInt();
            System.out.println("How much money in USD are you planning to spend on your trip? ");//2300
            double usd = input.nextDouble();//2300
            System.out.println("What is the three letter currency symbol for your destination? ");//MXC
            String symbol = input.next();//MXC
            System.out.println("How many " + symbol + " are there in 1 USD? ");//19.8
            double conversion = input.nextDouble();//19.8

            double hours = (days * 24);
            double minutes = (days * 24 * 60);

            System.out.println();
            System.out.println("If you are travelling for " + days + " days that is the same as " + hours + " hours, which equal " + minutes + " minutes");

            double perDay = (usd / days) + (usd % days);
            System.out.println("If you are going to spend " + usd + "USD that allows you " + perDay + " USD per day.");

            double conperDay = (usd / days) + (usd % conversion);
            double conUSD = (usd * conversion);

            System.out.println("That translates to " + conUSD + " " + symbol + " in total, which equals to " + conperDay + " " + symbol + " per day.");

//            System.out.println();
            System.out.println("********************");
            System.out.println();
        }

//        Part 3 - method for the time difference b/w home & converting info
        public static void time() {
            Scanner input = new Scanner(System.in);
            System.out.println("What is the time distance, in hours between your home and your destination? ");//2
            int timeDiff = input.nextInt();//the time difference is 2

//            System.out.println();
            System.out.println("****************");
            System.out.println();
        }

//        Part 4 - method for the distance b/w home & destination in square kilometers & converts in into square miles
        public static void distance() {
            //kilometers*0.62137 = miles
            Scanner input = new Scanner(System.in);

        final double KS_TO_MILES = 0.386102;

            System.out.println("What is the area in KM^2 of your destination? ");//1973000
            double kSquared = input.nextInt();//1973000
            double mSquared = kSquared * KS_TO_MILES;
            System.out.println("That equals to " + mSquared + " miles squared ");

            System.out.println();
            System.out.println("****************");
            System.out.println();
        }
}

