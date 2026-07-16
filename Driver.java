public class Engine {
	int milage;
	String model;
	Engine(int milage,String model){
		this.milage=milage;
		this.model=model;
	}
	public void printDetails() {
		System.out.println("Milage : "+milage+" , Model : "+model);
	}
}
public class Car {
	String brand;
	double price;
	Engine e;
	Car(String brand,double price,Engine e){
		this.brand=brand;
		this.price=price;
		this.e=e;
	}
	public void printDetails() {
		System.out.println("Brand : "+brand+" , Price : "+price);
	}
}
public class Driver {
	public static void main(String[] args) {
		Car c=new Car("Tata",300,new Engine(40,"Wired"));
		c.e.printDetails();
		c.printDetails();
	}
}
/*Expected Output:
Milage : 40 , Model : Wired
Brand : Tata , Price : 300.0
*/
