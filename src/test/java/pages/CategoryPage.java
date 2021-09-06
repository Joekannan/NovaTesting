package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class CategoryPage{
	
	WebDriver driver;

	@FindBy(css = "a#itemc.list-group-item")
	List <WebElement> categories;
	
	@FindBy(xpath = ".//div[@id='tbodyid']//a[@class='hrefch']")
	List <WebElement> products;
	
	@FindBy(linkText = "Add to cart")
	WebElement btnAddToCart;
	
	JavascriptExecutor js;
	
	WebDriverWait wait;
	
	public CategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor) driver;
	}
	
	
	public void selectProduct(String category) {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		switch(category){	
			case "Phones":
				for(WebElement cate :  categories){
					System.out.println(cate.getText());
					if(cate.getText().equalsIgnoreCase("Phones")) {
						js.executeScript("arguments[0].click()", cate);
						
						wait.until(ExpectedConditions.visibilityOfAllElements(products));
						for(WebElement product : products) {
							product.click();
							wait.until(ExpectedConditions.elementToBeClickable(btnAddToCart));
							break;
						}
						
						
						System.out.println("Clicked Phone");
						break;
					}
					
				}
				break;
				
			case "Laptops":
				for(WebElement cate :  categories){
					System.out.println(cate.getText());
					if(cate.getText().equalsIgnoreCase("Laptops")) {
						js.executeScript("arguments[0].click()", cate);
						
						wait.until(ExpectedConditions.visibilityOfAllElements(products));
						for(WebElement product : products) {
							product.click();
							wait.until(ExpectedConditions.elementToBeClickable(btnAddToCart));
							break;
						}
						
						System.out.println("Clicked Laptop");
						break;
					}
					
				}
				break;
				
			case "Monitors":
				for(WebElement cate :  categories){
					System.out.println(cate.getText());
					if(cate.getText().equalsIgnoreCase("Monitors")) {
						js.executeScript("arguments[0].click()", cate);
						
						wait.until(ExpectedConditions.visibilityOfAllElements(products));
						for(WebElement product : products) {
							product.click();
							wait.until(ExpectedConditions.elementToBeClickable(btnAddToCart));
							break;
						}
						
						System.out.println("Clicked Monitors");
						break;
					}
				}
				break;
				
			default:
				break;
		}
	
	}
	
}

