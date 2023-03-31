package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Demo_Practice {
public static void main(String[] args) {
	
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(opt);
	
	driver.navigate().to("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	
	By FnameL = By.cssSelector("input[name=firstname]");
	WebElement Fname = driver.findElement(FnameL);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView()", Fname);
	
	Fname.sendKeys("Mahesh Babu");
	
	By LnameL = By.cssSelector("input[name=lastname]");
	WebElement Lname = driver.findElement(LnameL);
	Lname.sendKeys("Rampatruni");
	
	By SexL = By.xpath("//input[@value='Male']");
	WebElement Sex = driver.findElement(SexL);
    Actions action =new Actions(driver);
    action.click(Sex).build().perform();
	
	By ExpL = By.xpath("//input[@value='3']");
	WebElement Exp = driver.findElement(ExpL);
	action.click(Exp).build().perform();
	
	By DateL = By.xpath("//input[@style='width:95%;padding:4px 0px 4px 5px;margin:4px 0px']");
	WebElement Date = driver.findElement(DateL);
	action.click(Date).build().perform();
	
	By ProfessionL = By.xpath("//span[text()=' Automation Tester ']");
	WebElement Profession = driver.findElement(ProfessionL);
	Profession.click();
	
	
}
}
