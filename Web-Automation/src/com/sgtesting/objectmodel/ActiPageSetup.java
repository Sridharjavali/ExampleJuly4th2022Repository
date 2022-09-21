package com.sgtesting.objectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiPageSetup {
	public ActiPageSetup(WebDriver o)
	{
		PageFactory.initElements(o,this);
	}
	private WebElement username;
	public WebElement username1()
	{
		return username;
	}
	private WebElement pwd;
	public WebElement password1()
	{
		return pwd;
	}
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement login;
	public WebElement login()
	{
		return login; 
	}
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement minimise()
	{
		return gettingStartedShortcutsPanelId;
	}
	@FindBy(xpath = ("//div[text()='USERS']"))
	private WebElement user;
	public WebElement user()
	{
		return user;
	}
	@FindBy(xpath = ("//div[text()='Add User']"))
	private WebElement adduser;
	public WebElement adduser()
	{
		return adduser;
	}
	private WebElement userDataLightBox_firstNameField;
	public WebElement firstname()
	{
		return userDataLightBox_firstNameField;
	}
	private WebElement userDataLightBox_lastNameField;
	public WebElement lastname()
	{
		return userDataLightBox_lastNameField;
	}
	private WebElement userDataLightBox_emailField;
	public WebElement email()
	{
		return userDataLightBox_emailField;
	}
	private WebElement userDataLightBox_usernameField;
	public WebElement username()
	{
		return userDataLightBox_usernameField;
	}
	private WebElement userDataLightBox_passwordField;
	public WebElement password()
	{
		return userDataLightBox_passwordField;
	}
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement retypepassword()
	{
		return userDataLightBox_passwordCopyField;
	}
	@FindBy(xpath = ("//span[text()='Create User']"))
	private WebElement createuser;
	public WebElement createuser()
	{
		return createuser;
	}
	@FindBy(xpath = ("//span[text()='Save Changes']"))
	private WebElement Savechanges;
	public WebElement Savechanges()
	{
		return Savechanges;
	}
	@FindBy(xpath = ("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]"))
	private WebElement clicOnUser;
	public WebElement clicOnUser()
	{
		return clicOnUser;
	}
	private WebElement userDataLightBox_deleteBtn;
	public WebElement ClickOnDeleteUser()
	{
		return userDataLightBox_deleteBtn;
	}
	@FindBy(xpath = ("//div[text()='TASKS']"))
	private WebElement clicOnTask;
	public WebElement clicOnTask()
	{
		return clicOnTask;
	}
	@FindBy(xpath = ("//div[text()='Add New']"))
	private WebElement clicOnAddNew;
	public WebElement clicOnAddNew()
	{
		return clicOnAddNew;
	}
	@FindBy(xpath = ("//div[text()='+ New Customer']"))
	private WebElement clicOnNewCustomer;
	public WebElement clicOnNewCustomer()
	{
		return clicOnNewCustomer;
	}
	private WebElement customerLightBox_nameField;
	public WebElement Entercustomername()
	{
		return customerLightBox_nameField;
	}
	@FindBy(xpath = ("//span[text()='Create Customer']"))
	private WebElement clicOnCreateCustomer;
	public WebElement clicOnCreateCustomer()
	{
		return clicOnCreateCustomer;
	}
	@FindBy(xpath = ("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]"))
	private WebElement clicOnEditCustomer;
	public WebElement clicOnEditCustomer()
	{
		return clicOnEditCustomer;
	}
	@FindBy(xpath = ("//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea"))
	private WebElement ModifyCustomer;
	public WebElement ModifyCustomer()
	{
		return ModifyCustomer;
	}
	@FindBy(xpath = ("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[1]"))
	private WebElement clicOnClose;
	public WebElement clicOnClose()
	{
		return clicOnClose;
	}
	@FindBy(xpath = ("//div[text()='ACTIONS']"))
	private WebElement clicOnActions;
	public WebElement clicOnActions()
	{
		return clicOnActions;
	}
	@FindBy(xpath = ("//div[text()='Delete']"))
	private WebElement clicOnDelete;
	public WebElement clicOnDelete()
	{
		return clicOnDelete;
	}
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement ConfirmDeleteCustomer()
	{
		return customerPanel_deleteConfirm_submitTitle;
	}
	@FindBy(xpath = ("//div[text()='+ New Project']"))
	private WebElement clicOnNewProject;
	public WebElement clicOnNewProject()
	{
		return clicOnNewProject;
	}
	private WebElement projectPopup_projectNameField;
	public WebElement EnterProjectName()
	{
		return projectPopup_projectNameField;
	}
	@FindBy(xpath = ("//span[text()='Create Project']"))
	private WebElement clicOnCreateProject;
	public WebElement clicOnCreateProject()
	{
		return clicOnCreateProject;
	}
	@FindBy(xpath = ("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]"))
	private WebElement clicOnCreateProjectEdit;
	public WebElement clicOnCreateProjectEdit()
	{
		return clicOnCreateProjectEdit;
	}
	@FindBy(xpath = ("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]"))
	private WebElement clicOnActionProject;
	public WebElement clicOnActionProject()
	{
		return clicOnActionProject;
	}
	@FindBy(xpath = ("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div"))
	private WebElement clicOnDeleteProject;
	public WebElement clicOnDeleteProject()
	{
		return clicOnDeleteProject;
	}
	private WebElement projectPanel_deleteConfirm_submitTitle;
	public WebElement ConfirmDeleteproject()
	{
		return projectPanel_deleteConfirm_submitTitle;
	}
	@FindBy(xpath = ("//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea"))
	private WebElement clicOnModifyProject;
	public WebElement clicOnModifyProject()
	{
		return clicOnModifyProject;
	}
	@FindBy(xpath = ("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[1]"))
	private WebElement clicOnCloseButton;
	public WebElement clicOnCloseButton()
	{
		return clicOnCloseButton;
	}
	@FindBy(xpath = ("//div[text()='Add New Task']"))
	private WebElement clicOnAddNewTask;
	public WebElement clicOnAddNewTask()
	{
		return clicOnAddNewTask;
	}
	@FindBy(xpath = ("//div[text()='Create new tasks']"))
	private WebElement clicOnCreateNewTask;
	public WebElement clicOnCreateNewTask()
	{
		return clicOnCreateNewTask;
	}
	@FindBy(xpath = ("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input"))
	private WebElement clicOnTaskName;
	public WebElement clicOnTaskName()
	{
		return clicOnTaskName;
	}
	@FindBy(xpath = ("//span[text()='Create Tasks']"))
	private WebElement clicOnCreateTasks;
	public WebElement clicOnCreateTasks()
	{
		return clicOnCreateTasks;
	}
	@FindBy(xpath = ("//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]"))
	private WebElement clicOnCreatedTasks;
	public WebElement clicOnCreatedTasks()
	{
		return clicOnCreatedTasks;
	}
	@FindBy(xpath = ("//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]"))
	private WebElement clicOnActionTasks;
	public WebElement clicOnActionTasks()
	{
		return clicOnActionTasks;
	}
	@FindBy(xpath = ("//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div"))
	private WebElement clicOnDeleteTasks;
	public WebElement clicOnDeleteTasks()
	{
		return clicOnDeleteTasks;
	}
	private WebElement taskPanel_deleteConfirm_submitTitle;
	public WebElement ConfirmDeleteTasks()
	{
		return taskPanel_deleteConfirm_submitTitle;
	}
	private WebElement logoutLink;
	public WebElement getLogoutLink()
	{
		return logoutLink;
	}
}
