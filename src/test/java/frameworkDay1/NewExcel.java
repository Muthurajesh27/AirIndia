package frameworkDay1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewExcel {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement skills = driver.findElement(By.id("Skills"));
		
		File file = new File("D:\\MavenDay1\\excel\\NewExceltask.xlsx");
		@SuppressWarnings("resource")
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Test");
		Select s = new Select(skills);
		List<WebElement> option = s.getOptions();
			for (int i = 0; i < option.size(); i++) {
				WebElement txt = option.get(i);
				String text = txt.getText();
				Row row = sheet.createRow(i);
				Cell cell = row.createCell(0);
				cell.setCellValue(text);	
			}
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);
		driver.close();
	}
}