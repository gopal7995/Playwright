package TestClasses;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import BaseTest.Base;
import Pages.HomePage;

public class Test_CarsHome extends Base{
	 Playwright playwright;
	 Browser browser;
	 Page page;

	@BeforeMethod
	public void goToCarsHomePage() throws InterruptedException {
		page=launchTheBrowser();
	}
	@Test
	public void goToNewCars() throws InterruptedException {
		HomePage hp=new HomePage(page);
		hp.clickOnNewCars();
		Assert.assertEquals(hp.getNewCarPageTitle(), "New Cars");
	}
	@AfterMethod
	public void tearDow() {
		quitTheBrowser();
	}

}
