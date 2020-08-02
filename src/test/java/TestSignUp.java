import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestSignUp {
	

	
	private Account account;
	private SignUpPage signUpPage;
	Selenium selenium;
	
	@BeforeMethod
	public void setUp(){
		
		selenium.goToUrl();		
	}
	
	@Test (dataProvider = "sign")
	public void signUpTestWithMissingInputs(String Firstname, String Lastname, String Email, String Password) {
		
	}
	
	
	@DataProvider
	 public Object[][] sign() {
	    return new Object[][] {
	    
	    	new Object[] {  "QA","Test", "qa.technicaltest@venngage.com", "123456", "" },
	    	new Object[] { "Test", "qa.technicaltest@venngage.com", "123456", "" },
	      new Object[] { "QA", "qa.technicaltest@venngage.com", "123456", "" },
	      new Object[] { "", "", "", "" },
	     	      
	    };
	}
	}