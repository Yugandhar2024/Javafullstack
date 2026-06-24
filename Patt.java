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

/*class Patt
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
*/
/* Print the Pattern-15.
* * * * *
*       *
* * * * *
*       *
*       *
*/
/*
class Patt
{
public static void main(String[] args)
{
	int n=5,star=0; //Firstly the 0th row the stars is zero so we intialized.
	for(int i=1 ; i<=n ; i++)
	{
		star++; //Star is to inc for match the 1st row and corresponding rows.
		for(int j=1 ; j<=star ; j++)
		{
			System.out.print("* ");
		}
		System.out.println(); //To move to next row.
	}
}
}
*/
/* Expected output.Pattern-16.
*
* *
* * *
* * * *
* * * * *
*/
/*
class Patt
{
public static void main(String[] args)
{
	int n=7,star=n+1; //Firstly the 0th row the star is n+1 so we intialized.
	for(int i=1 ; i<=n ; i++)
	{
		star--; //Star is to dec for match the 1st row and corresponding rows.
		for(int j=1 ; j<=star ; j++)
		{
			System.out.print("* ");
		}
		System.out.println(); //To move to next row.
	}
}
}
*/
/* Expected output.Pattern-17.
* * * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*
*/
/*
class Patt
{
public static void main(String[] args)
{
	int n=7,star=0,space=n; //Firstly the 0th row the star is 0 and space is n so we intialized.
	for(int i=1 ; i<=n ; i++)
	{
		star++; //Star is to Inc for match the 1st row and correspondig rows.
		space--; //Space is to Dec for match the 1st row and corresponding rows.
		for(int j=1 ; j<=space ; j++)
		{
			System.out.print("  "); 
		}
		for(int k=1 ; k<=star ; k++)
		{
			System.out.print("* ");
		}
		System.out.println(); //To move to next row.
	}
}
}
*/
/* Expected Output.Pattern-18.
            *
          * *
        * * *
      * * * *
    * * * * *
  * * * * * *
* * * * * * *
*/
/*class Patt
{
public static void main(String[] args)
{
	int n=7,star=n+1,space=-1; //Firstly the 0th row the star is n+1 and space is -1 is so we intialized.
	for(int i=1 ; i<=n ; i++)
	{
		star--; //Star is to Dec for match the 1st row and correspondig rows.
		space++; //Space is to Inc for match the 1st row and corresponding rows.
		for(int j=1 ; j<=space ; j++)
		{
			System.out.print("  "); 
		}
		for(int k=1 ; k<=star ; k++)
		{
			System.out.print("* ");
		}
		System.out.println(); //To move to next row.
	}
}
}
*/
/* Expected Output.Pattern-19.
* * * * * * *
  * * * * * *
    * * * * *
      * * * *
        * * *
          * *
            *
*/
/*
class Patt
{
public static void main(String[] args)
{
	int n=7,star=-1,space=n; //Firstly the 0th row the star is -1 and space is n is so we intialized.
	for(int i=1 ; i<=n ; i++)
	{
		star+=2; //Star is to Inc '2' for match the 1st row and correspondig rows.
		space--; //Space is to Dec for match the 1st row and corresponding rows.
		for(int j=1 ; j<=space ; j++)
		{
			System.out.print("  "); 
		}
		for(int k=1 ; k<=star ; k++)
		{
			System.out.print("* ");
		}
		System.out.println(); //To move to next row.
	}
}
}
*/
/*Expected Output.Pattern-20.
            *
          * * *
        * * * * *
      * * * * * * *
    * * * * * * * * *
  * * * * * * * * * * *
* * * * * * * * * * * * *
*/
/*
class Patt
{
public static void main(String[] args)
{
	int n=7,star=n+2,space=-1; //Firstly the 0th row the star is n+2 and space is -1 is so we intialized.
	for(int i=1 ; i<=n ; i++)
	{
		star-=2; //Star is to Dec '2' for match the 1st row and correspondig rows.
		space++; //Space is to Inc for match the 1st row and corresponding rows.
		for(int j=1 ; j<=space ; j++)
		{
			System.out.print("  "); 
		}
		for(int k=1 ; k<=star ; k++)
		{
			System.out.print("* ");
		}
		System.out.println(); //To move to next row.
	}
}
}
*/
/* Expected Output.Pattern-21.
* * * * * * *
  * * * * *
    * * *
      *
*/
/*
class Patt
{
public static void main(String[] args)
{
	int n=7,star=0,space=n/2+1; 
	for(int i=1 ; i<=n ; i++)
	{
		if(i<=n/2+1)
		{
			space--;
			star++;
		} 
		else
		{	space++;
			star--;
		}
		for(int j=1 ; j<=star ; j++)
			{
				System.out.print("* "); 
			}
		for(int k=1 ; k<=space ; k++)
			{
				System.out.print(" "); 
			}

		System.out.println(); //To move to next row.
	}
}
}
*/
/*Expected Output.Pattern-22.
*
* *
* * *
* * * *
* * *
* *
*
*/
/*class Patt
{
    public static void main(String[] args)
    {
        int n = 7, star = 0, space = n/2 + 1;

        for(int i = 1; i <= n; i++)
        {
            if(i <= n/2 + 1)
            {
                space--;
                star++;
            }
            else
            {
                space++;
                star--;
            }

            for(int j = 1; j <= space; j++)
            {
                System.out.print("  ");
            }

            for(int k = 1; k <= star; k++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
*/
/*Expected output.Pattern-23.
     *
    * *
  * * *
* * * *
  * * *
    * *
      *
*/
/*
class Patt
{
public static void main(String[] args)
{
	int n=7,space=n/2+1,star=-1;
	for(int i=1 ; i<=n ; i++)
	{
		if(i<=n/2+1)
		{
			star+=2; 
			space--;
		}
		else
		{
			star-=2; 
			space++;
		}

		for(int j=1 ; j<=space ; j++)
		{
			System.out.print("  "); 
		}
		for(int k=1 ; k<=star ; k++)
		{
			System.out.print("* ");
		}
		System.out.println(); //To move to next row.
	}
}
}
*/
/*Expected Output.Pattern-24.
      *
    * * *
  * * * * *
* * * * * * *
  * * * * *
    * * *
      *
*/
/*
class Patt
{
public static void main(String[] args)
{
	int n=7,star=n+2,space=-1; //Firstly the 0th row the star is n+2 and space is -1 is so we intialized.
	for(int i=1 ; i<=n ; i++)
	{
		if(i<=n/2+1)
		{
			star-=2; 
			space++; 
		}
		else
		{
			star+=2; 
			space--; 
		}

		for(int j=1 ; j<=space ; j++)
		{
			System.out.print("  "); 
		}
		for(int k=1 ; k<=star ; k++)
		{
			System.out.print("* ");
		}
		System.out.println(); //To move to next row.
	}
}
}
*/
/*Expected Output.Pattern-25.
* * * * * * *
  * * * * *
    * * *
      *
    * * *
  * * * * *
* * * * * * *
*/
class Patt
{
public static void main(String[] args)
{
	int n=11,star=0,space=n; 
	for(int i=1 ; i<=n ; i++)
	{
		if(i<=n/2+1)
		{
			space-=2; 
			star++; 
		}
		else
		{
			space+=2; 
			star--; 
		}

		for(int j=1 ; j<=star ; j++)
		{
			System.out.print("* "); 
		}
		for(int k=1 ; k<=space ; k++)
		{
			System.out.print("  ");
		}
		for(int l=1;l<=star;l++)
		{
			if(i==(n/2)+1 && l==1)
				continue;
				System.out.print("* ");
		}
		System.out.println(); //To move to next row.
	}
}
}
/* Expected output.Pattern-26.
*           *
* *       * *
* * *   * * *
* * * * * * *
* * *   * * *
* *       * *
*           *
*/

