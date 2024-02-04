package Codes.datatypes;

public class typecast {
    public static void main(String[] args) {
        byte b = 20;
        int i = 200;
        long l = 10000;

        System.out.println(b);
        //int a = int(l); we cannot convert long in int
        int a = (int)l;
        System.out.println(a);

        short s1 = (short)i;
        System.out.println(s1);



        System.out.println();

        float f = 3.33f;

        double d1 = f;
        System.out.println(d1);

       // float f1 = d; not allowed
       float f1 = (float)d1;

       System.out.println(f1);
        
    }
}
