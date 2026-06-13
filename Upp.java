class Upp{
public static void main(String[] args){

	//prog to check wheather give char is uppercase or lowercase alphabet.
	char n='Y';
	if(n>=97 && n<=122)
		{
			System.out.println("Given character is Lower Case Alphabet.");
		}
	else if(n>=65 && n<=90)
		{
			System.out.println("Given character is Upper Case Alphabet.");
		}
	else
		{
			System.out.println("Given character is not a Alphabet.");
		}
	}
}
