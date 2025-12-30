package testcases;

import base.TestBase;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
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

    @BeforeMethod
    public void objinit() {
        lg = new LoginPage(driver);   // driver is READY
        dsh = new DashBoard(driver);
        ment = new Mentor(driver);
        lgt = new Logout(driver);
    }

    @Test(priority = 1)
    public void tc001_Login() throws IOException {
        Assert.assertTrue(lg.clkLogin(), "Login button not visible");
        lg.clickLogin();
        lg.e_mail(ExcelUtility.readExcel(0, 0));
        lg.pass(ExcelUtility.readExcel(0, 1));
        lg.log();
    }

    @Test(priority = 2)
    public void tc002_Dashboard() throws IOException {
    	lg.clickLogin();
        lg.e_mail(ExcelUtility.readExcel(0, 0));
        lg.pass(ExcelUtility.readExcel(0, 1));
        lg.log();

        dsh.clickDash();
        dsh.addproject();
        dsh.addTopic("NewTopic");
        dsh.addBottom("20");
        dsh.clickadd();
    }

    @Test(priority = 3)
    public void tc003_Mentor() throws IOException {
    	lg.clickLogin();
        lg.e_mail(ExcelUtility.readExcel(0, 0));
        lg.pass(ExcelUtility.readExcel(0, 1));
        lg.log();

        ment.clkMentor();
        ment.addMentor();
        ment.mntrName("karnan");
        ment.mntrEmail("karnan@gmail.com");
        ment.mntrPhone("98909789");
        ment.mntrPass("1234");
        ment.mntrProject("ICT");
        ment.mntrAdd();
    }

    @Test(priority = 4)
   
    public void tc004_Logout() throws IOException {
    	lg.clickLogin();
        lg.e_mail(ExcelUtility.readExcel(0, 0));
        lg.pass(ExcelUtility.readExcel(0, 1));
        lg.log();

        lgt.clickLogout();
    }
}
