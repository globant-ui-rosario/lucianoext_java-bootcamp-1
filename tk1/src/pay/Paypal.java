package pay;

import shoppingCart.Cart;
import user.User;

public class Paypal extends PayMethod{	
	private String email,psw;

	@Override
	public double pay(Cart cart,User user) {
		email=user.getEmail();
		psw=user.getPsw();
		return (cart.getTotal()-cart.getCheapestPrice());
	}

}
