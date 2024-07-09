package inheritance;

public class Week9 {
    static void example1(){
        Week9 wk9 = new Week9();

        Person p = new Person();
        System.out.println(p);

        //p.firstName = "Ben";
        p.setFirstName("Ben");

        Student student = new Student();

        System.out.println(student.consume("pizza"));
        System.out.println(student.consume(1000));
        System.out.println(student);
        System.out.println("*".repeat(20));

        System.out.println(p.consume("rice"));
        System.out.println(student.consume("rice"));

    }
    static void example2(){

        Person old = new Student();
        System.out.println(old.consume("rice"));
        System.out.println(old);
    }
    public static void main(String[] args) {
        example2();

    }
}
