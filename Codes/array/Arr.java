package Codes.array;

import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {


        int marks[] = new int[5]; //declaration of array with size 5
        marks[0] = 70;
        marks[1] = 80;
        marks[2] = 79;
        marks[3] = 68;
        marks[4] = 70;

        System.out.println(marks[2]);

        int ages[] = {23,53,22,33,54,23};
        System.out.println(ages[0]);

        System.out.println();

        for(int i = 0;i < ages.length;i++){
            System.out.println(ages[i]);
        }


        Scanner sc = new Scanner(System.in);
        int nums[] = new int[5];
        for(int j = 0;j < nums.length;j++){
            System.out.print("nums["+j+"] : ");
            nums[j] = sc.nextInt();
        }

        for(int j = 0;j < nums.length;j++){
            System.out.print("nums["+j+"] : ");
            System.out.print(nums[j]+" ");
        }


        sc.close();
    }
}
