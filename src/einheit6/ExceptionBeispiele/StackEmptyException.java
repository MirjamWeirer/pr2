package einheit6.ExceptionBeispiele;

public class StackEmptyException extends Exception{
    public StackEmptyException(){}
    public StackEmptyException (String msg){
        super(msg);
    }
}
