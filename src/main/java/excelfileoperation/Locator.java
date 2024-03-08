package excelfileoperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println("driver.getCurrentUrl()");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
}

}
