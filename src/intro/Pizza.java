package intro;

public class Pizza {

    public String delivery(String address){
        //souf: String Formatting
        //Create a string and pass placeholders: %s, d, f: %s  %d  %f

       return String.format("Your pizza will be delivered to the address: %s", address);
    }
    public String delivery(String address, int time){

        return delivery(address) + " in " + time + " minutes";
    }
}
