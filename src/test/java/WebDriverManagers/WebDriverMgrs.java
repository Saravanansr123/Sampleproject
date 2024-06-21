package WebDriverManagers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class WebDriverMgrs {

	public WebDriver driver;

	public WebDriver launchBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("edge")) {
			
			System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		}

		else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else
			System.out.println("Invalid Browser Name");

		driver.manage().window().maximize();
		return driver;
	}
}
