package org.atmecs.web_main;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Test {
static Scanner input=new Scanner(System.in);
static String driverpath;
	public static void main(String[] args) {
		System.out.println("please enter the chrome driver path:");
		driverpath=input.nextLine();
		System.setProperty("webdriver.chrome.driver",driverpath);
		WebDriver driver=new ChromeDriver();
		driver.get("resources\\facebook.html");
		driver.findElement(By.id("namebox")).sendKeys("arjun.santra355@gmail.com");
		driver.findElement(By.id("namebox1")).sendKeys("arjun@123");

	}

}
