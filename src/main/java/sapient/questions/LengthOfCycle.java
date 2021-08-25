package sapient.questions;

public class LengthOfCycle {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0};
        int[] arr1 = {1,0,1};
        int[] arr2 = {1,3,4};

        int startIndex =0;
        int countOfCycle = lengthOfCycle(arr, startIndex);
        int countOfCycle1 = lengthOfCycle(arr1, startIndex);
        int countOfCycle2 = lengthOfCycle(arr2, startIndex);


        System.out.println("count of cycle is "+ countOfCycle);
        System.out.println("count of cycle is "+ countOfCycle1);
        System.out.println("count of cycle is "+ countOfCycle2);


    }

    private static int lengthOfCycle(int[] arr, int startIndex) {
        int index= startIndex;
        int counter=0;
        while(index>=0 && index< arr.length){
            index=arr[index];
            counter++;
            if(index==startIndex){
                return counter;
            }
        }
        return -1;
    }
}
