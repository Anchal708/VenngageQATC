public class SignUpPage {
	
	private Selenium selenium;
	

	private static final String firstNameInput = "//input[@id='user_first_name']";
	private static final String lastNameInput = "//input[@id='user_last_name']";
	private static final String EmailInput = "//input[@id='user_email']";
	private static final String PasswordInput = "//input[@id='user_password']";
	
	
	public Account SignUpPage(){
		selenium.sendKeys();
		selenium.clickByXpath();
		return new Account();
		
	}
	
	
	
}