import java.util.Scanner;
class Table
{
	public static void main(String...k)
	{
		Scanner ob=new Scanner(System.in);
		int a,i;
		a=ob.nextInt();
		for(i=0;i<11;i++)
		{
			System.out.println(a+"*"+i+"="+(a*i));
		}
	}
}