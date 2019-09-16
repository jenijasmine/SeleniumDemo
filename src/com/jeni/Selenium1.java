package com.jeni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\verizon\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:4200/");
		
		WebElement name = driver.findElement(By.name("name"));
		WebElement city = driver.findElement(By.name("city"));
		WebElement rating = driver.findElement(By.name("rating"));
		//WebElement btn = driver.findElement(By.name("btn"));
		
		name.sendKeys("jeni");
		Thread.sleep(3000);
		city.sendKeys("chennai");
		Thread.sleep(3000);
		rating.sendKeys("5");
		Thread.sleep(3000);
		WebElement btn = driver.findElement(By.xpath("/html/body/app-root/div/app-anglist/div/div/button"));
		btn.click();
		Thread.sleep(3000);
		
		WebElement edit = driver.findElement(By.xpath("/html/body/app-root/div/app-anglist/div/table/tbody/tr[3]/td[4]/span/button[1]/i"));
		edit.click();
		WebElement ename = driver.findElement(By.name("ename"));
		WebElement ecity = driver.findElement(By.name("ecity"));
		WebElement erating = driver.findElement(By.name("erating"));
		
		ename.clear();
		ecity.clear();
		erating.clear();
		ename.sendKeys("simbu");
		Thread.sleep(3000);
		ecity.sendKeys("bangalore");
		Thread.sleep(3000);
		erating.sendKeys("10");
		Thread.sleep(3000);
		WebElement save = driver.findElement(By.xpath("/html/body/app-root/div/app-anglist/div/table/tbody/tr[3]/td[4]/span/button[1]/i"));
		save.click();
		Thread.sleep(3000);
		
    	WebElement delete = driver.findElement(By.xpath("/html/body/app-root/div/app-anglist/div/table/tbody/tr[1]/td[4]/span/button[2]/i"));
    	delete.click();
    	
    	Thread.sleep(3000);
		
		driver.quit();
		
	}

}
