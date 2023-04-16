package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


	
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

@FindBy(how =How.NAME,using="City")
WebElement City;

@FindBy(how=How.NAME,using="state")
WebElement State;
		
@FindBy(how=How.NAME,using="PostalCode")
WebElement PostalCode;

@FindBy(how =How.NAME,using="UserName")
WebElement UserName;

@FindBy(how=How.NAME,using="Password")
WebElement Password;
@FindBy(how=How.NAME,using="Confirm Password")
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





	}






