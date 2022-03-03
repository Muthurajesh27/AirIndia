package frameworkDay1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day2Excel {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\MavenDay1\\excel\\FrameworkExcel.xlsx");
		FileInputStream stream = new FileInputStream(file);
		@SuppressWarnings("resource")
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet1");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				CellType type = cell.getCellType();
				switch (type) {
				case STRING:
					String data = cell.getStringCellValue();
					System.out.println(data);

					break;
				case NUMERIC:
					if (DateUtil.isCellDateFormatted(cell)) {
						String dateInfo = new SimpleDateFormat("MMM-dd-yyyy").format(cell.getDateCellValue());
						System.out.println(dateInfo);

					} else {
						String name = BigDecimal.valueOf(cell.getNumericCellValue()).toString();
						// double d = cell.getNumericCellValue();
						// BigDecimal b = BigDecimal.valueOf(d);
						// String name = b.toString();
						System.out.println(name);
					}
					break;
				default:
					break;
				}
			}
		}
	}
}