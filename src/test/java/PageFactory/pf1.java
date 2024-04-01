package PageFactory;

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
}
