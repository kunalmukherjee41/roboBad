import java.util.Scanner;
class MaxNumber
{
	public static void main(String s[])
	{
		int a,b,c;
		Scanner ob=new Scanner(System.in);
		System.out.printf("Enter your 3 number");
		a=ob.nextInt();
		b=ob.nextInt();
		c=ob.nextInt();
		if(a>b)
		{
			if(a>c)
			System.out.printf("Max number is %d",a);
			else
			System.out.printf("Max number is %d",c);
		}
		else
		{
			if(b>c)
			System.out.printf("Max number is %d",b);
			else
			System.out.printf("Max number is %d",c);
		}
	}
}