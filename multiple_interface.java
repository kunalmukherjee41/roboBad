interface i1
{
	void f1();
}
interface i2
{
	void f2();
}
interface i3 extends i1,i2
{
	void f3();
}
class A implements i3
{
	void f1(int g)
	{
		System.out.println("A1");
	}
	void f2(int d)
	{
		System.out.println("A2");
	}
	void f3(int d)
	{
		System.out.println("A1");
	}
}
class B
{
	public static void main()
	{
		A ob=new A();
		ob.f1(3);
		ob.f3(5);
	}
}