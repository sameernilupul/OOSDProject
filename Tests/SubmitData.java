package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SubmitData {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://localhost:8080/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testSubmitData() throws Exception {
		driver.get(baseUrl + "/WebApplication/EnterDetails/EnterDetails.jsp");
		driver.findElement(By.name("locationID")).clear();
		driver.findElement(By.name("locationID")).sendKeys("122345");
		driver.findElement(By.name("name")).clear();
		driver.findElement(By.name("name")).sendKeys("sameernilupul");
		driver.findElement(By.name("CO2_concentration")).clear();
		driver.findElement(By.name("CO2_concentration")).sendKeys("1234");
		driver.findElement(By.name("O2_concentration")).clear();
		driver.findElement(By.name("O2_concentration")).sendKeys("123");
		driver.findElement(By.name("dustLevel")).clear();
		driver.findElement(By.name("dustLevel")).sendKeys("234");
		driver.findElement(By.name("airQualityLevel")).clear();
		driver.findElement(By.name("airQualityLevel")).sendKeys("123");
		driver.findElement(By.name("percentage")).clear();
		driver.findElement(By.name("percentage")).sendKeys("234");
		driver.findElement(By.name("waterQualityIndex")).clear();
		driver.findElement(By.name("waterQualityIndex")).sendKeys("234");
		driver.findElement(By.name("populationDensity")).clear();
		driver.findElement(By.name("populationDensity")).sendKeys("124");
		driver.findElement(By.name("greenPercentage")).clear();
		driver.findElement(By.name("greenPercentage")).sendKeys("324");
		driver.findElement(By.name("building")).clear();
		driver.findElement(By.name("building")).sendKeys("24");
		driver.findElement(By.name("submit")).click();
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
}
