import java.util.Scanner;
class Basicoperation
{
	public static void main(String aa[])
	{
		System.out.printf("1- Addition\n2- Subtraction\n3- multiplaction\n4- Division");
		System.out.printf("\nEnter your choice\n");
		Scanner ob=new Scanner(System.in);
		int ch=ob.nextInt();
		System.out.printf("Enter two number\n");
		int a=ob.nextInt();
		int b=ob.nextInt();
		int c;
		switch(ch)
		{
			case 1:
				c=a+b;
				System.out.printf("Addition is=%d",c);
				break;
			case 2:
				c=a-b;
				System.out.printf("Subtraction is=%d",c);
				break;
			case 3:
				c=a*b;
				System.out.printf("Multiplaction is=%d",c);
				break;
			case 4:
				float d=(float)a/b;
				System.out.printf("Division is=%f",d);
				break;
		}
	}
}