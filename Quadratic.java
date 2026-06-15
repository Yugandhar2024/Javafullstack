class Quadratic {
	public static void main(String args[]) {
		int a=1,b=7,c=12;
		double root1=(-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
		double root2=(-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
		System.out.println(root1);
		System.out.println(root2);
	}
}
