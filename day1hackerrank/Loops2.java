
import java.util.Scanner;

class Solution {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // number of queries

        for (int i = 0; i < t; i++) {
            int a = in.nextInt(); // starting value
            int b = in.nextInt(); // multiplier
            int n = in.nextInt(); // number of terms

            int sum = a; // running total
            for (int j = 0; j < n; j++) {
                sum += b * Math.pow(2, j); // add b * 2^j
                System.out.print(sum + " "); // print each term
            }
            System.out.println(); // new line after each query
        }

        in.close();
    }
}
