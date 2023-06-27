package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	WebDriver driver;

	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//span[text()='Apple iPhone 13 (128GB) - Blue'])[1]") WebElement phone;
	@FindBy(id = "add-to-cart-button") WebElement cart;
	
	public void SelectItem() {
		phone.click();
	}
	
	public void AddToCart() {
		cart.click();
	}
}
