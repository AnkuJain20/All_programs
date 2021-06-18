package exception;

public class AgeNegativeException extends  Exception{

    public AgeNegativeException(String msg) {
        System.out.println((msg));
    }

    public AgeNegativeException() {
    }
}
