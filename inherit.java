class Man
{	
	String name;
	int run;
	public void fun(String M, int R)
	{
		name=M; run=R;
		System.out.println("NAME: "+name+"\nRUN: "+run);
	}
}
class Batsman extends Man
{
	int century;
	void fun(int a)
	{
		century=a;
		System.out.println("CENTURY: "+a);
	}
}
class Inherit
{
	public static void main(String...k)
	{
		Batsman b=new Batsman();
		b.fun("kunal",34565);
		b.fun(99);
	}
}