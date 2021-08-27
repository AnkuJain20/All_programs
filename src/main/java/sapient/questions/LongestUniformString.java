package sapient.questions;


public class LongestUniformString {
    public static void main(String[] args) {
         String input= "aabbbbccc";
         int maxlength= 0;
         int maxIndex=0;
         uniformString(input,maxlength, maxIndex);
    }


    public static void uniformString( String input,int maxIndex, int maxlength){
              int current_Index =0;
             int current_length=0;
            for (int i=0;i<input.length();i++){
                if(i==0){
                    current_length++;
                }

                else if (input.charAt(i)==input.charAt(i-1)){
                    current_length++;
                }
                else {
                    if ( current_length>maxlength){
                        maxlength=current_length;
                        maxIndex=current_Index;

                    }
                    current_Index=i;
                    current_length=1;
                }

            }
            if(current_length>maxlength) {
                maxlength = current_length;
                maxIndex = current_Index;
            }

            System.out.println("max length is "+ maxlength + "max index is "+ maxIndex);
        }
    }




