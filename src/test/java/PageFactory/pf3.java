package PageFactory;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pf3 {

	WebDriver driver;
	public pf3(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//@FindBy(id="otp") WebElement p1;
	@FindBy(xpath="//*[@id=\"verifyUser\"]") WebElement p2;	
	//@FindBy(xpath="//*[@id=\"account_dd\"]/div[1]/i[2]") WebElement p3;
	@FindBy(xpath="//*[@id='profile_detail']/span") WebElement p4;
	
//	public void fun1() {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter OTP: ");
//		String OTP=sc.next();
//		WebElement otp=driver.findElement(By.id("otp"));
//		//otp.sendKeys(OTP);
//		p1.sendKeys(OTP);		
//	}
	
	public void fun2() {		
		p2.click();
	}
//	public void fun3() {
//		p3.click();		
//	}
//	
	public void fun4() {		
		p4.click();
	}
}
