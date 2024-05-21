package intro;

import java.util.Scanner;

public class Week3 {

    //psvm+tab
    public static void main(String[] args) {

        example7();
    }
    static void example7(){

        Course c1 = new Course();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a course name: ");
        String courseName = input.nextLine();
        String courseCode;
        do {
            System.out.printf("Enter the course code for the %s course%n", courseName);
            courseCode = input.nextLine();
            if(courseCode.length() == 8)
                break;
            System.out.printf("Sorry but '%s' in not a valid course code. " +
                    "Please try again%n", courseCode);
        }
        while(true);

        System.out.println("Enter your grade");
        double grade = input.nextDouble();

        c1.courseName = courseName;
        c1.setCourseCode(courseCode);
        c1.grade = grade;

        System.out.printf("Course name = %s, Course Code = %s, Grade = %.1f",
                c1.courseName, c1.getCourseCode(), c1.grade);

    }
    static void example6(){

        Car c1 = new Car();
        c1.color = "red, white";
        c1.doors = 5;
        c1.transmissionType = 'M';
        System.out.println(c1.getHorsePower());
        c1.setHorsePower(123);
        System.out.println(c1.getHorsePower());
    }
    static void example5(){

        Pizza p1 = new Pizza();

        System.out.println(p1.delivery("1 Georgian Drive"));
        System.out.println(p1.delivery("1 Georgian Drive", 15));
    }
    static void example4(){

        //create an object=> instantiate

        int num = 100;
        Car c1 = new Car();

        System.out.println(c1.accelerate()); //vrom, vrom

        String v1 = c1.accelerate(100);

        String v2 = c1.accelerate(10f);
        long num1 = 123;
        String v3 = c1.accelerate(num1);

        String v4 = c1.decelerate((short)1);
        short num2 = 123;
        String v5 = c1.decelerate(num2);


    }
    static void example2(){

        Object o = 1;
        o = 1.1;
        o = 2f;
        o = true;
        o ='C';
        o = "hi";

    }
    static void example3(){

        int[] numbers;  //declared but not initialized

        numbers = new int[5];

        numbers[0] = 123;
        numbers[1] = 456;

        int[] numbers1 = {9, 8, 7, 6, 5, 4};

        Object[] anyValues = {true, "hi", 1.1, 'a'};

        /*

                    4       8       12

                    7       14      21

                    9       18      27

         */

        int[][] data = {  {4,8,12}, {7,14,21}, {9,18,27}    };
        System.out.println(data[1][2]);  //21
    }
    static void example1(){

                /*

            Data Type                   Size in bits            value range

            int                             32                  2^number of bits
            long                            64
            short                           16
            byte                            8

            char                            8
            float                           32
            double                          64

         */

        int num1 = -130;
        double num2 = num1;

        //implicity typecasting: small to big

        byte num3 = (byte)num1; //explicit typecasting


        /*

        -128                            127
         */

        System.out.println(num3);

        //promotion:  smaller data type => bigger: no issues

        //demotion: bigger to smaller: explictly with LINE 27


        float num4 = num1;

    }
}
