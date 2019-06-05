package unit_09_constructors_and_this;

public class SimpleThisExample {

	public static void main(String[] args) {
		Car bmw = new Car("BMW", 2018, 5);
		Car audi = new Car("Audi", 2018, 5);
		
		bmw.setColor("White");
		audi.setColor("Black");
	}
}