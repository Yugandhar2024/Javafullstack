package demo;

/*public class A { //Taking an object reference variable as global static in same class.
	static A obj=new A();
	int a=10;
	public static void main(String[] args) {
		A obj=new A();
		System.out.println(obj);
		System.out.println(A.obj.a);
		System.out.println(A.obj);
	}
}*/
/*Expected Output:
 demo.A1@6f539caf
 10
 demo.A1@79fc0f2f
 */
/*public class A { //Taking an obj reference variable as non-static in same class.
	A obj=new A();//Non-static as obj reference.
	int a=10;
	public static void main(String[] args) {
		A obj=new A();
	}
}*/
/*Expected Output:
StackOverflowError at runtime error
*/
/*
class A1{ //Taking an object reference variable as global static inside another class.
	static int n=100;
	int a=10;
}
class A{
	static A1 obj=new A1(); //obj reference vari as global static in another class.
	int b=20;
	public static void main(String[] args) {
		A1 obj=new A1();
		System.out.println(obj);
		System.out.println(A.obj);
		System.out.println(A.obj.a);
		System.out.println(A.obj.n);
		System.out.println(obj.a);
		System.out.println(obj.n);
		A.obj.n=1000;
		System.out.println(obj.n);
	}
	
}
*/
/*Expected output:
demo.A1@6f539caf
demo.A1@79fc0f2f
10
100
10
100
1000
*/
/*
class A1 { //Taking an obj reference variable as non-static in another class.
	static int n=100;
	int a=10;
}
class A{
	A1 obj=new A1();//non_static variable as obj reference in another class.
	int b=20;
	public static void main(String[] args) {
		A1 obj=new A1();
		System.out.println(A1.n);
		System.out.println(obj.n);
	}
}
*/
/*Expected Output:
100
100
*/
class B{ //accessing global static var by taking obj reference of another class and obj reference of same class in main method.
	static int n=100;//global static variable.
	int a=10;
}
class A{
	B obj=new B();//obj reference of first class.
	int b=20;
	public static void main(String[] args) {
		A obj=new A();//obj reference of second class.
		System.out.println(obj.obj.n);//Accessing variable by both object references.
	}
}
/*Expected Output:
100
*/
