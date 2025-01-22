import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args){
        //FIND SUM OF VALUES
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 5 Values:");
        int[] nums = new int[5];
        int sum=0;
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
            sum += nums[i];
        }
        System.out.println("THE SUM OF THE NUMBERS YOU ENTERED IS "+sum);
        sc.close();
    }
    
}
