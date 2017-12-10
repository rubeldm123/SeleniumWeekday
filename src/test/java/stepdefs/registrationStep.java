package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.HomepageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class registrationStep {
	WebDriver driver;
	@BeforeTest()
	@Given("^user is visiting homepage$")
	public void user_is_visiting_homepage() throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rubeldm\\Documents\\workspace_driver\\chromedriver2.33.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		driver.getTitle();
		String pageTile= driver.getTitle();
	}
	
	@Test()
		@When("^user click on register link$")
		public void user_click_on_register_link() throws Throwable {
			HomepageFactory Re=new HomepageFactory(driver);
			Re.registerLink().click();
			
			}

		@When("^user enter FirstName$")
		public void user_enter_FirstName() throws Throwable {
			HomepageFactory FN=new HomepageFactory(driver);
			FN.FirstName().sendKeys("MD");
			
		
		}

		@When("^User enter LastName$")
		public void user_enter_LastName() throws Throwable {
			HomepageFactory LN=new HomepageFactory(driver);
			LN.LaststName().sendKeys("Rubel");
		   
		}

		@When("^User enter PhoneNumber$")
		public void user_enter_PhoneNumber() throws Throwable {
			HomepageFactory PN=new HomepageFactory(driver);
			PN.PhoneNumber().sendKeys("123-2345-123");
		  
		}

		@When("^User Enter EmailID$")
		public void user_Enter_EmailID() throws Throwable {
			HomepageFactory EI=new HomepageFactory(driver);
			EI.EmailID().sendKeys("asde@gmail.com");
		
		}

		@When("^User Enter Address$")
		public void user_Enter_Address() throws Throwable {
			HomepageFactory AD=new HomepageFactory(driver);
			AD.EnterAddress().sendKeys("123 4th ave");
			
		 
		}

		@When("^User Enter City$")
		public void user_Enter_City() throws Throwable {
			HomepageFactory Ci=new HomepageFactory(driver);
			Ci.cityName().sendKeys("Patuakhali");
			
		    
		}

		@When("^User Enter State$")
		public void user_Enter_State() throws Throwable {
			HomepageFactory St=new HomepageFactory(driver);
			St.StateName().sendKeys("Barisal");
			
		   
		}

		@When("^User ENter PostelCode$")
		public void user_ENter_PostelCode() throws Throwable {
			HomepageFactory PC=new HomepageFactory(driver);
			PC.postalcode().sendKeys("1234");
			
		 
		}

		@When("^User Select Country$")
		public void user_Select_Country() throws Throwable {
			HomepageFactory co=new HomepageFactory(driver);
			co.selectcountry();
	
		}

		@When("^user enter username,$")
		public void user_enter_username() throws Throwable {
			HomepageFactory un=new HomepageFactory(driver);
			un.enterUsername().sendKeys("rubeldm");
			
		
		}

		@When("^password,$")
		public void password() throws Throwable {
			HomepageFactory PS=new HomepageFactory(driver);
			PS.Enterpassword().sendKeys("password");
		
		}

		@When("^confirm password$")
		public void confirm_password() throws Throwable {
			HomepageFactory cp=new HomepageFactory(driver);
			cp.ConfirmPassword().sendKeys("password");
		
		}

		@When("^user click on submit button$")
		public void user_click_on_submit_button() throws Throwable {
			HomepageFactory sub=new HomepageFactory(driver);
			sub.submit_button().click();
		   
		}

		@Then("^user receives confirmation of successful registration$")
		public void user_receives_confirmation_of_successful_registration() throws Throwable {
			HomepageFactory cm=new HomepageFactory(driver);
			cm.confirmation();
		   
		}
@AfterTest()
		@Then("^user closes the browser$")
		public void user_closes_the_browser() throws Throwable {

	//driver.close();
	
		 
		}

	   
	





}//end of class
