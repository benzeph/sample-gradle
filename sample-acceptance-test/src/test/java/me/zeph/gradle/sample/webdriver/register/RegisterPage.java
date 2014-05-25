package me.zeph.gradle.sample.webdriver.register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class RegisterPage extends Page {

	public static final String USERNAME = "username";
	public static final String PASSWORD = "password";
	public static final String SUBMIT = "submit";

	public void registerUsernameAndPassword(String username, String password) {
		wait.until(elementToBeClickable(By.id(SUBMIT)));
		driver.findElement(By.id(USERNAME)).sendKeys(username);
		driver.findElement(By.id(PASSWORD)).sendKeys(password);
		driver.findElement(By.id(SUBMIT)).click();
	}

	public void findLinkAndClick(String link) {
		wait.until(elementToBeClickable(By.id(link)));
		driver.findElement(By.id(link)).click();
	}

	public void goToPage(String url) {
		driver.get(url);
	}

	public boolean waitUntil(ExpectedCondition<List<WebElement>> expectedCondition) {
		return wait.until(expectedCondition).isEmpty();
	}

	public WebElement findElement(By by) {
		return driver.findElement(by);
	}

	public void quit() {
		driver.quit();
	}
}
