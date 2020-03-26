package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Properties;

public class Reader {
    public static Properties configFile;

    static {
        try {
            FileInputStream fileInputStream = new FileInputStream("configuration.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){
        return configFile.getProperty(key);

    }
}
