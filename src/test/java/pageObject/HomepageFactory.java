package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomepageFactory {
	WebDriver driver=null;
	
	public HomepageFactory(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}//HF
	
	@FindBy(linkText="REGISTER")
	WebElement register_link;
	public WebElement registerLink(){
	return register_link;
}//WR
	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement enter_FirstName;
	public WebElement FirstName(){
		return enter_FirstName;
	}
	@FindBy(xpath="//input[@name='lastName']")
	WebElement enter_LastName;
	public WebElement LaststName(){
		return enter_LastName;
		}
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement enter_PhoneNumber;
	public WebElement PhoneNumber(){
		return enter_PhoneNumber;
	}
	
	@FindBy(xpath="//input[@name='userName']")
	WebElement EmailID;
	public WebElement EmailID(){
		return EmailID;
	}

@FindBy(xpath="//input[@name='address1']")	
WebElement Enter_Address;
public WebElement EnterAddress(){
	return Enter_Address;
}

@FindBy(xpath="//input[@name='city']")
WebElement Enter_City;
public WebElement cityName(){
	return Enter_City;
}

@FindBy(xpath="//input[@name='state']")
WebElement Enter_State;	
public WebElement StateName(){
	return Enter_State;
}

@FindBy(xpath="//input[@name='postalCode']")
WebElement ENter_PostelCode;
public WebElement postalcode(){
return ENter_PostelCode;
}	

public void selectcountry(){
	Select country = new Select(driver.findElement(By.xpath("//select[@name='country']")));
	country.selectByVisibleText("BANGLADESH");
	
}
	
	
	
@FindBy(xpath="//input[@id='email']")
WebElement enter_username;
public WebElement enterUsername(){
	return enter_username;
}	
	

	
	


@FindBy(xpath="//input[@name='password']")
WebElement enter_password;
public WebElement Enterpassword(){
	return enter_password;
}//

@FindBy(xpath="//input[@name='confirmPassword']")
WebElement confirm_password;
public WebElement ConfirmPassword(){
	return confirm_password;
}

@FindBy(xpath="//input[@name='register']")
WebElement submit_button;
public WebElement submit_button(){
	return submit_button;
}
	
public void confirmation(){
	String expectedURL= "http://newtours.demoaut.com/create_account_success.php";
	String currentURL=driver.getCurrentUrl();
	
	if (currentURL.equals(expectedURL)){
		System.out.println("Registration SuccesFUll: ");
	}
	else{
	System.out.println("PLease try again: ");	
	}
	
}








}//end class
