import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TemplatesPage {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://venngage.com/templates");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//div[@class='templates__template--2aRcT']"));
		action.moveToElement(we).build().perform();
		Thread.sleep(2000);
		String create = driver.findElement(By.xpath("//button[@class='templates__signUp--2DvEL']")).getText();
		System.out.println(create);
		if(create.equals("CREATE")) {
		System.out.println("passed");
		}else {
		System.out.println("failed");
		}
		WebElement createButton = driver.findElement(By.xpath("//button[@class='templates__signUp--2DvEL']"));
		action.moveToElement(createButton).build().perform();
		Thread.sleep(2000);
		String signUPText = driver.findElement(By.xpath("//button[@class='templates__signUp--2DvEL']")).getText();
		System.out.println(signUPText);
		        if(signUPText.equals("")) {
		        System.out.println("passed");
		        }else {
		        System.out.println("failed");
		        }

		}

		}



