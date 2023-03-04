package class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReaderDemo2 {
    public static void main(String[] args) throws IOException {
//location of file on computer
        String path="Files/NamesAndSalaries.xlsx";
        //using fileinput stream as we want to read the data
        //file output steam is to add the data to a file
        FileInputStream fileInputStream=new FileInputStream(path);
        //XSSFWorkbook class that knows how to read and write data to an excel file
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        //from the excel file we need to get the sheet
        Sheet sheet1= xssfWorkbook.getSheet("sheet1");
        for(Row rows:sheet1){
            for(Cell c:rows){
                System.out.print(c+" ");
            }
            System.out.println();
        }
        System.out.println("*********Regular for loop below*******");
int rowSize=sheet1.getPhysicalNumberOfRows();//storing the number of rows in a sheet

        for (int i = 0; i <rowSize; i++) {
            Row row=sheet1.getRow(i);
            int noOfCells=row.getPhysicalNumberOfCells();//storing the number of cells in a sheet
            for (int j = 0; j < noOfCells; j++) {
                Cell cell=row.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();
        }

    }
}
