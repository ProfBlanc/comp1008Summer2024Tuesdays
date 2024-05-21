package intro;

public class Car {

    //attributes
    //accessLevel dataType name[= value]
    public String color;
    private int horsePower;
    protected char transmissionType;
    int doors;

    //instance variables ^

    //getter and setter: special method: update a private instance variable

    public int getHorsePower(){
        return horsePower;
    }

    public void setHorsePower(int horsePower){
        if(horsePower > 0 && horsePower < 600){
            this.horsePower = horsePower;
        }
    }

    //methods
    //an action or behaviour of the class

    //accelerate
    //accessLevel returnDataType name([parameters]){}

    //4 accessLevels: public, private, protected, default (aka: package-private)
    // returnDataType: output and/or result of the function
    public String accelerate(){
        return "vroom, vroom";
    }
    public String accelerate(double speed){
        return "increased speed by " + speed + " km/h";
    }
    public int accelerate(String value){
        return 1;
    }

    //create a method name decelerate: take a SHORT value
    public String decelerate(short value){
        return "decreasing speed by " + value + " km/h";
    }

}
