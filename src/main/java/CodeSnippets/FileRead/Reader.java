package CodeSnippets.FileRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "C:\\Personal Projects\\Certifications\\Udemy\\Java 8 Concepts\\src\\main\\java\\CodeSnippets\\FileRead\\ReaderFile";
        File fileObject = new File(fileName);

        //File fileObject = new File("C:\\Personal Projects\\Certifications\\Udemy\\Java 8 Concepts\\src\\main\\java\\CodeSnippets\\FileRead\\ReaderFile");

        Scanner scan = new Scanner(fileObject);

        while(scan.hasNextLine()){
            String lineRead = scan.nextLine();
            System.out.println(lineRead);
        }

    }
}
