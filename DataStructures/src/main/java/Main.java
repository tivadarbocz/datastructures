import datastructures.Stack;

/**
 * Created by Tivadar Bocz on 2016.08.25..
 */
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        System.out.println("Is stack empty? " + stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(5);
        stack.printOutElements();
        System.out.println("Is stack empty? " + stack.isEmpty());
        stack.pop();
        stack.printOutElements();
        System.out.println("Is stack empty? " + stack.isEmpty());

    }
}
