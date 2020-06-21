package CodeSnippets.Exceptions;

import java.io.File;
import java.io.FileReader;

public class ExceptionClass {

    //Reading a file should check the "File not found" exception.
    FileReader fr = new FileReader(new File("C://test.txt"));
}
