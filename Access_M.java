class A{  
protected void msg(){System.out.println("Hello java");}  
}  
  
public class Access_m extends A{  
void msg(){System.out.println("Hello java");}//C.T.Error  
 public static void main(String args[]){  
   Access_m obj=new Access_m();  
   obj.msg();  
   }  
} 