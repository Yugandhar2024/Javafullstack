package oop;

/**
 * InstanceVariableDemo - demonstrates instance variables and object state.
 */
public class InstanceVariableDemo {
    private String name;
    private int id;

    public InstanceVariableDemo(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    public static void main(String[] args) {
        InstanceVariableDemo obj = new InstanceVariableDemo("Yugandhar", 101);
        obj.displayDetails();
    }
}
