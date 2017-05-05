package pay;

import shoppingCart.Cart;
import user.User;

public class Cash extends PayMethod{
	private static double discount=0.10;

	@Override
	public double pay(Cart cart,User user) {
		return cart.getTotal() - (cart.getMostExpensivePrice()*0.9);
	}
	

}
