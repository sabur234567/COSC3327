 package rationalnumbers;
import rationalnumbers.RationalNumber;
import rationalnumbers.RationalNumberImpl_Khan;

public class RationalNumberUtils_Khan {

		//rv = r1+r2 
		public static RationalNumber add(RationalNumber r1, RationalNumber r2)
		{
			
			int commondenom = r1.getDenominator() * r2.getDenominator();
			int num1 = r1.getNumerator() * r2.getDenominator();
			int num2 = r2.getNumerator() * r1.getDenominator();
			int sum = num1 + num2;

			RationalNumber rationalnum = new RationalNumberImpl_Khan(sum, commondenom);
			return rationalnum;
			
		}
		//rv = r1 -21
		public static RationalNumber subtract(RationalNumber r1, RationalNumber r2)
		{
			int commondenom = r1.getDenominator() * r2.getDenominator();
			int num1 = r1.getNumerator() * r2.getDenominator();
			int num2 = r2.getNumerator() * r1.getDenominator();
			int difference = num1 - num2;
			
			return new RationalNumberImpl_Khan(difference,commondenom);
		}
		// rv = r1*r2
		public static RationalNumber multiply(RationalNumber r1, RationalNumber r2)
		{
			int num = r1.getNumerator() * r2.getNumerator();
			int denom = r1.getDenominator() * r2.getDenominator();
			
			return new RationalNumberImpl_Khan(num,denom);
		}
		//rv =  r1/r2 reverse num and denomo for r2 then multiply 
		public static RationalNumber divide(RationalNumber r1, RationalNumber r2)
		{
			assert r1.getNumerator() != 0 : "Numerator with a 0 cannot be divided";
			assert r2.getNumerator() != 0: "Numerator with a 0 cannot be divided";
			
			int num2 = r2.getDenominator();
			int denom2 = r2.getNumerator();
			
			int num3 = r1.getNumerator() * num2;
			int denom3 = r1.getDenominator() * denom2;
			
			return new RationalNumberImpl_Khan(num3,denom3);
		}
		// rv = -r1
		public static RationalNumber negate(RationalNumber r1)
		{
			
			int num3 = -(r1.getNumerator());
			int denom3 = (r1.getDenominator());
			return new RationalNumberImpl_Khan(num3,denom3);
		}

		
}
