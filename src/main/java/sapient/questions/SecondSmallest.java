package sapient.questions;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {13, 2, 7, 14, 6};
        int secondSmallest = secondSmallest(arr);
        System.out.println("second smallest number is "+ secondSmallest);
    }

    private static int secondSmallest(int[] arr) {

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currNum = arr[i];
            if (currNum <= min1) {
                min2 = min1;
                min1 = currNum;
            } else {
                if (currNum > min1 && currNum <= min2) {
                    min2 = currNum;
                }
            }
        }
        return min2;
    }
}
