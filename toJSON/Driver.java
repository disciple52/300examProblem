package toJSON;

public class Driver 
{
	static String fname = "Mike";
	static String lname = "Litman";

	static String fullName = "{\"fname\":\"Mike\",\"lname\":\"Litman\"}";

	public static void main(String[] args)
	{
		toJSON();
		System.out.println("****");
		fromJSON();
	}


	public static void toJSON()
	{
		// {"fname":"Mike","lname":"Litman"} 
		String temp = "{\"fname\":\""+fname+"\",\"lname\":\""+lname+"\"}";
		System.out.println(temp);
		System.out.println("*****");
		System.out.println("{\"fname\":\"Mike\",\"lname\":\"Litman\"}");
	}

	public static void fromJSON()
	{
		/*and the REVERSE: build an object that is a person 
		 * that has fname of Mike and lname of Litman
		 */
		String firstName = null;
		String lastName = null;

		for(int i = 0; i < fullName.length(); i++)
		{
			try{


				if(fullName.charAt(i) == ':')
				{
					firstName = fullName.substring(i + 2, fullName.indexOf(',') - 1);
					for(int j = i + 1; j < fullName.length(); j++)
					{
						if(fullName.charAt(j) == ':')
						{
							lastName = fullName.substring(j + 2, fullName.length() - 2);
						}
					}
				}
			}
			catch(Exception e)
			{
			}

		}
		System.out.println("Person: " + firstName + " " + lastName);
	}
	
	//Person p = new Person(firstName, lastName);

}
