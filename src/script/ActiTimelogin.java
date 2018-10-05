package script;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Auto_constant;
import generic.Excel;

public class ActiTimelogin implements Auto_constant
{
	static
	{
		System.setProperty(key, value);
	}
	public static void main(String[] args) 
	{
	
		WebDriver driver=new ChromeDriver();
		String us=Excel.abc(excelpath, "Sheet1" ,2,0 );
		String psw=Excel.abc(excelpath, "Sheet1" ,2,1 );
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys(us);
		driver.findElement(By.name("pwd")).sendKeys(psw);
		driver.findElement(By.xpath("//div[text()='Login '")).click();
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
	if(actualTitle.equals("actiTIME- Login"))
	{
		System.out.print("Login-pass");
	
	}
	else
	{
		System.out.println("Login-fail");
	}
	driver.close();
	}
}
