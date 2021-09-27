package primenumber;
import java.util.*;
public class Primenumber {

	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				count++;
		}
		if(count==2)
			System.out.println("number is prime");
		else
			System.out.println("number is not prime");
	}
}
