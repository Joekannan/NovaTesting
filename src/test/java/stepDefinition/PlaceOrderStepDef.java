package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CategoryPage;
import utility.BaseClass;


public class PlaceOrderStepDef extends BaseClass{
//	WebDriver driver;
	
	CategoryPage category;
	
	
	@When("I place an order for {string}")
	public void i_place_an_order_for(String Category) {
		category = new CategoryPage(driver);
		category.selectProduct(Category);
		
	}

	@Then("Order should be placed successfully")
	public void order_should_be_placed_successfully() {
	}

	
	
}
