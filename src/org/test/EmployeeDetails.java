package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EmployeeDetails {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravinkumar\\eclipse-workspace\\MouseOver\\drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.amazon.in");

WebElement src = driver.findElement(By.id("fourth"));
WebElement des = driver.findElement(By.id("amt7"));

Actions acc = new Actions(driver);
acc.dragAndDrop(src, des).perform();

WebElement src1 = driver.findElement(By.id("credit2"));
WebElement des1 = driver.findElement(By.id("bank"));

acc.dragAndDrop(src1, des1).perform();

WebElement src2 = driver.findElement(By.id("fourth"));
WebElement des2 = driver.findElement(By.id("amt8"));

acc.dragAndDrop(src2, des2).perform();

WebElement src3 = driver.findElement(By.id("credit1"));
WebElement des3 = driver.findElement(By.id("loan"));

acc.dragAndDrop(src3, des3).perform();




}
}
