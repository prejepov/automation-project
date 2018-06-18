package com.cybertek;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo {
//https://tutorialehtml.com/en/html-tutorial-drop-down-lists-menu/
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		String url = "https://tutorialehtml.com/en/html-tutorial-drop-down-lists-menu/";
		driver.get(url);
		
		WebElement selectTag = driver.findElement(By.name("my_html_select_box"));
		
		Select list = new Select(selectTag);
		
		WebElement selected = list.getFirstSelectedOption();
		System.out.println(selected.getText());
		
		System.out.println(list.getFirstSelectedOption().getText());
		
		
		//List<WebElement> options = list.getOptions();
//		System.out.println("--------------------");
//		for(WebElement webElement: options) {
//			System.out.println(webElement.getText());
//			
//		}
		
		

	}

}
