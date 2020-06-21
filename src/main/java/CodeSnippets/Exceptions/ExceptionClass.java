package CodeSnippets.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionClass {

    public static void main(String[] args) {

/*        try{
            //Reading a file should check the "File not found" exception.
            FileReader fr = new FileReader(new File("C://test.txt"));
        }

        catch (FileNotFoundException e){
            System.out.println("File not found!");
        }*/
        try{
            readFile();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }

    }//End of main()

    public static void readFile() throws FileNotFoundException{
        File file = new File("text.txt");
        FileReader fr = new FileReader(file);
    }
}//End of Class
