package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testutil.TestBase;

public class Createaccountpage extends TestBase{
	
	@FindBy(xpath="//a[contains(text(),'Create Account')]")
	WebElement btn1;
	
	
	public Createaccountpage() {
		
		PageFactory.initElements(driver, this);
		System.out.print("Createaccountpage class contructor");
}

	public String verifyCreateAccounttitle() {
		String titlepfpage=driver.getTitle();
		return titlepfpage;
		
	}

	public void createaccount()
	{
		btn1.click();
	}
	
		}
	
	


