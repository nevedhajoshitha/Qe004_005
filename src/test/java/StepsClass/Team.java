package StepsClass;

import org.openqa.selenium.By;

import Base_Package.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Team extends Base {
	@Given("Browser is launched")
	public void browser_is_launched() {
	   Start("https://www.google.com");
	}

	@When("^User enters a (.*)$")
	public void user_enters_a_text(String str) throws InterruptedException {
	   driver.findElement(By.name("q")).sendKeys(str);
	   Thread.sleep(2000);
	}

	@When("Clicks on the search button")
	public void clicks_on_the_search_button() throws InterruptedException {
	   driver.findElement(By.name("btnK")).click();
	   Thread.sleep(2000);
	}

	@Then("Quit browser")
	public void quit_browser() {
	    Stop();
	}

}
