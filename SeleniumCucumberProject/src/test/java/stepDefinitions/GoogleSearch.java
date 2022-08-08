package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public WebDriver driver;

	@Given("^Browser is open$")
	public void browser_is_open() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(3));

		System.out.println("Browser is ready");
	}

	@And("^User is on google search page$")
	public void user_is_on_google_search_page() {

		driver.get("https://google.com");
	

	}

	@When("^user enters a keyword$")
	public void user_enters_a_keyword() {
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(3));
		driver.findElement(By.name("q")).sendKeys("eclipx");

	}

	@And("^hits enter$")
	public void hits_enter() {

		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);

	}

	@Then("^user is navigated to search results$")
	public void user_is_navigated_to_search_results() throws InterruptedException {
		driver.findElement(
				By.xpath("//a[@href='https://eclipxgroup.com/']//div[@class='TbwUpd NJjxre']//cite[@role='text']"))
				.isDisplayed();

		System.out.println("Redirected to results");
		Thread.sleep(2000);
		driver.quit();
	}

}
