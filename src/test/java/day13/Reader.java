package day13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Reader {
    private static Properties configurationFile;

    static{
        try {
            FileInputStream pathToFile = new FileInputStream(System.getProperty
                    ("user.dir")+"/configuration.properties");
            configurationFile = new Properties();
            configurationFile.load(pathToFile);
            pathToFile.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("failed to load the file");
        }
    }
    public static String getProperties(String keyName){
        return configurationFile.getProperty(keyName);
    }
}
