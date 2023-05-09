1. //method
public class execution {
 public int multipynumbers(int a,int b) {
	int z=a*b;
	return z;
	}

public static void main(String[] args) {

	execution b=new execution();
	int ans= b.multipynumbers(10,3);
	System.out.println("Multipilcation is :"+ans);
	}

}

2.//callmethod
public class callmethod {
	int val=150;

	int operation(int val) {
		val =val*10/100;
		return(val);
	}

	public static void main(String args[]) {
		callmethod d = new callmethod();
		System.out.println("Before operation value of data is "+d.val);
		d.operation(100);
		System.out.println("After operation value of data is "+d.val);
		}

}

3.//overloading
public class overloading {
	public void area(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }

    public static void main(String args[])
   {

overloading ob=new overloading();
       ob.area(10,12);
       ob.area(5);  
   }

}






