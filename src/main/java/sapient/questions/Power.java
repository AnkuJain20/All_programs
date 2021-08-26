package sapient.questions;

public class Power {
    public static void main(String[] args) {
      int base=4;
      int exponent=3;
      int answer =checkPower(base, exponent);
      System.out.println(answer);
    }
    //number should be 0 0r gretaer than zero and must be integer.

    private static int checkPower(int base, int exponent) {
        int ans = 1;
        for(int i=0;i<exponent;i++){
            ans = ans* base;
        }
        return ans;
    }
}
