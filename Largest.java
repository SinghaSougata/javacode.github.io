package largest;
import java.util.*;
public class Largest {

	public static void main(String ags[]) {
		Scanner sc=new Scanner(System.in);{
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int large=0;
			for(int i=0;i<n;i++) {
				if(large<arr[i])
					large=arr[i];
			}
			System.out.println(large);
		}
	}
}
