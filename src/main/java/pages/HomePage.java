package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	By homePageUserName = By.xpath("//h6[text()='Dashboard']");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//get the welcome text or username from home page
	public String getHomePageUserName() {
		return driver.findElement(homePageUserName).getText();
	}
}
