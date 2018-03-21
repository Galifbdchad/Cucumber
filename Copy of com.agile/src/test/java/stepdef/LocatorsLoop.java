package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsLoop {
	WebDriver driver;
	
	public LocatorsLoop(WebDriver driver){
		this.driver =driver;
	}
	
	public void loop(){
	
		WebElement nameAlert = driver.findElement(By.id("nameAlert"));
	    WebElement emailAlert = driver.findElement(By.id("emailAlert"));
	    WebElement messageAlert = driver.findElement(By.id("messageAlert"));
		
	    WebElement success_message= driver.findElement(By.id("success-message"));
		String sm= success_message.getText();
		
		
		WebElement error_message= driver.findElement(By.id("error-message"));
		String em= error_message.getText();
		
		
		boolean isDisplayed1= nameAlert.isDisplayed();
		boolean isDisplayed2= emailAlert.isDisplayed();
		boolean isDisplayed3= messageAlert.isDisplayed();
		
		
		if(isDisplayed1)
		{
			System.out.println("Please fill in the required field"+nameAlert.getText());
			System.out.println(em);
		}
		
		if(isDisplayed2){
			System.out.println("Please fill in the required field"+emailAlert.getText());
			System.out.println(em);
		}
		
		if(isDisplayed3){
			System.out.println("Please fill in the required field"+messageAlert.getText());
			System.out.println(em);
		}
		
		else{
			System.out.println(sm);
		}
		
	}}