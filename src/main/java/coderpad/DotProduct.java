package coderpad;

public class DotProduct {
    public static void main(String[] args) {
        int[] arr1 = { 5,1,3};
        int[] arr2 = { 15,8,11};
       int sum= findDotProduct( arr1,arr2);
        System.out.println("Sum of dot products of two arrays is "+ sum);


    }

    private static int findDotProduct(int[] arr1, int[] arr2) {
        int sum=0;
        for(int i=0;i<arr1.length;i++){
            sum=sum+arr1[i]*arr2[i];
        }
        return sum;
    }
}
