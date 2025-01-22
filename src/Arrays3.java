import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args){
        //FIND SUM OF VALUES
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 5 Values:");
        int[] nums = new int[5];
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
           // int sum += nums[i];
        }
        sc.close();
    }
    
}
