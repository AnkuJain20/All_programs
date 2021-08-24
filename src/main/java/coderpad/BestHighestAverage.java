package coderpad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestHighestAverage {
   static String[][] s1 = { { "Rohan", "84" },
            { "Sachin", "102" },
            { "Ishan", "55" },
            { "Sachin", "180" } };

    public static void main(String[] args) {
        String name = "";
        int marks = 0;
        Map<String, List<Integer>> map = new HashMap<>();
Double Highestaverage = 0.0;
        for (int i = 0; i < s1.length; i++) {
            name = s1[i][0];
            marks = Integer.parseInt(s1[i][1]);

            if (map.containsKey(name)) {
                map.get(name).add(marks);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(marks);
                map.put(name, list);
            }
        }

        for(String key : map.keySet()){
            List<Integer>marks1 = map.get(key);
          Double average =  getAverage(marks1);
            if (Highestaverage < average) {

                Highestaverage= average;
            }
        }
        System.out.println("best Highestaverahe is "+Highestaverage);
    }
    public static Double getAverage(List<Integer> marks){
        Integer sum =0;
        for(int i=0;i<marks.size();i++){
            sum = sum + marks.get(i);
        }
        Double average = (double) (sum / marks.size());
return average ;

    }
}
