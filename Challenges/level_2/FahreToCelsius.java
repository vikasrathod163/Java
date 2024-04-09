package level_2;

import java.util.Scanner;

public class FahreToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Tempreture in Fahrenheit : ");
        float fahra = sc.nextFloat();

        float celsius = (fahra-32)*5/9;

        System.out.println("Celsius : "+celsius);
        sc.close();
    }
}
