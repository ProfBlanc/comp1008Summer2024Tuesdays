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

    }
}
