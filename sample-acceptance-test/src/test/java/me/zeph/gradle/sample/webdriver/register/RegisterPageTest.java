package me.zeph.gradle.sample.webdriver.register;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfAllElementsLocatedBy;

public class RegisterPageTest {

	public static final String URL = "http://localhost:8080/sample-war/index";
	private RegisterPage page = new RegisterPage();

	@After
	public void tearDown() {
		page.quit();
	}

	@Test
	public void shouldRegisterUserSuccess() {
		//given
		page.goToPage(URL);

		//when
		page.findLinkAndClick("registerLink");
		page.registerUsernameAndPassword("benwei", "123456");

		//then
		page.waitUntil(presenceOfAllElementsLocatedBy(By.id("welcome")));
		assertThat(page.findElement(By.id("welcome")).getText(), is("Welcome, benwei"));
	}

}
