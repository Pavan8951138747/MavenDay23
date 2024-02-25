package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;

public class DemoTest extends BaseTest {

	@Test
	public void testA() {
		Reporter.log(driver.getTitle(), true);

		int rc = Excel.getRowCount("./data/AcrosssGeoCredentials.xlsx", "login");
		Reporter.log("RC:" + rc, true);

		int cc = Excel.getColumnCount("./data/AcrosssGeoCredentials.xlsx", "login", 0);
		Reporter.log("CC:" + cc, true);

		String v = Excel.getCellValue("./data/AcrosssGeoCredentials.xlsx", "login", 0, 0);
		Reporter.log("Value" + v, true);

		Excel.setCellValue("./data/AcrosssGeoCredentials.xlsx", "login", 0, 0, "Pavan");
	}

}
