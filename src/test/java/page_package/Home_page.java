package page_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
WebDriver driver;
@FindBy(xpath="/html/body/div[3]/div/div/div[1]/div/ul/li[3]/a")WebElement addprty;
@FindBy(xpath="//*[@id=\"frm_property\"]/div[2]/div[1]")WebElement prtyfor;
@FindBy(xpath="//*[@id=\"listtype\"]")WebElement lstpln;
@FindBy(xpath="//*[@id=\"proplabel\"]")WebElement prtylabel;
@FindBy(xpath="//*[@id=\"propcategory\"]")WebElement catgry;
@FindBy(xpath="//*[@id=\"propcost\"]") WebElement expctprze;
@FindBy(xpath="//*[@id=\"propbeds\"]")WebElement beds;
@FindBy(xpath="//*[@id=\"district\"]")WebElement disct;
@FindBy(xpath="//*[@id=\"proplocation\"]")WebElement lcton;
@FindBy(xpath="//*[@id=\"propaddress\"]")WebElement addrss;

public Home_page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

}
