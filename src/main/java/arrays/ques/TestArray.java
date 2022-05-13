package arrays.ques;

public class TestArray {
    public static void main(String[] args) {
        int[] values = new int[7];

        //insert - {1,2,3}
        // value at particular index values[2]
        // print element in array
        // find element in array

        int numberToSearch = 11;
        boolean numberFound= false;

        values[0] = 8;
        values[1] = 9;
        values[2] = 7;

//to get values from array
        int k = values[2];

        for (int i = 0; i < values.length; i++) {
//            System.out.println(values[i]);
            if (numberToSearch == values[i]) {
                numberFound=true;
                break;
            }
            }
        if(numberFound){
            System.out.println("number found");}
        else{
            System.out.println("Number not found");


        }
    }
}


