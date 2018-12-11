package exception;

public class ExceptionHandling3 {
    public static void main(String[] args) {

        int num1 =10;
        int num2 = 2;

        try{
            int result = num1/num2;
            System.out.println("your expected value is: "+result);
        }catch(Exception ex){
            System.out.println("We are not allowed to divide a number by zero");
            System.out.println("Try again without zero");
        }
            System.out.println("End of code");
    }
}
