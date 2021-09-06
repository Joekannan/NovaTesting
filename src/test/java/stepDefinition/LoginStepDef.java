package stepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utility.BaseClass;


public class LoginStepDef extends BaseClass {
	
//	WebDriver driver;
	
	LoginPage login;
	
//	@Before
//	public void setUp() {
//		WebDriverManager.chromedriver().setup();
//	    driver = new ChromeDriver();
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	    driver.get("https://www.demoblaze.com/");
//		    
//	}
	
	@Given("I am on homepage")
	public void i_am_on_homepage() {
	    String title = driver.getTitle();
	    assertEquals(title, "STORE");
	    
	}
	
	@When("I login using {string} and {string}")
	public void i_login_using_and(String username, String password) {
		login = new LoginPage(driver);
		login.clickLogin();
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickSignin();
		
	}

	@Then("I should be signed in successfully")
	public void i_should_be_signed_in_successfully() {
		login.verifyLogin();
		
	}
	
//	@After
//	public void tearDown() {
//		driver.close();
//		driver.quit();
//	}

}
