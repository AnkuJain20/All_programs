package coderpad;

public class SmallestNumber {
    public static void main(String[] args) {
        int[] arr = { 7,5,12,22,8};
    int minNum   =  smallestNumber( arr);
        System.out.println("smallest number is "+ minNum);
    }

    private static int smallestNumber(int[] arr) {
        int min= arr[0];
        for(int i=0;i< arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
