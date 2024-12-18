package BasePage;

import java.util.ArrayList;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class BasePage {

public Page page;
public ArrayList<String> allElemtTextList;
	
	public BasePage(Page page) {
		this.page=page;
	}
	
	
	public ArrayList<String> getAllTheElemetAndStoredIntoArray(String element) {
		
    allElemtTextList=new ArrayList<String>();
	Locator loc=page.locator(element);
	System.out.println("Count "+loc.count());
		for(int i=0; i<loc.count(); i++) {
			String text=loc.nth(i).innerText();
			allElemtTextList.add(text);
		}
		
		return allElemtTextList;
	}
	
	public void clickOnReqElemt(String element, String reqStrig) {
		
	    allElemtTextList=new ArrayList<String>();
		Locator loc=page.locator(element);
			for(int i=0; i<loc.count(); i++) {
				String text=loc.nth(i).innerText();
				if(text.equalsIgnoreCase(reqStrig)) {
					loc.nth(i).click();
					System.out.println("Click On - "+text);
					break;
				}
			}
			
		}
}
