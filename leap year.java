import java.util.Scanner;
class LeapYear
{
	public static void main(String sdp[])
	{
		int a;
		System.out.printf("\nEnter a year");
		Scanner ob= new Scanner(System.in);
		a=ob.nextInt();
		if(a%4==0)
		{
			if(a%100==0)
			{
				if(a%400==0)
				System.out.printf("\nLeap Year");
				else
				System.out.printf("\nNot Leap Year");
			}
			else
			System.out.printf("\nLeap Year");
		}
		else
		System.out.printf("\nNot Leap Yera");
	}
}