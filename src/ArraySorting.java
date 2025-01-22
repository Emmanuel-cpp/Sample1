import java.util.Arrays;
import java.util.Collections;
public class ArraySorting {
    public static void main(String[] args){
        char[] letters = {'b', 'e', 'c', 'a', 'd'};
        System.out.println("THIS IS THE ORIGINAL ARRAY "+Arrays.toString(letters));
        Arrays.sort(letters);
        System.out.println("THIS IS A SORTED ARRAY LIST "+Arrays.toString(letters));
        //
        String[] names = {"Emmanuel Siamoonga", "Joel Chabota", "Hope Luumuno","Temwani Nundwe","Abigail Chilongu"};
        System.out.println(Arrays.toString(names));
        System.out.println("THIS BELOW IS THE SORTED ARRAY");
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        System.out.println("THE ARRAY IS NOW SORTED IN DESCENDING ORDER");
        Arrays.sort(names, Collections.reverseOrder());
        System.out.println(Arrays.toString(names));

    }
}
