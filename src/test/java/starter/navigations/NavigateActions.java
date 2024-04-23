package starter.navigations;

import net.serenitybdd.core.steps.UIInteractions;


public class NavigateActions extends UIInteractions {
	//
	public void toLoginPage() {
		openUrl("https://www.saucedemo.com/v1/index.html");
	}
}
