package base_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import page_package.Login_page;

public class Base_cls {
public static WebDriver driver;
public Login_page lpobj;

@BeforeTest
public void open() {
	driver=new ChromeDriver();
	driver.get("https://keralaproperty.in/member/login/");
	driver.manage().window().maximize();
}
@BeforeMethod
public void loginobj() {
	lpobj=new Login_page(driver);
}
}
