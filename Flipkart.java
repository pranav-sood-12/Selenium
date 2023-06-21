package first_lab;

import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
public class WorkingWithChrome {
	ChromeDriver driver;
	public void closeTest() {
		driver.quit();
	}
	
	public void  invokeBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		System.out.println("google.com launched successfully!");
	}
	
	public void navigate() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.navigate().to("https://www.flipkart.com");
		try {
	        Thread.sleep(3000);
	        System.out.println("Succesfully launched Flipkart status 200");
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	        System.out.println("we encountered an unexpected error!!");
	    }
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		try {
	        Thread.sleep(2000);
	        System.out.println("Closed Login Pop-Up status 200");
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	        System.out.println("we encountered an unexpected error!!");
	    }
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/a/div[1]/div/img")).click();
		try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	        System.out.println("we encountered an unexpected error!!");
	    }
		System.out.println("entered mobile phone section 200");
//		js.executeScript("window.scrollBy(0,500)");
    	try {
        Thread.sleep(2000);
    	} catch (InterruptedException e) {
        e.printStackTrace();
        System.out.println("we encountered an unexpected error!!");
		}
    	driver.findElement(By.className("1aPR5")).click();
    	System.out.println("seelcted mobile phone 200");
    	try {
            Thread.sleep(2000);
        	} catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("we encountered an unexpected error!!");
    		}
    	driver.findElement(By.className("_4rR01T")).click();
    	
//    	driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img")).click();
    	try {
            Thread.sleep(3000);
        	} catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("we encountered an unexpected error!!");
    		}
    	
    	
    	// Switch to the new tab

    	// Switch to the new tab
    	String currentWindowHandle = driver.getWindowHandle();
    	java.util.Set<String> windowHandles = driver.getWindowHandles();
    	for (String windowHandle : windowHandles) {
    	    if (!windowHandle.equals(currentWindowHandle)) {
    	        driver.switchTo().window(windowHandle);
    	        break;
    	    }
    	}
    	System.out.println("switched tab successfully 200");
    	WebElement buyNowButton = driver.findElement(By.className("_2KpZ6l"));
    	buyNowButton.click();
    	System.out.println("Test ended successfully, we are on payment page 200");
    	try {
            Thread.sleep(5000);
        	} catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("we encountered an unexpected error!!");
    		}
	}
}
