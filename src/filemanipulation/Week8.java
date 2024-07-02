package filemanipulation;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Week8 {

    static void example1(){

        //create a valid Path
        Path path = Path.of("src/filemanipulation");
        System.out.println(path.toAbsolutePath().toString());

        Path path1 = Path.of("src","filemanipulation");
        System.out.println(path1.toAbsolutePath());

        Path path2 = Path.of("src/filemanipulation/Week8.java");
        Path path3 = Path.of("src","filemanipulation", "Week8.java");

        System.out.println(path2.toAbsolutePath());
        System.out.println(path3.toAbsolutePath());

        System.out.println(path.toFile().exists());

        //create a directory
        try{
            Path path4 = Path.of("src","filemanipulation", "testFile.txt");
            path4.toFile().createNewFile();
//            Path path5 = Path.of("src","filemanipulation", "testDir1");
//            Files.createDirectory(path5);
Path path5 = Path.of("src","filemanipulation", "testDir1", "testDir2", "testDir3");
Files.createDirectories(path5);
        }
        catch (IOException e){
            System.err.println(e);
        }

    }
    static void example2(){

        //how would I create a file named f1.txt inside of
        // testDir1?
Path path1 = Path.of("src", "filemanipulation",
        "testDir1", "f1.txt");
try{
 path1.toFile().createNewFile();
}
catch (IOException e){
    System.err.println(e);
}
        //how would I create a file named f2.txt inside of
        // testDir2?
        Path path2 = Path.of("src", "filemanipulation",
                "testDir1", "testDir2", "testDir22",
                "testDir222", "testDir1122");
        path2.toFile().mkdirs();

//            path2.toFile().mkdir();
        //how would I create a file named f3.txt inside of
        // testDir3?

    }
static void example3(){
        Path path = Path.of("src","filemanipulation");

        for(int i = 1; i <= 3; i++){

            try{
                Path temp = path.resolve("testDir" + i);
                temp = temp.resolve("f" + i + ".txt");
                temp.toFile().createNewFile();
            }
            catch (IOException e){
                System.err.println(e);
            }

        }
}
static void example4(){
        //Get all files and folders or a path

Path path = Path.of("src", "filemanipulation");

String[] fileNames = path.toFile().list(); //array of Filename Strings

for(String fileName : fileNames){
    System.out.println(fileName);
}
    System.out.println("*".repeat(20));

File[] fileObjects = path.toFile().listFiles();

for(File file : fileObjects){

    System.out.println(file.getName());
    System.out.println(file.lastModified());
    System.out.println(file.isDirectory());
    System.out.println(file.isFile());

}

}

static void example5(){

Path path = Path.of("src", "filemanipulation",
        "second.txt");
try {
    Files.writeString(path, "\nI love Java",
            path.toFile().exists()? StandardOpenOption.APPEND :
            StandardOpenOption.CREATE_NEW);
}
catch (IOException e){
    System.err.println(e);
}
}
static void example6(){
        Path path = Path.of("src", "filemanipulation", "second.txt");
        try {
            String content = Files.readString(path);
            System.out.println(content);
        }
        catch (IOException e){
            System.err.println(e);
        }
}
static void example7(){

        Path path1 = Path.of("src","filemanipulation",
                "testDir3");
    Path path2 = Path.of("src","filemanipulation",
            "testDir3Thirty");

        path1.toFile().renameTo(path2.toFile());

//        Files.copy(path1, path2);
//        Files.delete(path1);
}
    public static void main(String[] args) {
        example7();
    }
}
