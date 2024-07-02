package filemanipulation;

/*
welcome comp1008 - week 8
Agenda
	Announcements
	File Manipulation Lecture




School Course Evaulations Tracker


Enter a school: GeorgianCollege
Enter a year: 2024
Enter a semester: summer

Create the directory struction		src/filemanipulation/funtask/
		GeorgianCollege/2024/summer

Ask user to enter a course code: comp1008
Create this directory inside of      ^

src/filemanipulation/funtask/GeorgianCollege/2024/summer/comp1008

how many evaluations have you had? 2

use a loop, ask user to enter the name and grade of each evaulation
Write to the path above a file named evaluation.txt
content of file will be the grade
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class SchoolCourseEvaluationsTracker {

    static Scanner input = new Scanner(System.in);
    /**
     * Ask the user a question and return their answer as a String
     * @param question the question to ask
     * @return the users answer
     */
    static String ask(String question){
        System.out.print(question + ": ");
        return input.nextLine();
    }
    public static void main(String[] args) {
        String school, semester, year, course,
                grade, evaluation;
        Path rootPath = Path.of("src","filemanipulation",
                "funtask");
        try {
            if (!rootPath.toFile().exists()) {
                rootPath.toFile().mkdirs();
            }

            school = ask("Enter school name");
            year = ask("Enter school year");
            semester = ask("Enter school semester");

            rootPath = rootPath.resolve(school).resolve(year).resolve(semester);
            Files.createDirectories(rootPath);

            course = ask("Enter course code");
            rootPath = rootPath.resolve(course);
            rootPath.toFile().mkdir();

int numEvaluations = Integer.parseInt(ask("How many evaluations have you had?"));
for(int i = 1; i <= numEvaluations; i++){
 evaluation = ask("Enter evaluation " + i + " name");
 grade = ask("Enter grade for " + evaluation);

 Files.writeString(rootPath.resolve(evaluation + ".txt"),
         grade);
}
        }
        catch (IOException e){
            System.err.println(e);
        }
    }

}
