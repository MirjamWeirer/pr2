public class UncheckedException {

    public static void main(String[] args) {
        //arithmeticException();
        //nullPointerException();
        arrayIndexOutOfBoundsException();
    }


    public static void arithmeticException() {
        try{
            int a = 1;
            int b = 0;
            int c = a/b;
        } catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println("Exception Handling");
        }
        System.out.println("to some action after exception handling");
    }


    private static void nullPointerException() {
        try {
            String data = null;
            data.toLowerCase();
        } catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    private static void arrayIndexOutOfBoundsException() {
        try {
            String[] data = {"1","2","3"};
            for (int i = 0; i <= data.length; i++) {
                int number = Integer.parseInt(data[i]);
                System.out.println(number);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        } catch (NumberFormatException e){
            System.out.println("Input could not be parsed");
            e.printStackTrace();
        }
    }
}
