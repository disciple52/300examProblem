package toJSON;

public class Driver
{
	
	public static void main(String [] args)
	{
		Person p = new Person("Mike", "Litman", 35);
		toJSON(p);
		fromJSON fJSON = p.itWorks();
		System.out.println(fJSON);
	}
	
	public static void toJSON(Person p)
	{
		System.out.println("{\"fname\":\""+p.getFname()+"\",\"lname\":\""+p.getLname()+"\",\"age\":\""+ p.getAge()+"\"}");
	}
}
