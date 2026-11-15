package page_package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Home_page {
WebDriver driver;
Select obj;
@FindBy(xpath="/html/body/div[3]/div/div/div[1]/div/ul/li[3]/a")WebElement addprty;
@FindBy(xpath="//*[@id=\"proptype\"]")WebElement prtyfor;
@FindBy(xpath="//*[@id=\"listtype\"]")WebElement lstpln;
@FindBy(xpath="//*[@id=\"proplabel\"]")WebElement  prtylabel;
@FindBy(xpath="//*[@id=\"propcategory\"]")WebElement catgry;
@FindBy(xpath="//*[@id=\"propcost\"]") WebElement expctprze;
@FindBy(xpath="//*[@id=\"propbeds\"]")WebElement beds;
@FindBy(xpath="//*[@id=\"propbaths\"]")WebElement baths;
@FindBy(xpath="//*[@id=\"district\"]")WebElement disct;
@FindBy(xpath="//*[@id=\"proplocation\"]")WebElement lcton;
@FindBy(xpath="//*[@id=\"propaddress\"]")WebElement addrss;
@FindBy(xpath="//*[@id=\"introlabel\"]")WebElement title_adv ;
@FindBy(xpath="//*[@id=\"frm_property\"]/div[9]/div/div/iframe")WebElement iframe_tag ;
@FindBy(xpath="/html/body")WebElement  smry;
@FindBy(xpath="//*[@id=\"sub_frmproperty\"]")WebElement  subbt;

public Home_page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void Adddetails(){
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	addprty.click();
	
	System.out.println(prtyfor.getTagName());
	obj=new Select(prtyfor);
	obj.selectByValue("rent");
	
	obj=new Select(lstpln);
	obj.selectByValue("featured");
	
	//prtylabel.click();
	prtylabel.sendKeys("DreamLand");
	
	obj=new Select(catgry);
	obj.selectByVisibleText("House");
	
	 expctprze.sendKeys("30000");
	  
	 beds.sendKeys("4");
	
	 baths.sendKeys("3");
	
	 obj=new Select(disct);
	 obj.selectByValue("11");
	 
	 obj=new Select(lcton);
	 obj.selectByValue("301");
	 
	 addrss.sendKeys("kadachira,kannur");
	 
	 title_adv.sendKeys("Nice Plot");
		 
	 driver.switchTo().frame(iframe_tag);
	 
	     smry.click();
	 smry.sendKeys("Hi my name is Sherin");
	
	driver.switchTo().defaultContent();
	
	subbt.click();
}
}
