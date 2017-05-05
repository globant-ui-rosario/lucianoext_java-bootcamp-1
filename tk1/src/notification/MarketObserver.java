package notification;

public interface MarketObserver {
	public void doUpdatePrice(double price, String name);

	public void doUpdateNewItem(String name);

	public void doUpdatePaymentTransaction(int counter);

}
