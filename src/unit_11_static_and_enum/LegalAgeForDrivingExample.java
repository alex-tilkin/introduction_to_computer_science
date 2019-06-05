package unit_11_static_and_enum;

public class LegalAgeForDrivingExample {

	public static void main(String[] args) {
		Person avi = new Person("Avi", 20);
		Person shani = new Person("Shani", 16);
		
		System.out.println(avi.getName() + " is" + (avi.isLegalForDriving() ? "" : " not") + " eligable for driving");
		System.out.println(shani.getName() + " is" + (shani.isLegalForDriving() ? "" : " not") + " eligable for driving");

		shani.setMinAgeForlicense(21);
		
		System.out.println(avi.getName() + " is" + (avi.isLegalForDriving() ? "" : " not") + " eligable for driving");
		System.out.println(shani.getName() + " is" + (shani.isLegalForDriving() ? "" : " not") + " eligable for driving");
		
		System.out.println("There are totally " + Person.getNumberOfPeople() + " people");
	}
}