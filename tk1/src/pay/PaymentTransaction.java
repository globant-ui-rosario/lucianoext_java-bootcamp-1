package pay;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import notification.MarketObserver;
import notification.MarketSubject;

public class PaymentTransaction implements MarketSubject{
	private static int counter=0;
	private double total;	
	List<MarketObserver> marketObservers;
	
	public PaymentTransaction(){
		counter++;
		marketObservers= new ArrayList<MarketObserver>();
		
	}
	
	public void getTotal(double total){
		this.total=total;
		doNotify();
	}
	
	public void showTotal(){
		System.out.println("total with discount: " + total);
	}

	
	//notification
	
	
	public void addObserver(MarketObserver marketObserver) {
		marketObservers.add(marketObserver);
	}

	@Override
	public void removeObserver(MarketObserver marketObserver) {
		marketObservers.remove(marketObserver);
	}

	@Override
	public void doNotify() {
		for (MarketObserver marketObserver : marketObservers) {
			marketObserver.doUpdatePaymentTransaction(counter);
			
		}
	}
	
	
	

}
