import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1dataType {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        
        Scanner scan = new Scanner(System.in);
        
        int num1;
        double num2;
        String str;
        
        num1 = scan.nextInt();
        num2 = scan.nextDouble();
        scan.nextLine();
        str =  scan.nextLine();
        
        System.out.println(num1+i);
        System.out.println(num2+d);
        System.out.println(s.concat(str));
        
        
        scan.close();    
    }
}