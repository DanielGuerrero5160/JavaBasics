package class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReaderDemo3 {
    public static void main(String[] args) throws IOException {
        LinkedHashMap<String,String> row1=new LinkedHashMap<>();
        row1.put("Name","Hamid");
        row1.put("age","30");
        row1.put("city","San Ramon");
        row1.put("salary","120000");

        LinkedHashMap<String,String> row2=new LinkedHashMap<>();
        row2.put("Name","Sam");
        row2.put("age","60");
        row2.put("City","San Ramon");
        row2.put("salary","70000");

        LinkedHashMap<String, String> row3=new LinkedHashMap<>();
        row3.put("Name","Fayed");
        row3.put("age", "45");
        row3.put("City","Alexandria");
        row3.put("salary","129020");

        List<Map<String,String>> allRows=new ArrayList<>();
        allRows.add(row1);
        allRows.add(row2);
        allRows.add(row3);

        System.out.println(allRows);


    }
}
