	import java.util.Scanner; 
  
public class Scan2
{ 
    public static void main(String[] args) 
    { 
         
        Scanner sc = new Scanner(System.in); 
  
         
        int sum = 0, count = 0; 
		
    ;
        while (sc.hasNextInt()) 
        { 

            int num = sc.nextInt(); 
            sum += num; 
            count++; 

			
        } 
        int avg = sum / count; 
        
		System.out.println("Mean: " + avg); 
    } 
} 