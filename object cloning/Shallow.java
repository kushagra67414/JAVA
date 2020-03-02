package cloning;

public class Shallow {
	
	public static void main(String[] args)
	
	{
		
		abc obj = new abc();
		obj.i=5;
		obj.j=7;
		
		abc obj1 = obj;
		obj1.j=8;
		
		System.out.println(obj1);
		
		System.out.println(obj);
		
	}
	
}

class abc 
{
	
	int i;
	int j;
	public String toString() {
		
		return "abc{" + "i=" + i + ",j=" + j +'}';
		
	}
	
}


