public class A{
public static void main(String[] args)
{
string str = "hii/its me kush/how are you";
Scanner s = new Scanner(str)
System.out.println("boolean check" + s.hasNextBoolean());
s.useDelimiter("/");
System.out.println("print token used")
	
while(s.hasNext()){
System.out.println(s.next());

}
System.out.println("delimiter" = s.delimiter());


}



}