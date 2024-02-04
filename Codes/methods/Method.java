package Codes.methods;

public class Method {
    // method without parameter and return value
    public static void greet(){
        System.out.println("Wellcome !");
    }

    // method with parameter but without return value
    public static void sum(int x,int y){
        int addition = x+y;
        System.out.println("Addition is "+addition);
    }

    // method without parameter but with return value
    public static int squreOf10(){
        int i = 10;
        return (i*i);
    }

    // method with parameter but with return value
    public static int greater(int x,int y){
      if(x < y){
        return y;
      }else{
        return x;
      }
    }



    public static void main(String[] args) {
        greet();
        sum(10, 20);
        int i = squreOf10();
        System.out.println("Square is : "+i);
        int gr = greater(11,20);
        System.out.println(gr);
        System.out.println(greater(100,100));
    }
}
