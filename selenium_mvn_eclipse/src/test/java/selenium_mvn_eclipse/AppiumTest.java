package selenium_mvn_eclipse;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

import org.testng.Reporter;

public class AppiumTest {

private static AppiumDriver wd;
    
    @BeforeClass
    public static void setUpClass() throws MalformedURLException {
    	DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appium-version", "1.0");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("platformVersion", "9.1");
		capabilities.setCapability("deviceName", "Vibhor's iPhone");
		wd = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
		
    
    //@Test
    public void ifAllTabButtonsExistTest() throws IOException {
    	assertEquals("Button named Ads should be made visible","Ads",wd.findElement(By.name("Ads")).getText());
		assertEquals("Button named My Account should be made visible","My Account",wd.findElement(By.name("My Account")).getText());
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]")).click();
		assertEquals("Button named Submit an Ad should be made visible","Submit an Ad",wd.findElement(By.name("Submit an Ad")).getText());
		assertEquals("Button named My Favourites should be made visible","My Favorites",wd.findElement(By.name("My Favorites")).getText());
		//wd.findElement(By.name("Ads (0)")).click();
		//wd.findElement(By.name("Sarches (0)")).click();
		assertEquals("Button named My Chats should be made visible","My Chats",wd.findElement(By.name("My Chats")).getText());
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]")).click();
    }
	
    //@Test
    public void ifLandingPageHasAllTheHeadres() throws IOException{
    	assertEquals("The landing page should have a search bar","Sarch in Gurgaon...",wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIATextField[1]")).getText());
    	assertEquals("Find ads near you should be present","Fnd ads neear you",wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIAStaticText[1]")).getText());
    	assertEquals("The landing page should show a button displaying Sabmit a Free Ads","Sabmit a Free Ads",wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIAButton[2]")).getText());
    	//WebElement el = (WebElement) wd.findElementsByXPath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]");
    	//List<WebElement> list = el.findElements(By.className("UIACollectionCell"));
    	assertEquals("Help should be visible","Help",wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[12]")).getText());
    	assertEquals("Safety Tips should be visible","Safety Tips",wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[13]")).getText());
    	assertEquals("Terms of use should be visible","Safety Tips",wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[14]")).getText());
    	assertEquals("Contact us should be visible","Contact us",wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[15]")).getText());
    	assertEquals("Settings us should be visible","Settings",wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[16]")).getText());
    	assertEquals("version 2.0.0 us should be visible",wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[17]")).getText());
    }
    
    //@Test
    public void ifLandingPageHasAllTheListingCategories() throws IOException{
    	assertEquals("The landing page should have Mobiles & Tablets","Mobiles & Tablets",wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[1]")).getText());
    	assertEquals("Category Electronics & Computers should be shown on Landing Page","Electronics & Computers",wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[2]")).getText());
    	assertEquals("Category Vehicles should be shown on Landing Page","Vehicles",wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[3]")).getText());
    	assertEquals("Category Home & Furniture should be shown on Landing Page","Home & Furniture",wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[4]")).getText());
    	assertEquals("Category Animals should be visible","Animals",wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[5]")).getText());
    	assertEquals("Category Books, Sports & Hobbies should be visible","Books, Sports & Hobbies",wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[6]")).getText());
    	assertEquals("Category Fashion & Beauty should be visible","Fashion & Beauty",wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[7]")).getText());
    	assertEquals("Category Kids & Baby should be visible","Kids & Baby ",wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[8]")).getText());
    	assertEquals("Gurgaon should be visible",wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIAButton[1]")).getText());
    	assertEquals("Sabmit a Free Ads should be visible",wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIAButton[2]")).getText());
    }
    
    @Test
    public void openSubmitPage() throws IOException{
    	wd.findElement(By.name("Sabmit a Free Ads")).click();
    	assertEquals("Add photos should appear as first text","Add Photos",wd.findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[1]").getText());
    	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAButton[1]")).click();
    	wd.findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIAActionSheet[1]/UIAScrollView[1]/UIATableView[1]/UIATableCell[2]").click();
    	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]")).click();
    	wd.findElement(By.name("Photo, Portrait, 25 September, 11:30 PM")).click();
    	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIATextField[1]")).click();
    	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIATextField[1]")).sendKeys("Test Title test title test title");
    	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIATextField[2]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIATextField[2]")).sendKeys("Description");
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIATextField[3]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIATextField[3]")).sendKeys("Vibhor");
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIATextField[4]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIATextField[4]")).sendKeys("Vibhorgaur8@gmail.com");
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIATextField[5]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIATextField[5]")).sendKeys("7827599849");
    }
    
    @AfterClass
    public static void tearDownClass() {
        if (wd != null) {               
            wd.quit();
        }           
    }
    
}
