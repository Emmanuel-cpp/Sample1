import java.util.Scanner;
//STRING FORMATTING
public class StringFormat {
    public static void main(String[] args){
        Scanner data = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = data.nextLine();
        System.out.print("Enter Program Of Study: ");
        String program = data.nextLine();
        System.out.print("Enter Year of Study: ");
        int yearOfStudy = data.nextInt();

        //String NewData = String.format("GOOD MORNING MY NAME IS %s, I AM A YEAR %d %s STUDENT", name,yearOfStudy,program);

        System.out.println(String.format("GOOD MORNING MY NAME IS %s, I AM A YEAR %d %s STUDENT", name,yearOfStudy,program));

        //System.out.println(NewData);
        

        data.close();
    }
    
}
