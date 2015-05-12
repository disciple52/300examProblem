package toJSON;

public class fromJSON 
{
	private String fname;
	private String lname;
	private int age;
	
	public fromJSON(String fname, String lname, int age)
	{
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	
	public String toString()
	{
		return "Person" + "(" + "\"" + this.fname + "\"" + ", " + "\"" +this.lname + "\"" + ", " + Integer.toString(age) + ")";
	}

}
