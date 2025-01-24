//import java.util.Arrays;
public class MultiArray {
    public static void main(String[] args){
        //MULTI-DIMENSIONAL ARRAY
        int[][] numbers = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15}
        };
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println("\n");
        }
        //LET US MAKE A MULTIPLICATION TABLE
        for(int number = 1; number<10; number++){
            for(int multi=1; multi<10; multi++){
                System.out.println(String.format("%d X %d = %d",number,multi,number*multi));
            }
        }
    }
    
}
