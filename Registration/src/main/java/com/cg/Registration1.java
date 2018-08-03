package com.cg;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Registration1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Users\\vmanigan\\Desktop\\All jar files\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\Spring_Workspace\\Registration\\src\\main\\webapp\\RegistrationPage.html");
		LoginPage page = PageFactory.initElements(driver, LoginPage.class);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		page.Firstname.sendKeys("Vamshi");
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		page.Lastname.sendKeys("Maniagndla");
		Thread.sleep(1000);
		page.Email.sendKeys("vamshimanigandla@gmail.com");
		Thread.sleep(1000);
		page.Mobileno.sendKeys("9640555555");
		Thread.sleep(1000);
		
		page.City.sendKeys("Hyderabad");
		Thread.sleep(1000);
		page.Address.sendKeys("shamirpet");
		Thread.sleep(1000);
		page.state(driver);
		Thread.sleep(1000);
		LoginPage.button(driver).click();
		Thread.sleep(1000);
		 /*Alert alert=driver.switchTo().alert();
		 assertEquals(alert.getText(), "Details Validated");*/
		 driver.switchTo().alert().accept();
		driver.get("D:\\Spring_Workspace\\Registration\\src\\main\\webapp\\ProjectDetails.html");
		Thread.sleep(1000);
		page.ProjectName.sendKeys("MyDemo");
		Thread.sleep(1000);
		page.ClientName.sendKeys("Samsung");
		Thread.sleep(1000);
		page.TeamSize.sendKeys("9");
		Thread.sleep(1000);
		page.button1(driver).click();
		
		
		/*
		HomePage.button(driver).click();
		HomePage.signIn(driver).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 LoginPage.username(driver).sendKeys("vamshimanigandla");
		 page.pass.sendKeys("Vamc@572");
			page.pass.submit();*/

	
	}
}


