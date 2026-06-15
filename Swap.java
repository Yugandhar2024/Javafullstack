class Swap
{
public static void main(String[] args)
{
	int a=10;
	int b=20;
	int c=a;
	a=b;
	b=c;
	System.out.println(a);
	System.out.println(b);
	System.out.println("Swapping without using extra variable");
	int d=10;
	int e=20;
	d=d+e;
	e=d-e;
	d=d-e;
	System.out.println(d);
	System.out.println(e);	
}
}
