package ejm.chapter07.item43;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddressBook {

	private List<Address> addresses = new ArrayList<>();

	public List<Address> getAddresses() {
		if (addresses.isEmpty()) {
			return Collections.emptyList();
		}

		return new ArrayList<>(addresses);
	}

	public void addAddress(Address address) {
		addresses.add(new Address(address.getCity()));
	}

}
