package coderpad;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {13, 2, 7, 14, 6};
        int secondSmallest = secondSmallest(arr);
        System.out.println("second smallest number is "+ secondSmallest);
    }

    private static int secondSmallest(int[] arr) {

        int min = Integer.MAX_VALUE;
        int min1 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num <= min) {
                min1 = min;
                min = num;
            } else {
                if (num > min && num <= min1) {
                    min1 = num;
                }
            }
        }
        return min1;
    }
}
