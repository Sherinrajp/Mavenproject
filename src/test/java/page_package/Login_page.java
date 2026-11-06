package page_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
WebDriver driver;
@FindBy(xpath="//*[@id=\"ulogin\"]")WebElement uname;
@FindBy(xpath="//*[@id=\"upass\"]")WebElement password;
@FindBy(xpath="//*[@id=\"sub_logbtn\"]")WebElement loginbut;

public Login_page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

public String titleverify() {
	String title=driver.getTitle();
	return title;
	}

public void loginmth(String user,String pass) {
	uname.sendKeys(user);
	password.sendKeys(pass);
	loginbut.click();
}
}
