import java.lang.reflect.Method;
public class Kush{ 
  
    // Main method 
    public static void main(String[] args) 
    { 
  
        try { 
            // create class object 
            Class classobj = Kush.class; 
  
            // get list of methods 
            Method[] methods = classobj.getMethods(); 
  
            // get the name of every method present in the list 
            for (Method method : methods) { 
  
                String MethodName = method.getName(); 
                System.out.println("Name of the method: "
                                   + MethodName); 
            } 
        } 
        catch (Exception e) { 
            e.printStackTrace(); 
        } 
    } 
  
    // method name setValue 
    public static int setValue() 
    { 
        System.out.println("setValue"); 
        return 24; 
    } 
  
   
} 