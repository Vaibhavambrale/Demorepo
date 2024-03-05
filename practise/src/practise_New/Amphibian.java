package practise_New;

public class Amphibian extends Animal {

	public void Mother() {
		System.out.println("I am the mother");
	}
	public void Father() {
		System.out.println("I am the father");
	}
	public static void main(String[] args) {
	Animal b = new Amphibian();
	b.Father1();
	b.Mother();
	b.Father2();
	
}
}