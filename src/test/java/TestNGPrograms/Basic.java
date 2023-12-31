package TestNGPrograms;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Basic {
		@BeforeSuite
		public void bs() {
			System.out.println("Before suite");
		}
		
		@AfterSuite
		public void as() {
			System.out.println("After suite");
		}
		
		@BeforeClass
		public void bc() {
			System.out.println("Before class");
		}
		
		@AfterClass
		public void ac() {
			System.out.println("After class");
		}
		
		@BeforeTest
		public void bt() {
			System.out.println("Before test");
		}
		
		@AfterTest
		public void at() {
			System.out.println("After test");
		}
		
		@BeforeMethod
		public void bm() {
			System.out.println("Before Method");
		}
		
		@AfterMethod
		public void am() {
			System.out.println("After Method");
		}
		
		@Test(dependsOnGroups = {"unit1"})
		public void A() {
			System.out.println("First");
		}
		
		@Test(priority = -4, invocationCount = 2, groups = {"unit1"})
		public void B() {
			System.out.println("Second");
		}
		
		@Test(priority = 6, groups = {"unit1"})
		public void C() {
			
			System.out.println("Third");
			Reporter.log("This is information");
			Assert.assertTrue(false);
		}
	
}
