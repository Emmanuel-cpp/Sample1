import java.util.Arrays;
public class ArrayCopy {
    public static void main(String[] args){
        int values[] = {1,2,3,4,5};
       // int[] copyValues = values; 
       int[] copyValues = Arrays.copyOf(values, values.length);
       //Arrays.fill(values, 8);
       System.out.println(Arrays.toString(values));
       System.out.println(Arrays.toString(copyValues));


       //TO COMPARE 2 ARRAYS THIS IS WHAT WE DO
       System.out.println(Arrays.equals(values, copyValues));
    }
}
