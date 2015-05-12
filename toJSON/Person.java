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
		return fname;
	}
	
	public String getLname()
	{
		return lname;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String toJSON()
	{
		return "Person" + "(" + "\"" + this.fname + "\"" + ", " + "\"" + this.lname + "\"" + ", " + Integer.toString(age) + ")";
	}
}


