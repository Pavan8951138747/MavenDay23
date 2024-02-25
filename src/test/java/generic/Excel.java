package generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static int getRowCount(String path, String sheet) {
		int rc = 0;
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			rc = wb.getSheet(sheet).getLastRowNum();
			wb.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return rc;
	}

	public static int getColumnCount(String path, String sheet, int r) {
		int cc = 0;
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			cc = wb.getSheet(sheet).getRow(r).getLastCellNum();
			wb.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return cc;
	}

	public static String getCellValue(String path, String sheet, int r, int c) {
		String v = " ";
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			v = wb.getSheet(sheet).getRow(r).getCell(c).getStringCellValue();
			wb.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return v;
	}

	public static void setCellValue(String path, String sheet, int r, int c, String v) {

		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			wb.getSheet(sheet).getRow(r).getCell(c).setCellValue(v);
			wb.write(new FileOutputStream(path));
			wb.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
