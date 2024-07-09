package inheritance;

public class Person {
    private String firstName, lastName;
    protected int age;
    public double weight;
    boolean lovesJava;

    public Person(){}
    public Person(String firstName, String lastName, int age, double weight, boolean lovesJava) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.lovesJava = lovesJava;
    }
    //toString(): represent a summary of the Object values


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", lovesJava=" + lovesJava +
                '}';
    }

    public int consume(String food){
        return food.length();
    }
    public int consume(int liquidAmount){
        return liquidAmount;
    }

}
