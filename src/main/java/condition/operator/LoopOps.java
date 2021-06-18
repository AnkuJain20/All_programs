package condition.operator;

public class LoopOps {


    public static void breakAndContinue(){
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
//                break; //comes out from the loop
                continue; //skip the further steps and move to next
            }
            System.out.println(i); //Skips 5
        }
    }

    private static void differentLoops() {
        int i=1;

//        while loop: dont know the number of iterations
        while(true){
            i++;
            if (i == 10){
                break;
            }
            System.out.println(i);
        }

        //        for loop: when we know thw no of iterations
        for (int j = 1; j <= 10; j++){
            System.out.println(j);
        }

        //        in do while loop the code gets execute atleast once.
        do{
            i++;
            if (i == 10){
                break;
            }
            System.out.println(i);
        }while (true);
    }


    public static void main(String[] args) {

        LoopOps.differentLoops();

        LoopOps.breakAndContinue();



    }



}

