import java.util.Arrays;
public class Arrays4 {
    public static void main(String[] args){
        char[] vowels = new char[5];
        /* 
        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';
        */
        char vowel[] = {'a','b','i','o','u'};
        System.out.println(vowel);
        System.out.println(vowels);
        //PRINTNG OUT VAUES FROM AN ARRAY PRINTS THEM OUT AS A STRING, WHAT IF WE WANT THE ARRAY AS IT IS
        System.out.println(Arrays.toString(vowel));
    }
    
}
