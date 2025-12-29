package testcases;

import base.TestBase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.DashBoard;
import pages.LoginPage;
import pages.Logout;
import pages.Mentor;
import utility.ExcelUtility;

public class LoginTest extends TestBase {
	LoginPage lg;
	DashBoard dsh;
	Mentor ment;
	Logout lgt;
	
	@BeforeClass
	public void objinit() {
		lg = new LoginPage(driver);
		dsh=new DashBoard(driver);
		ment=new Mentor(driver);
		lgt=new Logout(driver); 
	}

    @Test
    public void tc001_Login() throws IOException {

    	Assert.assertTrue(lg.clkLogin(),"Login button not visible");
        lg.clickLogin();
        lg.e_mail(ExcelUtility.readExcel(0, 0));
        lg.pass(ExcelUtility.readExcel(0, 1));
        lg.log();
        
    }
    @Test 
    public void tc002_Dashboard() {
    	dsh.clickDash();
    	dsh.addproject();
    	dsh.addTopic("NewTopic");
    	dsh.addBottom("20");
    	dsh.clickadd();
    }
    @Test
    public void tc003_Mentor() {
        ment.clkMentor();
        ment.addMentor();
        ment.mntrName("karnan");
        ment.mntrEmail("karnan@gmail.com");
        ment.mntrPhone("98909789");
        ment.mntrPass("1234");
        ment.mntrProject("ICT");
        ment.mntrAdd();
    }
    @Test
    public void tc004_Logout() {
    	lgt.clickLogout();
    }
}



