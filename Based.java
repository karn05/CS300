//แปลงเลขฐานใด ๆ ไปยังเลขฐานใด ๆ
import java.util.Scanner;
public class Based {
	 public static void main(String []args) {
	        Scanner sc = new Scanner(System.in);
	        int sourceBase = sc.nextInt();
	        String sourceString = sc.next();
	        int destiBase = sc.nextInt();	        
	        System.out.println(Long.toString(Long.parseLong(sourceString, sourceBase), destiBase));
	    }
}
