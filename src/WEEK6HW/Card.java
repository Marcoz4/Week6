package WEEK6HW;

public class Card {
	private int value; // the card's value 
	private String name; // the card's name
	
	//Created a constructor to create new card
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	//Getter
	public int getValue() {
		return value;
	}

	//Setter
	public void setValue(int value) {
		this.value = value;
	}
	
	// Getter for name 
	public String getName() { 
		return name; 
	} 
	// Setter for name 
	public void setName(String name) { 
		this.name = name; 
	} 
	// Method to describe the card 
	public void describe() { 
		System.out.println(name + " (value: " + value + ")"); 
	}
}
