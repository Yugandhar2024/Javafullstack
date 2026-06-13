class Leap
{
public static void main(String[] args)
{

  //program to check wheather the given year is Leap Year or not

	int y=2007;
	if((y%4==0) && (y%100!=0) || (y%400==0))
		System.out.println("Leap Year: "+y);
	else
		System.out.println("Not a Leap Year: "+y);
		
}
}
