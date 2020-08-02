import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium {

	private WebDriver driver;

	public Selenium() {
		driver = new ChromeDriver();
	}

	public void goToUrl() {
		driver.get("https://infograph.venngage.com/register");
	}

	public void sendKeys() {
		driver.findElement(By.xpath("//input[@id='user_first_name']")).sendKeys("QA");
		driver.findElement(By.xpath("//input[@id='user_last_name']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("qa.technicaltest@venngage.com");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("123456");

	}

	public void clickByXpath() {

		driver.findElement(By.xpath("//button[@id='btn_register']")).click();

	}

}