package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		String url = "http://the-internet.herokuapp.com/checkboxes";
		driver.get(url);
		
		WebElement firstOne = driver.findElement(By.tagName("input"));
		
		WebElement secondOne = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
		
		System.out.println(firstOne.isSelected());
		System.out.println(secondOne.isSelected());
		secondOne.click();
		System.out.println(secondOne.isSelected());
//		firstOne.click();
//		System.out.println(firstOne.isSelected());
		
		driver.close();
		
		
		

	}

}
