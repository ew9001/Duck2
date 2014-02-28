package com.duck.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Capabilities;

import java.net.URL;

public class BrowserStack {

  public static final String USERNAME = "earlwillis1";
  public static final String AUTOMATE_KEY = "XsPyFTirN4mH8aCLMB9A";
  public static final String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";

  
  
  public static void main(String[] args) throws Exception {
 

    
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("browser", "IE");
    caps.setCapability("browser_version", "7.0");
    caps.setCapability("os", "Windows");
    caps.setCapability("os_version", "XP");
    caps.setCapability("browserstack.debug", "true");

    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    driver.get("http://stage.coffee-mate.com" + "/Contact-Us.aspx");
    
    // This script will fill out the contact form and submit
    
    driver.findElement(By.linkText("Sign in")).click();
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlReason"))).selectByVisibleText("General Inquiry or Question");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFirstName")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFirstName")).sendKeys("PubmoTestFirst");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtLastName")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtLastName")).sendKeys("PubmoTestLast");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtEmail")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtEmail")).sendKeys("xxxxx@yahoo.com");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtAddress1")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtAddress1")).sendKeys("75 W. 10th Street");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtAddress2")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtAddress2")).sendKeys("Apt. 3B");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCity")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCity")).sendKeys("New York");
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlStates"))).selectByVisibleText("New York");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtZip")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtZip")).sendKeys("10003");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtHomePhone1")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtHomePhone1")).sendKeys("212");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtHomePhone2")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtHomePhone2")).sendKeys("222");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtHomePhone3")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtHomePhone3")).sendKeys("2222");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtWorkPhone1")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtWorkPhone1")).sendKeys("212");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtWorkPhone2")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtWorkPhone2")).sendKeys("456");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtWorkPhone3")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtWorkPhone3")).sendKeys("7890");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtComments")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtComments")).sendKeys("Please do contact this test account.");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_imgbtnSubmit")).click();
   

  

    driver.quit();

  }
}