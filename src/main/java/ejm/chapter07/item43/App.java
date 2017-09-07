package ejm.chapter07.item43;

public class App {

	public static void main(String[] args) {

		AddressBook book = new AddressBook();

		System.out.println("Initially...");

		for (Address address : book.getAddresses()) {
			System.out.println(address.getCity());
		}

		book.addAddress(new Address("Kathmandu"));

		System.out.println("After insertion...");
		for (Address address : book.getAddresses()) {
			System.out.println(address.getCity());
		}

	}

}
