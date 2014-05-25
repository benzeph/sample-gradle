package me.zeph.gradle.sample.webdriver.register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
	protected WebDriver driver = new FirefoxDriver();
	protected WebDriverWait wait = new WebDriverWait(driver, 10);
}
