package Section1_CoreJAVA.FileReadWrite;

import java.io.*;

public class Reader {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "C:\\Personal Projects\\Certifications\\Udemy\\Java 8 Concepts\\src\\main\\java\\CodeSnippets\\FileRead\\ReaderFile";
/*        File fileObject = new File(fileName);

        //File fileObject = new File("C:\\Personal Projects\\Certifications\\Udemy\\Java 8 Concepts\\src\\main\\java\\CodeSnippets\\FileRead\\ReaderFile");

        Scanner scan = new Scanner(fileObject);

        while(scan.hasNextLine()){
            String lineRead = scan.nextLine();
            System.out.println(lineRead);
        }*/

    //Reading File line by line using "Buffer Reader"

        try{
            FileReader fr = new FileReader(new File(fileName));
            BufferedReader br = new BufferedReader(fr);
            String read = null;

            while(( read = br.readLine()) != null){
                System.out.println("Read lines === ");
                System.out.println(read);
            }
        }
        catch (IOException ex){
            System.out.println("Unable to reaD file " + ex);
        }



    }//End of main
}//End of clAA
