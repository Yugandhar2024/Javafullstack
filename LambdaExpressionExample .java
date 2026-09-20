/*
package comparator;

public class Product {
	String name;
	double cost,quantity,rating,offer;
	public Product(String name, double cost, double quantity, double rating, double offer) {
		super();
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
		this.rating = rating;
		this.offer = offer;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", cost=" + cost + ", quantity=" + quantity + ", rating=" + rating + ", offer="
				+ offer + "]\n";
	}
	
}
//It is business logic class
*/
package comparator;
import java.util.*;
public class LambdaExpressionExample {
	public static void main(String[] args) {
		ArrayList<Product>dmart=new ArrayList<>();
		dmart.add(new Product("Santoor Soap",45,100,5,2));
		dmart.add(new Product("Dabur red Paste",20,20,3.5,0));
		dmart.add(new Product("Good Day Biscuits",60,500,4.5,10));
		dmart.add(new Product("Quaker Oats",200,1000,5,25));
		dmart.add(new Product("Basumati Rice",150,1000,4,14));
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Choose one option");
			System.out.println("1.For Sorting based on the name");
			System.out.println("2.For Sorting based on the cost");
			System.out.println("3.For Sorting based on the quantity");
			System.out.println("4.For Sorting based on the rating");
			System.out.println("5.For Sorting based on the offer");
			System.out.println("6.For exit");
			int choice=sc.nextInt();
			if(choice==1) {
				Comparator c=(Object o1,Object o2)->{
					Product p1=(Product) o1;
					Product p2=(Product) o2;
					return p1.name.compareTo(p2.name);
				};
				Collections.sort(dmart,c);
				System.out.println(dmart);
			}
			else if(choice==2) {
				Collections.sort(dmart,(Object o1,Object o2)->{
					Product p1=(Product) o1;
					Product p2=(Product) o2;
					return Double.valueOf(p1.cost).compareTo(p2.cost);
				});
				System.out.println(dmart);
			}
			else if(choice==3) {
				Collections.sort(dmart,(o1,o2)->{
					Product p1=(Product) o1;
					Product p2=(Product) o2;
					return Double.valueOf(p1.quantity).compareTo(p2.quantity);
				});
				System.out.println(dmart);
			}
			else if(choice==4) {
				Collections.sort(dmart,(p1,p2)->{
					return Double.valueOf(p1.rating).compareTo(p2.rating);
				});
				System.out.println(dmart);
			}
			else if(choice==5) {
				Collections.sort(dmart,(p1,p2)-> Double.valueOf(p1.offer).compareTo(p2.offer));
				System.out.println(dmart);
			}
			else if(choice==6) {
				System.err.println("Thank You...Visit Again...!!");
				break;
			}
			else {
				System.err.println("Invalid Input...Please Try Again...!!");
			}
		}
		}
}
/*Expected Output:
Choose one option
1.For Sorting based on the name
2.For Sorting based on the cost
3.For Sorting based on the quantity
4.For Sorting based on the rating
5.For Sorting based on the offer
6.For exit
1
[Product [name=Basumati Rice, cost=150.0, quantity=1000.0, rating=4.0, offer=14.0]
, Product [name=Dabur red Paste, cost=20.0, quantity=20.0, rating=3.5, offer=0.0]
, Product [name=Good Day Biscuits, cost=60.0, quantity=500.0, rating=4.5, offer=10.0]
, Product [name=Quaker Oats, cost=200.0, quantity=1000.0, rating=5.0, offer=25.0]
, Product [name=Santoor Soap, cost=45.0, quantity=100.0, rating=5.0, offer=2.0]
]
Choose one option
1.For Sorting based on the name
2.For Sorting based on the cost
3.For Sorting based on the quantity
4.For Sorting based on the rating
5.For Sorting based on the offer
6.For exit
2
[Product [name=Dabur red Paste, cost=20.0, quantity=20.0, rating=3.5, offer=0.0]
, Product [name=Santoor Soap, cost=45.0, quantity=100.0, rating=5.0, offer=2.0]
, Product [name=Good Day Biscuits, cost=60.0, quantity=500.0, rating=4.5, offer=10.0]
, Product [name=Basumati Rice, cost=150.0, quantity=1000.0, rating=4.0, offer=14.0]
, Product [name=Quaker Oats, cost=200.0, quantity=1000.0, rating=5.0, offer=25.0]
]
Choose one option
1.For Sorting based on the name
2.For Sorting based on the cost
3.For Sorting based on the quantity
4.For Sorting based on the rating
5.For Sorting based on the offer
6.For exit
3
[Product [name=Dabur red Paste, cost=20.0, quantity=20.0, rating=3.5, offer=0.0]
, Product [name=Santoor Soap, cost=45.0, quantity=100.0, rating=5.0, offer=2.0]
, Product [name=Good Day Biscuits, cost=60.0, quantity=500.0, rating=4.5, offer=10.0]
, Product [name=Basumati Rice, cost=150.0, quantity=1000.0, rating=4.0, offer=14.0]
, Product [name=Quaker Oats, cost=200.0, quantity=1000.0, rating=5.0, offer=25.0]
]
Choose one option
1.For Sorting based on the name
2.For Sorting based on the cost
3.For Sorting based on the quantity
4.For Sorting based on the rating
5.For Sorting based on the offer
6.For exit
4
[Product [name=Dabur red Paste, cost=20.0, quantity=20.0, rating=3.5, offer=0.0]
, Product [name=Basumati Rice, cost=150.0, quantity=1000.0, rating=4.0, offer=14.0]
, Product [name=Good Day Biscuits, cost=60.0, quantity=500.0, rating=4.5, offer=10.0]
, Product [name=Santoor Soap, cost=45.0, quantity=100.0, rating=5.0, offer=2.0]
, Product [name=Quaker Oats, cost=200.0, quantity=1000.0, rating=5.0, offer=25.0]
]
Choose one option
1.For Sorting based on the name
2.For Sorting based on the cost
3.For Sorting based on the quantity
4.For Sorting based on the rating
5.For Sorting based on the offer
6.For exit
5
[Product [name=Dabur red Paste, cost=20.0, quantity=20.0, rating=3.5, offer=0.0]
, Product [name=Santoor Soap, cost=45.0, quantity=100.0, rating=5.0, offer=2.0]
, Product [name=Good Day Biscuits, cost=60.0, quantity=500.0, rating=4.5, offer=10.0]
, Product [name=Basumati Rice, cost=150.0, quantity=1000.0, rating=4.0, offer=14.0]
, Product [name=Quaker Oats, cost=200.0, quantity=1000.0, rating=5.0, offer=25.0]
]
Choose one option
1.For Sorting based on the name
2.For Sorting based on the cost
3.For Sorting based on the quantity
4.For Sorting based on the rating
5.For Sorting based on the offer
6.For exit
7
Choose one option
1.For Sorting based on the name
Invalid Input...Please Try Again...!!
2.For Sorting based on the cost
3.For Sorting based on the quantity
4.For Sorting based on the rating
5.For Sorting based on the offer
6.For exit
6
Thank You...Visit Again...!!
*/
