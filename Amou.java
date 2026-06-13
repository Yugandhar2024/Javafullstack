class Amou{
public static void main(String[] args){
//program to count the total number of notes in the given Amount.
	int m=9990,count=0;
	if(m>=500)
	{
		int note500=m/500;
		count+=note500;
		System.out.println("500-----> "+note500);
		m=m%500;
	}
	if(m>=200)
	{
		int note200=m/200;
		count+=note200;
		System.out.println("200-----> "+note200);
		m=m%200;
	}
	
	if(m>=100)
	{
		int note100=m/100;
		count+=note100;
		System.out.println("100-----> "+note100);
		m=m%100;
	}
	
	if(m>=50)
	{
		int note50=m/50;
		count+=note50;
		System.out.println("50-----> "+note50);
		m=m%50;
	}
	
	if(m>=20)
	{
		int note20=m/20;
		count+=note20;
		System.out.println("20-----> "+note20);
		m=m%20;
	}
	if(m>=10)
	{
		int note10=m/10;
		count+=note10;
		System.out.println("10-----> "+note10);
		m=m%10;
	}
	
	if(m>=5)
	{
		int coin5=m/5;
		count+=coin5;
		System.out.println("5-----> "+coin5);
		m=m%5;
	}
	if(m>=2)
	{
		int coin2=m/2;
		count+=coin2;
		System.out.println("2-----> "+coin2);
		m=m%2;
	}
	if(m>=1)
	{
		int coin1=m/1;
		count+=coin1;
		System.out.println("1-----> "+coin1);
		m=m%1;
	}
	System.out.println("Count-----> "+count);
}
}
