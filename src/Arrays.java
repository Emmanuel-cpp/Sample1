import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        //DECLARE AND INITIALISE AN ARRAY
        //THIS BELOW IS AN ARRAY DECLARATION WITH SIZE 5
        Scanner input = new Scanner(System.in);
        int[] Hope = new int[5];  
        for(int i=0; i<Hope.length; i++){
            Hope[i] = input.nextInt();
        } 
        input.close();
        //ENHANCED FOR LOOP TO PRINT FROM THE ARRAY
        for(int enh:Hope){
            System.out.println(enh);
        }
    }
}
 