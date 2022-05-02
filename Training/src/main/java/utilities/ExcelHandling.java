package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling {

	public static void writeEmailDataInExcel() throws InvalidFormatException {

		try {

			FileInputStream fis = new FileInputStream(
					new File(System.getProperty("user.dir") + "/src/main/resources/TestData.xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook(fis);

			XSSFSheet sheet = workbook.getSheet("Accounts");
			for (int i = 1; i <= sheet.getLastRowNum(); i++) {

				XSSFCell cell = sheet.getRow(i).getCell(0);

				cell.setCellType(CellType.STRING);
				cell.setCellValue(Util.generateRandomEmail());
			}
			FileOutputStream fileOut = new FileOutputStream(
					new File(System.getProperty("user.dir") + "/src/main/resources/TestData.xlsx"));
			workbook.write(fileOut);

			System.out.println("Email in Excel updated successfully");
			fileOut.close();

			workbook.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readDataInExcel() throws InvalidFormatException {

		try {

			FileInputStream fis = new FileInputStream(
					new File(System.getProperty("user.dir") + "/src/main/resources/TestData.xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook(fis);

			XSSFSheet sheet = workbook.getSheet("Accounts");
			System.out.println("Newly added Email : ");

			for (int i = 1; i <= sheet.getLastRowNum(); i++) {

				System.out.println(sheet.getRow(i).getCell(0));
			}

			workbook.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String readDataInExcel(int rowNum) throws InvalidFormatException {
		String value = "";
		try {

			FileInputStream fis = new FileInputStream(
					new File(System.getProperty("user.dir") + "/src/main/resources/TestData.xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook(fis);

			XSSFSheet sheet = workbook.getSheet("Accounts");
			value = sheet.getRow(rowNum).getCell(0).toString();
			workbook.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}

	public static String getConfigData(String key) throws InvalidFormatException {
		String value = "";
		try {

			FileInputStream fis = new FileInputStream(
					new File(System.getProperty("user.dir") + "/src/main/resources/TestData.xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook(fis);

			XSSFSheet sheet = workbook.getSheet("Config_Data");
			System.out.println("Newly added Email : ");

			for (int i = 1; i <= sheet.getLastRowNum(); i++) {

				if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(key)) {
					value = sheet.getRow(i).getCell(1).toString();
					break;
				}

			}

			workbook.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return value;
	}

}
