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

public class ExcelReaderDemo4 {
    public static void main(String[] args) throws IOException {
        String path="Files/NamesAndSalaries.xlsx";
        //using fileinput stream as we want to read the data
        //file output steam is to add the data to a file
        FileInputStream fileInputStream=new FileInputStream(path);
        //XSSFWorkbook class that knows how to read and write data to an excel file
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        //from the excel file we need to get the sheet
        Sheet sheet1= xssfWorkbook.getSheet("sheet1");

        System.out.println("*********Regular for loop below*******");

        int rowSize=sheet1.getPhysicalNumberOfRows();//storing the number of rows in a sheet

        var excelData=new ArrayList<>();

        for (int i = 1; i <rowSize; i++) {
            Row row=sheet1.getRow(i);
           LinkedHashMap rowMap=new LinkedHashMap<>();
           rowMap.put("Name",row.getCell(0));
           rowMap.put("Age",row.getCell(1));
           rowMap.put("City",row.getCell(2));
           rowMap.put("Salary",row.getCell(3));
           excelData.add(rowMap);
        }
        
    }
}
