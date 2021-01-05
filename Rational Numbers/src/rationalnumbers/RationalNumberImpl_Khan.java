package rationalnumbers;

public class RationalNumberImpl_Khan implements RationalNumber {
	private int r1;
	private int r2;
	
	// 0/4
	// 2/2
	// -2/4 = -1/2
	// 5/3
	// -2/-4 = 1/2
	// 2/-4 =  -1/2
	// 4/2 .getNumerator is 2
	public RationalNumberImpl_Khan(int a, int b)
	{
		assert b !=0 : "Denominator cannot be 0";

			
		int gcd = 0;
		
		boolean numIsNeg = false;
		boolean denomIsNeg = false;
		
		if(a==0)
		{
			this.r1=0;
			this.r2=1;
		}
		else
		{
			// finds gcd
			if(a<0)
			{
				a= a*(-1);
				numIsNeg = true;
			}
			if(b<0)
			{
				b = b*(-1);
				denomIsNeg = true;
			}
			for(int i = 1; i <= a && i <= b; i++)
			{
				if(a % i==0 && b % i==0)
					gcd = i;
			}
			//check for negatives
			if(numIsNeg && denomIsNeg)
			{
				this.r1 = a/gcd;
				this.r2 = b/gcd;
			}
			else if(numIsNeg && !denomIsNeg)
			{
				this.r1 =-(a)/gcd;
				this.r2= b/gcd;
			}
			else if(!numIsNeg && denomIsNeg)
			{
				this.r1 = -(a)/gcd; //keep the num with negative sign
				this.r2 = b/gcd;
			}
			else if(!numIsNeg && !denomIsNeg)
			{
				this.r1 = a/gcd;
				this.r2 = b/gcd;
			}
		}
				
		
	}
	public int getNumerator()
	{
		return this.r1;
	}
	public int getDenominator()
	{
		assert r2>0;
		
		return this.r2;
	}
	public double getValue()
	{
		return (double)this.r1 /(double)this.r2;
	}
	public String toString()
	{
		String fraction = r1 + "/" + r2;
		return fraction;
	}
	
}
