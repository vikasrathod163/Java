package level_5;

import java.util.Scanner;

public class OddSum {

    public static int odds(int n){
        int sum = 0;
        for(int i = 1;i <= n;i+=2){
            sum = sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int n = sc.nextInt();
        System.out.println("Sum of Odd Numbers till "+n+" : "+odds(n));

        sc.close();
    }
}
