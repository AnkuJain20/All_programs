package sapient.questions;

import java.util.Arrays;

public class SubArrayExceedsSum {
    public static void main(String[] args) {
        int [] arr = { 4,3,8,7};
        int threshhold =12;
       int countOfElements = subArrayExceedsSum( arr, threshhold);
        System.out.println("count of subarray is: "+ countOfElements);
    }
    // if threshold is greater than all the elements, thaen ans is -1.

    private static int subArrayExceedsSum(int[] arr, int threshhold) {
        int sum=0;
        int length = arr.length;
        int count=0;
        Arrays.sort(arr);
       for(int i=length-1;i>=0;i--){
           sum= sum +arr[i];
           count++;
           if (sum> threshhold){
               return count ;
           }
       }
       return -1;
    }
}
