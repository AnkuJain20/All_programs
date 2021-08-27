package sapient.questions;

public class BinarySearch {
    public static void main(String[] args) {

        int [] arr = { 1,3,5,7,9,11,13};
        int number = 5;
        int SearchNumberIndex=binarySearch(arr, number);
        System.out.println("Index of search Number :"+ SearchNumberIndex);

    }

    private static int binarySearch(int[] arr, int number) {
        int startIndex =0;
        int endIndex= arr.length-1;
        while(startIndex<= endIndex){
            int mid= (startIndex+endIndex)/2;
            if ( arr[mid]==number){
                return  mid;
            }
            else if( arr[mid]>number){
                endIndex=mid-1;
            }
            else{
                startIndex= mid+1;
            }
        }
        return -1;
    }
}
