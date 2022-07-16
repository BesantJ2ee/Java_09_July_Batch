package org.Besant.JavaProgramme;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 126;

		
		a++;
		// byte is 8 bit value
		System.out.println(a);
		a++;
		System.out.println(a);
		
		
		//Short
		
		short s = 32767;
		s++;
		System.out.println(s);
		
		short r = -32768;
		r--; //Post Decrement
		--r; //Pre decrement
		System.out.println(r);
		
		//Long data type
		
		long a1 = 100000L; 
		long b1 = -200000l;
		
		char letterA = 'A';
		//char uses 2 byte in java, It is because java uses Unicode system not ASCII code system. The \u0000 is the lowest range of Unicode system
		
		char letterB='\u0000';
		
		char letterc='\uFFFF';
		
		
		System.out.println(letterB);
		System.out.println(letterc);
		
		int x = 10;
	   x += 5;

		
	}

}
