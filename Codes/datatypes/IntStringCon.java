package Codes.datatypes;

public class IntStringCon {
    public static void main(String[] args) {

        //String to integer conversion

        String s = "328";
        String s2 = "387";

        int i = Integer.parseInt(s);
        int j = Integer.valueOf(s2);
        System.out.println(i);
        System.out.println(j);
        System.out.println(i+j);


        //Integer to String conversion

        int a = 30;
        int b = 12;
        System.out.println(a+b);

        String str = String.valueOf(a);
        String str2 = String.valueOf(b);

        System.out.println(str+str2);



    }
    
}
