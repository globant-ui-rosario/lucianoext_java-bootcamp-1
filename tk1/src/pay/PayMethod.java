package pay;

import java.util.ArrayList;

import shoppingCart.Cart;
import user.User;

public abstract class PayMethod {
	public abstract double pay(Cart cart,User user);
	
		
}
