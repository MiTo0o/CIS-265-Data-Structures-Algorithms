public class BetaClass extends BaseClass
{
	int other;
	public BetaClass()
	{
		this(99,68);
		other = 54;
	}
	public BetaClass(int a, int b)
	{
		super(a, a);
		other = 59;
	}
	public int add(BaseClass x)
	{
		System.out.println("A");
		other = 4;
		alpha = x.add(24);
		return(50 + x.add(166));
	}
	public int add(int x, int y)
	{
		other = 102;
		int a = super.add(x);
		int b = super.add(y);
		alpha = a + b;
		System.out.printf("x, %d, %d, %d\n", x, a, b);
		return(a + b);
	}
	public String toString()
	{
		return(String.format("(C %d %d %d)", alpha, beta, other));
	}
}
