import java.security.MessageDigest;
import java.util.Scanner;


public class Solution{
public static void main(String []arg) throws RuntimeException{


Scanner sc = new Scanner(System.in);
String s = sc.next();
try{
MessageDigest md= 	MessageDigest.getInstance("MD5");

md.update(s.getBytes());
byte[] digest = md.digest(); 
System.out.println(digest);
for(byte b: digest){
System.out.printf("%02x", b);
}
}	
catch(Exception e)
{
	System.out.println("error occur");
}
}
}