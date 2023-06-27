package Object_Package;

import java.util.Set;

import org.bouncycastle.util.Arrays.Iterator;

import com.github.dockerjava.api.command.StartContainerCmd;

import Base_Package.Base;
import TestPages.CartPage;
import TestPages.SearchPage;

public class MainPage extends Base{
public static void main(String[] args) throws InterruptedException {
	Start("https://www.amazon.in");
	SearchPage s = new SearchPage(driver);
	s.EnterItemName();
	s.ClickButton();
	Thread.sleep(2000);
	
	CartPage c = new CartPage(driver);
	c.SelectItem();
	
	WindowHandling();
	
	c.AddToCart();
	Thread.sleep(2000);
	
	Stop();
}
}
