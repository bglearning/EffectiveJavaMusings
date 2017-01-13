package ejm.chapter02.item06;

import java.util.Arrays;

public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0) 
            throw new IllegalStateException();

        Object result = elements[--size];
        elements[size] = null;
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size) 
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push("World");
        s.push("Hello");

        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
