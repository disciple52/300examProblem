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
	//{"fname":"Mike","lname":"Litman","age":"35"}
	public String toJSON()
	{
		return "{\"fname\":\"" + this.fname + "\",\"lname\":\"" + this.lname + "\",\"age\":\"" + Integer.toString(age) + "\"}";
	}
}


