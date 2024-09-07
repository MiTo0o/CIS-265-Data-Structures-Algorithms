public class BaseClass
{
	protected int alpha, beta, other;
	public BaseClass()
	{
		alpha = 147;
		other = 141;
		beta = 175;
	}
	public BaseClass(int b, int a)
	{
		other = 20;
		System.out.println("F");
		beta = a;
		alpha = b;
	}
	public void method(int x)
	{
		try
		{
			x = x / 0;
			x = 123456;
		}
		catch(Exception e)
		{
			System.out.print(42);
		}
		System.out.printf("method: %d", x);
	}
	public int add(int x)
	{
		other = 128;
		System.out.println("E");
		return(x + alpha + beta);
	}
	public int add()
	{
		System.out.print("add");
		other = 120;
		return(alpha - beta);
	}
	public int add(BaseClass x)
	{
		int b = x.alpha;
		int a = x.alpha;
		int c = x.add(b);
		System.out.printf("D %d %d %d\n", a, b, c);
		other = 132;
		return(a + b + c);
	}
	public String toString()
	{
		return(String.format("(A: %d %d)", alpha, beta));
	}
}
