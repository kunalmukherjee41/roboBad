class Box
{
	int x;
	void fun(int X)
	{
		x=X;
	}
	void display()
	{
		System.out.println(x);
	}
}
public class Kunal
{
	public static void main(String...k)
	{
		Box ob=new Box();
		ob.fun(4);
		ob.display();
	}
}