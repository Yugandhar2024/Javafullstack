public class Circle1 {
	double l,b,h;
	Circle1(double l,double b){
		this.l=l;
		this.b=b;
	}
	public void Area() {
		double area=l*b;
		System.out.println("Area of rectangle 2D:"+area);
		System.out.println("---------------------------");
	}
	Circle1(double l,double b,double h){
		this.l=l;
		this.b=b;
		this.h=h;
	}
	public void Area1() {
		double area=l*b*h;
		System.out.println("Area of rectangle 3D:"+area);
		System.out.println("---------------------------");
	}
}
public class Area {

	public static void main(String[] args) {
		Circle1 c=new Circle1(5,3);
		Circle1 c1=new Circle1(2,3,4);
		c.Area();
		c1.Area1();

	}

