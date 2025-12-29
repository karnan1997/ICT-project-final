package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoard {
	 WebDriver driver;
	 WebDriverWait wait;
	 
	 public DashBoard(WebDriver driver) {
		 this.driver=driver;
		 wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	 }
public void clickDash() {
	WebElement dash=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Dashboard']")));
	dash.click(); 
	}
public void addproject() {
	WebElement pr=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='+ Add Project']")));
    pr.click();
}
public void addTopic(String top) {
WebElement tp=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='topic']")));
tp.sendKeys(top);
}
public void addBottom(String Bottom) {
	WebElement bt=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='duration']")));
    bt.sendKeys(Bottom);
}
public void clickadd() {
	WebElement ad=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add']")));
	ad.click();
}
}
