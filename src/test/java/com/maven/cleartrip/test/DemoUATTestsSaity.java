package com.maven.cleartrip.test;

import com.maven.cleartrip.framework.BaseTest;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoUATTestsSaity extends BaseTest {

	@Severity(SeverityLevel.NORMAL)
	@Link("https://example.org")
	@Test(priority = 0, description="Verify the Home page link for sanity")
	public void CheckHomeLinkTextSanity() {
		String home_link_text = this
				.openBrowser()
				.openManageApp()
				.getHomeLinkText();
		Assert.assertEquals(home_link_text,"Home");

	}

}
