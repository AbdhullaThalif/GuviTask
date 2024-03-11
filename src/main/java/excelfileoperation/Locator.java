package excelfileoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		//System.out.println("driver.getCurrentUrl()");
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		
	
		}

}
