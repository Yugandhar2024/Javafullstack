//Programs to Print the Patterns using Nested-For-Loops.
/* class Patt
{
	public static void main(String[] args)
	{
		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("* "); //Inner Loop For Columns
			}
			System.out.println(); //Outer Loop For Rows.
		}
	}
}*/
/* Print the pattern-1.
* * * *
* * * *
* * * *
* * * *
*/
/*
class Patt
{
public static void main(String[] args){
	int n=7;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==1 || i==n)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
	System.out.println();
	}
}
}
*/
/* Print the pattern-2.

* * * * * * *





* * * * * * *
*/
/* class Patt
{
public static void main(String[] args){
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(j==1 || j==n)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
	System.out.println();
	}
}
}
*/
/* Print the pattern-3.
*    *
*    *
*    *
*    *
*    *
 */
/*
class Patt
{
public static void main(String[] args){
	int n=6;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==1 || i==n || j==1 || j==n)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
	System.out.println();
	}
}
}
*/
/* Print the Pattern-4.
******
*    *
*    *
*    *
*    *
******
*/
/*
 class Patt
{
public static void main(String[] args){
	int n=10;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)   
		{
			if(i==j)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
	System.out.println();
	}
}
}
*/
/*Print the Pattern-5.
*
 *
  *
   *
    *
     *
      *
       *
        *
         *
*/
/*
class Patt
{
public static void main(String[] args){
	int n=8;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i+j==(n+1))
				System.out.print("* ");
			else
				System.out.print("  ");
		}
	System.out.println();
	}
}
}
*/
/* Print the Pattern-6.
       *
      *
     *
    *
   *
  *
 *
*
*/
/*
class Patt
{
public static void main(String[] args){
	int n=10;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==((n+1)/2) || j==((n+1)/2))
				System.out.print("* ");
			else
				System.out.print("  ");
		}
	System.out.println();
	}
}
}
*/
/* Print the Pattern-7.
    *
    *
    *
    *
**********
    *
    *
    *
    *
    *
*/
/*
class Patt
{
public static void main(String[] args){
	int n=7;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==1 || i==n || j==(n+1/2))
				System.out.print("* ");
			else
				System.out.print("  ");
		}
	System.out.println();
	}
}
}
*/
/* Print the Pattern-8.
* * * * * * *
      *
      *
      *
      *
      *
* * * * * * *
*/
/*
 class Patt
{
public static void main(String[] args){
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(j==1 || i==(n+1)/2 || j==n)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
	System.out.println();
	}
}
}
*/
/* Print the Pattern-9.
*       *
*       *
* * * * *
*       *
*       *
*/
/*class Patt
{
public static void main(String[] args)
	{
		int n=5;
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=1 ; j<=n ;j++)
			{
				if(i==j || i+j==(n+1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
  		}
					
	}
}
*/
/*Print the Pattern-10.
*       *
  *   *
    *
  *   *
*       *
*/
/*
class Patt
{
public static void main(String[] args)
	{
		int n=5;
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=1 ; j<=n ;j++)
			{
				if(i==j || i+j==(n+1) || i==1 || i==n || j==1 || j==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
  		}
					
	}
}
*/
/*Print the Pattern-11.

* * * * *
* *   * *
*   *   *
* *   * *
* * * * *

*/
/*
class Patt
{
public static void main(String[] args)
	{
		int n=5;
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=1 ; j<=n ;j++)
			{
				if(i==j || i+j==(n+1) || i==1 || i==n )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
  		}
					
	}
}
*/
/*Print the Pattern-12.
* * * * *
  *   *
    *
  *   *
* * * * *
*/
/*
class Patt
{
public static void main(String[] args)
	{
		int n=5;
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=1 ; j<=n ;j++)
			{
				if(i==j || i+j==(n+1) || j==1 || j==n )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
  		}
					
	}
}
*/
/* Print the Pattern-13.
*       *
* *   * *
*   *   *
* *   * *
*       *
*/
/*
class Patt
{
public static void main(String[] args)
	{
		int n=5;
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=1 ; j<=n ;j++)
			{
				if(i==j || j==1 || j==n )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
  		}
					
	}
}
*/
/*Print the Pattern-14.
*       *
* *     *
*   *   *
*     * *
*       *
*/

class Patt
{
public static void main(String[] args)
	{
		int n=10;
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=1 ; j<=n ;j++)
			{
				if(i==1 || i==(n+1)/2 || j==1 || j==n )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
  		}
					
	}
}

/* Print the Pattern-15.
* * * * *
*       *
* * * * *
*       *
*       *
*/
