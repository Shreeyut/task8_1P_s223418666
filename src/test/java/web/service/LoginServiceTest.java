package web.service;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginServiceTest {
	
	private void sleep(long sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testLoginSuccess() {
		System.setProperty(
				"webdriver.chrome.driver", 
				"C:/Users/guest1/Downloads/chromedriver-win64(2)/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);
		
		// Full path where login.html is located.
		// You can click on html file and copy the path shown in your browser.
		//
		driver.navigate().to(
				"file:///C:/Users/guest1/Desktop/Uni/SIT707/java_projects/task8_1P/pages/login.html");
		sleep(5);
		
		// Find username element
		//
		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		ele.sendKeys("shreeyut");
		
		// Find password element
		//
		ele = driver.findElement(By.id("passwd"));
		ele.clear();
		ele.sendKeys("1234");
		
		ele = driver.findElement(By.id("dob"));
		ele.clear();
		ele.sendKeys("01-02-2000");
	
		// Find Submit button, and click on button.
		//
		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(5);
		
		/*
		 * On successful login, the title of page changes to 'success',
		 * otherwise, 'fail'.
		 */
		ele = driver.findElement(By.id("name"));
		String status= ele.getText();
		Assert.assertEquals(status, "success");
		
		driver.close();
	}
		@Test
		public void testEmptyName() {
				System.setProperty(
						"webdriver.chrome.driver", 
						"C:/Users/guest1/Downloads/chromedriver-win64(2)/chromedriver-win64/chromedriver.exe");
				WebDriver driver = new ChromeDriver();		
				System.out.println("Driver info: " + driver);
				driver.navigate().to(
						"file:///C:/Users/guest1/Desktop/Uni/SIT707/java_projects/task8_1P/pages/login.html");
				sleep(2);
				WebElement ele = driver.findElement(By.id("username"));
				ele.clear();
				ele.sendKeys("");

				ele = driver.findElement(By.id("passwd"));
				ele.clear();
				ele.sendKeys("1234");
				
				ele = driver.findElement(By.id("dob"));
				ele.clear();
				ele.sendKeys("01-02-2000");

				ele = driver.findElement(By.cssSelector("[type=submit]"));
				ele.submit();
				sleep(1);
				ele = driver.findElement(By.id("name"));
				String status= ele.getText();
				Assert.assertEquals(status, "no username");
				driver.close();
		}
		@Test
		public void testEmptyPassword() {
				System.setProperty(
						"webdriver.chrome.driver", 
						"C:/Users/guest1/Downloads/chromedriver-win64(2)/chromedriver-win64/chromedriver.exe");
				WebDriver driver = new ChromeDriver();		
				System.out.println("Driver info: " + driver);
				driver.navigate().to(
						"file:///C:/Users/guest1/Desktop/Uni/SIT707/java_projects/task8_1P/pages/login.html");
				sleep(2);
				WebElement ele = driver.findElement(By.id("username"));
				ele.clear();
				ele.sendKeys("shreeyut");

				ele = driver.findElement(By.id("passwd"));
				ele.clear();
				ele.sendKeys("");
				
				ele = driver.findElement(By.id("dob"));
				ele.clear();
				ele.sendKeys("01-02-2000");

				ele = driver.findElement(By.cssSelector("[type=submit]"));
				ele.submit();
				sleep(1);
				ele = driver.findElement(By.id("name"));
				String status= ele.getText();
				Assert.assertEquals(status, "no password");
				driver.close();
		}
		@Test
		public void testEmptyDOB() {
				System.setProperty(
						"webdriver.chrome.driver", 
						"C:/Users/guest1/Downloads/chromedriver-win64(2)/chromedriver-win64/chromedriver.exe");
				WebDriver driver = new ChromeDriver();		
				System.out.println("Driver info: " + driver);
				driver.navigate().to(
						"file:///C:/Users/guest1/Desktop/Uni/SIT707/java_projects/task8_1P/pages/login.html");
				sleep(2);
				WebElement ele = driver.findElement(By.id("username"));
				ele.clear();
				ele.sendKeys("shreeyut");

				ele = driver.findElement(By.id("passwd"));
				ele.clear();
				ele.sendKeys("1234");
				
				ele = driver.findElement(By.id("dob"));
				ele.clear();
				ele.sendKeys("");

				ele = driver.findElement(By.cssSelector("[type=submit]"));
				ele.submit();
				sleep(1);
				ele = driver.findElement(By.id("name"));
				String status= ele.getText();
				Assert.assertEquals(status, "no dob");
				driver.close();
		}
		@Test
		public void testWrongUsernameCorrectPasswordCorrectDOB() {
				System.setProperty(
						"webdriver.chrome.driver", 
						"C:/Users/guest1/Downloads/chromedriver-win64(2)/chromedriver-win64/chromedriver.exe");
				WebDriver driver = new ChromeDriver();		
				System.out.println("Driver info: " + driver);
				driver.navigate().to(
						"file:///C:/Users/guest1/Desktop/Uni/SIT707/java_projects/task8_1P/pages/login.html");
				sleep(2);
				WebElement ele = driver.findElement(By.id("username"));
				ele.clear();
				ele.sendKeys("abcd");

				ele = driver.findElement(By.id("passwd"));
				ele.clear();
				ele.sendKeys("1234");
				
				ele = driver.findElement(By.id("dob"));
				ele.clear();
				ele.sendKeys("01-02-2000");

				ele = driver.findElement(By.cssSelector("[type=submit]"));
				ele.submit();
				sleep(1);
				ele = driver.findElement(By.id("name"));
				String status= ele.getText();
				Assert.assertEquals(status, "wrong username");
				driver.close();
		}
		@Test
		public void testWrongUsernameWrongPasswordWrongDOB() {
				System.setProperty(
						"webdriver.chrome.driver", 
						"C:/Users/guest1/Downloads/chromedriver-win64(2)/chromedriver-win64/chromedriver.exe");
				WebDriver driver = new ChromeDriver();		
				System.out.println("Driver info: " + driver);
				driver.navigate().to(
						"file:///C:/Users/guest1/Desktop/Uni/SIT707/java_projects/task8_1P/pages/login.html");
				sleep(2);
				WebElement ele = driver.findElement(By.id("username"));
				ele.clear();
				ele.sendKeys("asdf");

				ele = driver.findElement(By.id("passwd"));
				ele.clear();
				ele.sendKeys("asdf");
				
				ele = driver.findElement(By.id("dob"));
				ele.clear();
				ele.sendKeys("01-02-2000");

				ele = driver.findElement(By.cssSelector("[type=submit]"));
				ele.submit();
				sleep(1);
				ele = driver.findElement(By.id("name"));
				String status= ele.getText();
				Assert.assertEquals(status, "wrong username");
				driver.close();
		}
		@Test
		public void testWrongUsernameCorrectPasswordWrongDOB() {
			System.setProperty(
					"webdriver.chrome.driver", 
					"C:/Users/guest1/Downloads/chromedriver-win64(2)/chromedriver-win64/chromedriver.exe");
			WebDriver driver = new ChromeDriver();		
			System.out.println("Driver info: " + driver);
			driver.navigate().to(
					"file:///C:/Users/guest1/Desktop/Uni/SIT707/java_projects/task8_1P/pages/login.html");
			sleep(2);
			WebElement ele = driver.findElement(By.id("username"));
			ele.clear();
			ele.sendKeys("asdf");

			ele = driver.findElement(By.id("passwd"));
			ele.clear();
			ele.sendKeys("asdf");
			
			ele = driver.findElement(By.id("dob"));
			ele.clear();
			ele.sendKeys("03-01-1999");

			ele = driver.findElement(By.cssSelector("[type=submit]"));
			ele.submit();
			sleep(1);
			ele = driver.findElement(By.id("name"));
			String status= ele.getText();
			Assert.assertEquals(status, "wrong username");
			driver.close();
	}
		@Test
		public void testCorrectUsernameWrongPasswordCorrectDOB() {
			System.setProperty(
					"webdriver.chrome.driver", 
					"C:/Users/guest1/Downloads/chromedriver-win64(2)/chromedriver-win64/chromedriver.exe");
			WebDriver driver = new ChromeDriver();		
			System.out.println("Driver info: " + driver);
			driver.navigate().to(
					"file:///C:/Users/guest1/Desktop/Uni/SIT707/java_projects/task8_1P/pages/login.html");
			sleep(2);
			WebElement ele = driver.findElement(By.id("username"));
			ele.clear();
			ele.sendKeys("shreeyut");

			ele = driver.findElement(By.id("passwd"));
			ele.clear();
			ele.sendKeys("asdf");
			
			ele = driver.findElement(By.id("dob"));
			ele.clear();
			ele.sendKeys("01-02-2000");

			ele = driver.findElement(By.cssSelector("[type=submit]"));
			ele.submit();
			sleep(1);
			ele = driver.findElement(By.id("name"));
			String status= ele.getText();
			Assert.assertEquals(status, "wrong password");
			driver.close();
	}
		@Test
		public void testCorrectUsernameWrongPasswordWrongDOB() {
			System.setProperty(
					"webdriver.chrome.driver", 
					"C:/Users/guest1/Downloads/chromedriver-win64(2)/chromedriver-win64/chromedriver.exe");
			WebDriver driver = new ChromeDriver();		
			System.out.println("Driver info: " + driver);
			driver.navigate().to(
					"file:///C:/Users/guest1/Desktop/Uni/SIT707/java_projects/task8_1P/pages/login.html");
			sleep(2);
			WebElement ele = driver.findElement(By.id("username"));
			ele.clear();
			ele.sendKeys("shreeyut");

			ele = driver.findElement(By.id("passwd"));
			ele.clear();
			ele.sendKeys("asdf");
			
			ele = driver.findElement(By.id("dob"));
			ele.clear();
			ele.sendKeys("03-01-1999");

			ele = driver.findElement(By.cssSelector("[type=submit]"));
			ele.submit();
			sleep(1);
			ele = driver.findElement(By.id("name"));
			String status= ele.getText();
			Assert.assertEquals(status, "wrong password");
			driver.close();
	}
		@Test
		public void testCorrectUsernameCorrectPasswordWrongDOB() {
			System.setProperty(
					"webdriver.chrome.driver", 
					"C:/Users/guest1/Downloads/chromedriver-win64(2)/chromedriver-win64/chromedriver.exe");
			WebDriver driver = new ChromeDriver();		
			System.out.println("Driver info: " + driver);
			driver.navigate().to(
					"file:///C:/Users/guest1/Desktop/Uni/SIT707/java_projects/task8_1P/pages/login.html");
			sleep(2);
			WebElement ele = driver.findElement(By.id("username"));
			ele.clear();
			ele.sendKeys("shreeyut");

			ele = driver.findElement(By.id("passwd"));
			ele.clear();
			ele.sendKeys("1234");
			
			ele = driver.findElement(By.id("dob"));
			ele.clear();
			ele.sendKeys("03-01-1999");

			ele = driver.findElement(By.cssSelector("[type=submit]"));
			ele.submit();
			sleep(1);
			ele = driver.findElement(By.id("name"));
			String status= ele.getText();
			Assert.assertEquals(status, "wrong dob");
			driver.close();
	}
}
