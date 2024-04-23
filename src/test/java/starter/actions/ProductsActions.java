package starter.actions;

import org.openqa.selenium.By;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;

public class ProductsActions extends PageObject {
	//
	@Step("Adding item to cart")
	public void addToCart(String item) {
		//
		String str= "//div[contains(text(),'"+item+"')]/following::button[1]";
		$(By.xpath(str)).click();
		System.out.println("clicked"+ item);
	}
	@Step("Getting Cart Count")
	public String getCartCount() {
		return $(".fa-layers-counter").getText();
	}
	public void moveToCart() {
		// 
		$(".shopping_cart_link").click();
		
	}
}
