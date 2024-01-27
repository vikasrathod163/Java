package Java.Codes.Operators;

import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1;
        int n2;

        System.out.println("Enter 1st number : ");
        n1 = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        n2 = sc.nextInt();

        int sum = n1+n2;
        int sub = n1-n2;
        int mul = n1*n2;
        int div = n1/n2;

        sc.close();
        System.out.println("SUM : "+sum+"\nSUB : "+sub+"\nMUL : "+mul+"\nDIV : "+div);
    }
}
