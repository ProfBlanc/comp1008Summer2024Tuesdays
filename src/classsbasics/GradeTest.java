package classsbasics;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GradeTest {


    //@Test

    @Test
    public void test1(){

        String name = "Intro to OOP";
        double mark  = 100;

        Grade grade = new Grade(name, mark);

        if(grade.getName().equals(name) && grade.getMark() == mark){
            System.out.println("Good!");
        }else{
            System.out.println("Bad!");
        }
    }
    @Test
    public void test2(){

        String name = "Intro to OOP";
        double mark  = 101;

        Grade grade = new Grade(name, mark);

        assertEquals(mark, grade.getMark());
        assertEquals(name, grade.getName());



    }


}