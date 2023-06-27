package TestNGPrograms;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base_Package.Base;

public class GooglePage extends Base{
@BeforeMethod
public void OpenBrowser() {
	Start("https://www.google.com");
}

@AfterMethod
public void CloseBrowser() {
	Stop();
}


@DataProvider(name = "data")
public Object[][] testdata() {
	return new Object[][] {{"Selenium"}};
}

@Test(dataProvider = "data")

public void SearchText(String str) throws InterruptedException {
	String s = driver.getTitle();
	String t = "Googl";
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(s, t);
	//Assert.assertEquals(s, t,"The titles are not matching");
	driver.findElement(By.name("q")).sendKeys(str);
	Thread.sleep(2000);
	driver.findElement(By.name("btnK")).click();
	Thread.sleep(2000);
	sa.assertAll();
}
}
