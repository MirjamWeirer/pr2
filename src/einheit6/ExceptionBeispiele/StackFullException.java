package einheit6.ExceptionBeispiele;

public class StackFullException extends Exception{
    public StackFullException(){}
    public StackFullException (String msg){
        super(msg);
    }
}
