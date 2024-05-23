package web.service;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyServerTest {
	private void sleep(long sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testNullName() {
		Assert.assertEquals("null username",LoginService.login(null, "1234","2000-02-01" ));
	}
	@Test
	public void testNullPassword() {
		Assert.assertEquals("null password",LoginService.login("shreeyut", null,"2000-02-01" ));
	}
	@Test
	public void testNullDOB() {
		Assert.assertEquals("null dob",LoginService.login("shreeyut", "1234",null ));
	}
	@Test
	public void testEmptyName() {
		Assert.assertEquals("no username",LoginService.login("", "1234","2000-02-01" ));
	}
	@Test
	public void testEmptyPassword() {
		Assert.assertEquals("no password",LoginService.login("shreeyut", "","2000-02-01" ));
	}
	@Test
	public void testEmptyDOB() {
		Assert.assertEquals("no dob",LoginService.login("shreeyut", "1234", "" ));
	}
	@Test
	public void testWrongUsernameCorrectPasswordCorrectDOB() {
		Assert.assertEquals("wrong username",LoginService.login("asdf", "1234", "2000-02-01" ));
	}
	@Test
	public void testWrongUsernameWrongPasswordWrongDOB() {
		Assert.assertEquals("wrong username",LoginService.login("asdf", "asdf", "asdf" ));
	}
	@Test
	public void testWrongUsernameCorrectPasswordWrongDOB() {
		Assert.assertEquals("wrong username",LoginService.login("asdf", "1234", "asdf" ));
}
	@Test
	public void testCorrectUsernameWrongPasswordCorrectDOB() {
		Assert.assertEquals("wrong password",LoginService.login("shreeyut", "asdf", "2000-02-01" ));
}
	@Test
	public void testCorrectUsernameWrongPasswordWrongDOB() {
		Assert.assertEquals("wrong password",LoginService.login("shreeyut", "asdf", "asdf" ));
}
	@Test
	public void testCorrectUsernameCorrectPasswordWrongDOB() {
		Assert.assertEquals("wrong dob",LoginService.login("shreeyut", "1234", "asdf" ));
}
	@Test
	public void testCorrectUsernameCorrectPasswordCorrectDOB() {
		Assert.assertEquals("success",LoginService.login("shreeyut", "1234", "2000-02-01" ));
}
}
