  /*
Program: Java program to print the tagline of the brand entered(take any 5 brands).
@Name: Mohsin Shaikh
@Date: 18th Aug 2022
*/ 
class Tagline
{
	static void BrandName()
	{
		String tagline = "Van Husen"; //Putting Brand's Name
		switch (tagline)
		{
			case "Van Husen" : System.out.println ("The Way Forward: Evolve Everyday");
				break;
			case "Mufti" :System.out.println ("Mufti - anything else is uniform.");
				break;
			case "Allen Solly" : System.out.println("My World, My Way");
				break;
			case "Tommy Hilfiger" : System.out.println ("Fashion is fleeting; style is forever.");
				break;
			case "Levi's" : System.out.println ("Live in Levi's");
				break;
		}
	}
	public static void main (String args[])
	{
		BrandName();
	}
}
 