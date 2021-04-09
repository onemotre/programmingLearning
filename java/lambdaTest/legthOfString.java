package lambdaTest;

import java.util.Arrays;

public class legthOfString {
    public static void main(String[] args) {

        var names = new String[]{"Harry", "Hellen", "Frank", "Robert", "Luck", "Planck"};
        System.out.println(Arrays.toString(names));

        Arrays.sort(names, (first, last)->(first.length() - last.length()));
        System.out.println(Arrays.toString(names));

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }
}