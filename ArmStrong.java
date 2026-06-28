class ArmStrong//Print the true or false is given no is ArmStrong Number.
{
	public static int count(int n)
	{
		int c=0;
		while(n!=0)
		{
			n=n/10;
			c++;
		}	
		return c;
	}
	public static int pow(int b,int p)
	{
		int res=1;
		for(int i=1 ; i<=p ;i++)
		{
			res=res*b;	
		}
		return res;
	}
	public static boolean isArmStrong(int n)
	{
		int temp=n;
		int count=count(n);
		int sum=0;
		while(n!=0)
		{
			int r=n%10;
			int pow=pow(r,count);
			sum=sum+pow;
			n=n/10;
		}
		return temp==sum;
	}
	public static void main(String[] args)
	{
		System.out.println("Is Number ArmStrong No : "+isArmStrong(153));	
	}
}
/*Expected Output:
Is Number ArmStrong No : true
*/
