package toJSON;

public class Person 
{
	private String fname;
	private String lname;
	private int age;
	
	public Person(String fname, String lname, int age)
	{
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	
	public String getFname()
	{
		return this.fname;
	}
	
	public String getLname()
	{
		return this.lname;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public fromJSON itWorks()
	{
		return new fromJSON(fname, lname, age);
	}
	
}


