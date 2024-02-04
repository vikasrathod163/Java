public class logical {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        
        // 0011
        // 0100

        // 0000 - 0
        System.out.println(a&b); 

        // 0011
        // 0100

        // 0111
        System.out.println(a|b);

        // 0011
        // 0100
        
        // 0111

        System.out.println(a^b);

    }
}
