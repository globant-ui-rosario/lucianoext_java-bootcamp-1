package shopping;
import notification.MarketSubject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import notification.MarketObserver;;
public class Item implements MarketSubject {
	protected String id;
	protected String name;
	protected double price;
	protected int cuantity;
	
	private ArrayList<MarketObserver> marketObservers;
	
	public Item(String id, String name, double price){
		this.id=id;
		this.name=name;
		this.price=price;		
		marketObservers= new ArrayList<MarketObserver>();
	
	}

	public Item(){
		id=null;
		name=null;
		price=0;
		cuantity=0;
	}
	
	
	
	
	public int getCuantity() {
		return cuantity;
	}



	public void setCuantity(int cant) {
		this.cuantity = cant;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		doNotify();
	}

	@Override
	public String toString() {
		return ("item: "+ name + "..." + " $" + price);
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
			marketObserver.doUpdatePrice(price, name);
		}
	}
	


	
	
	

}
