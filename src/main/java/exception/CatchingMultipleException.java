package exception;

import pojo.ques.Employee;

//2 kind of exception: CompileTime(checked) or RunTime exception
public class CatchingMultipleException {

    public static void main(String[] args) {
//        int arr [] = new int [7];
//        try {
//            arr[10] = 30/10;

        int [] arr = new int[7];
        try{
            arr[6]=30/10;
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println(e);
        }finally {
            System.out.println("Always executed");
        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Array index is not in range");
//            e.printStackTrace();
//        }
//        catch (ArithmeticException e){
//            System.out.println(" Number divide by Zero");
//            e.printStackTrace();
//        }

        //Throws Null pointer exception
        String str = null;
        System.out.println(str.length());

        Employee e = null;
        e.getSalary();

    }
}

