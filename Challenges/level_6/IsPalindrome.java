package level_6;

import java.util.Scanner;

public class IsPalindrome {

    public static boolean isP(int arr[]){
        int i = 0; 
        while (i < arr.length / 2) {
            if(arr[i] != arr[arr.length-1-i]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of string : ");
        int n = sc.nextInt();

        int ar[] = new int[n];
        for(int i = 0;i < n;i++){
            System.out.print("Enter Element No - "+(i+1)+" : ");
            ar[i] = sc.nextInt();
            System.out.println();
        }
        boolean flag = isP(ar);
        if(flag){
            System.out.println("Given Array is Palindrome");
        }
        else{
            System.out.println("Given Array is Not Palindrome");
        }

        sc.close();
    }
}
