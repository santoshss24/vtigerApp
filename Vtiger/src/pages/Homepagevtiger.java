package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepagevtiger 
{
	@FindBy(xpath="//span[@class=\"fa fa-user\"]")
	private WebElement admin;
	
	@FindBy(id="menubar_item_right_LBL_SIGN_OUT")
	private WebElement signout;
	
	public Homepagevtiger(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void adminsignOut()
	{
		admin.click();
	}
	public void Signout()
	{
		signout.click();
	}
}
