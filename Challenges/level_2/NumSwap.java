package level_2;

public class NumSwap {
    public static void main(String[] args) {
        int a = 23;
        int b = 43;

        System.out.println("Before swaping : a - "+a+" b - "+b);

        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("After swaping : a - "+a+" b - "+b);
    }
}
