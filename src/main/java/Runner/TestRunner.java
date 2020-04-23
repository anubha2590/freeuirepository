package Runner;
import com.cucumber.listener.Reporter;

import java.io.File;
import java.io.FileReader;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\ajeet\\eclipse-workspace\\Freeui\\src\\main\\java\\Feature\\createAccount.feature" ,
		glue= {"StepDefinitions"}, 
		format= {"pretty","html:test-output"},
				plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report1.html"}
		)

public class TestRunner {
	
	@AfterClass
	public static void writeExtentReport() {
		//Reporter.loadXMLConfig(new File("C:\\Users\\ajeet\\eclipse-workspace\\Freeui\\src\\main\\java\\config\\extent-config.xml"));
		//Reporter.setSystemInfo("Java Version", "1.8.0_151");

	}

}
