package com.sgtesting.objectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1 {
	public static WebDriver o=null;
	public static ActiPageSetup p=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimise();
		createuser();
		modifyuser();
		deleteuser();
		logout();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\\\Library\\\\drivers\\\\chromedriver.exe");
			o=new ChromeDriver();
			p=new ActiPageSetup(o);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			o.navigate().to("http://localhost:81/login.do");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void login()
	{
		try
		{
			p.username1().sendKeys("admin");
			Thread.sleep(1000);
			p.password1().sendKeys("manager");
			Thread.sleep(1000);
			p.login().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void minimise()
	{
		try
		{
			p.minimise().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void createuser()
	{
		try
		{
			p.user().click();
			Thread.sleep(1000);
			p.adduser().click();
			Thread.sleep(1000);
			p.firstname().sendKeys("vinay");
			Thread.sleep(1000);
			p.lastname().sendKeys("patil");
			Thread.sleep(1000);
			p.email().sendKeys("vinay@gmail.com");
			Thread.sleep(1000);
			p.username().sendKeys("vinay patil");
			Thread.sleep(1000);
			p.password().sendKeys("2588");
			Thread.sleep(1000);
			p.retypepassword().sendKeys("2588");
			Thread.sleep(1000);
			p.createuser().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void modifyuser()
	{
		try
		{
			p.clicOnUser().click();
			Thread.sleep(1000);
			p.firstname().clear();
			Thread.sleep(1000);
			p.firstname().sendKeys("shahi");
			Thread.sleep(1000);
			p.lastname().clear();
			Thread.sleep(1000);
			p.lastname().sendKeys("jaya");
			Thread.sleep(1000);
			p.email().clear();
			Thread.sleep(1000);
			p.email().sendKeys("shashi@gmail.com");
			Thread.sleep(1000);
			p.username().clear();
			Thread.sleep(1000);
			p.username().sendKeys("shashi patil");
			Thread.sleep(1000);
			p.password().clear();
			Thread.sleep(1000);
			p.password().sendKeys("vinay");
			Thread.sleep(1000);
			p.retypepassword().clear();
			Thread.sleep(1000);
			p.retypepassword().sendKeys("vinay");
			Thread.sleep(1000);
			p.Savechanges().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void deleteuser()
	{
		try
		{
			p.clicOnUser().click();
			Thread.sleep(1000);
			p.ClickOnDeleteUser().click();
			Thread.sleep(1000);
			Alert a=o.switchTo().alert();
			a.accept();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			p.getLogoutLink().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApplication()
	{
		try
		{
			o.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
