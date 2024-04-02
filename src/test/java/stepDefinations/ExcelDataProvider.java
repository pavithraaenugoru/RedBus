package stepDefinations;


import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageFactory.ExelExec;

public class ExcelDataProvider {
	
	 WebDriver driver;
	 @Test(dataProvider="testdata")
	 public void Program(String ticket_no,String number) throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/Home/PrintTicket");
		driver.findElement(By.id("searchTicketTIN")).sendKeys(ticket_no);
		driver.findElement(By.id("searchTicketMobileno")).sendKeys(number);
		driver.findElement(By.id("ticketSearch")).click();
	}
	 @DataProvider(name = "testdata")
		public Object getData() {
			ExelExec utils = new ExelExec("C:\\Users\\aepavith\\Downloads\\phnNumber.xlsx");
			int rows = utils.getRowCount(0);
			Object[][] logindata = new Object[rows][2];
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < 2; j++) {
					logindata[i][j] = utils.getdata(0, i + 1, j);
					System.out.println(logindata[i][j]);
				}	 
			}
			return logindata;
		}
	
}
