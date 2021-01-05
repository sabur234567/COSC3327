package rationalnumbers;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;
import rationalnumbers.RationalNumber;
import rationalnumbers.RationalNumberUtils_Khan;
import rationalnumbers.RationalNumberImpl_Khan;

class RationalNumberTest {
	
	@Test
	void testNormalFractions() 
	{
		System.out.println("NOW TESTING NORMAL FRACTIONS");
		int num = 0;
		int denom = 6;
		RationalNumber rat1 = new RationalNumberImpl_Khan(num,denom);
	
		int assertNum = rat1.getNumerator();
		int assertDenom = rat1.getDenominator();
		assertEquals(assertNum, 0);
		assertEquals(assertDenom, 1);
		
		num = 5;
		denom = 10;
		RationalNumber rat2 = new RationalNumberImpl_Khan(num,denom);
		
		assertNum = rat2.getNumerator();
		assertDenom = rat2.getDenominator();
		assertEquals(assertNum, 1);
		assertEquals(assertDenom, 2);
		
		System.out.println("TEST SUCCESFULLY COMPLETED");
	}
	@Test
	void testDecimalValue() 
	{
		System.out.println("NOW DECIMAL VALUE OF NORMAL FRACTIONS");
		int num = 4;
		int denom = 2;
		RationalNumber rat1 = new RationalNumberImpl_Khan(num,denom);
	
		double assertValue = rat1.getValue();
		assertEquals(assertValue, 2);
		
		num = 5;
		denom = 10;
		RationalNumber rat2 = new RationalNumberImpl_Khan(num,denom);
		double value = (double)num/(double)denom;
		
		assertValue = rat2.getValue();
		assertEquals(assertValue, value);
		
		System.out.println("TEST SUCCESFULLY COMPLETED");
	}
	@Test
	void add() 
	{
		System.out.println("NOW ADDING FRACTIONS");
		int num = 1;
		int denom = 4;
		RationalNumber rat1 = new RationalNumberImpl_Khan(num,denom);
		
		int num2 = 1;
		int denom2 = 4;
		RationalNumber rat2 = new RationalNumberImpl_Khan(num2,denom2);
		
		RationalNumber r3 = new RationalNumberImpl_Khan(num,denom);
		
		r3 = RationalNumberUtils_Khan.add(rat1, rat2);
		int assertNum = r3.getNumerator();
		int assertDenom = r3.getDenominator();
		assertEquals(assertNum, 1);
		assertEquals(assertDenom, 2);
		
		num = -1;
		denom = 4;
		rat1 = new RationalNumberImpl_Khan(num,denom);
		
		num2 = 2;
		denom2 = 7;
		rat2 = new RationalNumberImpl_Khan(num2,denom2);
		
		r3 = new RationalNumberImpl_Khan(num,denom);
		
		r3 = RationalNumberUtils_Khan.add(rat1, rat2);
		assertNum = r3.getNumerator();
		assertDenom = r3.getDenominator();
		assertEquals(assertNum, 1);
		assertEquals(assertDenom, 28);
		
		num = -1;
		denom = 4;
		rat1 = new RationalNumberImpl_Khan(num,denom);
		
		num2 = 0;
		denom2 = 5;
		rat2 = new RationalNumberImpl_Khan(num2,denom2);
		
		r3 = new RationalNumberImpl_Khan(num,denom);
		
		r3 = RationalNumberUtils_Khan.add(rat1, rat2);
		assertNum = r3.getNumerator();
		assertDenom = r3.getDenominator();
		assertEquals(assertNum, -1);
		assertEquals(assertDenom, 4);
		
		num = -1;
		denom = 8;
		rat1 = new RationalNumberImpl_Khan(num,denom);
		
		num2 = -8;
		denom2 = 2;
		rat2 = new RationalNumberImpl_Khan(num2,denom2);
		
		r3 = new RationalNumberImpl_Khan(num,denom);
		
		r3 = RationalNumberUtils_Khan.add(rat1, rat2);
		assertNum = r3.getNumerator();
		assertDenom = r3.getDenominator();
		assertEquals(assertNum, -33);
		assertEquals(assertDenom, 8);
		System.out.println("TEST SUCCESFULLY COMPLETED");
		
	}
	@Test
	void subtract() 
	{
		System.out.println("NOW SUBTRATING FRACTIONS");
		int num = 1;
		int denom = 4;
		RationalNumber rat1 = new RationalNumberImpl_Khan(num,denom);
		
		int num2 = 1;
		int denom2 = 4;
		RationalNumber rat2 = new RationalNumberImpl_Khan(num2,denom2);
		
		RationalNumber r3 = new RationalNumberImpl_Khan(num,denom);
		
		r3 = RationalNumberUtils_Khan.subtract(rat1, rat2);
		int assertNum = r3.getNumerator();
		int assertDenom = r3.getDenominator();
		assertEquals(assertNum, 0);
		assertEquals(assertDenom, 1);
		
		num = -1;
		denom = 4;
		rat1 = new RationalNumberImpl_Khan(num,denom);
		
		num2 = 2;
		denom2 = 7;
		rat2 = new RationalNumberImpl_Khan(num2,denom2);
		
		r3 = new RationalNumberImpl_Khan(num,denom);
		
		r3 = RationalNumberUtils_Khan.subtract(rat1, rat2);
		assertNum = r3.getNumerator();
		assertDenom = r3.getDenominator();
		assertEquals(assertNum, -15);
		assertEquals(assertDenom, 28);
		
		num = -1;
		denom = 4;
		rat1 = new RationalNumberImpl_Khan(num,denom);
		
		num2 = 0;
		denom2 = 5;
		rat2 = new RationalNumberImpl_Khan(num2,denom2);
		
		r3 = new RationalNumberImpl_Khan(num,denom);
		
		r3 = RationalNumberUtils_Khan.subtract(rat1, rat2);
		assertNum = r3.getNumerator();
		assertDenom = r3.getDenominator();
		assertEquals(assertNum, -1);
		assertEquals(assertDenom, 4);
		
		num = -1;
		denom = 8;
		rat1 = new RationalNumberImpl_Khan(num,denom);
		
		num2 = -8;
		denom2 = 2;
		rat2 = new RationalNumberImpl_Khan(num2,denom2);
		
		r3 = new RationalNumberImpl_Khan(num,denom);
		
		r3 = RationalNumberUtils_Khan.subtract(rat1, rat2);
		assertNum = r3.getNumerator();
		assertDenom = r3.getDenominator();
		assertEquals(assertNum, 31);
		assertEquals(assertDenom, 8);
		
		
		num = 10;
		denom = 8;
		rat1 = new RationalNumberImpl_Khan(num,denom);
		
		num2 = 1;
		denom2 = 2;
		rat2 = new RationalNumberImpl_Khan(num2,denom2);
		
		r3 = new RationalNumberImpl_Khan(num,denom);
		
		r3 = RationalNumberUtils_Khan.subtract(rat1, rat2);
		assertNum = r3.getNumerator();
		assertDenom = r3.getDenominator();
		assertEquals(assertNum, 3);
		assertEquals(assertDenom, 4);
		System.out.println("TEST SUCCESFULLY COMPLETED");
	}
	
	@Test
	void multiply() 
	{
		System.out.println("NOW MULTIPLYING FRACTIONS");
		int num = 1;
		int denom = 4;
		RationalNumber rat1 = new RationalNumberImpl_Khan(num,denom);
		
		int num2 = 1;
		int denom2 = 4;
		RationalNumber rat2 = new RationalNumberImpl_Khan(num2,denom2);
		
		RationalNumber r3 = new RationalNumberImpl_Khan(num,denom);
		
		r3 = RationalNumberUtils_Khan.multiply(rat1, rat2);
		int assertNum = r3.getNumerator();
		int assertDenom = r3.getDenominator();
		assertEquals(assertNum, 1);
		assertEquals(assertDenom, 16);
		
		num = -1;
		denom = 4;
		rat1 = new RationalNumberImpl_Khan(num,denom);
		
		num2 = 2;
		denom2 = 7;
		rat2 = new RationalNumberImpl_Khan(num2,denom2);
		
		r3 = new RationalNumberImpl_Khan(num,denom);
		
		r3 = RationalNumberUtils_Khan.multiply(rat1, rat2);
		assertNum = r3.getNumerator();
		assertDenom = r3.getDenominator();
		assertEquals(assertNum, -1);
		assertEquals(assertDenom, 14);
		
		num = -1;
		denom = 4;
		rat1 = new RationalNumberImpl_Khan(num,denom);
		
		num2 = 0;
		denom2 = 5;
		rat2 = new RationalNumberImpl_Khan(num2,denom2);
		
		r3 = new RationalNumberImpl_Khan(num,denom);
		
		r3 = RationalNumberUtils_Khan.multiply(rat1, rat2);
		assertNum = r3.getNumerator();
		assertDenom = r3.getDenominator();
		assertEquals(assertNum, 0);
		assertEquals(assertDenom, 1);
		
		num = -1;
		denom = 8;
		rat1 = new RationalNumberImpl_Khan(num,denom);
		
		num2 = -8;
		denom2 = 2;
		rat2 = new RationalNumberImpl_Khan(num2,denom2);
		
		r3 = new RationalNumberImpl_Khan(num,denom);
		
		r3 = RationalNumberUtils_Khan.multiply(rat1, rat2);
		assertNum = r3.getNumerator();
		assertDenom = r3.getDenominator();
		assertEquals(assertNum, 1);
		assertEquals(assertDenom, 2);
		
		System.out.println("TEST SUCCESFULLY COMPLETED");
	}
	@Test
	void divide() 
	{
		System.out.println("NOW DIVIDING FRACTIONS");
		int num = 1;
		int denom = 4;
		RationalNumber rat1 = new RationalNumberImpl_Khan(num,denom);
		
		int num2 = 1;
		int denom2 = 4;
		RationalNumber rat2 = new RationalNumberImpl_Khan(num2,denom2);
		
		RationalNumber r3 = new RationalNumberImpl_Khan(num,denom);
		
		r3 = RationalNumberUtils_Khan.divide(rat1, rat2);
		int assertNum = r3.getNumerator();
		int assertDenom = r3.getDenominator();
		assertEquals(assertNum, 1);
		assertEquals(assertDenom, 1);
		
		num = -1;
		denom = 4;
		rat1 = new RationalNumberImpl_Khan(num,denom);
		
		num2 = 2;
		denom2 = 7;
		rat2 = new RationalNumberImpl_Khan(num2,denom2);
		
		r3 = new RationalNumberImpl_Khan(num,denom);
		
		r3 = RationalNumberUtils_Khan.divide(rat1, rat2);
		assertNum = r3.getNumerator();
		assertDenom = r3.getDenominator();
		assertEquals(assertNum, -7);
		assertEquals(assertDenom, 8);
		
		num = -1;
		denom = 4;
		rat1 = new RationalNumberImpl_Khan(num,denom);
		
		num2 = 16;
		denom2 = 5;
		rat2 = new RationalNumberImpl_Khan(num2,denom2);
		
		r3 = new RationalNumberImpl_Khan(num,denom);
		
		r3 = RationalNumberUtils_Khan.divide(rat1, rat2);
		assertNum = r3.getNumerator();
		assertDenom = r3.getDenominator();
		assertEquals(assertNum, -5);
		assertEquals(assertDenom, 64);
		
		num = -1;
		denom = 8;
		rat1 = new RationalNumberImpl_Khan(num,denom);
		
		num2 = -8;
		denom2 = 2;
		rat2 = new RationalNumberImpl_Khan(num2,denom2);
		
		r3 = new RationalNumberImpl_Khan(num,denom);
		
		r3 = RationalNumberUtils_Khan.divide(rat1, rat2);
		assertNum = r3.getNumerator();
		assertDenom = r3.getDenominator();
		assertEquals(assertNum, 1);
		assertEquals(assertDenom, 32);
		
		System.out.println("TEST SUCCESFULLY COMPLETED");
	}
	
	@Test
	void negate() 
	{
		System.out.println("NOW TESTING NEGATING FRACTIONS");
		int num = 0;
		int denom = 6;
		RationalNumber rat1 = new RationalNumberImpl_Khan(num,denom);
		rat1 = RationalNumberUtils_Khan.negate(rat1);
		
		int assertNum = rat1.getNumerator();
		int assertDenom = rat1.getDenominator();
		assertEquals(assertNum, 0);
		assertEquals(assertDenom, 1);
		
		num = 5;
		denom = 10;
		RationalNumber rat2 = new RationalNumberImpl_Khan(num,denom);
		rat2 = RationalNumberUtils_Khan.negate(rat2);
		
		assertNum = rat2.getNumerator();
		assertDenom = rat2.getDenominator();
		assertEquals(assertNum, -1);
		assertEquals(assertDenom, 2);
		
		num = -10;
		denom = 2;
		RationalNumber rat3 = new RationalNumberImpl_Khan(num,denom);
		rat3 = RationalNumberUtils_Khan.negate(rat3);
		
		assertNum = rat3.getNumerator();
		assertDenom = rat3.getDenominator();
		assertEquals(assertNum, 5);
		assertEquals(assertDenom, 1);
		
		num = 3;
		denom = -8;
		RationalNumber rat4 = new RationalNumberImpl_Khan(num,denom);
		rat4 = RationalNumberUtils_Khan.negate(rat4);
		
		assertNum = rat4.getNumerator();
		assertDenom = rat4.getDenominator();
		assertEquals(assertNum, 3);
		assertEquals(assertDenom, 8);
		System.out.println("TEST SUCCESFULLY COMPLETED");
	}
}