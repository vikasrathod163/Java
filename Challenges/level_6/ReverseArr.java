package level_6;


import java.util.Scanner;

public class ReverseArr {

    public static int[] rev(int arr[]){
        int reversed[] = new int[arr.length];

        int cnt = 0;
        for(int i = arr.length-1;i >= 0;i--){
            reversed[i] = arr[cnt];
            cnt++;
        }
        return reversed;
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


        System.out.println("Original Array - ");
        for(int ele:ar){
            System.out.print(ele+" ");
        }

        int a[] = rev(ar);

        System.out.println("\nReversed Array - ");
        for(int ele:a){
            System.out.print(ele+" ");
        }

        sc.close();
    }
}
