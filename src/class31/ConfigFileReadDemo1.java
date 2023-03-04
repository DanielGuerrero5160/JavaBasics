package class31;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReadDemo1 {
    public static void main(String[] args) throws IOException {
        //location or path of the file from which we want to read the data
        String path="Files/config.properties";
        //a class that helps us navigate to that folder where the files is stored
        //java is not really going to that location, but java is bringing the file contents into the computers memory.
//if you face issues, hover mouse and click on add exception to method signature
        FileInputStream fileInputStream=new FileInputStream(path);
        /*
        This properties class will assist us to read and write data to .properties files
         */
        Properties properties=new Properties();
        //loads all  the date from the file into the above object "properties"
        properties.load(fileInputStream);
        //we can print properties to get all keys and values, or we use the get method to get the value of a specific key
        System.out.println(properties.get("user"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("URL"));
        System.out.println(properties.get("browser"));
        //it is a good idea to close a file after we access the data
        //we can use fileInputSteam and use the .close method
        fileInputStream.close();


    }
}
