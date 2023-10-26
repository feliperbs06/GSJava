package exceptions;

import java.io.*;
import java.nio.charset.Charset;

public class ReadAFile {
    public static void main(String[] args) {
        // Input/Output Streams are 8 bit binary
        // Reader/Writer are 16 bit Unicode

//        new InputStreamReader(System.in, Charset.forName("UTF8"));
        // BufferedReader provided "readLine" :)
        // also check API for "Scanner"
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
//        try {
        String fileName = null;
        try {
            fileName = keyboard.readLine(); // "Checked" Exceptions must be handled
        } catch (IOException ioe) {
            System.out.println("keyboard problem, fatal");
            System.exit(1);
        }
        System.out.println("you typed: " + fileName);
        // se also "Path", "File", "Files"

        // try-with-resources (the parens on try) guarantees to close all resources
        // in reverse order of mention
        // you SHOULD use this form, rather than closing with "finally"
        try (
//            BufferedReader fileInput = new BufferedReader(new FileReader(fileName))
            FileReader fileReader = new FileReader(fileName);
            BufferedReader fileInput = new BufferedReader(fileReader); // this semi is optional!
        ) {
        String line = null;
        while ((line = fileInput.readLine()) != null) {
            System.out.println("> " + line);
        }


        } catch (FileNotFoundException ioe) {
            System.out.println("File not found");
        } catch (IOException ioe) {
            System.out.println("reading failed");
        } finally {
            System.out.println("Happens no matter what");
        }
    }

}
