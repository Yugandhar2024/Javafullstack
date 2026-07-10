public class Jspiders {
	int a=10;
	static {
		System.out.println("From SIB");
	}
	{
		System.out.println("From IIB");
	}
	Jspiders(){
		System.out.println("From the Jspiders() Constructor");
	}
	public static void main(String[] args) {
		System.out.println("Main Starts");
		Jspiders j1=new Jspiders();
		Jspiders j2=new Jspiders();
		System.out.println(j1.a);
		System.out.println(j2.a);
		System.out.println("Main Ends");
		
	}
}
/*Expected Output:
From SIB
Main Starts
From IIB
From the Jspiders() Constructor
From IIB
From the Jspiders() Constructor
10
10
Main Ends

*/
