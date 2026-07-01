package demo;

class PriPal //Palindrome Prime Number or Not using Method.
{
	public static boolean isPalPrime(int n)
	{
		int temp=n,res=0,rem,count=0;
		while(n!=0)
		{
			rem=n%10;
			res=res*10+rem;
			n=n/10;
		}
		for(int i=1 ; i<=temp ; i++)
		{
			if(temp%i==0)
				count++;
		}
		if(res==temp && count==2)
			return true;
		else
			return false;
	}
	public static void main(String[] args)
	{
		int n=131;
		if(isPalPrime(n))
			System.out.println("Given number "+n+ " is Palindrome Prime Number");
		else
			System.out.println("Given number "+n+" is Not a Palindrome Prime Number");
	}
}
/*Expected output:
Given number 131 is Palindrome Prime Number
*/
