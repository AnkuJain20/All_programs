package sapient.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MedianSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {5, 9, 12, 15};
        int[] arr2 = {7, 11, 15, 17};

        List<Integer> resultList = new ArrayList<>();
        for(int i: arr1){
            resultList.add(i);
        }
        for(int i: arr2){
            resultList.add(i);
        }

        Collections.sort(resultList);
        System.out.println("soreted list");
        for(int k: resultList){
            System.out.print( k + " ");
        }


//        double medianNumber = medianArray(arr1, arr2);
//        System.out.println("median number is "+ medianNumber);

    }

    private static double medianArray(int[] arr1, int[] arr2) {
        int totalLen = arr1.length + arr2.length;
        int[] mergedArray = new int[totalLen];
        int countera = 0, counterb = 0, counterR = 0;

        while (counterR < totalLen) {
            if((countera < arr1.length && counterb<arr2.length)) {
                if (arr1[countera] < arr2[counterb]) {
                    mergedArray[counterR] = arr1[countera];
                    countera++;
                }
                else {
                    mergedArray[counterR] = arr2[counterb];
                    counterb++;
                }
            }
            else {

                if (countera < arr1.length) {
                    mergedArray[counterR] = arr1[countera];
                    countera++;

                }
                else {
                    mergedArray[counterR] = arr2[counterb];
                    counterb++;
                }

            }
            counterR++;

        }

        for (int i = 0 ; i < totalLen ; i++) {
            System.out.println(mergedArray[i]);
        }

        if (counterR%2==0){
            double med= (mergedArray[(totalLen/2)]+mergedArray[(totalLen/2)-1])/2.0;
            return med;
        }
        else{
            return mergedArray[totalLen/2];
        }

    }


}
