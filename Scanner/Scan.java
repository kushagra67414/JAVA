import java.util.Scanner; 
public class Scan 
{ 
    public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		char gender = sc.next().charAt(0);
		int age = sc.nextInt();
		long mob = sc.nextLong();
		
		
		System.out.println("name:"  + name);
		System.out.println("gender:"  + gender);
		System.out.println("age:"  + age);
		System.out.println("mob:"  + mob);
		
	}
	
}