package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Parametrize {
	public WebDriver driver;

	
	 @Given("^user is on test website login page$")
	    public void user_is_on_test_website_login_page() {
		 WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		driver.navigate().to(" https://example.testproject.io");
	    }

	    @When("^user enters (.+) and (.+)$")
	    public void user_enters_and(String username, String password) throws InterruptedException {
	    	
	    	driver.findElement(By.id("name")).sendKeys(username);
	    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	    	// not good to add thread.sleep
	    	Thread.sleep(2000);
	    }
	    @And("^clicks on login$")
	    public void clicks_on_login() {
	    	driver.findElement(By.cssSelector("#login")).click();
	    }
	    
	    @Then("^user is navigated next screen$")
	    public void user_is_navigated_next_screen() {
	    	driver.findElement(By.xpath("//button[@id='logout']")).isDisplayed();
	    	driver.quit();
	    }

	 

}
