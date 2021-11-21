package sapient.questions;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {
    public static void main(String[] args) {
        int number = 6;
       List<Integer> result =primeFactors( number);
        System.out.println("Prime factors of a " + number + "are" + result);
    }
   // number should be gretaer than zero and must be integer.

    private static List<Integer> primeFactors(int number) {

        List primeFactors= new ArrayList();
        for(int i=2;i<=number;i++){
         while (number%i==0){
             number= number/i;
             primeFactors.add(i);
            }
        }
        return primeFactors;
    }
}
