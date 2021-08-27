package sapient.questions;

import java.util.ArrayList;

public class StairCase {
    public static void main(String[] args) {
        int number= 4;
        Integer numberOfCombinations=countSteps(number);
        System.out.println(numberOfCombinations);
    }
    private static Integer countSteps(int number) {
        int [] ways = new int [number+1];
        ways[0]=1;
        ways[1]=1;
        ways[2]=2;
        ways[3]=4;

        if(number == 0 || number== 1){
            return 1;
        }
        if (number== 2){
            return  2;
        }

        if (number ==3)
        {
            return 4;
        }



        for(int i=4;i<=number; i++){

//            int waysTo=ways.get(i-1)+ways.get(i-2)+ways.get(i-3);
//            ways.add(i, waysTo);
            ways[i]= ways[i-1]+ways[i-2]+ways[i-3];

        }
        return  ways[number];


    }




}