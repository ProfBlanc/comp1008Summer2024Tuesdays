package intro;

import java.util.Scanner;
import java.util.Random;
//import java.util.*;

public class Week2 {

    //psvm+tab
    public static void main(String[] args) {

        //sout+tab
        //System.out.println("Wow, that's cool!");
        example1();
    }

    static void example1(){
        System.out.println("This is example1");
        //create various variables

        //dataType name;
        //dataType name = value;
        int age = 100;
        boolean havingFun = true;
        double temperature = 15.5;
        String name = "Ben";
        Object anyValue = 123;
        anyValue = 'c';
        anyValue = false;
        anyValue = 12.34;
        anyValue = 1f;
        //ASCII table
        //temperature = 'c';
        System.out.println(temperature);

        System.out.println(anyValue);
        System.out.print(age);
        System.out.println();//outputs \n => new line char
        System.out.print('\0');

        /*
            null
                offical value for n/a, no value, not yet ready,
                    comming soon

            nul
                out of content
         */

        String value;



    }
    static void example2(){

        //how to get user input
        //output a message
        System.out.println("Enter your age");
        //create a Scanner object
        Scanner input = new Scanner(System.in);

        //user scanner object method to GET specific data
        int age = input.nextInt();

        System.out.println("You are " + age + " years old");
    }
    static void task1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int years = input.nextInt();
        int months = years * 12;
        int weeks = years * 52;
        int minutes = years * 365 * 24 * 60;
        int seconds = minutes * 60;

        System.out.println("Years = " + years);
        System.out.println("Months = " + months);
    }

    static void task2(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1 ");
        double num1 = input.nextDouble();

        System.out.println("Enter num2 ");
        double num2 = input.nextDouble();

        double sum = num1 + num2;
        double prod = num1 * num2;
        double diff = num1 - num2;
        double quo = num1 / num2;
    }
    static void task3(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = input.nextInt();
        System.out.println("Counter from 1 to " + i );
        int count;
        for(count = 1; count <= i; count++){
            System.out.println(count);
        }

        System.out.println("Counting from " + count + " to 1");
        while(count > 0){
            System.out.println(count);
            count--;
        }

    }
    /*
    Task 1
        ask the user for their age
        output their age in years, months, minutes, weeks, seconds
    Task 2:
        ask the user for two numbers
        output the sum, product, difference, and quotient of these numbers
    Task 3
        ask the user for one number
        using the for loop, count from 1 up to this number
        user a while loop, count down from this number to 0.
    Task 4:
        Pizza Order calculator
        Ask the user what size of pizza they want?
            S, M, L, XL
        Ask the user how many toppings they want on the pizza
            1-5
        Ask the user how many km away they live form the pizza store
            1-20
        if user inputs any invalid values (size, toppings, km)
            output error message
        if not, calculate pizza price

            $5 base price
            + $3 per topping
            + $1.5 per km of delivery distance
        output the price of order
     */
}
