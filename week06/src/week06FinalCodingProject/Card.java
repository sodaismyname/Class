package week06FinalCodingProject;

public class Card {

	 int value;
	 String name;
	
	public Card(String name, int value){
		 this.name = name;
		 this.value = value;
	}
	
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void describe() {
		System.out.println(this.name + " vale of: " + this.value + "\n");
	}
}
