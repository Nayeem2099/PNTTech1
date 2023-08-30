package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

    public static void main(String[] args) {

        //compile time exception until you add try catch (checked error)

        //FileReader fr = new FileReader("C:\Users\nadee\IdeaProjects\PNTech1\src\exercise");
        //turns into this below after you add try/catch

        FileReader fr = null;
        try {
            fr = new FileReader("C:\\Users\\nadee\\IdeaProjects\\PNTech1\\src\\exercise");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader br = new BufferedReader(fr);


        //br.readLine(); before we fixed it and added try catch
        try {
            String line; //we made a string to print entire value of the text
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally { //used to close port between the file reader and buffer reader
            try {
                fr.close(); //what we typed before adding try catch to this
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                br.close(); //what we typed before adding try catch
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }


    }
}
