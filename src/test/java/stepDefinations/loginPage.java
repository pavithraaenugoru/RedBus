package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageFactory.pf1;
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
		pf1 obj=new pf1(driver);
		obj.fun1();
		obj.fun2();
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
		pf1 obj=new pf1(driver);
		obj.fun3();
	}

	@When("click generate OTP button")
	public void click_generate_otp_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    System.out.println("Please solve CAPTCHA manually and press ENTER to continue....");
		new java.util.Scanner(System.in).nextLine();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id=\"otp-container\"]")).click();
		pf1 obj=new pf1(driver);
		obj.fun4();
	}

	@Then("user should see an error message")
	public void user_should_see_an_error_message() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    //WebElement generate_otp=driver.findElement(By.xpath("//*[@id=\"signInView\"]/div[2]/div/div[1]/div[4]/div[3]/span"));
		pf1 obj=new pf1(driver);
		obj.fun5();
		Thread.sleep(2000);
	}
	
	@When("login page is opened user enters a valid phone number")
	public void login_page_is_opened_user_enters_a_valid_phone_number() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    Thread.sleep(2000);
		WebElement login_frame=driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/div[3]/iframe"));		
		driver.switchTo().frame(login_frame);
		//driver.findElement(By.xpath("//*[@id=\"mobileNoInp\"]")).sendKeys("8341402168");//9059088020//8919600952
		pf1 obj=new pf1(driver);
		obj.fun6();
	}

	@When("click Send OTP button")
	public void click_send_otp_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    System.out.println("Please solve CAPTCHA manually and press ENTER to continue....");
		new java.util.Scanner(System.in).nextLine();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id=\"otp-container\"]")).click();
		pf1 obj=new pf1(driver);
		obj.fun7();
		Thread.sleep(5000);
	}

	@When("user enters incorrect OTP")
	public void user_enters_incorrect_otp() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();	    
		//WebElement otp=driver.findElement(By.id("otp"));
		//otp.sendKeys(OTP);
		pf1 obj=new pf1(driver);
		obj.fun8();		
	}

	@When("click verify button")
	public void click_verify_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    //driver.findElement(By.xpath("//button[@id='verifyUser']")).click();
		pf1 obj=new pf1(driver);
		obj.fun9();
	}

	@Then("user should see error message")
	public void user_should_see_error_message() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    //WebElement err_msg=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[3]/div[3]/div[1]"));
		pf1 obj=new pf1(driver);
		obj.fun10();		
		Thread.sleep(2000);
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
		pf1 obj=new pf1(driver);
		obj.fun8();
	}

	@Then("click verify OTP button")
	public void click_verify_otp_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//driver.findElement(By.xpath("//button[@id='verifyUser']")).click();
		pf1 obj=new pf1(driver);
		obj.fun11();
	}

	@Then("user should successfully logged into app")
	public void user_should_successfully_logged_into_app() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.print("Successfully logged in:)");
		Thread.sleep(1000);
	}
	
	@Given("user goes to account select show my ticket")
	public void user_goes_to_account_select_show_my_ticket() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//driver.findElement(By.xpath("//*[@id=\"ticket_details\"]")).click();
		pf1 obj=new pf1(driver);
		obj.fun1();		
		obj.fun12();
		Thread.sleep(2000);		
	}

	@When("user enters ticket number and mobile number")
	public void user_enters_ticket_number_and_mobile_number() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();		
//		WebElement t_no=driver.findElement(By.xpath("//*[@id=\"searchTicketTIN\"]"));
//		t_no.click();
//		t_no.sendKeys("TT4252802246");
//		WebElement m_no=driver.findElement(By.xpath("//*[@id=\"searchTicketMobileno\"]"));		
//		m_no.click();
//		m_no.sendKeys("9059923461");		
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		Thread.sleep(2000);
		pf1 obj=new pf1(driver);
		obj.fun14();
		obj.fun15();
		obj.fun16();
	}

	@Then("trip details displays")
	public void trip_details_displays() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	@Given("user goes to account select Email or SMS")
	public void user_goes_to_account_select_email_or_sms() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();		
		pf1 obj=new pf1(driver);
		obj.fun1();		
		obj.fun13();		
	}

	@Then("user enters details to get Email or SMS")
	public void user_enters_details_to_get_email_or_sms() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}