package greatest;
import java.util.Scanner;
public class Greatest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();
         if(a>b && a>c)
        	 System.out.println("the greatest number between 3 number is: "+a);
         else if(b>a && b>c)
        	 System.out.println("the greatest number between 3 number is: "+b);
         else
        	 System.out.println("the greatest number between 3 number is: "+c);
        	 
  }
	
	
}

