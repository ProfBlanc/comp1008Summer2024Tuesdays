package inheritance;

public class Student extends Person{

    int studentId;
    String desiredProgram;
    double gpa;

    @Override
    public String toString(){
        return getClass().getSimpleName()
                + super.toString().substring(6)
                + " AND studentid = " + studentId + ", gpa = " + gpa + ", " +
                "desiredProgram = " + desiredProgram;

    }

    public Student(){}
    public Student(String firstName, String lastName,
                   int age, double weight, boolean lovesJava){

            super(firstName, lastName, age, weight, lovesJava);

//        this.age = age;
//        this.weight = weight;
//        this.lovesJava = lovesJava;
//        //        this.firstName = firstName;
//        setFirstName(firstName);
//        setLastName(lastName);
    }
    public int consume(String food, int quantity){
        return food.length() * quantity;
    }
    public int consume(String food){
     //   return food.length() * 2;
        return super.consume(food) * 2;
    }

    public Student(String firstName, String lastName, int age, double weight, boolean lovesJava, int studentId, String desiredProgram, double gpa) {
        super(firstName, lastName, age, weight, lovesJava);
        this.studentId = studentId;
        this.desiredProgram = desiredProgram;
        this.gpa = gpa;
    }
}
