/*class SumDig
{
public static void main(String[] args)
{
	//Sum of the digits of the given 'n' number.
	int n=15632,rem,s=0;
	while(n!=0)
	{
		rem=n%10;
		s=s+rem;
		n=n/10;
	}
	System.out.println("Sum of the digits of the given number:"+s);
}
}*/
/*class SumDig
{
public static void main(String[] args)
{
	//Sum of Squares of the digits in the given 'n' number.
	int n=15632,rem,s=0;
	while(n!=0)
	{
		rem=n%10;
		s=s+rem*rem;
		n=n/10;
	}
	System.out.println("Sum of Squares of the digits in the given number:"+s);
}
}*/
class SumDig
{
public static void main(String[] args)
{
	//Sum of Cubes of the digits in the given 'n' number.
	int n=222,rem,s=0;
	while(n!=0)
	{
		rem=n%10;
		s=s+rem*rem*rem;
		n=n/10;
	}
	System.out.println("Sum of Cubes of the digits in the given number:"+s);
}
}
