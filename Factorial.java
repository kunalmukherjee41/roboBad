import java.util.Scanner;
class Fact
{
	void factorial()
	{
		int a,f=1,i;
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		for(i=1;i<=a;i++)
			f=i*f;
		System.out.println(f);
	}
	public static void main(String args[])
	{	
		Fact ob=new Fact();
		ob.factorial();
	}
}