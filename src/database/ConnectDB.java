package database;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConnectDB {

    public static void main(String[] args) {

        Properties prop = new Properties();
        try {
            InputStream inputStream = new FileInputStream("C:\\Users\\nadee\\IdeaProjects\\PNTech1\\secret.properties");
            prop.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String driverClass = prop.getProperty("MYSQLJDBC.driver");
        Class.forName(driverClass);

    }
}

