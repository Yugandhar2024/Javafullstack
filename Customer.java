public class Cap {
	String color;
	int height;
	Cap(String color,int height){
		this.color=color;
		this.height=height;
	}
	public static void open() {
		System.out.println("Cap is Opened");
	}
	public static void close() {
		System.out.println("Cap is Closed");
	}
	public void display() {
		System.out.println("Color: "+color+",Height: "+height);
	}
}
public class Pen {
	String brand;
	double cost;
	Cap c;
	Pen(String brand,double cost,Cap c){
		this.brand=brand;
		this.cost=cost;
		this.c=c;
	}
	public void write() {
		System.out.println("Started Writing");
	}
	public void display() {
		System.out.println("Brand: "+brand+", Cost: "+cost);
	}
}
public class Customer {
	public static void main(String[] args) {
		Pen p=new Pen("Hauser",10,new Cap("Blue",3));
		p.c.open();
		p.write();
		p.c.close();
		p.c.display();
		p.display();			
}
}
/*Expected Output:
Cap is Opened
Started Writing
Cap is Closed
Color: Blue,Height: 3
Brand: Hauser, Cost: 10.0
*/
