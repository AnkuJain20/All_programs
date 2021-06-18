package important.misc;

public class PrintPattern {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("pattern is  ");
        for (int j = 2; j <= n + 1; j++) {
            for (int i = 1; i < j; i++) {
                System.out.print("*" + "");
            }
            System.out.println();
        }
    }
}


