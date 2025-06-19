

/* Number1 */

/*import java.util.Scanner;
class Pattern1
{
public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the value:");
n=s.nextInt();
for(int i=0;i<=n;i++)
{
for(int j=0;j<=n;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}*/

/* Number2 */

/* class Pattern1
{
public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(i);
}
System.out.println();
}
}
} */

/* Number3 */

/* class Pattern1
{
public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(j);
}
System.out.println();
}
}
} */

/* Number4 */

/* class Pattern1
{
public static void main(String[] args)
{
int n,k=1;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(k++ +"\t");
}
System.out.println();
}
}
} */

/* Number5 */

/* class Pattern1
{
public static void main(String[] args)
{
int n,k=1;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(k==10)
{
k=1;
}
System.out.print(k++ +"\t");
}
System.out.println();
}
}
} */

/* Number6 */

/* class Pattern1
{
public static void main(String[] args)
{
int n,k=1;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(k++ +"\t");
k+=1;
}
System.out.println();
}
}
} */

/* Number7 */

/*class Pattern1
{
public static void main(String[] args)
{
int n,k=1;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(j%2);
}
System.out.println();
}
}
}*/

/* Number8 */

/*class Pattern1
{
public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n-1;j++)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print(" *");
}
System.out.println();
}
}
}*/

/* Number9 */
/*class Pattern1
{
public static void main(String[] args)
{
int n,even=2;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n-1;j++)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print(" "+even);
even+=2;
}
System.out.println();
even=2;
}
}
}*/

/* Number10 */

/* class Pattern1
{
public static void main(String[] args)
{
int n;
String s="INDIA";
Scanner s1=new Scanner(System.in);
System.out.print("Enter the value:");
n=s1.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=0;j<i;j++)
{
System.out.print(s.charAt(j));
}
System.out.println();
}
}
} */

/* Number11 */
/*
class Pattern1
{
public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=i;j<=2*n-i;j++)
{
System.out.print(" ");
}
for(int k=1;k<=2*i-1;k++)
{
System.out.print(" *");
}
System.out.println();
}
}
}
*/
/*Number12*/
/*
class Pattern1
 {
    public static void main(String[] args) {
        int rows = 7;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= Math.abs(rows / 2 + 1 - i); j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= rows - 2 * Math.abs(rows / 2 + 1 - i); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}*/
/*Number13*/
/*
class Pattern1
{
    public static void main(String[] args) {
        int rows = 9; 
        int spaces = 0; 

        for (int i = 1; i <= rows; i++) {
            
            if(i <= rows/2+1) {
                spaces = Math.abs(rows/2+1 - i);
            } else {
                spaces = Math.abs(i - (rows/2+1));
            }

            
            for (int j = 0; j < spaces; j++) {
                System.out.print("  ");
            }

         
            if (i == 1 || i == rows) {
                System.out.println("*");
            } else {
                System.out.print("*");
                for (int j = 0; j < (rows/2+1 - spaces)*2-1; j++) {
                    System.out.print("  ");
                }
                System.out.println("*");
            }
        }
    }
}
*/
/*Number 14*/
/*
 class Pattern11 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
 
   }
}
*/
/*Number 15*/
/*
class Pattern1{
 
    public static void main(String[] args) {
        int rows = 7;
        for (int i = 0; i < rows; i++)

 {
            if (i == rows / 2) {
                for (int j = 0; j < rows; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int k = 0; k < rows / 2; k++) {
                    System.out.print("  ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
/*Number 16*/
/*
class Pattern1 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 && (j == 0 || j == n - 1)) ||
                    (i == 1 && (j == 1 || j == n - 2)) ||
                    (i == 2 && (j == 2 || j == n - 3)) ||
                    (i == 3 && (j == n / 2 )) ||
                    (i == 4 && (j == 3 || j == n - 4)) ||
                    (i == 5 && (j == 2 || j == n - 3)) ||
                    (i == 6 && (j == 0 || j == n - 1))) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
*//*Number 17*/
class Pattern1 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println(i);
        }
    }
}
                  
