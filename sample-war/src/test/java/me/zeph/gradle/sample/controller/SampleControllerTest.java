package me.zeph.gradle.sample.controller;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SampleControllerTest {

	@Test
	public void shouldGoToSamplePage() {
		//given
		SampleController sampleController = new SampleController();

		//when
		String viewName = sampleController.view();

		//then
		assertThat(viewName, is("sample-index"));
	}
}
