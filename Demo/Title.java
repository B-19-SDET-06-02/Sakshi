package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
	String title,exptitle="facebook";
	public void  titl()
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium_software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		title=driver.getTitle();
		if(exptitle.equals(title))
		{
			System.out.println("you are on correct page");
			}
		else
		{
			System.out.println("not landing on correct page");
			
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Title oo=new Title();
		oo.titl();

	}

}
