package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public boolean clkLogin() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Login']"))).isDisplayed();
    }
    public void clickLogin() {
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Login']")));
        loginButton.click();
    }
    
    public void e_mail(String em) {
    	WebElement emaiL = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
    	emaiL.sendKeys(em);
    }
    public void pass(String pas) {
    	WebElement passw=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='password']")));
    	passw.sendKeys(pas);
    }
    
    public void log() {
    	WebElement logbtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Login']")));
    	logbtn.click();
    }
}


