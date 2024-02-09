package Challenges.level_6;

import java.util.Scanner;

public class IsSorted {

    public static boolean isSortedA(int ar[]){
        for(int i = 0;i < ar.length-1;i++){
            if(ar[i] > ar[i+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean isSortedD(int ar[]){
        for(int i = 0;i < ar.length-1;i++){
            if(ar[i] < ar[i+1]){
                return false;
            }
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

        System.out.println("Array is in ascending order : "+isSortedA(ar));
        System.out.println("Array is in Descending order : "+isSortedD(ar));
        sc.close();
    }
}
