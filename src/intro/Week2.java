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
     */
}
