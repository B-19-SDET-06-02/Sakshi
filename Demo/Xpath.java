package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
String path;
   public void locate()
   {
	   path=System.getProperty("user.dir")+"\\browser\\ChromeDriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver drive=new ChromeDriver();
		drive.navigate().to("https://www.facebook.com/");
		//x-path first approach
		//drive.findElement(By.xpath("//input[@type='email']")).sendKeys("admin");
		
		//x-path second approach
		//drive.findElement(By.xpath("//input[contains(@ id,'u_o')]")).click();
		
		
		//x-path third approach
		WebElement el=drive.findElement(By.xpath("//span[Contains(text(),'Create an account')]"));
		System.out.println(el.getText());
		

   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xpath oo=new Xpath();
		oo.locate();

	}

}
