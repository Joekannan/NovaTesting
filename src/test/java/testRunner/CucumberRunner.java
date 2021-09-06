package testRunner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utility.BaseClass;

@CucumberOptions(
        features = "src/test/resources",
        glue="stepDefinition",
        plugin = { "json:target/cucumber-reports/cucumber.json",
                "pretty", "html:target/html-report/cucumber-html-reports.html",
                "junit:target/cucumber-reports/cucumber.xml" }
        )


public class CucumberRunner extends AbstractTestNGCucumberTests{
	
	
	@BeforeMethod
	public void setUp() {
		BaseClass.driverInitialization();
		
	}

	

	@AfterMethod
	public void tearDown() {
		BaseClass.driverClosure();
	}
}
