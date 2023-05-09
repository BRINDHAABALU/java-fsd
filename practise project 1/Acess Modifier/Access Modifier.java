1.//default
package acessmodifier;
public class acess {
	  void display() 
	     { 
	         System.out.println("You are using defalut access specifier"); 
	     } 
	} 

public class defau {
public static void main(String[] args)
 {
	System.out.println("Dafault Access Specifier");
	acess obj = new acess(); 		  
      obj.display(); 


}
}

2.//private
public class B {
	   private void display() 
	    { 
	        System.out.println("You are using private access specifier"); 
	    } 

}
public class priacess {
	public static void main(String[] args) {
		System.out.println("Private Access Specifier");
		B  obj = new B(); 
            obj.display();
    

	}
}

3.//protected
public class C {
	protected void display() 
    { 
        System.out.println("This is protected access specifier"); 
    } 

}
public class proacess extends C{
	public static void main(String[] args) {
			proacess obj = new proacess ();   
		obj.display();  
	}
}
4.//public
public class D {
	public void display() 
    { 
        System.out.println("This is Public Access Specifiers"); 
    } 

}
public class pubacess {
public static void main(String[] args) {
		D obj = new D(); 
        obj.display();  

}
}
