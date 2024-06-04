package classsbasics;

import java.util.ArrayList;
import java.util.Random;

/**
 * This is an awesome Person class that I am very proud of
 * @author Ben Blanc
 * @since 2024-05-28
 * @version 1.0
 */
public class Person {


    private String firstName = "Human", lastName = "Being";
    //public String lastName;
    private short birthYear = 2010;
    /** This is the height of the person */
    public double height;

    private ArrayList<Hobby> hobbies = new ArrayList<>();

    //level of education
    //enum: enumerable: drop-down list of options

    //list of options: array of constants
    enum ListOfEducation {HIGH_SCHOOL, COLLEGE, UNIVERSITY, MASTERS, DOCTORAL}

    public ListOfEducation educationLevel = ListOfEducation.COLLEGE;



    //getters and setters are special methods that enforce restrictions

    //getInstanceVariableName    =>  returns values

    //setInstanceVariableName    => enforces restrictions

    public String getFirstName(){
        return firstName;
    }
    //java documentation

    /**
     * This will validate a name based on criteria of:
     *  All characters must be in range of A-Z
     * @param name value to validate
     * @return whether all characters are A-Z
     */
    private boolean validateName(String name){
        boolean result = true;
        //enhanced for loop  => foreach loop
        // dataType placeHolder : collectionOfValues

        for(char letter : name.toUpperCase().toCharArray()){
            if(letter < 'A' || letter > 'Z'){
                result = false;
                break;
            }
        }

        return result;
    }

    /**
     * Validates name A-Z and space and hyphen
     * @param name value to validate
     * @param includeHyphensAndSpaces whether to allow hyphens and spaces
     * @return whether name is valid according to our criteria
     */
    private boolean validateName(String name, boolean includeHyphensAndSpaces){

        if(!includeHyphensAndSpaces)
            return validateName(name);

        boolean result = true;
        for(char letter : name.toUpperCase().toCharArray()){
            if(letter >= 65 && letter <= 90 || letter == 32 || letter == 45){
            }
            else{
                result = false;
                break;
            }

        }
        return result;
    }
    public void setFirstName(String firstName){
        //this.firstName     this = an instance of Person (Person object)
        //firstName
        if(firstName.length() >= 3 && validateName(firstName))
            this.firstName = firstName;
    }

    //alt+inset
    //rightl-click : generate

    public short getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(short birthYear) {
        if(birthYear <= 2010)
            this.birthYear = birthYear;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.length() >= 3 && validateName(lastName, true))
            this.lastName = lastName;
    }

    //Factory method: a method that produces a NEW OBJECT of this class with preset values
    public static Person Youth(){

        Person p = new Person();
        p.firstName = "Young";
        p.lastName = "Person";
        Random random = new Random();
        p.birthYear = (short)random.nextInt(2007, 2011);
        return p;
    }
    //create two more factory methods: Adult() and Doctor()

    public static Person Adult(){

        Person p = new Person();
        p.firstName = "Adult";
        p.lastName = "Person";
        Random random = new Random();
        p.birthYear = (short)random.nextInt(1960, 2007);
        return p;
    }
    public static Person Doctor(){

        Person p = Adult();
        p.educationLevel = ListOfEducation.DOCTORAL;
        return p;
    }
    //consttuctor: special method: NO return data type. EXACT SAME name of class
    //default constructor
    public Person(){}

    public Person(String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
    }
    public Person(String firstName, String lastName, short birthYear){
        this(firstName, lastName);
        setBirthYear(birthYear);
    }
    public Person(String firstName, String lastName, short birthYear, ListOfEducation educationLevel){
        this(firstName, lastName, birthYear);
        this.educationLevel = educationLevel;
    }
    public Person(short birthYear, String lastName, String firstName){
        this(firstName, lastName, birthYear);
    }

    public void addHobby(Hobby hobby){
        hobbies.add(hobby);
    }
    public void addHobby(String name, double averageTimeSpent){
        addHobby(new Hobby(name, averageTimeSpent));
    }
    public boolean removeHobby(Hobby hobby){

        if(hobbies.contains(hobby)){
            hobbies.remove(hobby);
            return true;
        }
        return false;
    }
    public boolean removeHobby(int index){

        if(index < 0 || index >= hobbies.size())
            return false;

        hobbies.remove(index);
        return true;
    }

    public void displayHobbies(){


        for(Hobby currentHobby : hobbies){
            System.out.printf("Name=%s, AvgTimeSpent=%.1f%n",
                    currentHobby.name, currentHobby.averageTimeSpent);
        }


    }
}
