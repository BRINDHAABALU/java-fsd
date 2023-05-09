
1.//default constructor
public class demo {
public static void main(String[] args) {
      emp emp1=new emp();
	emp emp2=new emp();

	emp1.display();
	emp2.display();
}

}

2.//parameterized constructor
public class std {
	int id;
	String name;

   std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
public class paramcon {
	public static void main(String[] args) {
	std Std1=new std(2,"Alex");
	std Std2=new std(10,"Annie");
	Std1.display();
	Std2.display();

}
}