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
public class VideoPopAflac {
  private WebDriver driver;
  private String baseUrl, nodeUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws MalformedURLException {
    //driver = new FirefoxDriver();
    //driver = new InternetExplorerDriver();
    
    baseUrl = "http://www.imadeacomeback.com";
    //nodeUrl ="http://10.0.2.15:5557/wd/hub";
    nodeUrl = "http://localhost:5557/wd/hub";


    
DesiredCapabilities capability  = DesiredCapabilities.internetExplorer();
    capability.setJavascriptEnabled(true);
    capability.setBrowserName("internet explorer");
    capability.setPlatform(Platform.WINDOWS);


    //System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
    driver = new RemoteWebDriver(new URL(nodeUrl), capability);
    
    // baseUrl = "http://qa.aflac.pubmodev.com/";
  //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

  }

  @Test
  public void testPageLoadsAflac() throws Exception {
   driver.get(baseUrl);
    driver.manage().window().setPosition(new Point(0, 0));
   	Thread.sleep(2000);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    

    driver.manage().window().setSize(new Dimension(1980, 1024));
    WebDriver augmentedDriver = new Augmenter().augment(driver);
    File scrFile1 = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scrFile1, new File("Y://axa/winxp-ie8/home/winxp-ie8-homepage-1980x1024.png"));
 
    driver.manage().window().setPosition(new Point(0, 0));
driver.manage().window().setSize(new Dimension(1600, 1024));
File scrFile1a = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scrFile1a, new File("Y://axa/winxp-ie8/home/winxp-ie8-homepage-1600x1024.png"));
    driver.manage().window().setPosition(new Point(0, 0));
driver.manage().window().setSize(new Dimension(1440, 1024));
File scrFile1b = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scrFile1b, new File("Y://axa/winxp-ie8/home/winxp-ie8-homepage-1440x1024.png"));
   
driver.manage().window().setSize(new Dimension(1280, 1024));
File scrFile1c = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scrFile1c, new File("Y://axa/winxp-ie8/home/winxp-ie8-homepage-1280x1024.png"));
driver.manage().window().setSize(new Dimension(1024, 1024));
File scrFile1d = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scrFile1d, new File("Y://axa/winxp-ie8/home/winxp-ie8-homepage-1024x1024.png"));
driver.manage().window().setSize(new Dimension(800, 1280));
File scrFile1e = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scrFile1e, new File("Y://axa/winxp-ie8/home/winxp-ie8-homepage-800x1280.png"));
driver.manage().window().setSize(new Dimension(700, 1280));
File scrFile1f = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scrFile1f, new File("Y://axa/winxp-ie8/home/homepage-700x1280.png"));
driver.manage().window().setSize(new Dimension(600, 1280));
File scrFile1g = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scrFile1g, new File("Y://axa/winxp-ie8/home/winxp-ie8-homepage-600x1280.png"));
driver.manage().window().setSize(new Dimension(500, 1280));
File scrFile1h = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scrFile1h, new File("Y://axa/winxp-ie8/home/winxp-ie8-homepage-500x1280.png"));
   
driver.manage().window().setSize(new Dimension(400, 1280));
File scrFile1i = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scrFile1i, new File("Y://axa/winxp-ie8/home/winxp-ie8-homepage-400x1280.png"));
driver.manage().window().setSize(new Dimension(300, 1280));
File scrFile1j = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scrFile1j, new File("Y://axa/winxp-ie8/home/winxp-ie8-homepage-300x1280.png"));

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