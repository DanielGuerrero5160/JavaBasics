package class31;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReaderDemo1 {
    public static void main(String[] args) throws IOException {
        //location of file on computer
        String path="Files/NamesAndSalaries.xlsx";
        //using fileinput stream as we want to read the data
        //file output steam is to add the data to a file
        FileInputStream fileInputStream=new FileInputStream(path);
        //XSSFWorkbook class that knows how to read and write data to an excel file
        XSSFWorkbook  xssfWorkbook=new XSSFWorkbook(fileInputStream);
        //from the excel file we need to get the sheet
        Sheet sheet1= xssfWorkbook.getSheet("sheet1");
        Row row=sheet1.getRow(1);
        Cell cell=row.getCell(1);
        System.out.println(cell);
        //iterating through the rows and columns in the excel sheet
        for(Row rows:sheet1){
            for(Cell c:rows){
                System.out.print(c+" ");
            }
            System.out.println();
        }





    }
}
