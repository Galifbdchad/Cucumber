package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef1 {

	WebDriver driver;
	LocatorsLoop  lcl;

@Given("^user navigated to agiletrailblazers\\.com$")
public void user_navigated_to_agiletrailblazers_com() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "/drivers/chromedriver.exe");	
	driver=new ChromeDriver();
	
	driver.get("http://mock.agiletrailblazers.com/contact.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
}

@When("^user enter Name as \"([^\"]*)\"$")
public void user_enter_Name_as(String arg1) throws Throwable {

   driver.findElement(By.id("name")).sendKeys("Mr Jack Robinson");
		
}

@When("^enter Email as \"([^\"]*)\"$")
public void enter_Email_as(String arg1) throws Throwable {
	 driver.findElement(By.id("email")).sendKeys("jackrob@email.com");
	
}

@When("^enter Phone number as \"([^\"]*)\"$")
public void enter_Phone_number_as(String arg1) throws Throwable {
	 driver.findElement(By.id("mobile")).sendKeys("67890");
	 }



@When("^enter Office number as \"([^\"]*)\"$")
public void enter_Office_number_as(String arg1) throws Throwable {
	 driver.findElement(By.id("office")).sendKeys("12345");
}



@When("^select from the dropdown menu as \"([^\"]*)\"$")
public void select_from_the_dropdown_menu_as(String arg1) throws Throwable {
	 Select slc = new Select(driver.findElement(By.id("subject")));
	 slc.selectByVisibleText("Agile");}



@When("^write message in message box as \"([^\"]*)\"$")
public void write_message_in_message_box_as(String arg1) throws Throwable {
	 driver.findElement(By.id("message")).sendKeys("Please contact with me");

}


@When("^click on submit button$")
public void click_on_submit_button() throws Throwable {
	 driver.findElement(By.id("submit")).click();
}

@Then("^submit should be successful$")
public void submit_should_be_successful() throws Throwable {

	lcl= new LocatorsLoop(driver);
	 lcl.loop();

	 driver.close();
}

	
	

}
