package com.cg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	
	private static WebElement element = null;
	
	@FindBy(how=How.ID,using="Firstname")
	 WebElement Firstname;
	@FindBy(how=How.ID,using="Lastname")
	 WebElement Lastname;
	@FindBy(how=How.ID,using="Email")
	 WebElement Email;
	@FindBy(how=How.ID,using="Mobileno")
	 WebElement Mobileno;
	@FindBy(how=How.ID,using="City")
	 WebElement City;
	@FindBy(how=How.ID,using="Address")
	 WebElement Address;
	@FindBy(how=How.ID,using="State")
	 WebElement State;
		public static WebElement state(WebDriver driver)
		{
			element =driver.findElement(By.id("State")); 
			Select select=new Select(element);
			select.selectByVisibleText("Telangana");
			return element;
			
		}
	/*@FindBy(how=How.ID,using="Submit")
	 WebElement Submit;*/
	 public static WebElement button(WebDriver driver){
		 
        element = driver.findElement(By.id("submit"));

        return element;

        }
	 
	 @FindBy(how=How.ID,using="ProjectName")
	 WebElement ProjectName;
	 @FindBy(how=How.ID,using="ClientName")
	 WebElement ClientName;
	 @FindBy(how=How.ID,using="TeamSize")
	 WebElement TeamSize;
	 @FindBy(how=How.ID,using="Submit")
	 WebElement Submit1;
	 public  WebElement button1(WebDriver driver){
		 
        element = driver.findElement(By.id("submit"));

        return element;

        }

}
