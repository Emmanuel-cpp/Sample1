import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args){
        //USER DEFINED ARRAY SIZE
        Scanner user = new Scanner(System.in);
        System.out.print("How many Numbers do you have: ");
        int limit = user.nextInt();
        int[] numbers = new int[limit];
        //PROMPT USER TO ENTER NUMBERS
        //NOTICE THAT WHEN USING THE LENGTH FUNCTION IN THE ARRAY WE DO NOT PUT ()
        int i=0;
        while(i<numbers.length){
            numbers[i] = user.nextInt();
            i++;
        }
        System.out.println("Would you like to print out the values\n1. Yes \n2. No");
        int choice = user.nextInt();
        if(choice==1){
            int x=0;
            do{
                System.out.println(numbers[x]);
                x++;
            }
            while(x<numbers.length);
        }
        else if(choice==2){
            System.out.println("THANK YOU FOR USING MY PROGRAM");
            System.out.println("HAVE MERCY UPON ME OHH LORD ACCORDING TO THY LOVING KINDNESS");
        }
        else{
            System.out.println("INVALID INPUT");
        }
        user.close();
    }
    
}
