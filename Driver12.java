public class A {
	static int a=10;
	int b=20;
	public static void demo1() {
		System.out.println("SM from A");
	}
	public void demo2() {
		System.out.println("NSM from A");
	}
}
public class B extends A{
	static int c=30;
	int d=40;
	public static void demo3() {
		System.out.println("SM from B");
	}
	public void demo4() {
		System.out.println("NSM from B");
	}
}
public class Driver12 {
	public static void main(String[] args) { //Inheritance with respective static members.
		B obj=new B();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.demo1();
		obj.demo2();
		System.out.println(obj.c);
		System.out.println(obj.d);
		obj.demo3();
		obj.demo4();
		A obj1=new A();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		obj1.demo1();
		obj1.demo2();
	//	System.out.println(obj1.c); cte because the c is in b class 
	//	obj1.demo3(); CTE because the demo3() is present the B class so the inheritance not possible from base to parent class 
	//Inheritance possible from supermost class to parent class to child class 
		}
}
/*Expected Output:
10
20
SM from A
NSM from A
30
40
SM from B
NSM from B
10
20
SM from A
NSM from A
*/
