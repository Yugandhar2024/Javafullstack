package oop;

/**
 * MethodDemo - demonstrates method definition and calling.
 */
public class MethodDemo {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        greet("Java Learner");
        System.out.println("Sum = " + add(10, 20));
    }
}
