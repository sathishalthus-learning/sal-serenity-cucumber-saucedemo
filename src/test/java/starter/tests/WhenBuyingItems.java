package starter.tests;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Steps;
import starter.actions.CartActions;
import starter.actions.LoginActions;
import starter.actions.ProductsActions;
import starter.navigations.NavigateActions;

public class WhenBuyingItems {

	@Steps
	NavigateActions navigate;

	@Steps
	LoginActions login;

	@Steps
	ProductsActions product;
	
	@Steps
	CartActions cart;

	//
	@Given("buyer navigated to login page")
	public void buyer_navigated_to_login_page() {
		//
		navigate.toLoginPage();
	}

	@Given("logging in with {string} and {string}")
	public void logging_in_with_and(String username, String password) {
		//
		login.asValidUser(username, password);
	}

	@When("adding an items")
	public void adding_an_item(DataTable dataTable) {
		//
		List<String> items = dataTable.asList();
		for (String item : items) {
			product.addToCart(item);
		}
	}

	@Then("verify the cart qty")
	public void verify_the_cart_qty() {
		//
		System.out.println(product.getCartCount());
		product.moveToCart();
		System.out.println(cart.calculateTotalPrice());
		
		
	}

	@Then("completes the purchase")
	public void completes_the_purchase() {
		//
		System.out.println("complete purchase");
	}

}
