/*
public class Basics
{ 
// Method signature: public String greet(String name)
public String greet(String name) 
{ 
return "WELCOME TO " + name + "!";
}
public static void main(String[] args) 
{
MyClass obj = new MyClass();
String message = obj.greet("MY WORLD"); 
System.out.println(message);
}
}
*/

/*
public class Basics
{
public static void main(String[] args) 
{
System.out.println("Ravikumar");
}
}
*/
/* 
//This is a documentation comment.
public class Basics
{
public static void main(String[] args) 
{
// This is a single-line comment.
System.out.println("Believe yourself");
//This is a multi-line comment.
System.out.println("Welcome to My World");
}
}
*/
/*
public class Basics //Data Types
{
public static void main(String[] args) 
{
int myInt = 10;
boolean myBoolean = true;
char myChar = 'A';
float myFloat = 10.5f;
double myDouble = 20.75;
System.out.println("Integer: " + myInt);
System.out.println("Boolean: " + myBoolean);
System.out.println("Character: " + myChar);
System.out.println("Float: " + myFloat);
System.out.println("Double: " + myDouble);
}
}
*/
/*
public class Basics {
    // Global variable (class-level variable)
    static String name = "Global Name";

    public static void main(String[] args) {
        // Local variable (method-level variable)
        String name = "Local Name";

        System.out.println("Value of local variable 'name': " + name);
        System.out.println("Value of global variable 'name': " + VariableScope.name);
    }
}*/
public class Basics{

    // Function to print a name
    public static void printMyName(String myName) {
        System.out.println("My name is: " + myName);
    }

    public static void main(String[] args) {
        // Calling the function from the main method
        printMyName("Yugandhar"); 
    }
}
