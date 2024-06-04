package classsbasics;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

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
        double mark  = 10;

        Grade grade = new Grade(name, mark);

        assertEquals(mark, grade.getMark());
        assertEquals(name, grade.getName());



    }

    @Test
    public void testThreeArgConstructorWithInvalidValues(){

        String name = "abc";
        double mark = -10;
        Grade grade = new Grade(name, mark);

        assertNotEquals(name, grade.getName());
        assertEquals(0, grade.getMark());

        assertTrue(grade.getName().equals("Grade") &&
                grade.getMark() == 0);

    }
    //strings, doubles, ints (datatype)s

    @ParameterizedTest
    @ValueSource(doubles = {20, 30, 40, 100})
    public void testingGradesSetterWithValidValues(double mark) {

        Grade grade = new Grade();
        grade.setMark(mark);
        assertEquals(mark, grade.getMark());

    }
    @ParameterizedTest
    @ValueSource(doubles = {220, -30, 400, -100})
    public void testingGradesSetterWithInValidValues(double mark) {

        Grade grade = new Grade();
        grade.setMark(mark);
        assertNotEquals(mark, grade.getMark());

    }

    @ParameterizedTest
    @CsvSource({"OOP Course,100","Database,90","ASP .NET,95"})
    public void testingGradesConstructorWith3ArgsValidValues(String name, double mark){

        Grade grade = new Grade(name, mark);
        assertEquals(name, grade.getName());
        assertEquals(mark, grade.getMark());
    }

}