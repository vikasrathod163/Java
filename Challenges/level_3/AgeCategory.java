package level_3;

import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age : ");
        int age = sc.nextInt();


        if(age < 13){
            System.out.println("Child");
        }
        else if(age < 20){
            System.out.println("Teen");
        }
        else if(age < 60){
            System.out.println("Adult");
        }
        else if(age > 60 && age <= 100){
            System.out.println("Senior");
        }
        else{
            System.out.println("Enter Age between 0 to 100");
        }
        
        sc.close();
    }
}
