import java.util.*;

/**
 * This is transformmer for code point and string
 * @version 02.07.2021
 * @author onemotre
 */

public class codePoint{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        String greeting = "Welcome";
        System.out.println(greeting);
        for(int i = 0; i <= greeting.length() - 1; i++)
            System.out.print('=');
        System.out.println();

        System.out.println("'1' is for code point to string");
        System.out.println("'2' is for string to code point");

        int model = in.nextInt();
        if (model == 2){
            String sentence = in.next();
            for(int i = 0; i<=sentence.length()-1; ){
                int cp = sentence.codePointAt(i);
                if(Character.isSupplementaryCodePoint(cp))  i+=2;
                else i++;
                System.out.print(cp);
            }
        }
   }
}