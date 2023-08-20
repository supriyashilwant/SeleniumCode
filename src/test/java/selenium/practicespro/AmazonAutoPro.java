package selenium.practicespro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutoPro {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.crom.driver","src/test/resources/chromedriver_win32");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D58355126069%26hvpone%3D%26hvptwo%3D%26hvadid%3D486458712209%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D12374188604273504682%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9146385%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2154373&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id(" Sign in"));
		
		driver.findElement(By.id("ap_email"));
		
		WebElement username=driver.findElement(By.id("user_email_login"));
			
		driver.findElement(By.id("ap-credential-autofill-hint"));
		
		driver.findElement(By.id("continue"));
		
		WebElement password=driver.findElement(By.id("continue"));
		
		//driver.close();
	}

}
