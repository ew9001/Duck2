package com.duck.tests;

import java.io.File;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

@SuppressWarnings("unused")
public class HomeAflac {
  private WebDriver driver;
  private String baseUrl, nodeUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws MalformedURLException {
    driver = new FirefoxDriver();
   // driver = new InternetExplorerDriver();
    
    baseUrl = "http://www.imadeacomeback.com";
    //nodeUrl ="http://10.0.2.15:5557/wd/hub";
//nodeUrl = "http://192.168.2.7:5557/wd/hub";
  //nodeUrl = "http://192.168.2.5:5557/wd/hub";


    
//DesiredCapabilities capability  = DesiredCapabilities.internetExplorer();
//capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
//true); 
   // capability.setJavascriptEnabled(true);
    //capability.setBrowserName("internet explorer");
   // capability.setPlatform(Platform.WINDOWS);


    
   // driver = new RemoteWebDriver(new URL(nodeUrl), capability);
    
    // baseUrl = "http://qa.aflac.pubmodev.com/";
  //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

  }

  @Test
  public void testPageLoadsAflac() throws Exception {
   driver.get(baseUrl);

   	Thread.sleep(7000);
    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
    driver.manage().window().setPosition(new Point(0, 0));
    driver.manage().window().setSize(new Dimension(1980, 1024));
    //WebDriver augmentedDriver = new Augmenter().augment(driver);
    File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scrFile1, new File("Screenshots://axa/winxp-ie8/home/winxp-ie8-homepage-1980x1024.png"));
 
 
driver.manage().window().setSize(new Dimension(1600, 1024));
File scrFile1a = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scrFile1a, new File("Screenshots://axa/winxp-ie8/home/winxp-ie8-homepage-1600x1024.png"));

driver.manage().window().setSize(new Dimension(1440, 1024));
File scrFile1b = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scrFile1b, new File("Screenshots://axa/winxp-ie8/home/winxp-ie8-homepage-1440x1024.png"));
   
driver.manage().window().setSize(new Dimension(1280, 1024));
File scrFile1c = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scrFile1c, new File("Screenshots://axa/winxp-ie8/home/winxp-ie8-homepage-1280x1024.png"));
driver.manage().window().setSize(new Dimension(1024, 1024));
File scrFile1d = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scrFile1d, new File("Screenshots://axa/winxp-ie8/home/winxp-ie8-homepage-1024x1024.png"));
driver.manage().window().setSize(new Dimension(800, 1280));
File scrFile1e = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scrFile1e, new File("Screenshots://axa/winxp-ie8/home/winxp-ie8-homepage-800x1280.png"));
driver.manage().window().setSize(new Dimension(700, 1280));
File scrFile1f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scrFile1f, new File("Screenshots://axa/winxp-ie8/home/homepage-700x1280.png"));
driver.manage().window().setSize(new Dimension(600, 1280));
File scrFile1g = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scrFile1g, new File("Screenshots://axa/winxp-ie8/home/winxp-ie8-homepage-600x1280.png"));
driver.manage().window().setSize(new Dimension(500, 1280));
File scrFile1h = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scrFile1h, new File("Screenshots://axa/winxp-ie8/home/winxp-ie8-homepage-500x1280.png"));
   
driver.manage().window().setSize(new Dimension(400, 1280));
File scrFile1i = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scrFile1i, new File("Screenshots://axa/winxp-ie8/home/winxp-ie8-homepage-400x1280.png"));
driver.manage().window().setSize(new Dimension(300, 1280));
File scrFile1j = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scrFile1j, new File("Screenshots://axa/winxp-ie8/home/winxp-ie8-homepage-300x1280.png"));

  }

    
  

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}