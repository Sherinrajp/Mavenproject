package page_package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_page {
WebDriver driver;
@FindBy(xpath="//*[@id=\"ulogin\"]")WebElement username;
@FindBy(xpath="//*[@id=\"upass\"]")WebElement password;
@FindBy(xpath="//*[@id=\"sub_logbtn\"]")WebElement lginbt;

public Login_page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this );
	}

//methods
public String tittle_mthd()
{
	String title=driver.getTitle();
	return title;
}

public void login_mthd(String un,String pw)
{
	username.sendKeys(un);
	password.sendKeys(pw);
	lginbt.click();
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.urlContains("myhome"));
}
}

