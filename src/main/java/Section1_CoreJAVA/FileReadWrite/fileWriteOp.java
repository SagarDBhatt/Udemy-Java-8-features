package Section1_CoreJAVA.FileReadWrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriteOp {

    public static void main(String[] args) {

    }

    public static void fileWriter(){

        try(FileWriter fw = new FileWriter(new File("FileWriter.txt"))){

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }//end of method
}
