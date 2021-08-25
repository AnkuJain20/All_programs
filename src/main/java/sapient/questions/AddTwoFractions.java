package sapient.questions;

public class AddTwoFractions {

    public static void main(String[] args) {

        int [] data11 = {3,8};
        int [] data12 = {7,8};
        int [] result2 = addTwoFraction(data11,data12);

        if(result2[0] == 5 && result2[1] == 4){
            System.out.println("test passed");
        }
        /***
         *
         */

    }

    private static int[] addTwoFraction(int[] data1, int[] data2) {
        int num = data1[0]*data2[1]+data1[1]*data2[0];
        int deno= data1[1]*data2[1];
        int maxNum = Math.max(num,deno);
        for(int i=2;i<=maxNum;i++){
            while(num%i==0 && deno % i == 0){
                num=num/i;
                deno = deno/i;
            }
        }
        return new int[]{num, deno};
    }

}
