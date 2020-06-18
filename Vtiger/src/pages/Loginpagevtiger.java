package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Loginpagevtiger 
{
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;

	@FindBy(xpath="//button[.='Sign in']")
	private WebElement Signin;
	
	@FindBy(linkText="forgot password?")
	private WebElement forgotpassword;
	
	@FindBy(xpath="//span[.='Invalid credentials']")
	private WebElement loginerrormsg;
	
	public Loginpagevtiger(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String un) {
		username.clear();
		username.sendKeys(un);
	}
	
	public void setPassword(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}
	
	public void Signinbutton() {
		Signin.click();
	}
	
	public void forgotPassword() {
		forgotpassword.click();
		}
	public void errormsg()
	{
		Assert.assertTrue(loginerrormsg.isDisplayed()); 
		//if errormsg is displayed then TC is passed so it wont generate a screenshoot //
	}
	
}
