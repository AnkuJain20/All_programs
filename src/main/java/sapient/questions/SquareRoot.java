package sapient.questions;

public class SquareRoot {
    public static void main(String[] args) {
        int num = 7;
        int squareRootOfInteger = squareRoot(num);
        System.out.println(squareRootOfInteger);
    }

    private static int squareRoot(int num) {
        int ans =1;
        while(ans*ans<num){
            ans++;
        }
        if (ans* ans ==num) {
            return ans;
        }
        else{
            return  (ans-1);
        }
    }
}
