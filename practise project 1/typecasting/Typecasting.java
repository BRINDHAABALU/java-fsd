package typecasting;
public class typecast {
public static void main(String[] args) {
		System.out.println("Implicit Type Casting");
		char k='A';
		System.out.println("Value of k: "+k);
		
		int l=k;
		System.out.println("Value of l: "+l);
		
		float m=k;
		System.out.println("Value of m: "+m);
		
		long n=k;
		System.out.println("Value of n: "+n);
		
		double o=k;
		System.out.println("Value of o: "+o);
		
				
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		double x=45.5;
		int y=(int)x;
		System.out.println("Value of s: "+x);
		System.out.println("Value of t: "+y);
		
	}
}