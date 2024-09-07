public class AlphaClass extends BaseClass
{
	int other;
	public AlphaClass()
	{
		System.out.println("D");
		other = 85;
	}
	public AlphaClass(int a, int b)
	{
		super(b, a);
		System.out.println("C");
		other = 173;
	}
	public int add()
	{
		System.out.println("B");
		int val = super.add(225);
		other = 181;
		return(val);
	}
	public String toString()
	{
		return("[B" + super.toString() + "]");
	}
}
