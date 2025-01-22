import java.util.Scanner;
import java.util.Arrays;
public class ArraySearching2 {
    public static void main(String[] args){
        String[] names = {"Emmanuel Siamoonga", "Joel Chabota", "Hope Luumuno","Temwani Nundwe","Abigail Chilongu"};
        //SEARCHING BETWEEN A SPECIFIED RANGE
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name Search");
        String searchKey = input.nextLine();
        int startIndex = 1;
        int endIndex = 5;
        int ArrayIndex = Arrays.binarySearch(names,searchKey);
        input.close();

        System.out.println(Arrays.binarySearch(names, startIndex,endIndex, searchKey));
        
        System.out.println("SEARCH RESULTS FOUND BELOW\n"+names[ArrayIndex]);
    }
}
