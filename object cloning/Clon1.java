package cloning;

public class Clon1 {

	public static void main(String[] args) throws CloneNotSupportedException
	
	{
		
		Abc obj = new Abc();
		obj.i=5;
		obj.j=7;
		
		Abc obj1 = (Abc)obj.clone();
		
		
System.out.println(obj1);
		
		System.out.println(obj);

}
	
	
	
}


class Abc implements Cloneable
{
	
	int i;
	int j;
	public String toString() {
		
		return "Abc{" + "i=" + i + ",j=" + j +'}';
		
	}
	
public Object clone() throws CloneNotSupportedException
{
	return super.clone();
}

}
