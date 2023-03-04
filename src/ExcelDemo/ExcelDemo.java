package ExcelDemo;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo {
    public static void main(String[] args) throws IOException {
        //location of file on computer
        String path="/Users/danielguerrero/Desktop/ExcelDemo.xlsx";
        //using fileinput stream as we want ot read the data. File output steam is ta
        //add the data
        FileInputStream fileInputStream=new FileInputStream(path);
        //
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);

        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        Row row= sheet.getRow(0);
        System.out.println(row.getCell(0));

    }
}
