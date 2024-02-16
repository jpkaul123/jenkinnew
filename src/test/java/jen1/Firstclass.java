package jen1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstclass {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		

	}

}
