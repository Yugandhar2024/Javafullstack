class Strong //Print the true or false is given no is Strong number.
{
	public static int fact(int n)
	{
		int res=1;
		for(int i=n ; i>=1 ; i--)
		{
			res=res*i;
		}
		return res;
	}
	public static int sum(int n)
	{
		int s=0;
		while(n!=0)
		{
			int rem=n%10;
			s=s+fact(rem);
			n=n/10;
		}
		return s;
	}
	public static boolean isStrong(int n)
	{
		int res=sum(n);
		return n==res;
	}
	public static void main(String[] args)
	{
		System.out.println("Given Number is Strong : "+isStrong(145));
	}
}
/*Expected Output:
Given Number is Strong : true
*/
