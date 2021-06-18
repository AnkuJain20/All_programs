package important.misc;
//method oveloading means we have same method name but differs in no of arguments. it is also known as compile time polymorphisn because without execution, we come to know which method id being called..

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading mo= new MethodOverloading();
        mo.login( "Anku", "jain");
        mo.login(5678, "Anku","DJ" );

    }
    public void login( String name, String pwd){
        System.out.println(" login with name and password");
    }
    public void login(int phnNum, String pwd, String lastName){
    System.out.println(" login with phone number");
}

        }
