class Instance { }  
  
class Dog3 extends Instance {  

  static void method(Instance a) 
  {  
    if(a instanceof Dog3)
	{  
       Dog3 d=(Dog3)a;  //downcasting  
	   
       System.out.println("ok downcasting performed");  
    }  
  }  
   
  public static void main (String [] args) {  
  
    Instance a=new Dog3();  
	
    Dog3.method(a);  
  }  
    
 }  