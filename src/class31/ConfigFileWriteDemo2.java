package class31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteDemo2 {
    public static void main(String[] args) throws IOException {
        String path="Files/test2.properties";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        Properties properties=new Properties();
        properties.setProperty("Fruit","Apple");
        properties.setProperty("Fruit","Banana");
        properties.setProperty("Fruit","Watermelon");
        properties.setProperty("Fruit","Orange");
        properties.setProperty("Fruit","Grapes");

        properties.store(fileOutputStream,"Some Fruits have been added");

    }
}
