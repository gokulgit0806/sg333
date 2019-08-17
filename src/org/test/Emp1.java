package org.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Emp1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravinkumar\\eclipse-workspace\\MouseOver\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.shopclues.com/wholesale.html");
	
	WebElement src5 = driver.findElement(By.xpath("//a[text()='Sports & More']"));
	Actions acc = new Actions(driver);
	acc.moveToElement(src5).perform();
	WebElement src = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
	src.click();
	WebElement src2 = driver.findElement(By.xpath("//div[@class='prd_p_section']"));
	src2.click();
	WebElement src3 = driver.findElement(By.id("add_cart"));
	src3.click();
	WebElement src4 = driver.findElement(By.xpath("//a[@class='cart_ic']"));
	src4.click();	
	WebElement src6 = driver.findElement(By.xpath("//div[@class='p_price']"));
	String str = src6.getText();
	System.out.println(str);
	}
}
