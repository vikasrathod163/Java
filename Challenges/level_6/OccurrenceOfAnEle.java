package Challenges.level_6;

import java.util.Scanner;

public class OccurrenceOfAnEle {

    public static int occur(int ar[],int n){
        int oc = 0;
        for(int i = 0;i < ar.length;i++){
            if(ar[i] == n){
                oc++;
            }
        }
        return oc;
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

        // String s = "";
        // for(int i = 0;i < n;i++){
        //     if(s.contains(String.valueOf(ar[i]))){
        //         continue;
        //     }
        //     else{
        //         System.out.println("Occurrence of element - "+ar[i]+" : "+occur(ar, ar[i]));
        //         s = s+String.valueOf(ar[i]);
        //     }
        // }

        System.out.print("Enter the Element : ");
        int num = sc.nextInt();
        int cnt = occur(ar,num);
        System.out.println("Occurrence : "+cnt);
        sc.close();
    }
}
