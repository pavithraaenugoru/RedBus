Feature: Login to Redbus App 
	
Scenario: Unsuccessful login with invalid phone number
		Given user on Home Page
		And user goes to account select login
		When login page is opened user enters invalid phone number
		And click generate OTP button
		Then user should see an error message 
		
Scenario: Unsuccessful login with valid phone number but incorrect OTP
		Given user on Home Page
		And user goes to account select login
		When login page is opened user enters a valid phone number
		And click Send OTP button
		And user enters incorrect OTP
		And click verify button
		Then user should see error message
		
Scenario: Successful login with valid phone number
		Given user on Home Page
		And user goes to account select login
		When login page is opened user enters a valid phone number
		And click Send OTP button
		Then user should receive OTP via SMS
		And user enters OTP
		And click verify OTP button
		Then user should successfully logged into app


Scenario: Opening My Profile Page
    Given user on Home Page
		And user goes to account select login
		When login page is opened user enters a valid phone number as "8341402168"
		And click Send OTP button
		Then user should receive OTP via SMS
		And user enters OTP
		And click verify OTP button
		Then user should successfully logged into app
		And user go to My account
		When user select My Profile 
		Then user details will displayed
		

