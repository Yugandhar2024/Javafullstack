package Day1;

public class Emp { //Using the parameterisized Constructor.
	String name;
	double salary;
	Emp(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	public static void main(String[] args) {
		Emp e1=new Emp("Raja",50000);
		System.out.println(e1.name);
		System.out.println(e1.salary);		
	}
}
/*Expected Output:
Raja
50000.0
*/

