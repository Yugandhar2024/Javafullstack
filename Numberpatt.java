/* class Sam{
public static void main(String[] args)
{
	//Program to print number from 1 to 10 using while loop

	int i=1; //Intialization.
	while(i<=10)  //Condition.
		{
			System.out.println(i);
			i++; //Updation.
		}
}
} */
/* class Sam1
{
public static void main(String[] args)
{ //program to printing the pattern like A1,B2,......Y25,Z26 using while loop.

		char ch='A';
		int i=1;
		System.out.println("Printing the pattern like A1,B2,......Y25,Z26:");
		while(ch<='Z')
	{
		System.out.println(ch+""+i);
		ch++;
		i++;
	}
}
} */
/* class Sam2
{
public static void main(String[] args)
	{
		//prog to print the characters in lowercase from a to z  using while loop.
		char c1='a'; //Intialization.
		System.out.println("Lowercase Character from a to z is:");
		while(c1<='z') //Condition.
			{
				System.out.println(c1);
				c1++; //Updation.
			}
	}
} */
/* class Sam3
{
public static void main(String[] args)
	{
		//prog to print the 5 special characters after the z using while loop.
		//Intialization.
		int i=91;
		System.out.println("print the 5 special characters after the z.");
		while(i<=95)
			{
				System.out.println(i+" : "+(char)i);
				i++;
			}
	}
} */
/* class Sam4
{
public static void main(String[] args)
	{ //program to printing the patten like A26,B25,......Y2,Z1 using while loop.

		char ch='A';
		int i=26;
		System.out.println("Printing the pattern like A26,B25,......Y2,Z1.");
		while(ch<='Z'){
		System.out.println( ch+""+i);
		ch++;
		i--;
				}
	}
} */
/* class Sam5
{
public static void main(String[] args)
{ //program to printing the pattern like A1a,B2b,......Y25y,Z26z using while loop.

		char c1='A';
		char c2='a';
		int i=1;
		System.out.println("Printing the pattern like A1a,B2b,......Y25y,Z26z:");
		while(c1<='Z')
	{
		System.out.println(c1+""+i+c2+"");
		c1++;
		c2++;
		i++;
	}
}
} */
/* class Sam6
{
public static void main(String[] args)
{ //program to printing the pattern like Az,By,......Yb,Za using while loop.

	char c1='A';
	char c2='z';
		
	System.out.println("Printing the pattern like Az,By,......Yb,Za: ");
	while(c1<='Z')
	{
		System.out.println(c1+""+c2+"");
		c1++;
		c2--;
		
	}
}
} */
class NumberPatt
{
public static void main(String[] args)
{ //program to printing the pattern like z1A,y2B,.....b25Y,a26Z using while loop.

		char c1='z';
		char c2='A';
		int i=1;
		System.out.println("Printing the pattern like z1A,y2B,.....b25Y,a26Z:");
		while(c2<='Z')
	{
		System.out.println(c1+""+i+c2+"");
		c1--;
		c2++;
		i++;
	}
}
}
