package important.misc;

import java.util.Scanner;

public class NumberOperations {

    public static void numberOfDigits(int num){
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }

    //TODO: write trailzero count
    public static void trailZeroCount(int num){
        int trailZero = 0;
        while (num != 0) {
            if (num%10==0)
                trailZero++;
            num = num / 10;
        }
        System.out.println(trailZero);
    }

    public static void factorial(int num){
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of num: " + num + " is " + fact);

    }

    public static void isPrimeNumber(int num){

//        System.out.println("Enter string :");
//        Scanner in = new Scanner(System.in);
//        String str = in.next();
//        in.close();
//        System.out.println(" string to be reversed: " + str);


//        System.out.println("Enter number to check: ");
//        Scanner in = new Scanner(System.in);
//        int num2 = in.nextInt();
//        in.close();

        boolean isNumberPrime = true;
        for (int i = 2; i <= num - 1; i++) {
            if (num/i == 0) {
                isNumberPrime = false;
                break;
            }
        }

        if (isNumberPrime) {
            System.out.println("number is prime");
        } else {
            System.out.println("number is not prime");
        }
    }

    public static void swapTwoNumbers(int num1, int num2){
        //Method 1: By using 3rd variable
        System.out.println("Before swapping num2 is : " + num1 + " and num2: " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping num2 is : " + num1 + " and num2: " + num2);

        //Method 2: Without using 3rd var
        num1 = num2+num1 - num1;
        num2 = num1+num2 - num2;
        System.out.println("After swapping using method 2num2 is : " + num1 + " and num2: " + num2);

    }




    public static void main(String[] args) {

        reverseNumber(6443);
        swapTwoNumbers(10,25);
        factorial(3);
        isPrimeNumber(4);

        numberOfDigits(2347811);
        trailZeroCount(12300);

        fibonacci();
        isNumberArmstrong(1634);

    }

    private static void isNumberArmstrong(int number) {
        int countDigits = 0;
        int storeNumber = number;
        int remainder=0;
        while (number!=0){
            number = number/10;
            countDigits++;
        }
        int sum=0;
        number = storeNumber;
        while (number!=0){
            remainder = number%10;
            int temp = (int)Math.pow((int)remainder,(int)countDigits);
            sum = sum+ temp;
            number = number/10;
        }

        if(storeNumber == sum){
            System.out.println("Armstrong number");
        } else{
            System.out.println("Not armstrong");
        }


    }

    private static void fibonacci() {
        int count=4, num1 = 0, num2 = 0, num3 = 1;
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number of times");
//        count = in.nextInt();
//        System.out.println("Fibonacci Series of the number is:");

        for (int i = 0; i < count; i++) {
            num1 = num2;
            num2 = num3;
            num3 = num1 + num2;
            System.out.println(num1 + "");
        }
    }

    private static void reverseNumber(int number) {

        int remainder,reverseNumber=0;

        while(number!=0){
            remainder = number%10;
            reverseNumber = reverseNumber*10 + remainder ;
            number = number/10;
        }

        System.out.println("reverseNumber is : " + reverseNumber);


    }
}
