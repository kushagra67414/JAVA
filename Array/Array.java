class Array{
public static void main(String args[]){

int b[]=new int[5];//declaration and instantiation  
b[0]=10;//initialization  
b[1]=20;  
b[2]=70;  
b[3]=40;  
b[4]=50;  
  
for(int i=0;i<b.length;i++){
System.out.println(b[i]);  
}

int a[]={33,3,4,5};


for(int i=0;i<a.length;i++)
System.out.println(a[i]);

int arr[]={33,3,4,5};  
//printing array using for-each loop  
for(int i:arr)  
System.out.println(i);

}}
