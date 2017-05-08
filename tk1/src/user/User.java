package user;

public class User {
	private String name, CreditCardNumber ,email,psw ;
	
	public User(String name,String CreditCardNumber,String email,String psw){
		this.name=name;
		this.CreditCardNumber=CreditCardNumber;
		this.email=email;
		this.psw=psw;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreditCardNumber() {
		return CreditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		CreditCardNumber = creditCardNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	
}
