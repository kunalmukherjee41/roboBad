public class Example
{
	public static void main(String []args)
	{	
		Student sc=new Student();
		sc.setName("Kunal");
		sc.setAge(19);
		sc.setRoll(40);
		System.out.println("Name: " + sc.getName());
		System.out.println("Age: " + sc.getAge());
		System.out.println("Rollno: " + sc.getRoll());
	}
}