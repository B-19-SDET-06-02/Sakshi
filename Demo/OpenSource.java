package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSource {
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium_software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.facebook.com/");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		//driver.close();
		List<WebElement> al=(List<WebElement>) driver.findElement(By.tagName("a"));
		System.out.println(al.size());
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i).getText());
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OpenSource oo=new OpenSource();
		oo.launch();

	}

}


