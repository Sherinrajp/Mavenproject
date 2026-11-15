package test_package;

import org.testng.Assert;
import org.testng.annotations.Test;

import base_package.Base_cls;

public class login_test extends Base_cls {
	@Test(priority=1)
	public void kerala_titleverification_mthd()
	{
		String actual_title=lpobj.tittle_mthd();
		Assert.assertEquals(actual_title,"Kerala Property");
	}
	
	@Test(priority=2)
	public void kerala_loginverification_mthd()
	{
		lpobj.login_mthd("sherinrajp444@gmail.com", "654321");
	}
}
