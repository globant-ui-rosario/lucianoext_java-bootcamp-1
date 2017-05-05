package notification;

public interface MarketSubject {
	public void addObserver( MarketObserver marketObserver);
	public void removeObserver( MarketObserver marketObserver);
	public void doNotify();
	

}
