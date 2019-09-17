package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoopla {
	String path;
	public void det()
	{
		 path=System.getProperty("user.dir")+"\\browser\\ChromeDriver.exe";
			System.setProperty("webdriver.chrome.driver",path);
			WebDriver drive=new ChromeDriver();
			drive.get("https://www.zoopla.co.uk/");
			drive.findElement(By.id("search-input-location")).sendKeys("London");
			drive.findElement(By.id("search-submit")).click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoopla oo=new Zoopla();
		oo.det();

	}

}
