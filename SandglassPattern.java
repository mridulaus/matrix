import java.util. Scanner;

class SandglassPattern {  
public static void main(String args[]){     
Scanner s= new Scanner (System.in); 
System.out.println("Enter the number of row ");


 byte c =  s.nextByte( );
for(int i=1;i<=c;i++){    

for(int j=1 ;j<=c;j++){    

if  ((i + j <= c+1 && i <= j)  || (i >= j     && i + j >  c))
System.out.print(i + "" + j + " ");

else 
System.out.print("   ");    
}    
System.out.println();
}    
}} 