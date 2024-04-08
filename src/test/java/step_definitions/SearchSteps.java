package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class SearchSteps {

	@Given("User is on the homepage")
	public void user_is_on_the_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		
		        // Set the path to chromedriver executable
		        System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace-web\\joswin_automation\\src\\test\\resources\\chrome\\chromedriver\\chromedriver.exe");

		        
		        // Specify custom Chrome executable path
		        String chromePath = "D:\\eclipse-workspace-web\\joswin_automation\\src\\test\\resources\\chrome\\chrome-win64\\chrome.exe"; // Example: "C:\\Program Files\\CustomChrome\\chrome.exe"

		        // Set ChromeOptions to specify custom Chrome executable path
		        ChromeOptions options = new ChromeOptions();
		        options.setBinary(chromePath);
		        
		        // Initialize ChromeDriver with ChromeOptions
		        WebDriver driver = new ChromeDriver(options);
		        
		        // Maximize the browser window
		        driver.manage().window().maximize();

		        // Navigate to Google.co.in
		        driver.get("https://www.google.co.in");

		        // Find and click on the "Sign in" button
		        WebElement signInButton = driver.findElement(By.linkText("Sign in"));
		        signInButton.click();

		        // Find the email input field and enter your email address
		        WebElement emailInput = driver.findElement(By.id("identifierId"));
		        emailInput.sendKeys("your_email@gmail.com");

		        // Click on the "Next" button
		        WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
		        nextButton.click();

		        // Wait for the password input field to be visible
		        

	}

	@When("User searches for {string}")
	public void user_searches_for(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

	@Then("Search results for {string} are displayed")
	public void search_results_for_are_displayed(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
