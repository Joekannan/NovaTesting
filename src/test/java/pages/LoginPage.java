package pages;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.BaseClass;


public class LoginPage{
	
	WebDriver driver;


	@FindBy(id="login2")
	WebElement lnkLogin;
	
	@FindBy(id="loginusername")
	WebElement txtUserName;
	
	@FindBy(id="loginpassword")
	WebElement txtPassword;
	
	@FindBy(xpath = ".//button[text()='Log in']")
	WebElement btnLogin;
	
	@FindBy(id="nameofuser")
	WebElement lnkWelcome;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogin() {
		lnkLogin.click();
	}
	
	public void enterUsername(String username) {
		txtUserName.click();
		txtUserName.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void clickSignin() {
		btnLogin.click();
	}
	
	public void verifyLogin() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(lnkWelcome));
		
		String actualText = lnkWelcome.getText().split(" ")[0];
		assertEquals(actualText, "Welcome");
		
		boolean blnExist = lnkWelcome.isDisplayed();
		assertEquals(blnExist, true);
	}
}
