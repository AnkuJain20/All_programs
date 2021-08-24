package coderpad;

public class AddTwoFractions {

    public static void main(String[] args) {
        int [] data1 = {2,5};
        int [] data2 = {2,7};

        int [] result = addTwoFraction(data1,data2);

        System.out.println("result num: " + result[0] + " deno:" + result[1]);

    }

    private static int[] addTwoFraction(int[] data1, int[] data2) {
        int[] result;
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
