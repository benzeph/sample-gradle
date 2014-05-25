package me.zeph.gradle.sample.controller;

import me.zeph.gradle.sample.model.Register;
import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class RegisterControllerTest {

	public static final String FAKED_USERNAME = "fakedUsername";
	private RegisterController registerController;

	@Before
	public void setUp() throws Exception {
		registerController = new RegisterController();
	}

	@Test
	public void shouldGoToRegisterPage() {
		//when
		String viewName = registerController.view(new Register());

		//then
		assertThat(viewName, is("sample-register"));
	}

	@Test
	public void shouldRegisterUsernameAndPassword() {
		//given
		Register register = new Register();
		register.setUsername(FAKED_USERNAME);
		ExtendedModelMap model = new ExtendedModelMap();

		//when
		registerController.register(model, register);

		//then
		assertThat((String) model.get("username"), is(FAKED_USERNAME));
	}
}
