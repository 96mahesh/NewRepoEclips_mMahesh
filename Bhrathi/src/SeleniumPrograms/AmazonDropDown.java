package SeleniumPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropDown {
 public static void main(String[] args) throws InterruptedException {
	 int count =1;
		ChromeOptions option = new ChromeOptions();
		option.addArguments("remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(option);
	    
	    driver.get("https://www.amazon.in");
	    
	    By ListL = By.xpath("//select[@id='searchDropdownBox']");
	    WebElement dropdown = driver.findElement(ListL);
	    Select select = new Select(dropdown);
	    List<WebElement> alloptions = select.getOptions();
	    List<String> orgvalue = new ArrayList<String>();
	    for (WebElement ele : alloptions) {
			  String data = ele.getText();
			  orgvalue.add(data);
			  System.out.println(count+"====>"+data);
			  count++;
		}
	    System.out.println("orgvalue size "+orgvalue.size());
	    //orgvalue.remove("All Categories");
	    List<String> sortvalue = new ArrayList<String>(orgvalue);
	    Collections.sort(sortvalue);
	    System.out.println("=====>"+sortvalue);
	    boolean status = false;
	    for (String str1 : orgvalue) {
	    	for(String str2 :sortvalue )
	    	{
	    	if(str1.charAt(0)==str2.charAt(0))
	    	{
	    	status = true;
	    	}
	    	else 
	    	{
	    		status = false;
	    		//break;
	    	}
	    	}
		}
	    
	    if(status)
	    	System.out.println("Test script pass");
	    else
	    	System.out.println("test script fail");
	    
	    Thread.sleep(3000);
	    driver.close();
}
}
