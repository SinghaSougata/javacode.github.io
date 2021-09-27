package countdigit;
import java.util.*;
public class Countdigit {
	public static void main(String ags[]) {
		Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
		    int count=0;
		    while(n>0) {
		    	n=n/10;
		    	count++;
		    }
		    System.out.println(count);
		}
}
