import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Day2Operators {

   

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    	
        double tip=meal_cost*tip_percent/100;
        double tax=meal_cost*tax_percent/100;
        int totalCost=(int)Math.round(meal_cost+tip+tax);
        System.out.print(totalCost);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}
