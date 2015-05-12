package toJSON;

public class Driver
{
	public static void main(String [] args)
	{
		Person p = new Person("Mike", "Litman", 35);
		System.out.println(p.toJSON());
	}
}
