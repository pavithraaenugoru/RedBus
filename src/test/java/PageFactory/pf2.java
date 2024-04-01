package PageFactory;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pf2 {
	
	WebDriver driver;
	public pf2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id='mobileNoInp']") WebElement p1;
	@FindBy(xpath="//*[@id='otp-container']") WebElement p2;
	@FindBy(id="otp") WebElement p3;
	@FindBy(xpath="//button[@id='verifyUser']") WebElement p4;
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[3]/div[3]/div[1]") WebElement p5;
	
	public void fun1() {
		p1.sendKeys("8341402168");		
	}
	
	public void fun2() {		
		p2.click();		
	}
	
	public void fun3() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter OTP: ");
		String OTP=sc.next();
		p3.sendKeys(OTP);
		
	}
	
	public void fun4() {		
		p4.click();		
	}
	
	public void fun5() {		
		String msg2=p5.getAttribute("innerHTML");//textContent
		System.out.println("Error message: "+ msg2);
	}
}
