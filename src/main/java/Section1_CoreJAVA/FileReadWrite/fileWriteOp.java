package Section1_CoreJAVA.FileReadWrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriteOp {

    public static void main(String[] args) {
        fileWriter();
    }

    public static void fileWriter() {

        try (FileWriter fw = new FileWriter(new File("FileWriter.txt"))) {

            BufferedWriter bw = new BufferedWriter(fw);
            String arg = "This is String";
            bw.write("ONSJHJSA");
            bw.newLine();
            bw.write(arg);
            bw.newLine();
            bw.write("String entry in the File for Buffered Writer");
            bw.write(1);
            bw.write(4);

            bw.close();     //Until the BW is closed, No write operation occured.

            System.out.println("File Write Successfully!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }//end of method
}
