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
import Pages.NewCarsPage;

public class Test_NewCars extends Base {

	 Playwright playwright;
	 Browser browser;
	 Page page;
	 
	 @BeforeMethod
	 public void lauctTheBrowser() {
		 page=launchTheBrowser();
	 }

	@Test
	public void verfyThatUserShouldBeAbleToNavigateToBMWCarPage() throws InterruptedException {
		HomePage hp=new HomePage(page);
		hp.clickOnNewCars();
		NewCarsPage ncp=new NewCarsPage(page);
		Thread.sleep(5000);
		ncp.getAllTheCars();
		ncp.clickOnReqCar("Bmw");
		Assert.assertEquals(ncp.getBmwPageTitle(), "BMW Cars");
		
	}
	@AfterMethod
	public void tearDow() {
		quitTheBrowser();
	}
}
