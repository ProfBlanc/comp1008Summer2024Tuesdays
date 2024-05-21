package intro;

public class Course {

    public String courseName;
    private String courseCode;
    double grade;

    public String getCourseCode(){
        return courseCode;
    }
    public void setCourseCode(String courseCode){
//        if(courseCode.length() == 8){
//            this.courseCode = courseCode;
//        }

        this.courseCode = courseCode.length() == 8  ? courseCode : "comp1008";

        if(courseCode.length() == 8)
            this.courseCode = courseCode;
        else
            this.courseCode = "comp1008";

    }
    public boolean isOnDeansList(){
        return grade >= 90;
    }
}
