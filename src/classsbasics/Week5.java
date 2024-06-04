package classsbasics;

import java.util.ArrayList;
import java.util.Scanner;

public class Week5 {

    static void example1(){

        //ask the user how many Person object's they would like to create
        //create an array of X amount of Person objects

        //using a loop, ask the user for FirstName, LastName and birthYear
        //for each Person object

        Scanner input = new Scanner(System.in);

        System.out.println("How many Person objects would you like to create?");
        int number = input.nextInt(); // '3\n'
        //number = 3
        Person[] people = new Person[number];
        input.nextLine();  // consume \n

        for(int i = 1; i <= people.length ; i++){


            System.out.println("Enter the FirstName for Person " + i);
            String firstName = input.nextLine();

            System.out.println("Enter the LastName for Person " + i);
            String lastName = input.nextLine();

            System.out.println("Enter the birthYear for Person " + i);
            short birthYear = input.nextShort();

            input.nextLine(); // consume \n for nextShort() call

            people[i-1] = new Person(firstName, lastName, birthYear);

        }
        System.out.println("Here is a summary of the people objects");
        for(Person singlePerson : people){
            System.out.printf("FirstName=%s, LastName=%s, BirthYear=%d%n", singlePerson.getFirstName(),
                    singlePerson.getLastName(), singlePerson.getBirthYear());
        }

    }

    static void example2(){

        //ArrayList
        //ArrayList<DataType>
        //DataType: Reference Data Type
        //int, double,byte,boolean,
       //primitive data types have a Reference Wrapper
       //Start with capital letter
       //int => Integer, char => Character

       //Bulk Barn

ArrayList<Person> people = new ArrayList<>();
people.add(new Person());
System.out.println(people.size());  // 1
people.add(0, new Person("zero", "nothing", (short)2000));

people.set(1, new Person("New", "Person", (short)2001));
people.contains(new Person());



    }

    static void example3(){

        Person p1 = new Person("John", "Smith", (short)2000);
        p1.addHobby("Coding", 365);
        p1.addHobby(new Hobby("Coding", 365));
        p1.addHobby("Walking", 30.5);
        p1.displayHobbies();
        System.out.println("*".repeat(20));

        Hobby h = new Hobby("Walking", 30);
        System.out.println(h.equals(1));
        System.out.println(h.equals("hello"));

        System.out.println(new Hobby("walking", 30).equals(
                new Hobby("walking", 30)
        ));

        p1.removeHobby(new Hobby("Coding", 365));
        p1.displayHobbies();

    }
    public static void main(String[] args) {

        example3();

    }
}
