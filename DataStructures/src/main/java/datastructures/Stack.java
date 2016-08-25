package datastructures;

import java.util.Arrays;

/**
 * Created by Admin on 2016.08.25..
 */
public class Stack<T>/* implements  IStack*/ {

    private T[] elements;

    public Stack() {
        elements = (T[]) new Object[0];
    }

    public T pop() {
        if (isEmpty()) {
            throw new NullPointerException("Stack is empty!");
        } else {
            T result = elements[elements.length - 1];
            elements = Arrays.copyOf(elements, elements.length - 1);
            return result;
        }
    }

    public void push(T t) {
        elements = Arrays.copyOf(elements, elements.length + 1);
        elements[elements.length - 1] = t;
    }


    public boolean isEmpty() {
        return elements.length < 1 ? true : false;
    }

    public void printOutElements() {

        System.out.println("-----");
        for (int i = elements.length - 1; i >= 0; --i) {
            System.out.println("| " + elements[i] + " |");
        }
        System.out.println("-----");
    }
}