package shopping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import notification.MarketObserver;
import notification.MarketSubject;
import shoppingCart.Cart;

public class Shopping implements MarketSubject{
	
	private ArrayList<Item> stock=new ArrayList<Item>();
	private Item newItem=new Item();
	private ArrayList<MarketObserver> marketObservers;
	
	public Shopping(){
		marketObservers= new ArrayList<MarketObserver>();
		
	}
	
	public void preset(){
		
		//creating items
		Item i1=new Item("001","ps4",200);
		Item i2=new Item("002","xbox one",200);
		Item i3=new Item("003","nitendo switch",299);
		Item i4=new Item("004","sega",20);
		Item i5=new Item("005","gamepad sony",60);
		Item i6=new Item("006","Rise of the Tomb Raider ps4",60);
		Item i7=new Item("007","Rise of the Tomb Raider xbox one",60);
		Item i8=new Item("008","Mass Effect Andromeda ps4",60);
		Item i9=new Item("009","Mass Effect Andromeda xbox one",60);
		Item i10=new Item("010","Star wars knights of the old republic pc",10);
		
		//creating an offer
		Cart items1= new Cart();
		items1.add(i7);
		items1.add(i2);
		Offer offer1=new Offer("011", "Lara Croft Pack", 220, items1);
		
		
		//creating original stock
		stock.add(i1);
		stock.add(i2);
		stock.add(i3);
		stock.add(i4);
		stock.add(i5);
		stock.add(i6);
		stock.add(i7);
		stock.add(i8);
		stock.add(i9);
		stock.add(i10);
		stock.add(offer1);
	}

	public Item searchItem(String id) {
		for (Item item : stock) {
			if (item.getId().equalsIgnoreCase(id)){
				return item;
			}						
		}
		System.out.println("error 404 item not found");
		return null;
	}
	
	public void addItem(Item item){
		stock.add(item);
		newItem=item;
		doNotify();
		
	}
	
	
	//notification
	
	public void addObserver(MarketObserver marketObserver) {
		marketObservers.add(marketObserver);
	}

	
	public void removeObserver(MarketObserver marketObserver) {
		marketObservers.remove(marketObserver);
	}

	
	public void doNotify() {
		for (MarketObserver marketObserver : marketObservers) {
			marketObserver.doUpdateNewItem(newItem.getName());
		}
	}
	
	



}
