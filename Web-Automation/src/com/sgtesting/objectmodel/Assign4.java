package com.sgtesting.objectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign4 {
	public static WebDriver o=null;
	public static ActiPageSetup p=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimise();
		createcustomer();
		CreateProject();
		DeleteProject();
		deletecustomer();
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
	private static void login()
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
	private static void minimise()
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
	private static void createcustomer()
	{
		try
		{
			p.clicOnTask().click();
			Thread.sleep(1000);
			p.clicOnAddNew().click();
			Thread.sleep(1000);
			p.clicOnNewCustomer().click();
			Thread.sleep(1000);
			p.Entercustomername().sendKeys("vinay patil");
			Thread.sleep(1000);
			p.clicOnCreateCustomer().click();
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void CreateProject()
	{
		try
		{
			p.clicOnAddNew().click();
			Thread.sleep(1000);
			p.clicOnNewProject().click();
			Thread.sleep(1000);
			p.EnterProjectName().sendKeys("web automation");
			Thread.sleep(1000);
			p.clicOnCreateProject().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void DeleteProject()
	{
		try
		{
			p.clicOnCreateProjectEdit().click();
			Thread.sleep(1000);
			p.clicOnActionProject().click();
			Thread.sleep(1000);
			p.clicOnDeleteProject().click();
			Thread.sleep(1000);
			p.ConfirmDeleteproject().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deletecustomer()
	{
		try
		{
			p.clicOnEditCustomer().click();
			Thread.sleep(1000);
			p.clicOnActions().click();
			Thread.sleep(1000);
			p.clicOnDelete().click();
			Thread.sleep(1000);
			p.ConfirmDeleteCustomer().click();
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
