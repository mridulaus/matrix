import java.util.Scanner;
 
public class ExampleTri2 {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
          System.out.println("enter the  number");
         
        int row = sc.nextInt();
           for (int i = 1; i <= row; i++) 
        {
            for (int j = 1; j<=row ; j++){
          
if  (i + j >row )
System.out.print(  j + "");
else 
System.out.print(" ");    
}    
System.out.println();
}    
    }
}