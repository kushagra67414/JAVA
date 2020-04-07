

public class Generic2 {
	public static void main(String []arg) {
		
	mydata<String>	m1 = new mydata<String>();
	mydata<Integer>	m2 = new mydata<Integer>();
	Integer k = new  Integer(5);
	m1.add(k);
	m2.add("rahul");
	System.out.println("m1 :" + m1.get() + "m2 :: " + m2.get());
		
		
	}
	
}

class mydata<T>{
	T i;
	public void add(T i) {
	this.i =i;
	}
	
	public T get() {
		return (i) ;
	}
	
}
