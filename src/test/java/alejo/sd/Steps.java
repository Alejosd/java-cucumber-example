package alejo.sd;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import junit.framework.Assert;

public class Steps {
	@Given("the following animals: (.*)")
	public void the_following_animals(List<String> animals) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Google Nexus 5");

		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		//WebDriver driver = new ChromeDriver(capabilities);
	
		WebDriver driver = new FirefoxDriver(capabilities);

        driver.get("http://www.google.com");
        
        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("Guns And Roses");

        element.submit();
        
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        driver.quit();
			
		Assert.assertEquals("cow",animals.get(0));
	}
}
