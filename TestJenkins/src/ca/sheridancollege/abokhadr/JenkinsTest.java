package ca.sheridancollege.abokhadr;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* 
 * ICE7, Winter 2021
 * A class for creating  Selenium tests and creating multiple smoke tests on a local Jenkins.
 * Author: Prof. Liz Dancy, Hoda Abokhadra, 2021
 */

class JenkinsTest {

	static WebDriver browser;// the reference to the browser

	@AfterAll
	public static void closeBrowser() {
		browser.close();// close the browser after we have run all tests
	}

	// Before running the tests we want to set Chrome browser.

	@BeforeAll
	static void setUpDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		browser = new ChromeDriver();
		browser.get("http:localhost:8080");
	}

	// a test for making sure when the browser load the page, it will get Jenkins
	// Sign in page.
	@Disabled
	@Test
	public void testPageLoads() {
		String title = browser.getTitle();
		System.out.println(browser.getTitle());
		assertTrue(title.equals("Sign in [Jenkins]"));

	}

	/*
	 * This method does the signing in using the user credentials, navigating to
	 * home, and navigating to People page and lastly logout.
	 */

	@Test
	public void testLoginGoodCredsShowsDashboard() {
		// 1- look for the element j_username and automatically enter the username.
		WebElement username = browser.findElement(By.name("j_username"));
		username.sendKeys("JenTest");
		// 2- look for the element j_password and automatically enter the password.
		WebElement password = browser.findElement(By.name("j_password"));
		password.sendKeys("test");
		// 3- look for the element Submit and automatically click it.
		WebElement submitKey = browser.findElement(By.name("Submit"));
		submitKey.click();
		// 4- look for the element jenkins-home-link and automatically click it.
		WebElement jenkinsHome = browser.findElement(By.id("jenkins-home-link"));
		jenkinsHome.click();
		// 5- look for the element People and automatically navigating to it's page.
		WebElement selectPeople = browser.findElement(By.linkText("People"));
		selectPeople.click();
		// 6- look for the element log out and automatically click it.
		WebElement logout = browser.findElement(By.linkText("log out"));
		logout.click();

	}

}
