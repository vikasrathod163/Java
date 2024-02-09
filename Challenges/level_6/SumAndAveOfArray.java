package Challenges.level_6;

public class SumAndAveOfArray {

    public static void sumAndAve(int []arr){
        int sum = 0;
        float ave = 0;
        for(int element:arr){
            sum+=element;
        }
        ave = (float)sum/arr.length;
        System.out.printf("Sum of Array elements is : %d and Average is : %f",sum,ave);
    }
    public static void main(String[] args) {
        int arr[] = {3,4,9,8,7,1,5,5,55,5,6};
        sumAndAve(arr);
    }
}
