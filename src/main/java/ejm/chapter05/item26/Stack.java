package ejm.chapter05.item26;

public class Stack<E> {

	private E[] elements;

	private int size = 0;

	private static final int MAX_CAPACITY = 100;

	// The elements array will only contain element E
	// from push(E).
	@SuppressWarnings("unchecked")
	public Stack() {
		elements = (E[]) new Object[MAX_CAPACITY];
	}

	public void push(E e) {
		if (size >= MAX_CAPACITY)
			throw new IllegalStateException("Stack Full");
		elements[size++] = e;
	}

	public E pop() {
		if (size <= 0)
			throw new IllegalStateException("Stack Empty");
		E result = elements[--size];
		elements[size] = null;
		return result;
	}

	public int size() {
		return size;
	}

}
