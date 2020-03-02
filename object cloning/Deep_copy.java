package cloning;

public class clon {
	
	public static void main(String[] args)
	
	{
		
		abc obj = new abc();
		obj.i=5;
		obj.j=7;
		
		abc obj1 = new abc();
		
		obj1.i = obj.i;
		obj1.j = obj.j;
		
		obj1.j= 10;
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


