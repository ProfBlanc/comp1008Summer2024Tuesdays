package classsbasics;

public class Week4 {

    public static void main(String[] args) {
        Person p1 = new Person();
//        p1.lastName = "adhlfa23u09r9q34uq";
        System.out.println(p1.getFirstName());  //Human
        p1.setFirstName("ab");
        System.out.println(p1.getFirstName());  //Human
        p1.setFirstName("Ben");
        System.out.println(p1.getFirstName());  //Ben
        p1.setFirstName("Aa");
        System.out.println(p1.getFirstName());

        p1.height = 1.3;
        System.out.println(p1.educationLevel);
        p1.educationLevel = Person.ListOfEducation.UNIVERSITY;
        System.out.println(p1.educationLevel);

        Person youngPerson = Person.Youth();
        System.out.println(youngPerson.getBirthYear());


        Person p2 = new Person("Ben", "Blanc", (short)2000);
        System.out.println(p2.getFirstName());
        System.out.println(p2.getBirthYear());

    }
}
