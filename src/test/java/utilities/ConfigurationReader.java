package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
   private static Properties configFile ;

   static {
       try {

           FileInputStream input = new FileInputStream(System.getProperty("user.dir")+"/configuration.properties");
           configFile = new Properties();
           configFile.load(input);
           input.close();
       } catch (Exception e) {
           e.printStackTrace();
           throw  new RuntimeException("failed to load properties file");

       }


   }
   public static String getProperty(String keyName){
       return configFile.getProperty(keyName );
   }
}
