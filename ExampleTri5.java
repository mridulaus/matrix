import java.util. Scanner;

class ExampleTri5 {  
public static void main(String args[]){     
Scanner sc= new Scanner (System.in); 
System.out.println("Enter the number of row ");
 int  row =  sc.nextInt( );
int num = 1;
System.out.println("Here is the pattern "); 
for(int i=1;i<=row;i++){    

for(int j=1 ;j<=row;j++){   


if  (i + j <= row+1 && i >= j    ){
System.out.print(num + " ");
num = num+2;
}
else 
System.out.print("   ");    
}    
System.out.println();
}    
}}  