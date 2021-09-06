package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegistrationPage;
import utility.BaseClass;


public class RegistrationStepDef extends BaseClass{
	
//	WebDriver driver;
	
	RegistrationPage registration;
	
	

	@When("I enter unique details for registration")
	public void i_enter_unique_details_for_registration() {
		registration = new RegistrationPage(driver);
		registration.clickSignUp();
		registration.enterUsername();
		registration.enterPassword();
		registration.clickRegister();;
	}

	@Then("I should be registered successfully")
	public void i_should_be_registered_successfully() {
		registration.verifyRegistration();
	}
	
	
	
}
