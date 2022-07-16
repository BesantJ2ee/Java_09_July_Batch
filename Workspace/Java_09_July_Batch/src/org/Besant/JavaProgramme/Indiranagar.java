package org.Besant.JavaProgramme;

public class Indiranagar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("123");
		System.out.println("Welcome");
		System.out.println("  Java");
		
		String str ="besant";
		System.out.println(str.hashCode());
		
		String str2 ="besa   nt";
		System.out.println(str2.hashCode());
		
		String str3 ="fbesant";
		System.out.println(str3.hashCode());
		
		String str4 =new String("fbesant");
		System.out.println(str4.charAt(0)+" "+str4.compareTo(str3));
		
		System.out.println(str4.charAt(0)+" "+str4.concat(str3));
		
		System.out.println(str4.substring(1));
		
		System.out.println(str4.length());
		
		System.out.println(str4.startsWith("f"));
		
		System.out.println(str4.startsWith("e"));
		
		System.out.println(str4.endsWith("e"));
		
		
		System.out.println(str2.trim());

		
	    String avsc="a,b,c,d,e";
	    

    	String[] a =avsc.split(",");
	    
	    for(int i=0;i<a.length;i++)
	    {
	    		    	
	    	System.out.println(a[i]);	
	    }
	    
	    
	    StringBuffer s = new StringBuffer("Toyota");
	    s.append(str3);
	    StringBuffer s2 = new StringBuffer("Toyota");
	    s2.capacity();
	    
	    StringBuffer s3 = new StringBuffer("Toyota");
	    s3.length();
	    
	    
	    
	    jvjvgjv gsdgs=new jvjvgjv();
	    gsdgs.sum();
	    
	    jvjvgjv vnsvksj= new jvjvgjv();
	    
	    vnsvksj.sum();
	    
		
		
	}

}
