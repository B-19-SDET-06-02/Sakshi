package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bbc {
String path;
int a;
public void det()
{
	 path=System.getProperty("user.dir")+"\\browser\\ChromeDriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver drive=new ChromeDriver();
		drive.get("https://www.bbc.com/");
		List<WebElement> al=drive.findElements(By.className("media__link"));
		a=al.size();
		System.out.println(a);
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i).getText());
		}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bbc oo=new bbc();
		oo.det();

	}

}
