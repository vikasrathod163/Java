package level_3;

import java.util.Scanner;

public class gradeCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1,m2,m3,m4,m5;

        System.out.print("Enter Marks of Subject 1 : ");
        m1 = sc.nextInt();
        System.out.print("Enter Marks of Subject 2 : ");
        m2 = sc.nextInt();
        System.out.print("Enter Marks of Subject 3 : ");
        m3 = sc.nextInt();
        System.out.print("Enter Marks of Subject 4 : ");
        m4 = sc.nextInt();
        System.out.print("Enter Marks of Subject 5 : ");
        m5 = sc.nextInt();

        int total = m1+m2+m3+m4+m5;
        System.out.print("Total Marks : "+total+"\n");

        float per = total/5;
        System.out.println("Percentage : "+per);

        if(per > 90){
            System.out.println("Grade : A");
        }
        else if(per > 75){
            System.out.println("Grade : B");
        }
        else if(per > 60){
            System.out.println("Grade : C");
        }
        else if(per > 30){
            System.out.println("Grade : D");
        }
        else{
            System.out.println("Grade : F");
        }

        sc.close();
    }
}
