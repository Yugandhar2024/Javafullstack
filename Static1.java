/*2static,instance,static methods */
/*class Static1
{
int a=10,b=20;
public void add()
{
System.out.println(a+b);
}
public int sub()
{
return (a-b);
}
public void mul(int a,int b)
{
System.out.println(a*b);
}
public int div(int a,int b)
{
return (a/b);
}
public static void main(String[] ards)
{
int a=20,b=20;
Methods m=new Methods();
m.add();
System.out.println(m.sub());
m.mul(a,b);
System.out.println(m.div(a,b));
}
}*/
/*We cannt access instance variable in static method*/
/*
class Static1
{
int a=9;
static
{
System.out.println("We cannt access instance variable in static method");
}
static void demo(int x)
{
System.out.println(x);
}
public static void main(String[] args)
{
Static1 is=new Static1();
int y=is.a;
is.demo(y);
}
}*/
/*
class Static1
{
static int a=11,b=37;
int x=9,y=7;
public static void main(String[] args)
{
Static1 st=new Static1();
System.out.println("Accessing static variables in main "+a);
System.out.println("Accessing static variables in main "+b);
System.out.println("Accessing instance variables in main "+st.x);
System.out.println("Accessing instance variables in main "+st.y);
}
}*/
/*
class Static1
{
static void stmethod()
{
System.out.println("It is an static method");
}
void instmethod()
{
System.out.println("Calling staticMethodsInInstanceMethods");
stmethod();
}
public static void main(String[] args)
{
Static1 si=new Static1();
si.instmethod();
	}
}
*/
/*
class Static1
{
	static int a;
	static void static1(int a)
	{
		System.out.println("Its an Static method ");
		System.out.println(a);
		Static1 ob=new InStatic1();
		ob.instance1();
		
	}
	void instance1()
	{
		System.out.println("Its an Instance method");
		// static1(a);
	}
	public static void main(String[] args)
	{
		Static1 in=new Static1();
		in.instance1();
	}
}
*/
/*access static variable in instance method directly */
/*
class Static1
{
	static int a=9;
	void demo()
	{
		System.out.println("We can access static variable in instance method directly "+a);
	}
	public static void main(String[] args)
	{
		Static1 is=new Static1();
		//int y=is.a;
		is.demo();
	}
}*/
/*Its an Instance method*/
/*
class Static1
{
	static int a;
	static void static1(int a)
	{
		System.out.println("Its an Static method ");
		System.out.println(a);
		Static1 ob=new Static1();
		ob.instance1();
		
	}
	void instance1()
	{
		System.out.println("Its an Instance method");
		// static1(a);
	}
	public static void main(String[] args)
	{
		Static1 in=new Static1();
		in.instance1();
		/*int a=0;
		in.static1(a);
		*/
	}
}*/

		
		
		
		
