package sapient.questions;

public class IspowerOf10 {
    public static void main(String[] args) {
        int number = 0;

       boolean result = isPowerOf10(number);
        System.out.println(result);
    }

    private static boolean isPowerOf10(int number) {
        int counter=0;
        if(number<=1){
            return false;
        }
        while(number !=1){
            if(number%10==0){
                number=number/10;
                counter++;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
