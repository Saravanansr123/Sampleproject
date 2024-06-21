package OAP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import WebDriverManagers.WebDriverMgrs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class amazon {
	public WebDriver driver;

	@Given("user launch browser open amazon")
	public void user_launch_browser_open_amazon() {
		WebDriverMgrs webDr = new WebDriverMgrs();
	 	//Choosing Browser to Launch
		driver = webDr.launchBrowser("edge");
	 	driver.get("https://www.amazon.in/");
	    System.out.println("Browser Launched");
	}

	@And("user search product")
	public void user_search_product() {
		//Search a product by name
		WebElement ProductSch = driver.findElement(By.xpath("//div/input[@id=\"twotabsearchtextbox\"]"));
		ProductSch.sendKeys("alexa echo dot");
		//Click on Search 
		driver.findElement(By.xpath("//div/span/input[@id=\"nav-search-submit-button\"]")).click();
		System.out.println("Product Searched");
	}

	@Then("user close Amazon")
	public void user_close_amazon() {
		driver.quit();
		System.out.println("Browser Closed");
		
	}

}
