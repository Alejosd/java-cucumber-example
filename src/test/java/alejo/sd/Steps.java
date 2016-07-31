package alejo.sd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import junit.framework.Assert;

public class Steps {
	@Given("the following animals: (.*)")
	public void the_following_animals(List<String> animals) {
		

		WebDriver driver = new ChromeDriver();

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
