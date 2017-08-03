package ejm.chapter05.item28;

import java.util.ArrayList;
import java.util.List;

public class GroupCollection<E> {

	private List<E> items = new ArrayList<>();

	// Producer Extends
	public void putAll(List<? extends E> incomingItems) {
		for (E item : incomingItems) {
			items.add(item);
		}
	}

	// Consumer Super
	public void popAll(List<? super E> outgoingItems) {
		for (E item : items) {
			outgoingItems.add(item);
		}
	}

}
