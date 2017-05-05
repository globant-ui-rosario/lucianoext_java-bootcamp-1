package pay;

import java.util.ArrayList;

import shopping.Item;
import shoppingCart.Cart;
import user.User;

public class CreditCard extends PayMethod {
	private String name;
	private String number;
	private static double discount=0.9;	
	
	public double pay(Cart cart,User user) {
		name=user.getName();
		number=user.getCreditCardNumber();
		return (cart.getTotal()*discount);
	}
	
	

}
