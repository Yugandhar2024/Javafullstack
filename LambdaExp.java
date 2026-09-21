/*
package comparator;

public class Laptop {
	String name;
	double price;
	double generation;
	String color;
	public Laptop(String name, double price,double generation, String color) {
		super();
		this.name = name;
		this.price = price;
		this.generation=generation;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Laptop [name=" + name + ", price=" + price + ", generation="+generation+", color=" + color + "]\n";
	}
	
}

*/
package comparator;
import java.util.*;
public class LambdaExp {
	public static void main(String[] args) {
		ArrayList<Laptop> details=new ArrayList<>();
		details.add(new Laptop("Dell",50000,11,"white"));
		details.add(new Laptop("Hp",45000,10,"black"));
		details.add(new Laptop("Macbook",75000,9,"silver"));
		details.add(new Laptop("ThinkPad",35000,11,"grey"));
		details.add(new Laptop("Realme",60000,12,"white"));
		details.add(new Laptop("Lenova",55000,9,"black"));
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Choose one option");
			System.out.println("1.Sorting based on the name");
			System.out.println("2.Sorting based on the price");
			System.out.println("3.Sorting based on the generation");
			System.out.println("4.Sorting based on the color");
			System.out.println("5.For exit");
			int choice=sc.nextInt();
			if(choice==1) {
				Comparator c=(Object o1,Object o2)->{
					Laptop l1=(Laptop) o1;
					Laptop l2=(Laptop) o2;
					return l1.name.compareTo(l2.name);
				};
				Collections.sort(details,c);
				System.out.println(details);
			}
			else if(choice==2) {
				Collections.sort(details,(l1,l2)->{
					return Double.valueOf(l1.price).compareTo(l2.price);
				});
				System.out.println(details);
			}
			else if(choice==3) {
				Collections.sort(details,(l1,l2)->{
					return Double.valueOf(l1.generation).compareTo(l2.generation);
				});
				System.out.println(details);
			}
			else if(choice==4) {
				Comparator c=(Object o1,Object o2)->{
					Laptop l1=(Laptop) o1;
					Laptop l2=(Laptop) o2;
					return l1.color.compareTo(l2.color);
				};
				Collections.sort(details,c);
				System.out.println(details);
			}
			else if(choice==5) {
				System.err.println("Thank You Visit Again");
				break;
			}
			else {
				System.err.println("Invalid Input");
			}
		}
	}
}
/*Output:
Choose one option
1.Sorting based on the name
2.Sorting based on the price
3.Sorting based on the generation
4.Sorting based on the color
5.For exit
1
[Laptop [name=Dell, price=50000.0, generation=11.0, color=white]
, Laptop [name=Hp, price=45000.0, generation=10.0, color=black]
, Laptop [name=Lenova, price=55000.0, generation=9.0, color=black]
, Laptop [name=Macbook, price=75000.0, generation=9.0, color=silver]
, Laptop [name=Realme, price=60000.0, generation=12.0, color=white]
, Laptop [name=ThinkPad, price=35000.0, generation=11.0, color=grey]
]
Choose one option
1.Sorting based on the name
2.Sorting based on the price
3.Sorting based on the generation
4.Sorting based on the color
5.For exit
2
[Laptop [name=ThinkPad, price=35000.0, generation=11.0, color=grey]
, Laptop [name=Hp, price=45000.0, generation=10.0, color=black]
, Laptop [name=Dell, price=50000.0, generation=11.0, color=white]
, Laptop [name=Lenova, price=55000.0, generation=9.0, color=black]
, Laptop [name=Realme, price=60000.0, generation=12.0, color=white]
, Laptop [name=Macbook, price=75000.0, generation=9.0, color=silver]
]
Choose one option
1.Sorting based on the name
2.Sorting based on the price
3.Sorting based on the generation
4.Sorting based on the color
5.For exit
3
[Laptop [name=Lenova, price=55000.0, generation=9.0, color=black]
, Laptop [name=Macbook, price=75000.0, generation=9.0, color=silver]
, Laptop [name=Hp, price=45000.0, generation=10.0, color=black]
, Laptop [name=ThinkPad, price=35000.0, generation=11.0, color=grey]
, Laptop [name=Dell, price=50000.0, generation=11.0, color=white]
, Laptop [name=Realme, price=60000.0, generation=12.0, color=white]
]
Choose one option
1.Sorting based on the name
2.Sorting based on the price
3.Sorting based on the generation
4.Sorting based on the color
5.For exit
4
[Laptop [name=Lenova, price=55000.0, generation=9.0, color=black]
, Laptop [name=Hp, price=45000.0, generation=10.0, color=black]
, Laptop [name=ThinkPad, price=35000.0, generation=11.0, color=grey]
, Laptop [name=Macbook, price=75000.0, generation=9.0, color=silver]
, Laptop [name=Dell, price=50000.0, generation=11.0, color=white]
, Laptop [name=Realme, price=60000.0, generation=12.0, color=white]
]
Choose one option
1.Sorting based on the name
2.Sorting based on the price
3.Sorting based on the generation
4.Sorting based on the color
5.For exit
6
Choose one option
1.Sorting based on the name
2.Sorting based on the price
Invalid Input
3.Sorting based on the generation
4.Sorting based on the color
5.For exit
5
Thank You Visit Again
*/
