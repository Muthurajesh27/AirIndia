package testNgAdactin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	// 1
	public static void getdriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	// 2
	public static void loadUrl(String Url) {
		driver.get(Url);
	}

	// 3
	public void sendKeys(WebElement element, String data) {
		element.sendKeys(data);
	}

	// 4
	public static void click(WebElement element) {
		element.click();
	}

	// 5
	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	// 6
	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	// 7
	public String getUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public String getAttribute(WebElement element, String attributevalue) {
		String att = element.getAttribute(attributevalue);
		return att;

	}

	public boolean ContainsText(WebElement element, String text) {
		String txt = element.getText();
		boolean contains = txt.contains(text);
		return contains;
	}

	// 9
	public WebElement findElementById(String attributevalue) {
		WebElement element = driver.findElement(By.id(attributevalue));
		return element;
	}

	// 10
	public WebElement findElementByName(String Attributevalue) {
		WebElement element = driver.findElement(By.name(Attributevalue));
		return element;
	}

	// 11
	public WebElement findElementByClassname(String attributevalue) {
		WebElement element = driver.findElement(By.className(attributevalue));
		return element;
	}

	// 12
	public WebElement xPath(String value) {
		WebElement element = driver.findElement(By.xpath(value));
		return element;
	}

	// 13
	public String insertValueFromTextBox(WebElement element, String value) {
		String text = element.getAttribute(value);
		return text;
	}

	// 14
	public void selectOptionByText(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}

	// 15
	public void selectOptionById(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	// 16
	public void selectOptionByAttribute(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	// 17
	public void moveToElement(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	// 18
	public void dragAndDrop(WebElement src, WebElement dest) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, dest).perform();
	}

	// 19
	public void contextClick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}

	// 20
	public static void maximize() {
		driver.manage().window().maximize();
	}

	// 21
	public void minimize() {
		driver.manage().window().minimize();
	}

	// 22
	public void navigateTo() {
		driver.navigate().to("url");
	}

	// 23
	public void navigateForward() {
		driver.navigate().forward();
	}

	// 24
	public void navigateBack() {
		driver.navigate().back();
	}

	// 25
	public void navigateRefresh() {
		driver.navigate().refresh();
	}

	// 26
	public void doubleClick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}

	// 27
	public void alertAccept() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	// 28
	public void alertDismiss() {
		Alert d = driver.switchTo().alert();
		d.dismiss();
	}

	// 29
	public void alertSendkeys(String name) {
		Alert al = driver.switchTo().alert();
		al.sendKeys(name);
	}

	// 30
	public String alertGetText() {
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		return text;
	}

	// 31
	public void getScreenshot(String filePath) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File des = new File(filePath);
		FileUtils.copyFile(src, des);
	}

	// 32
	public void elementScreenshot(WebElement element, String filePath) throws IOException {
		File src = element.getScreenshotAs(OutputType.FILE);
		File des = new File(filePath);
		FileUtils.copyFile(src, des);
	}

	// 33
	public void jsClick(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", element);
	}

	// 34
	public void jsScrollUp(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	// 35
	public void jsScrollDown(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	// 36
	public Object jsGetAttribute(WebElement element, String data) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		Object attText = executor.executeScript("return arguments[0].getAttribute('" + data + "')", element);
		return attText;
	}

	// 37
	public List<WebElement> getOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		return options;
	}

	// 38
	public List<WebElement> getAllSelectOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		return allSelectedOptions;
	}

	// 39
	public WebElement getFirstSelectedOptions(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		return firstSelectedOption;
	}

	// 40
	public boolean isMultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;
	}

	// 41
	public void deSelectByIndex(int index, WebElement element) {
		Select s = new Select(element);
		s.deselectByIndex(index);
	}

	// 42
	public void deSelectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.deselectByValue(value);
	}

	// 43
	public void deSelectByVisibleText(WebElement element, String data) {
		Select s = new Select(element);
		s.deselectByVisibleText(data);
	}

	// 44
	public void deSelectAll(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
	}

	// 45
	public String getWindowHandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	// 46
	public Set<String> getWindowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}

	// 47
	public void switchToWindow(String data) {
		driver.switchTo().window(data);
	}

	// 48
	public static void closeAllWindows() {
		driver.quit();
	}

	// 49
	public void closeCurrentWindow() {
		driver.close();
	}

	// 50
	public void WriteData(String sheetName, int rowNo, int cellNo, String value) throws IOException {
		File file = new File("D:\\MavenDay1\\excel\\Hotel.xlsx");
		FileInputStream stream = new FileInputStream(file);
		@SuppressWarnings("resource")
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.createCell(cellNo);
		cell.setCellValue(value);
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);
	}

	// 51
	public void updateData(String sheetName, int rowNo, int cellNo, String oldData, String newData) throws IOException {
		File file = new File("D:\\MavenDay1\\excel\\Hotel.xlsx");
		FileInputStream stream = new FileInputStream(file);
		@SuppressWarnings("resource")
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		String data = cell.getStringCellValue();
		if (data.equals(oldData)) {
			cell.setCellValue(newData);
		}
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);
	}

	// 52
	public static String getData(String sheetName, int rowNo, int cellNo) throws IOException {
		String data = null;
		File file = new File("D:\\MavenDay1\\excel\\Hotel.xlsx");
		FileInputStream stream = new FileInputStream(file);
		@SuppressWarnings("resource")
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		CellType type = cell.getCellType();
		switch (type) {

		case STRING:
			data = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				data = new SimpleDateFormat("dd-MMM-yy").format(cell.getDateCellValue());
			} else {
				data = BigDecimal.valueOf(cell.getNumericCellValue()).toString();
			}
			break;
		default:
			break;
		}
		return data;
	}
}