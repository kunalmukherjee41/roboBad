interface i1
{
	void add(int q,int w);
	void sub(int r,int e);	
}
interface i2 extends i1
{
	void mul(int y,int t);
	void div(int i,int u);
}
interface i3 
{
	void mod(int p,int q);
}
class A implements i2
{
	public void add(int x,int y)
	{
		int sum=x+y;
		System.out.println(sum);
	}
	public void sub(int x,int y)
	{
		int s=x-y;
		System.out.println(s);
	}
	public void mul(int a,int b)
	{
		int m=a*b;
		System.out.println(m);
	}
	public void div(int a, int b)
	{
		int d=a/b;
		System.out.println(d);
	}
}
class C implements i2,i3
{
	public void add(int x,int y)
	{
		int sum=x+y;
		System.out.println(sum);
	}
	public void sub(int x,int y)
	{
		int s=x-y;
		System.out.println(s);
	}
	public void mul(int a,int b)
	{
		int m=a*b;
		System.out.println(m);
	}
	public void div(int a, int b)
	{
		int d=a/b;
		System.out.println(d);
	}
	public void mod(int f,int g)
	{
		int x=f%g;
		System.out.println(x);
	}
}
class B
{
	public static void main(String...K)
	{
		A ob=new A();
		ob.add(262,87);
		ob.sub(198,78);
		ob.mul(98,6);
		ob.div(898,56);	
		C obj=new C();
		obj.add(262,87);
		obj.sub(198,78);
		obj.mul(98,6);
		obj.div(898,56);
		obj.mod(45,6);
	}
}
