
/*

import java.io.*;
public class Program{
	static public void main(String Args[]){

	//mi servia' una variabile che 
	//conservi il path di un file
	String path= "file.txt";
	//hoimportato FileInputStrem ora vad a farmi una istanza
	FileInputStream input = new FileInputStream("/Users/luigi/file.txt");
	}
}

import java.io.*;

public class Program{

static public void main (String Args[]){
String filePath = "/Users/luigi/file.txt";

try {
            FileInputStream input = new FileInputStream(filePath);
            // File is found, you can proceed with reading the file or other operations
            System.out.println("File found and FileInputStream created successfully.");
            // Remember to close the FileInputStream when you're done with it
            input.close();
        } catch (FileNotFoundException e) {
            // Handle the case where the file is not found
            System.err.println("File not found: " + filePath);
            // Print the stack trace for debugging purposes
            e.printStackTrace();
        }
    }
}

*/


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        // Specify the path to the file
        String filePath = "file.txt";

        // Print the value of filePath
        System.out.println("File path: " + filePath);

        // Attempt to create a FileInputStream for the specified file
        try {
            FileInputStream input = new FileInputStream(filePath);
            // File is found, you can proceed with reading the file or other operations
            System.out.println("File found and FileInputStream created successfully.");

            // Close the FileInputStream when you're done with it
            try {
                input.close();
                System.out.println("FileInputStream closed successfully.");
            } catch (IOException e) {
                // Handle the case where an IOException occurs while closing the FileInputStream
                System.err.println("Error closing FileInputStream: " + e.getMessage());
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            // Handle the case where the file is not found
            System.err.println("File not found: " + filePath);
            // Print the stack trace for debugging purposes
            e.printStackTrace();
        }
    }
}
