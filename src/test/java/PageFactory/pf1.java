package PageFactory;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pf1 {

	WebDriver driver;
	public pf1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[@class='name_rb_secondary_item' and text()='Account'] ") WebElement p1;
	@FindBy(xpath="//*[@id='user_sign_in_sign_up']/span") WebElement p2;	
	@FindBy(xpath="//*[@id='mobileNoInp']") WebElement p3;
	@FindBy(xpath="//*[@id=\"otp-container\"]") WebElement p4;
	@FindBy(xpath="//*[@id=\"signInView\"]/div[2]/div/div[1]/div[4]/div[3]/span") WebElement p5;
	@FindBy(xpath="//*[@id='mobileNoInp']") WebElement p6;
	@FindBy(xpath="//*[@id='otp-container']") WebElement p7;
	@FindBy(id="otp") WebElement p8;
	@FindBy(xpath="//button[@id='verifyUser']") WebElement p9;
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[3]/div[3]/div[1]") WebElement p10;
	@FindBy(xpath="//*[@id=\"verifyUser\"]") WebElement p11;	
	@FindBy(xpath="//*[@id='ticket_details']") WebElement p12;
	@FindBy(xpath="//*[@id=\"smsandemail_ticket\"]") WebElement p13;
	@FindBy(id="searchTicketTIN") WebElement p14;
	@FindBy(id="searchTicketMobileno") WebElement p15;
	@FindBy(id="ticketSearch") WebElement p16;
		
	public void fun1() {
		p1.click();		
	}
	
	public void fun2() {		
		p2.click();		
	}
	
	public void fun3() {		
		p3.sendKeys("0000000000");	
	}
	
	public void fun4() {		
		p4.click();		
	}
	
	public void fun5() {		
		String msg=p5.getText();
		System.out.println("Error Messsage: "+msg);
	}
	public void fun6() {
		p6.sendKeys("8341402168");		
	}
	
	public void fun7() {		
		p7.click();		
	}
	
	public void fun8() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter OTP: ");
		String OTP=sc.next();
		p8.sendKeys(OTP);		
	}
	
	public void fun9() {		
		p9.click();		
	}
	
	public void fun10() {		
		String msg2=p10.getAttribute("innerHTML");//textContent
		System.out.println("Error message: "+ msg2);
	}
	public void fun11() {		
		p11.click();
	}
	public void fun12() {		
		p12.click();
	}
	public void fun13() {		
		p13.click();
	}
	public void fun14() {			
		p14.sendKeys("TT4252802246");
	}
	public void fun15() {			
		p15.sendKeys("9059923461");
	}
	public void fun16() {			
		p16.click();
	}	
}
