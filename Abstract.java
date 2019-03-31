abstract class A
{
	abstract void fun(int n);
}
class B extends A
{
	private int no;
	void fun(int n)
	{
		no=n;
		System.out.println(no);
	}
}
class C
{
	public static void main(String...k)
	{
		B ob=new B();
		ob.fun(4);
	}
}