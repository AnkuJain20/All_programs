package arrays.ques;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayOperations {

    public static void printArray(int[] array, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void printArrayInReverse(int[] array, int length) {
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void oddIndexPrint(int[] array, int length) {
        for (int i = 1; i < length; i = i + 2) {
            System.out.print(array[i] + " ");
        }
    }

    public static void evenIndexPrint(int[] array, int length) {
        for (int i = 0; i < length; i = i + 2) {
            System.out.print(array[i] + " ");
        }
    }

    public static void searchNumber(int[] array, int length) {
        int numberToSearch = 1;
        boolean isNumberPresentInArray = false;
        for (int i = 0; i < length; i++) {
            if (numberToSearch == array[i]) {
                isNumberPresentInArray = true;
                break;
            }
        }
        if (isNumberPresentInArray) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }
    }

    public static void countOccurrenceInArray(int[] array, int length) {
        int numberToSearch = 1;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (numberToSearch == array[i]) {
                count++;
            }
        }
        System.out.println("\n the count of " + numberToSearch + " is " + count);
    }

    public static void maxInArray(int[] array, int length) {
        int maxNUm = array[0];
        for (int i = 0; i < length; i++) {
            if (maxNUm < array[i]) {
                maxNUm = array[i];
            }

        }
        System.out.println(" maximum Number is " + maxNUm);
    }

    public static void minInArray(int[] array, int length) {
        int minNum = array[0];
        for (int i = 0; i < length; i++) {
            if (array[i] < minNum) {
                minNum = array[i];
            }
        }
        System.out.println("Minimum Number is " + minNum);
    }

    public static void sumOfArray(int[] array, int length) {
        int sum = array[0];
        for (int i = 1; i < length; i++) {
            sum = sum + array[i];
        }
        System.out.println(" sum of array is " + sum);
    }

    public static void create2DArrayAndPrint(){
        //Method1: for creating 2D Array and second num is optional
        int [] [] myarray = new int[2][];
        myarray[0] = new int[]{1,2,3};
        myarray[1] = new int[]{2,3,4,5};

        //Method 2:
        int [] [] myarray1 =  { { 8,3,4},{2,1,9,5}};

        for ( int i=0; i< myarray.length; i++){
            for (int j = 0; myarray[i].length > j; j++){
                System.out.println(myarray[i][j]);
            }
        }

    }

    public static void main(String[] args) {
        int [] array = {2,5,6,11,1,8,2};
        int length = array.length;


        System.out.println("Printing array");
        ArrayOperations.printArray(array,length);

        System.out.println("\nPrinting array in reverse order");
        ArrayOperations.printArrayInReverse(array, length);

        System.out.println("\nprinting odd index array");
        ArrayOperations.oddIndexPrint(array,length);

        System.out.println("\nprinting even index array");
        ArrayOperations.evenIndexPrint(array, length);

        ArrayOperations.searchNumber(array,length);

        ArrayOperations.countOccurrenceInArray(array, length);

        ArrayOperations.maxInArray( array, length);

        ArrayOperations.minInArray(array, length);

        ArrayOperations.sumOfArray(array, length);

        ArrayOperations.create2DArrayAndPrint();

        ArrayOperations.findDuplicate(array,length);

        ArrayOperations.merge3Array();

        ArrayOperations.sortArray(array);
    }

    private static void sortArray(int[] arrays) {

//        2 method
        Arrays.sort(arrays);
        int size= arrays.length;
        System.out.println("2 largest is "+ arrays[size-2]);

        int temp;
        for (int i=0; i< arrays.length;i++){
            for (int j=i+1;j< arrays.length;j++){
                if (arrays[i] >arrays[j]){
                    temp=arrays[i];
                    arrays[i]=arrays[j];
                    arrays[j]= temp;
                }
            }
        }
        System.out.println(" 2 largest in array is "+ arrays[size-2]);

        for(int i: arrays){
            System.out.print(i + " ");
        }

//
    }

    private static void merge3Array() {
        System.out.println("merging 3 arrays");
        int[] arr1= {1,2,3,4};
        int[] arr2= {5,6,7};
        int[] arr3= {8,9};

        int mergedArraySize = arr1.length+arr2.length + arr3.length;

        int[] mergedArray = new int[mergedArraySize];

        int currentIndex = 0;
        
        for(int i = 0; i< arr1.length;i++){
            mergedArray[currentIndex] = arr1[i];
            currentIndex++;
        }


        for(int i = 0; i< arr2.length;i++){
            mergedArray[currentIndex] = arr2[i];
            currentIndex++;
        }

        for(int i = 0; i< arr3.length;i++){
            mergedArray[currentIndex] = arr3[i];
            currentIndex++;
        }

        for(int i: mergedArray){
            System.out.print(i+ " " );
        }


    }

    private static void findDuplicate(int[] array, int length) {
        Set<Integer> mySet = new HashSet<>();
        for(int i=0;i<length;i++){
            int currentNum = array[i];

            if(mySet.contains(currentNum)){
                System.out.println("Duplicate number is: " + currentNum);
            } else {
                mySet.add(currentNum);
            }

        }

    }

}







