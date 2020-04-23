package StepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;

import Testutil.TestBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import pages.Createaccountpage;
import pages.Firsthomepage;

public class Createaccountstepdefinition extends TestBase {
	Firsthomepage fhomepage;
Createaccountpage createaccountpage1;
	@Given("^User launch url$")
	public void user_launch_url()
	{
		TestBase.initialization();
		
	}
	
	@Then("^user click to login link$")
	public void user_click_to_login()
	{
		fhomepage=new Firsthomepage();
		fhomepage.UserClickTologinlink();
		
	}
	@Then("^verify user is on createaccount page$")
	public void verify_user_is_on_createaccount_page()
	{
		createaccountpage1=new Createaccountpage();
		String title=createaccountpage1.verifyCreateAccounttitle();
		System.out.print(title);
		Assert.assertEquals("Web Hosting : Professional Web Hosting from HostMonster111", title);
	}
	
	@Then ("^user create account$")
	public void create_account()
	{
		createaccountpage1.createaccount();
		Assert.assertEquals(1,2);
	}
	
	@After
	public void afterScenario(Scenario scenario) {
		if (scenario.isFailed()) {
			//String screenshotName = scenario.getName().replaceAll(" ", "_");
			try {
				//This takes a screenshot from the driver at save it to the specified location
				File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
				//Building up the destination path for the screenshot to save
				//Also make sure to create a folder 'screenshots' with in the cucumber-report folder
				File destinationPath = new File("/Users/ajeet/eclipse-workspace/Freeui/Screenshot/testfailure.png");
				
				//Copy taken screenshot from source location to destination location
				FileUtils.copyFile(sourcePath, destinationPath);   

				//This attach the specified screenshot to the test
				Reporter.addScreenCaptureFromPath(destinationPath.toString());
			} catch (IOException e) {
			} 
		}
	}
	
}
