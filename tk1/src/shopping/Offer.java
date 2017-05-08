package shopping;



import shoppingCart.Cart;


public class Offer extends Item{

	private Cart items;
	public Offer(String id,String name,double price,Cart items){
		this.id=id;
		this.name=name;
		this.price=price;
		this.items=items;
	}
	@Override
	public String toString() {
		return ("offer= " + name + " Price: " + price + "\n" +items.list()+ "\n");
		
	}	
	

	
	
}
