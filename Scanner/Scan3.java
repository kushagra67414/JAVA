import java.util.*;  
public class Scan3
 {    
    public static void main(String[] args) 
	
	{  
         
		 
        Scanner scan = new Scanner(System.in);  
		//reading value
        while(scan.hasNext())
		{    
                if (scan.hasNextInt())

				{  
                     System.out.println("Found :" + scan.nextInt(16));  
                }  
				
             
             System.out.println("Not Found :" + scan.next());  
        }  
        scan.close();  
    }  
}  