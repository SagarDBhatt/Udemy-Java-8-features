package Section1_CoreJAVA.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionClass {

    public static void main(String[] args) {

/*        try{
            //Reading a file should check the "File not found" exception.
            FileReader fr = new FileReader(new File("C://test.txt"));
        }

        catch (FileNotFoundException e){
            System.out.println("File not found!");
        }*/
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        try {
            runTimeExceptin();
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception == " + e.toString());
        }

        try {
            multipleException();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }//End of main()

    public static void readFile() throws FileNotFoundException {
        File file = new File("text.txt");
        FileReader fr = new FileReader(file);
        //throw new FileNotFoundException();
    }

    public static void runTimeExceptin() {
        int a = 1;
        System.out.println(a / 0);
        throw new RuntimeException();
    }

    public static void multipleException() throws IOException {
        File fl = new File("null");
        FileReader fr = new FileReader(fl);
        throw new FileNotFoundException();
    }
}//End of Class
