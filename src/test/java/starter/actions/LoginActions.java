package starter.actions;

import net.serenitybdd.core.pages.PageObject;

public class LoginActions extends PageObject {
	//
	public void asValidUser(String username, String password) {
		$("#user-name").sendKeys(username);
		$("#password").sendKeys(password);
		$("#login-button").click();
	}
	
}
