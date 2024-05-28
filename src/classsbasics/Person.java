package classsbasics;

/**
 * This is an awesome Person class that I am very proud of
 * @author Ben Blanc
 * @since 2024-05-28
 * @version 1.0
 */
public class Person {


    private String firstName = "Human", lastName = "Being";
    //public String lastName;
    private short birthYear;
    /** This is the height of the person */
    public double height;


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
    public void setFirstName(String firstName){
        //this.firstName     this = an instance of Person (Person object)
        //firstName
        if(firstName.length() >= 3 && validateName(firstName))
            this.firstName = firstName;
    }
}
