import java.util.*;
class Oddeven
{
	public static void main(String as[])
	{
		int a;
		System.out.printf("Enter a number to cheak");
		Scanner ob=new Scanner(System.in);
		a=ob.nextInt();
		if(a%2==0)
		System.out.printf("Even number");
		else
		System.out.printf("Odd number");		
	}
}