package pages;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;



public class RegistrationPage {
	
	WebDriver driver;

	Faker fake;
	
	@FindBy(id="signin2")
	WebElement lnkSignUp;
	
	@FindBy(id="sign-username")
	WebElement txtUserName;
	
	@FindBy(id="sign-password")
	WebElement txtPassword;
	
	@FindBy(xpath = ".//button[text()='Sign up']")
	WebElement btnSignUp;
	
	@FindBy(id="nameofuser")
	WebElement lnkWelcome;
	
	
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickSignUp() {
		lnkSignUp.click();
	}
	
	public void enterUsername() {
		fake = new Faker();
		
		txtUserName.click();
		txtUserName.sendKeys(fake.name().firstName());
	}
	
	public void enterPassword() {
		txtPassword.sendKeys("Test123");
	}
	
	public void clickRegister() {
		btnSignUp.click();
	}
	
	public void verifyRegistration() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());
		
		String actualMsg = driver.switchTo().alert().getText();
		assertEquals(actualMsg, "Sign up successful.");
		
		driver.switchTo().alert().accept();
		
	}

}
