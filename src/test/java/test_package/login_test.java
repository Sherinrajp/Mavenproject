package test_package;

import org.testng.Assert;
import org.testng.annotations.Test;

import base_package.Base_cls;

public class login_test extends Base_cls {
@Test
public void titleverify() {
	String sitetitle=lpobj.titleverify();
	Assert.assertEquals(sitetitle,"keralaproperty");
}
@Test
public void login() {
	lpobj.loginmth("ebin.luminar@gmail.com","123456");
}
}
