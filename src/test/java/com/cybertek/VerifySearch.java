package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifySearch {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.etsy.com/");
		
		String searchId = "search-query";
		String searchItem = "fathers day gift";
		
		WebElement input = driver.findElement(By.id(searchId));
		input.sendKeys(searchItem + Keys.ENTER);
		
		input = driver.findElement(By.id(searchId));
		String actual = input.getAttribute("value");
		System.out.println(actual);
		
		if(actual.equals(searchItem)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
			System.out.println("expected: \t" + searchItem);
			System.out.println("found:\t" + actual);
		}
	}
}
