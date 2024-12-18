package BaseTest;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Base {
	
	 Playwright playwright;
	 Browser browser;
	 Page page;
	 
	public Page launchTheBrowser() {
		 playwright=Playwright.create();
		 browser= playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		 page=browser.newPage();
		 page.navigate("https://www.carwale.com/");	 
		 return page;
	}
	
   public boolean isElemetPreset(String element) {
	 boolean isElementThere = page.locator(element).isVisible();
	 return isElementThere;
		
	}
   public String getText(String element) {
	    String text=   page.locator(element).innerText();
		return text;
	}
 
   public void quitTheBrowser() {
	   page.close();
	   browser.close();
	   playwright.close();
		
	}

}
