public class MagicNo {
	public static void main(String[] args) {
		int n1=1234;
		int n2=n1;
		while(n2>9) {
			int s=0;
			while(n2>0) {
				int r=n2%10;
				s=s+r;
				n2=n2/10;
			}
			n2=s;
		}
		if(n2==1) {
			System.out.println(n1+" is a Magic Number");
		}
		else {
			System.out.println(n1+" is not a Magic Number");
		}
	}
}
/*Expected Output:
1234 is a Magic Number
*/
