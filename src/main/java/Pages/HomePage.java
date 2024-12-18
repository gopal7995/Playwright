package Pages;

import com.microsoft.playwright.Page;

import BasePage.BasePage;

public class HomePage extends BasePage {

	public HomePage(Page page) {
		super(page);
	}
	
	private String newCars="//div[contains(text(),'NEW CARS')]";
	private String findNewCars="//div[contains(text(),'Find New Cars')]";
	private String newCarsPageTitle="//h1";

	
	public void clickOnNewCars() throws InterruptedException {
		page.hover(newCars);
		page.click(findNewCars);
		Thread.sleep(2000);
	
	}
	public String getNewCarPageTitle() {
		 String text=page.locator(newCarsPageTitle).innerText();
		 System.out.println("Text new car page "+text);
		 return text;
	}
	
	
	}
