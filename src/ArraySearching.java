import java.util.Arrays;
import java.util.Scanner;
public class ArraySearching {
    public static void main(String[] args){
        //LET US HAVE AN ARRAY
        String[] names = {"Emmanuel Siamoonga", "Joel Chabota", "Hope Luumuno","Temwani Nundwe","Abigail Chilongu"};
        Arrays.sort(names);
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(names));
        System.out.println("Enter Name Search");
        String searchKey = input.nextLine();
        int ArrayIndex = Arrays.binarySearch(names,searchKey);
        input.close();
        
        System.out.println("SEARCH RESULTS FOUND BELOW\n"+names[ArrayIndex]);
    }
    
}
