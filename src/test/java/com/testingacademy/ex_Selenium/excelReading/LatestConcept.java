package com.testingacademy.ex_Selenium.excelReading;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class LatestConcept {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Naman\\IdeaProjects\\LearningSeleniumATB7x\\src\\test\\java\\com\\testingacademy\\ex_Selenium\\excelReading\\TD.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int row = sheet.getLastRowNum();
        int cell = sheet.getRow(0).getLastCellNum();
        System.out.println("Total row:" + row);
        System.out.println("Total cell:" + cell);

        for(int r = 0;r<=row;r++){
            XSSFRow currentRow = sheet.getRow(r);
            for(int c=0;c<cell;c++){
                String value = currentRow.getCell(c).toString();
                System.out.print(value +"  ");
            }
            System.out.println();
        }
        workbook.close();
        fis.close();
    }
}
