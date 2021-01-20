package com.Selenium_intellij;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException{
	// write your code here
        System.out.println("Hello");
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Rajeev Rajesh\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url="https://www.thesparksfoundationsingapore.org/";
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(3000);
        driver.findElement(By.linkText("Contact Us")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("GRIP (Internship)")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Why Join Us")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("Name")).sendKeys("Shambhavi");
        Thread.sleep(3000);
        driver.findElement(By.name("Email")).sendKeys("shambhaviratnapriya@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.linkText("Brand Ambassador")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Expert Mentor")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Events Volunteer")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Management Volunteer")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Jobs at Tech in Asia Portal")).click();
        driver.close();
        driver.quit();
    }
}
