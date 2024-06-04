package classsbasics;

import java.util.ArrayList;

public class Grade {

    private String name = "Grade";
    private double mark = 0;
    private ArrayList<String> rubric = new ArrayList<>();

    //create getters, setters and constructors (2: default and 3-arg)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 5)
            this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if(mark >= 0 && mark <= 100)
            this.mark = mark;
    }

    public ArrayList<String> getRubric() {
        return rubric;
    }

    public void setRubric(ArrayList<String> rubric) {
        this.rubric = rubric;
    }

    public Grade(){}

    public Grade(String name, double mark){
        setMark(mark);
        setName(name);
    }
}
