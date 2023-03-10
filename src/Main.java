import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       String first= "";
       String last= "";
       first= SafeInput.getNonZeroLenString(in, "Enter your first name");
       last= SafeInput.getNonZeroLenString(in, "Enter your last name");
        System.out.println("Your full name is: " +first +" "+last);
    }
}