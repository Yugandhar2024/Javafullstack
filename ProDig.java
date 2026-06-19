/*class ProDig
{
public static void main(String[] args)
{
	//Product of the digits of the given 'n' number.
	int n=15632,rem,p=1;
	while(n!=0)
	{
		rem=n%10;
		p=p*rem;
		n=n/10;
	}
	System.out.println("Product of the digits of the given number:"+p);
}
}*/
/*class ProDig
{
public static void main(String[] args)
{
	//Product of Squares of digits in the given 'n' number.
	int n=22,rem,p=1;
	while(n!=0)
	{
		rem=n%10;
		p=p*rem*rem;
		n=n/10;
	}
	System.out.println("Product of Squares of digits in the given number:"+p);
}
}*/
class ProDig
{
public static void main(String[] args)
{
	//Product of Cubes of digits in the given 'n' number.
	int n=22,rem,p=1;
	while(n!=0)
	{
		rem=n%10;
		p=p*rem*rem*rem;
		n=n/10;
	}
	System.out.println("Product of Cubes of digits in the given number:"+p);
}
}
