package collection.ques;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapOperations {

    private static void countOccurenceOfEachElementInStringArray() {
        String[] stringArray = {"bread", "butter", "and", "bread"};

        Map<String, Integer> wordAndCountMap = new HashMap<>();
        for (String str : stringArray) {
            boolean isMapContainsString = wordAndCountMap.containsKey(str);
            if (isMapContainsString) {
                int value = wordAndCountMap.get(str);
                wordAndCountMap.put(str, value + 1);
            } else {
                wordAndCountMap.put(str, 1);
            }
        }
        System.out.println("Printing array element and  its occurenece");
        Set<String> keysOfMap = wordAndCountMap.keySet();

        for(String key: keysOfMap){
            System.out.println(key + "---" + wordAndCountMap.get(key));
        }
    }

    private static void createAndPrintMapKeyValue() {
        Map<Integer, String> map = new HashMap();
        //Adding elements to map
        map.put(1, "Amit");
        map.put(5, "Rahul");
        map.put(2, "Jai");
        map.put(6, "Amit");
        map.put(1, "Hello");

        System.out.println("whether 3 as a key exists or not: " + map.containsKey(3));


        System.out.println("Printing keys and values from map");
        Set<Integer> keysOfMap = map.keySet();

        for(Integer key: keysOfMap){
            System.out.println(key + "---" + map.get(key));
        }
    }

    private static void countOccurenceOfEachElementInArray() {
        int[] arr = {2,2,5,4,2,2,5};

        Map<Integer,Integer> countMapping = new HashMap<>();
//        for(int i=0;i< arr.length;i++){
//            int num = arr[i];
//        }here num is same as arrayElement
        for(Integer arrayElement: arr){
            boolean isMapContainsTheNum = countMapping.containsKey(arrayElement);

            if(isMapContainsTheNum){
                int value = countMapping.get(arrayElement);

//                System.out.println("value of array element is " +value);
                countMapping.put(arrayElement, value+1);
            } else{
                countMapping.put(arrayElement, 1);
            }
        }

        System.out.println("Printing array element and  its occurenece");
        Set<Integer> keysOfMap = countMapping.keySet();

        for(Integer key: keysOfMap){
            System.out.println(key + "---" + countMapping.get(key));
        }
    }

    public static void main(String[] args) {

        MapOperations.createAndPrintMapKeyValue();

        MapOperations.countOccurenceOfEachElementInArray();

        MapOperations.countOccurenceOfEachElementInStringArray();



    }
}
