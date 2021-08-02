package org.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

	public static WebDriver driver;
	
	public static WebDriver loadBrowser() {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		return driver;
	}
	public static void launchUrl(String url) {
		driver.get(url);
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void impWait() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
	
	
		
		
	}

