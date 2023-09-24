import java.io.PrintStream;
import java.io.PrintWriter;

class MyException extends Exception {
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }


    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}

public class ExceptionClass {
    public static void main(String[] args) {
        try {
            throw new MyException("Hello this is MyException");
        } catch (MyException e) {
            //  ToString
            System.out.println("To String => " + e);
            //  GetMessage
            System.out.println("Get Message => " + e.getMessage());
            //  Print StackTrace
            System.out.print("Print Stack Trace => ");
            e.printStackTrace();
        }
    }
}
