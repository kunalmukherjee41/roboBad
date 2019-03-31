import java.util.Scanner;
class Swap
{
	public static void main(String d[])
	{
		int a,b;
		Scanner ob= new Scanner(System.in);
		System.out.printf("Enetr your 2 number\n");
		a=ob.nextInt();
		b=ob.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.printf("%d\t%d",a,b);
	}
}