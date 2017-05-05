package shoppingCart;

import java.util.ArrayList;

import shopping.Item;
import shopping.Shopping;
import shopping.Shopping;

public class Cart {
	private ArrayList<Item> items= new ArrayList<Item>();
	
	public void buy(String id,int cant,Shopping shopping){
		Item item=new Item();
		item= shopping.searchItem(id);
		if (item != null){
			item.setCuantity(cant);
			items.add(item);
			
		}
	}
	
	public double getTotal(){
		double total = 0;
		for (Item item : items) {
			total=total+ item.getPrice()*item.getCuantity();
		}
		return total;
	}
	
	public double getCheapestPrice(){
		double cheapest=(items.get(0)).getPrice();
		for (Item item : items) {
			double itemPrice=item.getPrice();
			if(itemPrice<cheapest){
				cheapest=itemPrice;			}						
			
		}
		return cheapest;
	}
	
	public double getMostExpensivePrice(){
		double expensive=(items.get(0)).getPrice();
		for (Item item : items) {
			double itemPrice=item.getPrice();
			if(itemPrice>expensive){
				expensive=itemPrice;			}						
			
		}
		return expensive;
	}
	
	public void add(Item item){
		items.add(item);
	}
		
	
	
	public String list(){
		String list="";
		for (Item item : items) {
			list=list + "*" +item.toString()+"\n";
		}
		return list;
	}
	
	

}
