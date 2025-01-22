import java.util.Scanner;

public class conversion2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        String number = input.nextLine();
        String number2 = input.nextLine();
        //LET US NOW CONVERT THIS STRING VALUE INTO an int,float or double
        int num = Integer.parseInt(number);
        int num2 = Integer.parseInt(number2);
        System.out.println("THE STRING VALUES ARE "+number+number2);
        System.out.println("THE INTEGER VALUES ARE "+(num+num2));

        //LET US TRY OUT THIS WAY OF CONVERTING
        

        input.close();
    }
    
}
