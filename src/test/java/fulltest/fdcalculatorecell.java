package fulltest;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fdcalculatorecell {

	public static void main(String[] args) throws Exception {

		// 1️⃣ Launch Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// 2️⃣ Open FD Calculator Website
		driver.get("https://example-fd-calculator-url.com"); 
		// replace with actual FD calculator URL
        // input> workbook>sheet>rows>cell
		// 3️⃣ Read Excel File
		FileInputStream file = new FileInputStream(
				"/Users/architsingh/eclipse-workspace/seleniumtraining1/excell/Book1.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		int rows = sheet.getLastRowNum();

		// 4️⃣ Loop through Excel rows
		for (int i = 1; i <= rows; i++) {

			String principal = sheet.getRow(i).getCell(0).toString();
			String rate = sheet.getRow(i).getCell(1).toString();
			String period = sheet.getRow(i).getCell(2).toString();
			String frequency = sheet.getRow(i).getCell(3).toString();

			// 5️⃣ Clear existing data
			driver.findElement(By.id("principal")).clear();
			driver.findElement(By.id("interest")).clear();
			driver.findElement(By.id("tenure")).clear();

			// 6️⃣ Enter values from Excel
			driver.findElement(By.id("principal")).sendKeys(principal);
			driver.findElement(By.id("interest")).sendKeys(rate);
			driver.findElement(By.id("tenure")).sendKeys(period);

			// 7️⃣ Select Frequency
			Select freq = new Select(driver.findElement(By.id("frequency")));
			freq.selectByVisibleText(frequency);

			// 8️⃣ Click Calculate
			driver.findElement(By.id("calculate")).click();

			// 9️⃣ Wait to observe result
			Thread.sleep(2000);

			// 🔟 Capture result (Optional Validation)
			String maturityValue = driver.findElement(By.id("maturityValue")).getText();
			System.out.println("Maturity Value for Row " + i + " : " + maturityValue);
		}

		// 11️⃣ Close resources
		workbook.close();
		driver.quit();
	}
}
