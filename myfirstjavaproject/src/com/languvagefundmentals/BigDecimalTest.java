package com.languvagefundmentals;
import java.math.BigDecimal;
import java.math.BigInteger;
public class BigDecimalTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 BigInteger bi  = new BigInteger("1231245346457757585686586586");
		 BigInteger Bi2 = new BigInteger("864833567356378533463865");
		 
		 BigInteger x = Bi2.add(bi);
		 System.out.println("Big inetegr="+x);
		 
		BigDecimal bd  = new BigDecimal("12312453464577575.85686586586");
		 BigDecimal Bd2 = new BigDecimal("8648.3567356378533463865");
		 
		 BigDecimal y = Bd2.add(Bd2);
		 System.out.println("BIG DECIMAL ="+y);
	}

}
