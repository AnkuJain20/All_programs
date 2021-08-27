package sapient.questions;

import java.util.ArrayList;

public class RobotMovement {
    public static void main(String[] args) {
        String test = "UDLR";
        ArrayList<Integer> result = walk(test);
        System.out.println(result);
    }

    private static ArrayList<Integer> walk(String test) {
        ArrayList<Integer> arr = new ArrayList<>();

        int x=0,y=0;
        for(int i=0;i<test.length();i++){
            char c = test.charAt(i);
            if(c=='U'){
                y++;
            }
            else if(c=='D'){
                y--;
            }
            else if(c=='R'){
                x++;
            }
            else if(c=='L'){
                x-- ;
            }

        }
        arr.add(x);
        arr.add(y);
        return arr;
    }
}

