package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    //keyword "throws" in method signature
    public static void main(String[] args) throws IOException {


        FileReader fr = new FileReader("C:\\Users\\nadee\\IdeaProjects\\PNTech1\\src\\exercise");
        BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
            fr.close();
            br.close();
        }
    }

