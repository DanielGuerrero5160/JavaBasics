package class31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        Pathe where we want to create the new file and the name of the file with its extension
         */
        String path="Files/test.properties";
        //we use FileOutputSteam when we have to write the data to a file
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        //Need to create a properties class
        Properties properties=new Properties();
        //adding a key and value to the file--just like put method for maps
        properties.setProperty("Name","Anees");
        //a method to write the data to the disk
        properties.store(fileOutputStream,"A new name has been added");


    }
}
