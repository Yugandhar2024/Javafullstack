class Disarium//Print the true or false is given number Disarium Number.
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
	public static boolean isDisarium(int n)
	{
		int temp=n;
		int count=count(n);
		int sum=0;
		while(n!=0)
		{
			int r=n%10;
			int pow=pow(r,count);
			sum=sum+pow;
			count--;
			n=n/10;
		}
		return temp==sum;
	}
	public static void main(String[] args)
	{
		System.out.println("Is Number Disarium No : "+isDisarium(135));	
	}
}
/*Expected Output:
Is Number Disarium No : true
*/
