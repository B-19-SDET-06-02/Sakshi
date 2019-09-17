package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Student_det {
	String path;
	public void Table()
	{
		path=System.getProperty("user.dir")+"\\browser\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver drive=new ChromeDriver();
		drive.navigate().to("file:///D:/html/stu.html");
		String a=drive.findElement(By.xpath("//table[@id='sak']")).getText();
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_det oo=new Student_det();
		oo.Table();

	}

}
