public class quiz_2888469
{
	public static void main(String[] args)
	{
		int x = 52, y = 1117;
		BaseClass alpha = new BaseClass(28, 110);
		//value of: alpha.alpha: 28 alpha.beta: 110 x: 52  y: 1117
		x = alpha.add();
		//value of: alpha.alpha: 28 alpha.beta: 110 x: -82  y: 1117
		y = alpha.add(y);
		//value of: alpha.alpha: 28 alpha.beta: 110 x: -82  y: 1255
		y = alpha.add(alpha);
		//value of: alpha.alpha: 28 alpha.beta: 110 x: -82  y: 222
		alpha = new AlphaClass(61, 21);
		//value of: alpha.alpha: 21 alpha.beta: 61 x: -82  y: 222
		x = alpha.add();
		//value of: alpha.alpha: 21 alpha.beta: 61 x: 307  y: 222
		y = alpha.add(y);
		System.out.println();
		//value of: alpha.alpha: 21 alpha.beta: 61 x: 307  y: 304
		y = alpha.add(alpha);
		System.out.println();
		//value of: alpha.alpha: 21 alpha.beta: 61 x: 307  y: 145
		alpha = new BetaClass(163, 139);
		System.out.println();
		//value of: alpha.alpha: 163 alpha.beta: 163 x: 307  y: 145
		x = alpha.add();
		System.out.println();
		//value of: alpha.alpha: 163 alpha.beta: 163 x: 0  y: 145
		y = alpha.add(y);
		System.out.println();
		//value of: alpha.alpha: 163 alpha.beta: 163 x: 0  y: 471
		y = alpha.add(alpha);
		System.out.println();
		//value of: alpha.alpha: 350 alpha.beta: 163 x: 0  y: 729
		alpha.method(92);
		BaseClass[] arr = new BaseClass[3];
		arr[0] = new BetaClass();
		arr[1] = new BaseClass();
		arr[2] = new AlphaClass();
		System.out.printf("------------%d-----------", ((BetaClass)arr[0]).other);
		
		//value of: arr[0].alpha: 99 arr[0].beta: 99 arr[0].other: 54
		//value of: arr[1].alpha: 147 arr[1].beta: 175 arr[1].other: 141
		//value of: arr[2].alpha: 147 arr[2].beta: 175 arr[2].other: 85
		for(int i = 0; i < 3; i++)
		{
			BaseClass tmp = arr[(i + 1) % 3];
			BaseClass val = arr[i];
			val.add(tmp);
			System.out.print(val);
		}
		alpha = arr[0];
		System.out.println();
		//value of: alpha.alpha: 346 alpha.beta: 99 x: 0  y: 729
		alpha = arr[1];
		System.out.println();
		//value of: alpha.alpha: 147 alpha.beta: 175 x: 0  y: 729
		alpha = arr[2];
		System.out.println();
		//value of: alpha.alpha: 147 alpha.beta: 175 x: 0  y: 729
		AlphaClass test1 = new AlphaClass();
		test1.other = 661;
		BaseClass test2 = test1;
		test2.other = 727;
		System.out.println();
		//value of: test1.alpha: 147 test1.beta: 175 x: 0  y: 729
		//value of: test2.alpha: 147 test2.beta: 175
		BaseClass test3 = new BaseClass();
		test3.other = 399;
		test2 = test3;
		System.out.println();
		//value of: test1.alpha: 147 test1.beta: 175 x: 0  y: 729
		//value of: test2.alpha: 147 test2.beta: 175
		//value of: test3.alpha: 147 test3.beta: 175
		test2.other = 838;
		System.out.println();
		//value of: test1.alpha: 147 test1.beta: 175 x: 0  y: 729
		//value of: test2.alpha: 147 test2.beta: 175 
		//value of: test3.alpha: 147 test3.beta: 175
	}
	// OUTPUT:
	// F
	// addE
	// E
	// D 28 28 166
	// F
	// C
	// B
	// E
	// E
	// E
	// D 21 21 103
	// F
	// addE
	// A
	// E
	// E
	// 42method: 92F
	// D
	// A
	// E
	// E
	// (C 346 99 4)E
	// D 147 147 469
	// (A: 147 175)E
	// D 346 346 791
	// [B(A: 147 175)]D
}
