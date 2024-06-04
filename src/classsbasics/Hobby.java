package classsbasics;

public class Hobby {


     String name;
    double averageTimeSpent;

    public Hobby(){}
    public Hobby(String name, double averageTimeSpent){

        this.name = name;
        this.averageTimeSpent = averageTimeSpent;
    }

    public boolean equals(Object o){

        if(o instanceof Hobby){

            Hobby compare = (Hobby) o;

return compare.name.equals(this.name) && this.averageTimeSpent == compare.averageTimeSpent;
            //hobby.equals(otherHobby)
            //hobby = this
            //otherHobby = o
        }
        return false;
    }
}
