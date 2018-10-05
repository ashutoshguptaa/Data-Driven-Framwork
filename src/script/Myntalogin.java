package script;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Auto_constant;
import generic.Excel;

public class Myntalogin implements Auto_constant
{
	static
	{
		System.setProperty(key, value);
	}
	public static void main(String[] args) 
	{
	
		WebDriver driver=new ChromeDriver();
		String us=Excel.abc(excelpath, "Sheet1" ,1,0 );
		String psw=Excel.abc(excelpath, "Sheet1" ,1,1 );
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
		driver.findElement(By.name("email")).sendKeys(us);
		driver.findElement(By.name("password")).sendKeys(psw);
		driver.findElement(By.className("login-login-button")).click();
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
	if(actualTitle.equals("Login"))
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
