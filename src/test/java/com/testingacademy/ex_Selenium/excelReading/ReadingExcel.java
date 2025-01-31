package com.testingacademy.ex_Selenium.excelReading;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingExcel {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Naman\\Downloads\\TD.xlsx");
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        //XSSFSheet sheet = workbook.getSheet("Sheet1");
        XSSFSheet sheet = workbook.getSheetAt(0);
//        String cellValue = sheet.getRow(1).getCell(1).getStringCellValue();
//        System.out.println(cellValue);

        int rows = sheet.getLastRowNum();
        int cols = sheet.getRow(0).getLastCellNum();
        for (int i = 0; i < rows; i++) {
           XSSFRow row = sheet.getRow(i);
            for (int j = 0; j < cols; j++) {
                XSSFCell cell = row.getCell(j);

            }
        }




        workbook.close();
        inputStream.close();

    }

}
