/*class Demo3 //Number of digits in given number
{
	public static int count(int a)
	{
		int c=0;
		while(a!=0)
		{
			a=a/10;
			c++;
		}
		return c;
	}
	public static void main(String[] args)
	{
		System.out.println("Number of digits in given number : "+count(123456));
	}
}*/
/*Output Expected:
Number of digits in given number : 6
*/
class Demo3 //Exponential power of given Input
{
	public static int exp(int x,int n)
	{
		int res=1;
		for(int i=1;i<=n;i++)
		{
			res=res*x;
		}
		return res;
	}
	public static void main(String[] args)
	{
		System.out.println("Exponential power of given inputs:"+exp(5,3));
	}
}
/*Output Expected:
Exponential power of given inputs:125
*/
