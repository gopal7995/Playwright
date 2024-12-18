package Pages;

import java.util.List;

import com.microsoft.playwright.Page;

import BasePage.BasePage;

public class NewCarsPage extends BasePage {

	
	//Page page;
	
	public NewCarsPage(Page page) {
		super(page);
	}
	
	private String allNewCars="//ul[contains(@class,'o-XylGE')]//a//div[2]";
	private String bmwCarsPageTitle="//h1";

	
	public void getAllTheCars() {
		List<String> listOFText=getAllTheElemetAndStoredIntoArray(allNewCars);
		System.out.println("listOFText "+listOFText);
	
	}
	public void clickOnReqCar(String car) {
		clickOnReqElemt(allNewCars,car);
	
	}
	public String getBmwPageTitle() {
		 String text=page.locator(bmwCarsPageTitle).innerText();
		 System.out.println("title of BMW car page  - "+text);
		 return text;
	}
}
