package ejm.chapter03.item11;

import java.util.Arrays;

public class Stack implements Cloneable {
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

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (elements.length == size) 
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    @Override
    public Stack clone() {
        try {
            Stack result = (Stack) super.clone();
            result.elements = elements.clone();
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push("World");
        s.push("Hello");

        Stack sCopy = s.clone();

        while (!s.isEmpty()) 
            System.out.println(s.pop());

        while (!sCopy.isEmpty()) 
            System.out.println(sCopy.pop());

    }
}
