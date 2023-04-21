package pageObject;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


	
	public class loginPageObject {
		
	
	WebDriver driver;


@FindBy(name= "firstName")
		WebElement FirstName;

@FindBy(how=How.NAME,using="lastName")
WebElement LastName;

@FindBy(how=How.NAME,using="phone")
WebElement Phone;
@FindBy(name="userName")
WebElement Email;

@FindBy(how=How.NAME,using="address1")
WebElement Address;

@FindBy(how =How.NAME,using="city")
WebElement City;

@FindBy(how=How.NAME,using="state")
WebElement State;
		
@FindBy(how=How.NAME,using="postalCode")
WebElement PostalCode;


@FindBy(how =How.NAME,using ="country")
WebElement Country;

@FindBy(how =How.NAME,using="email")
WebElement UserName;

@FindBy(how=How.NAME,using="password")
WebElement Password;
@FindBy(how=How.NAME,using="confirmPassword")
		WebElement ConfirmPassword;


@FindBy(name="submit")
WebElement Submit;

public loginPageObject(WebDriver d){
	driver=d;
	PageFactory.initElements(d, this);
	
}

public void firtName(String fname) {
	FirstName.sendKeys(fname);
}

public void lastName(String lname) {
	LastName.sendKeys(lname);
}
public void phone(String ph) {
	Phone.sendKeys(ph);
}
public void emalid(String rameshwar) {
	Email.sendKeys( rameshwar);
}

public void  adress(String devipur) {
	Address.sendKeys(devipur);
	
}
public void City(String delhi ) {
	City.sendKeys("Delhi");
}

public void State(String state ) {
	State.sendKeys("Delhi");
}
public void postalcode(String pastal) {
	PostalCode.sendKeys("273310");
}
public void selectcon() {
	Select dropdown=new Select(Country);
	dropdown.deselectByVisibleText("india");
}

public void Username(String ram){
	UserName.sendKeys("Rameshwar dubey");
}
public void Password(String Dubey21530) {
	Password.sendKeys("Dubey@1530");
}
	public void ConfPass(String pass) {
		ConfirmPassword.sendKeys("Dubey@1530");
	}
	public void submit() {
		Submit.click();
	}



	}






