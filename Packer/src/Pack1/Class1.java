package Pack1;

import java.util.Iterator;
import java.util.Set;

import org.apache.poi.poifs.property.Parent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Class1 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ACCER\\Downloads\\ChromeDriver83\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/bootstrap/bootstrap_modal.asp");
        String parent=driver.getWindowHandle();
        System.out.println("Parent"+parent);
        driver.findElement(By.xpath("//*[@id='main']/button")).click();
        Set<String> s1=driver.getWindowHandles();
        Iterator<String> i1=s1.iterator();
        while(i1.hasNext())
        {
          String child=i1.next();
          if(parent.equalsIgnoreCase(child)||parent.equalsIgnoreCase(child))
          {
           driver.findElement(By.xpath("//*[@id='myModal']/div/div/div[3]/button")).click(); 
          }
        }
 	}
}
