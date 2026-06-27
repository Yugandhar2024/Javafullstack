/*class Demo6//Factorial of given Number Method.
{
	public static int fact(int a)
{
	int r=1;
	for(int i=a ; i>=1 ; i--)
	{
		r=r*i;
	}
	return r;
}
	public static void main(String[] args)
{
	System.out.println("Factorial of given Number number : "+fact(5));
}
}
*/
/*Expected Output:
Factorial of given Number number : 120
*/
/*class Demo6//Even or Odd number of given Number Method.
{
	public static boolean even(int a)
{
	if(a%2==0)
	{
		return true;
	}
	else
	{
		return false;
	}
}
	public static void main(String[] args)
{
	System.out.println(even(52));
}
}
*/
/*Expected Output:
true
*/
class Demo6 //Reverse of given Number Method.
{
	public static int rev(int a)
{
	int rem=0;
	int res=0;
	while(a!=0)
	{
		rem=a%10;
		res=res*10+rem;
		a=a/10;
	}
	return res;
}
	public static void main(String[] args)
{
	System.out.println("Reverse of the given Number: "+rev(52111));
}
}
/*Expected Output
Reverse of the given Number: 11125
*/
