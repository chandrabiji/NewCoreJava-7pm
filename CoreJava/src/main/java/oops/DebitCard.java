package oops;
//Encapsulation = Data Hiding + Data Abstraction
public class DebitCard {
	
	//Data Hiding 
	private int pinNumber;
	
	
	//Data Abstraction
	public int getPinNumber() {
		return pinNumber;
	}


	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	public static void main(String[] args) {
		DebitCard visaCard = new DebitCard();
		visaCard.setPinNumber(1234);
		System.out.println("Your Pin Number : "+visaCard.getPinNumber());
	}

}
