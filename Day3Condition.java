import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Day3Condition {

	public static void main(String[] args) {
		
		int n;
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		if(n%2 != 0) {
			System.out.println("Weird");
		}
		else if(n%2==0 && n<5 && n>1) {
			System.out.println("Not Weird");
		}
		else if(n%2==0 && n>=6 && n<=20) {
			System.out.println("Weird");
		}
		else if(n%2==0 && n>20) {
			System.out.println("Not Weird");
		}
		

	}

}
