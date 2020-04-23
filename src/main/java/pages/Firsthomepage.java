package pages;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import Testutil.TestBase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;



public class Firsthomepage extends TestBase{
	
	Createaccountpage createaccountpage;
	
	//@FindBy(xpath = "//a[contains(text(),'Login to your Account')]")
			//WebElement login1;

			@FindBy(xpath ="//table//table//tbody[1]//tr[1]//td")
	List<WebElement> login1;
			
	//initialization page object
	
	public Firsthomepage() {
		
	PageFactory.initElements(driver, this);
	System.out.print("constructor called- text of -------");
	//login1.click();
                     }
public Createaccountpage UserClickTologinlink()
{
	login1.get(5).click();
	return createaccountpage;
	
	//driver.findElements(By.xpath("//table//table//tbody[1]//tr[1]//td")).get(5).click();
	//System.out.println(login1.isEmpty());
	
	//System.out.println("step2 done.........");
	//System.out.println(login1.getText());
	//System.out.println(login1.isEmpty());
	
	//System.out.println("size======"+login1.size());
}
}
