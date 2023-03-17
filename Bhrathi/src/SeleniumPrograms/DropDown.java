package SeleniumPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) {
	int count =1;
	ChromeOptions option = new ChromeOptions();
	option.addArguments("remote-allow-origins=*");
    WebDriver driver = new ChromeDriver(option);
    driver.get("file:///C:/Users/Mahesh/Downloads/country-names.html");
    
    By ListL = By.xpath("//select[@name='country']");
    WebElement dropdown = driver.findElement(ListL);
    
    Select select = new Select(dropdown);
   List<WebElement> options = select.getOptions();
   List<String> orgvalues = new ArrayList<>();
   for(WebElement ele : options) {
	  String data =  ele.getText();
	  orgvalues.add(data);
	  System.out.println(count+"====>"+data);
	  count++;	
}
   System.out.println("Original size "+orgvalues.size());
   orgvalues.remove("select country");
   List<String> Shortvalues = new ArrayList<>(orgvalues);
   Collections.sort(Shortvalues);
   if(orgvalues.equals(Shortvalues))
   {
	   System.out.println("test Script pass");
   }
   else
	   System.out.println("Test Script fail");
   
   System.out.println(Shortvalues.size());
   
   driver.close();
}
}
