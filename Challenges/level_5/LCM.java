package Challenges.level_5;

public class LCM {

    public static int lcm(int a, int b){
        int i = 1;
        while(true){
            int factor = a*i;
            if(factor%b == 0){
                return factor;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(lcm(15,40));
    }
}
