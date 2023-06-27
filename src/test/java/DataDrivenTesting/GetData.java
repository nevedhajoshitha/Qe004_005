package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import Base_Package.Base;

public class GetData extends Base{
public static void main(String[] args) throws IOException, InterruptedException {
	File f = new File("C:\\Users\\NEVEDHA\\eclipse2-workspace\\qe004_qe005\\src\\test\\resources\\samplesheet.xlsx");
	
	XSSFWorkbook w = new XSSFWorkbook();
	
	XSSFSheet s = w.createSheet("Greet");
	
	XSSFRow r = s.createRow(3);
	
	XSSFCell c = r.createCell(2);
	
	c.setCellValue("Welcome");
	
	FileOutputStream o = new FileOutputStream(f);
	w.write(o);
	

	}
}

