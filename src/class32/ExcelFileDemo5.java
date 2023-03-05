package class32;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class ExcelFileDemo5 {
    public static void main(String[] args) throws IOException {
String path="Files/Book1.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        //xssf is a class we can use to read and write data easily from Excel Files
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet2=xssfWorkbook.getSheet("sheet2");
      int numOfRows=sheet2.getPhysicalNumberOfRows();
        System.out.println(numOfRows);



        for (int i = 1; i <numOfRows ; i++) {
            Row row= sheet2.getRow(i);
            int noOfCells=row.getPhysicalNumberOfCells();
            for (int j = 0; j < noOfCells; j++) {
                Cell cell= row.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();
        }


    }
}
