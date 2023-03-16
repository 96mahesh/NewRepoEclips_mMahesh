package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTableTest {
  public static void main(String[] args) {
	ChromeOptions co = new ChromeOptions();
	co.addArguments("remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(co);
	
	driver.get("https://demo.guru99.com/test/web-table-element.php");
	
	By ColL =By.xpath("//table[@class='dataTable']/thead/tr/th");
	List<WebElement> col = driver.findElements(ColL);
	System.out.println("Columun Size = : " +col.size());
	
	By RowL =By.xpath("//table[@class='dataTable']/tbody/tr");
	List<WebElement> Row = driver.findElements(RowL);
	System.out.println("RowSize Size = : " +Row.size());
}
}

//div[@id='leftcontainer']/table/tbody/tr/td[1]
//div[@id='leftcontainer']/table/thead/tr/th