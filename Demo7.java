/* class Demo7// Is given Number is SPY Number or not using Method.
{
	public static boolean isSpyNo(int n)
{
	int r=0,s=0,p=1,temp=n;
	while(temp!=0)
	{
		r=temp%10;
		s=s+r;
		p=p*r;
		temp=temp/10;
	}
		return s==p;
}
	public static void main(String[] args)
{
	System.out.println("Is given Number is SPY Number : "+isSpyNo(123));
}
}
*/
/*Expected Output
Is given Number is SPY Number : true
*/
class Demo7// Is given Number is HARSHAD Number or not using Method.
{
	public static boolean isHarshadNo(int n)
{
	int temp=n,s=0;
	while(temp!=0)
	{
		int r=temp%10;
		s=s+r;
		temp=temp/10;
	}
	if(n%s==0)
		return true;
	else 
		return false;
}
	public static void main(String[] args)
{
	System.out.println("Is given Number is Harshad Number : "+isHarshadNo(81));
}
}
/*Expected output
Is given Number is Harshad Number : true
*/
