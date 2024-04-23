package starter.actions;

import java.util.List;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartActions extends PageObject{
	//
	public double calculateTotalPrice() {
		//
		double totalPrice=0.0;
		List<WebElementFacade> quantities= findAll(".cart_quantity");
		List<Integer> quantityList;
		for (WebElementFacade quantity : quantities) {
			String qty = (quantity.getText()
					
			quantityList.add(qty)
		}
		return totalPrice;
	}
}
