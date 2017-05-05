package app;

import notification.MarketManager;
import pay.PayFactory;
import pay.PayMethod;
import pay.PaymentTransaction;
import shopping.Item;
import shopping.Shopping;
import shoppingCart.Cart;
import user.User;

public class Demo {

	public static void main(String[] args) {
		Shopping shop=new Shopping();
		shop.preset();
		
		Cart cart=new Cart();
		
		cart.buy("001",1,shop);
		cart.buy("005",2,shop);
		cart.buy("008",1,shop);
		cart.buy("006",1,shop);
		cart.buy("010",1,shop);
		cart.buy("011",1,shop);
		
		User user=new User("Magnus Mefisto ","555481328","magnus_mefisto@yahoo.com","password");
		PayFactory payFactory=new PayFactory();
		PayMethod payMethod=payFactory.selectPayMethod("Cash");
		
		
		MarketManager manager = new MarketManager();
		PaymentTransaction paymentTransaction=new PaymentTransaction();
		paymentTransaction.addObserver(manager);
		paymentTransaction.getTotal(payMethod.pay(cart, user));

		shop.addObserver(manager);
		
		System.out.println(cart.list());
		
		paymentTransaction.showTotal();
		shop.addObserver(manager);
		shop.addItem(new Item("020","god of cacho",50));
		

	}

}
