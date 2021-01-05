package rationalnumbers;
import rationalnumbers.RationalNumberUtils_Khan;
import rationalnumbers.RationalNumber;
import rationalnumbers.RationalNumberImpl_Khan;
public class test {

	private static void impltest()
	{

		int n = 2;
		int d = 4;
		RationalNumber ratNum = new RationalNumberImpl_Khan(n,d);
		String expected = "1/2";
		System.out.println(ratNum + " exp = " + expected);
		System.out.println();

		n = 4;
		d = 2;
		RationalNumber ratNum1 = new RationalNumberImpl_Khan(n,d);
		expected = "2/1";
		System.out.println(ratNum1 + " exp = " + expected);
		System.out.println();

		n = 6;
		d = 8;
		RationalNumber ratNum2 = new RationalNumberImpl_Khan(n,d);
		expected = "3/4";
		System.out.println(ratNum2 + " exp = " + expected);
		System.out.println();

		n = 111;
		d = 111;
		RationalNumber ratNum3 = new RationalNumberImpl_Khan(n,d);
		expected = "1/1";
		System.out.println(ratNum3 + " exp = " + expected);
		System.out.println();

		n = -2;
		d = 4;
		RationalNumber ratNum4 = new RationalNumberImpl_Khan(n,d);
		expected = "-1/2";
		System.out.println(ratNum4 + " exp = " + expected);
		System.out.println();

		n = 111;
		d = -111;
		RationalNumber ratNum5 = new RationalNumberImpl_Khan(n,d);
		expected = "-1/1";
		System.out.println(ratNum5 + " exp = " + expected);
		System.out.println();

		n = 2;
		d = -4;
		RationalNumber ratNum6 = new RationalNumberImpl_Khan(n,d);
		expected = "-1/2";
		System.out.println(ratNum6 + " exp = " + expected);
		System.out.println();

		n = -6;
		d = -3;
		RationalNumber ratNum7 = new RationalNumberImpl_Khan(n,d);
		expected = "2/1";
		System.out.println(ratNum7 + " exp = " + expected);
		System.out.println();

		n = 0;
		d = -4;
		RationalNumber ratNum9 = new RationalNumberImpl_Khan(n,d);
		expected = "0/1";
		System.out.println(ratNum9 + " exp = " + expected);
		System.out.println();

		n = 6;
		d = -7;
		RationalNumber ratNum8 = new RationalNumberImpl_Khan(n,d);
		expected = "-6/7";
		System.out.println(ratNum8 + " exp = " + expected);
		System.out.println();

	}

	private static void utiltest1() {


		int a = 1;
		int b = 1;
		int c = 1;
		int d = 1;
		RationalNumber r1 = new RationalNumberImpl_Khan(a,b);
		RationalNumber r2 = new RationalNumberImpl_Khan(c,d);

		RationalNumber addRat = RationalNumberUtils_Khan.add(r1, r2);
		String expected = "2/1";
		System.out.println(addRat + " exp = " + expected);
		
		RationalNumber subRat = RationalNumberUtils_Khan.subtract(r1, r2);
		expected = "0/1";
		System.out.println(subRat + " exp = " + expected);
		
		RationalNumber multRat = RationalNumberUtils_Khan.multiply(r1, r2);
		expected = "1/1";
		System.out.println(multRat + " exp = " + expected);
		
		RationalNumber divRat = RationalNumberUtils_Khan.divide(r1, r2);
		expected = "1/1";
		System.out.println(divRat + " exp = " + expected);
		
		RationalNumber negRat = RationalNumberUtils_Khan.negate(r1);
		expected = "-1/1";
		System.out.println(negRat + " exp = " + expected);
		System.out.println();


	}
	
	private static void utiltest2() {


		int a = 0;
		int b = 9;
		int c = 6;
		int d = 1;
		RationalNumber r1 = new RationalNumberImpl_Khan(a,b);
		RationalNumber r2 = new RationalNumberImpl_Khan(c,d);

		RationalNumber addRat = RationalNumberUtils_Khan.add(r1, r2);
		String expected = "6/1";
		System.out.println(addRat + " exp = " + expected);
		
		RationalNumber subRat = RationalNumberUtils_Khan.subtract(r1, r2);
		expected = "-6/1";
		System.out.println(subRat + " exp = " + expected);
		
		RationalNumber multRat = RationalNumberUtils_Khan.multiply(r1, r2);
		expected = "0/1";
		System.out.println(multRat + " exp = " + expected);
		
		RationalNumber divRat = RationalNumberUtils_Khan.divide(r1, r2);
		expected = "0/1";
		System.out.println(divRat + " exp = " + expected);
		
		RationalNumber negRat = RationalNumberUtils_Khan.negate(r1);
		expected = "0/1";
		System.out.println(negRat + " exp = " + expected);
		System.out.println();





	}
	
	private static void utiltest3() {


		int a = 2;
		int b = 8;
		int c = 1;
		int d = 4;
		RationalNumber r1 = new RationalNumberImpl_Khan(a,b);
		RationalNumber r2 = new RationalNumberImpl_Khan(c,d);

		RationalNumber addRat = RationalNumberUtils_Khan.add(r1, r2);
		String expected = "1/2";
		System.out.println(addRat + " exp = " + expected);
		
		RationalNumber subRat = RationalNumberUtils_Khan.subtract(r1, r2);
		expected = "0/1";
		System.out.println(subRat + " exp = " + expected);
		
		RationalNumber multRat = RationalNumberUtils_Khan.multiply(r1, r2);
		expected = "1/16";
		System.out.println(multRat + " exp = " + expected);
		
		RationalNumber divRat = RationalNumberUtils_Khan.divide(r1, r2);
		expected = "1/1";
		System.out.println(divRat + " exp = " + expected);
		
		RationalNumber negRat = RationalNumberUtils_Khan.negate(r1);
		expected = "-1/4";
		System.out.println(negRat + " exp = " + expected);
		System.out.println();




	}
	
	private static void utiltest4() {


		int a = 1;
		int b = 1;
		int c = 1;
		int d = 1;
		RationalNumber r1 = new RationalNumberImpl_Khan(a,b);
		RationalNumber r2 = new RationalNumberImpl_Khan(c,d);

		RationalNumber addRat = RationalNumberUtils_Khan.add(r1, r2);
		String expected = "2/1";
		System.out.println(addRat + " exp = " + expected);
		
		RationalNumber subRat = RationalNumberUtils_Khan.subtract(r1, r2);
		expected = "0/1";
		System.out.println(subRat + " exp = " + expected);
		
		RationalNumber multRat = RationalNumberUtils_Khan.multiply(r1, r2);
		expected = "1/1";
		System.out.println(multRat + " exp = " + expected);
		
		RationalNumber divRat = RationalNumberUtils_Khan.divide(r1, r2);
		expected = "1/1";
		System.out.println(divRat + " exp = " + expected);
		
		RationalNumber negRat = RationalNumberUtils_Khan.negate(r1);
		expected = "-1/1";
		System.out.println(negRat + " exp = " + expected);
		System.out.println();




	}
	
	private static void utiltest5() {


		int a = 1;
		int b = 9;
		int c = 1;
		int d = 1;
		RationalNumber r1 = new RationalNumberImpl_Khan(a,b);
		RationalNumber r2 = new RationalNumberImpl_Khan(c,d);

		RationalNumber addRat = RationalNumberUtils_Khan.add(r1, r2);
		String expected = "10/9";
		System.out.println(addRat + " exp = " + expected);
		
		RationalNumber subRat = RationalNumberUtils_Khan.subtract(r1, r2);
		expected = "-8/9";
		System.out.println(subRat + " exp = " + expected);
		
		RationalNumber multRat = RationalNumberUtils_Khan.multiply(r1, r2);
		expected = "1/9";
		System.out.println(multRat + " exp = " + expected);
		
		RationalNumber divRat = RationalNumberUtils_Khan.divide(r1, r2);
		expected = "1/9";
		System.out.println(divRat + " exp = " + expected);
		
		RationalNumber negRat = RationalNumberUtils_Khan.negate(r1);
		expected = "-1/9";
		System.out.println(negRat + " exp = " + expected);
		System.out.println();




	}
	
	private static void utiltest6() {


		int a = 1;
		int b = 1;
		int c = 1;
		int d = 1;
		RationalNumber r1 = new RationalNumberImpl_Khan(a,b);
		RationalNumber r2 = new RationalNumberImpl_Khan(c,d);

		RationalNumber addRat = RationalNumberUtils_Khan.add(r1, r2);
		String expected = "2/1";
		System.out.println(addRat + " exp = " + expected);
		
		RationalNumber subRat = RationalNumberUtils_Khan.subtract(r1, r2);
		expected = "0/1";
		System.out.println(subRat + " exp = " + expected);
		
		RationalNumber multRat = RationalNumberUtils_Khan.multiply(r1, r2);
		expected = "1/1";
		System.out.println(multRat + " exp = " + expected);
		
		RationalNumber divRat = RationalNumberUtils_Khan.divide(r1, r2);
		expected = "1/1";
		System.out.println(divRat + " exp = " + expected);
		
		RationalNumber negRat = RationalNumberUtils_Khan.negate(r1);
		expected = "-1/1";
		System.out.println(negRat + " exp = " + expected);
		System.out.println();




	}

	public static void main(String a[])
	{

		System.out.println("START IMPL TEST");
		impltest();
		System.out.println("START UTIL TEST");
		utiltest1();
		utiltest2();
		utiltest3();
		utiltest4();
		utiltest5();
		utiltest6();


	}
}
