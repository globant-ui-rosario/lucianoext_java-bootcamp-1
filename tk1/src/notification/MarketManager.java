package notification;

public class MarketManager implements MarketObserver{

	@Override
	public void doUpdatePrice(double price,String name) {
		System.out.println("the Market Manager has been notified that the new price for " + name +" is " + price);
		
	}

	@Override
	public void doUpdateNewItem(String name) {
		System.out.println("the Market Manager has been notified that " +name +" has been added to stock");		
	}

	@Override
	public void doUpdatePaymentTransaction(int counter) {
		System.out.println("the Market Manager has been notified that the transacction number:" +counter +" was made");
		
		
	}

}
