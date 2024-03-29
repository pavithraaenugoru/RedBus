package stepDefinations;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	    driver.findElement(By.xpath("//span[@class='name_rb_secondary_item' and text()='Account']")).click();
		driver.findElement(By.xpath("//*[@id='user_sign_in_sign_up']/span")).click();
		Thread.sleep(2000);
	}

	@When("login page is opened user enters invalid phone number")
	public void login_page_is_opened_user_enters_invalid_phone_number() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    Thread.sleep(2000);
		WebElement login_frame=driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/div[3]/iframe"));		
		driver.switchTo().frame(login_frame);
		driver.findElement(By.xpath("//*[@id=\"mobileNoInp\"]")).sendKeys("0000000000");
	}

	@When("click generate OTP button")
	public void click_generate_otp_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    System.out.println("Please solve CAPTCHA manually and press ENTER to continue....");
		new java.util.Scanner(System.in).nextLine();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"otp-container\"]")).click();
	}

	@Then("user should see an error message")
	public void user_should_see_an_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    WebElement generate_otp=driver.findElement(By.xpath("//*[@id=\"signInView\"]/div[2]/div/div[1]/div[4]/div[3]/span"));
		System.out.println("Error Message: "+generate_otp.getText());
	}
	
	@When("login page is opened user enters a valid phone number")
	public void login_page_is_opened_user_enters_a_valid_phone_number() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    Thread.sleep(2000);
		WebElement login_frame=driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/div[3]/iframe"));		
		driver.switchTo().frame(login_frame);
		driver.findElement(By.xpath("//*[@id=\"mobileNoInp\"]")).sendKeys("9959324696");//9059088020//8919600952

	}

	@When("click Send OTP button")
	public void click_send_otp_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    System.out.println("Please solve CAPTCHA manually and press ENTER to continue....");
		new java.util.Scanner(System.in).nextLine();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"otp-container\"]")).click();
		Thread.sleep(5000);
	}

	@When("user enters incorrect OTP")
	public void user_enters_incorrect_otp() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter OTP: ");
		String OTP=sc.next();
		WebElement otp=driver.findElement(By.id("otp"));
		otp.sendKeys(OTP);
	}

	@When("click verify button")
	public void click_verify_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    driver.findElement(By.xpath("//button[@id='verifyUser']")).click();
	}

	@Then("user should see error message")
	public void user_should_see_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    WebElement err_msg=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[3]/div[3]/div[1]"));
		System.out.println("Error message: "+ err_msg.getAttribute("innerHTML"));//textContent
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
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter OTP: ");
		String OTP=sc.next();
		WebElement otp=driver.findElement(By.id("otp"));
		otp.sendKeys(OTP);
	}

	@Then("click verify OTP button")
	public void click_verify_otp_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//button[@id='verifyUser']")).click();
	}

	@Then("user should successfully logged into app")
	public void user_should_successfully_logged_into_app() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	@Then("user goes to account")
	public void user_goes_to_account() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		WebElement frame2=driver.findElement(By.xpath("//*[@id=\"main_header_new\"]"));
//		driver.switchTo().frame(frame2);
		Thread.sleep(5000);
		WebDriverWait webDriverWait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//WebElement acc=driver.findElement(By.xpath("//*[@id=\"account_dd\"]/div[1]/span"));//(//span[@class='name_rb_secondary_item'])[2]
		WebElement acc= webDriverWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='My Account']"))));		
		//webDriverWait.until(ExpectedConditions.visibilityOf(acc));
		acc.click();
	}

	@Then("selects My Profile option")
	public void selects_my_profile_option() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();	
		WebDriverWait webDriverWait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement profile=driver.findElement(By.xpath("//*[@id=\"profile_detail\"]/span"));
		
		webDriverWait.until(ExpectedConditions.visibilityOf(profile));
		profile.click();
	}

	@When("Profile page opened")
	public void profile_page_opened() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("Details should be displayed")
	public void details_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement u_name=driver.findElement(By.xpath("//div[@id='namevalue']")); 
		System.out.println("User Name: "+u_name.getText());
		WebElement u_dob=driver.findElement(By.id("agevalue")); 
		System.out.println("User Date_of_Birth: "+u_dob.getText());
		WebElement u_gender=driver.findElement(By.xpath("//input[@name='gender' and @value='1']")); 
		System.out.println("User Gender: "+u_gender.getText());
		WebElement u_email=driver.findElement(By.id("conemailvalue")); 
		System.out.println("User E-mail Address: "+u_email.getText());
		WebElement u_phn=driver.findElement(By.id("mobvalue")); 
		System.out.println("User Phone Number: "+u_phn.getText());
	}


	
}