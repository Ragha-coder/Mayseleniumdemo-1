package com.seleniumprograms.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.seleniumprogram.practice.Privateex;

public class Actionclass extends Privateex {

	static WebDriver driver;
	
	void m1() {
		name();
	}

	public static void main(String[] args) throws InterruptedException {
		
		Privateex ex= new Privateex();


		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

		WebElement link = driver.findElement(By.id("sumb-menu"));
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		
		action.moveToElement(link).build().perform();
		
		/*
		 * Action mouseOverHome = action.moveToElement(link).build();
		 * mouseOverHome.perform();
		 */
		
		Thread.sleep(2000);
		driver.findElement(By.id("link1")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
