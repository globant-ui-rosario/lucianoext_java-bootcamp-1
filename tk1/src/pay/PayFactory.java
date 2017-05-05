package pay;

public class PayFactory {
	public PayMethod selectPayMethod(String payMethod){
		switch (payMethod) {
		case "CreditCard":return new CreditCard();
		case "Cash":return new Cash();
		case "Paypal":return new Paypal();
		
		

		default: return null;
			
		}
	}

}
