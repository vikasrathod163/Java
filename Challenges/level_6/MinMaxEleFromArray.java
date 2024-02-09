package Challenges.level_6;

public class MinMaxEleFromArray {

    public static void minMax(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min : "+min+" Max : "+max);
    }
    public static void main(String[] args) {
        int ar[] = {2,5,343,53,32,5,-5,3,43,50,53,25,94,33};
        minMax(ar);
    }
}
