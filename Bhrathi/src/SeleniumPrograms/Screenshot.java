package SeleniumPrograms;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
public static void main(String[] args) throws Exception, Exception {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().fullscreen();
	String images = "ss";
	TakesScreenshot ts =(TakesScreenshot) driver;
	FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File(".//screnshots//"+images+".png"));
	
}
}
