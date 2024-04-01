package stepDefinations;


import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageFactory.pf1;
import PageFactory.pf2;
import PageFactory.pf3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginPage {
	
	WebDriver driver;
	@Given("user on Home Page")
	public void user_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);
		driver.get("https://www.redbus.in");
	}

	@Given("user goes to account select login")
	public void user_goes_to_account_select_login() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    //driver.findElement(By.xpath("//span[@class='name_rb_secondary_item' and text()='Account']")).click();
		//driver.findElement(By.xpath("//*[@id='user_sign_in_sign_up']/span")).click();
		pf1 obj1=new pf1(driver);
		obj1.fun1();
		obj1.fun2();
		Thread.sleep(2000);
	}

	@When("login page is opened user enters invalid phone number")
	public void login_page_is_opened_user_enters_invalid_phone_number() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    Thread.sleep(2000);
		WebElement login_frame=driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/div[3]/iframe"));		
		driver.switchTo().frame(login_frame);
		//driver.findElement(By.xpath("//*[@id=\"mobileNoInp\"]")).sendKeys("0000000000");
		pf1 obj2=new pf1(driver);
		obj2.fun3();
	}

	@When("click generate OTP button")
	public void click_generate_otp_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    System.out.println("Please solve CAPTCHA manually and press ENTER to continue....");
		new java.util.Scanner(System.in).nextLine();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id=\"otp-container\"]")).click();
		pf1 obj3=new pf1(driver);
		obj3.fun4();
	}

	@Then("user should see an error message")
	public void user_should_see_an_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	   // WebElement generate_otp=driver.findElement(By.xpath("//*[@id=\"signInView\"]/div[2]/div/div[1]/div[4]/div[3]/span"));
		pf1 obj4=new pf1(driver);
		obj4.fun5();
		
	}
	
	@When("login page is opened user enters a valid phone number")
	public void login_page_is_opened_user_enters_a_valid_phone_number() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    Thread.sleep(2000);
		WebElement login_frame=driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/div[3]/iframe"));		
		driver.switchTo().frame(login_frame);
		//driver.findElement(By.xpath("//*[@id=\"mobileNoInp\"]")).sendKeys("8341402168");//9059088020//8919600952
		pf2 obj1=new pf2(driver);
		obj1.fun1();
	}

	@When("click Send OTP button")
	public void click_send_otp_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    System.out.println("Please solve CAPTCHA manually and press ENTER to continue....");
		new java.util.Scanner(System.in).nextLine();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id=\"otp-container\"]")).click();
		pf2 obj2=new pf2(driver);
		obj2.fun2();
		Thread.sleep(5000);
	}

	@When("user enters incorrect OTP")
	public void user_enters_incorrect_otp() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();	    
		//WebElement otp=driver.findElement(By.id("otp"));
		pf2 obj3=new pf2(driver);
		obj3.fun3();
		//otp.sendKeys(OTP);
	}

	@When("click verify button")
	public void click_verify_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    //driver.findElement(By.xpath("//button[@id='verifyUser']")).click();
		pf2 obj4=new pf2(driver);
		obj4.fun4();
	}

	@Then("user should see error message")
	public void user_should_see_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    //WebElement err_msg=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[3]/div[3]/div[1]"));
		pf2 obj5=new pf2(driver);
		obj5.fun5();
		
	}
	
	@Then("user should receive OTP via SMS")
	public void user_should_receive_otp_via_sms() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
	}

	@Then("user enters OTP")
	public void user_enters_otp() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		pf2 obj6=new pf2(driver);
		obj6.fun3();
	}

	@Then("click verify OTP button")
	public void click_verify_otp_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//driver.findElement(By.xpath("//button[@id='verifyUser']")).click();
		pf3 obj2=new pf3(driver);
		obj2.fun2();
	}

	@Then("user should successfully logged into app")
	public void user_should_successfully_logged_into_app() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	

	@When("login page is opened user enters a valid phone number as {string}")
	public void login_page_is_opened_user_enters_a_valid_phone_number(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Thread.sleep(2000);
		WebElement login_frame2=driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/div[3]/iframe"));		
		driver.switchTo().frame(login_frame2);
		WebElement number=driver.findElement(By.xpath("//*[@id=\"mobileNoInp\"]"));
		number.click();
		number.sendKeys(string);
	}

	@Then("user go to My account")
	public void user_go_to_my_account() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//Thread.sleep(2000);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement accountButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"account_dd\\\"]/div[1]/i[2]")));
//		accountButton.click();
		//driver.findElement(By.xpath("//*[@id=\"account_dd\"]/div[1]/i[2]")).click();
//		pf3 obj3=new pf3(driver);
//		obj3.fun3();
		WebElement myAccountButton = driver.findElement(By.xpath("//*[@id=\\\"account_dd\\\"]/div[1]/i[2]"));
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click();", myAccountButton);
//		
	}

	@When("user select My Profile")
	public void user_select_my_profile() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Thread.sleep(2000);
		pf3 obj4=new pf3(driver);
		obj4.fun4();
//		 WebElement skills_Dropdown = driver.findElement(By.xpath("//*[@id='account_dd']"));
//
//	     Select skills_Dropdown_Select = new Select(skills_Dropdown);
//	     skills_Dropdown_Select.selectByVisibleText("My Profile");
	}

	@Then("user details will displayed")
	public void user_details_will_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}



}