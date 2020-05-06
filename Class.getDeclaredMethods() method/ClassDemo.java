import java.lang.reflect.*;

public class ClassDemo {

   public static void main(String[] args) {

      ClassDemo cls = new ClassDemo();
      Class c = cls.getClass();

      // returns the array of Method objects 
      Method[] m = c.getDeclaredMethods();
	  
      for(int i = 0; i < m.length; i++) {
         System.out.println("method = " + m[i].toString());
      }
   }

   public ClassDemo() {
      // no argument constructor
   }   

   public void showString(String string1) {
      this.string1 = string1;
   }

   private void showInteger(Integer i) {
      this.i = i;
   }

   public Integer i = 10;
   private String string1 = "tutorialspoint"; 
} 