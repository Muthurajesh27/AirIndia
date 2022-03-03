package frameworkDay1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel extends BaseClass{
	
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\MavenDay1\\excel\\FrameworkExcel.xlsx");
		FileInputStream stream = new FileInputStream(file);
		@SuppressWarnings("resource")
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet1");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			System.out.println("");
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				System.out.print(cell);
		}
	}
	}
}
