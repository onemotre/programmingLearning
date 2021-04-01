package equalAnalysis;

import java.util.*;

/**
 * Analysis the equalments
 * @author onemotre
 * @version 02.08.2021
 */

public class equalAnalysis {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("type your equalment below:");
        String formula = in.nextLine();

        char[] operator = new char[10];
        int operatorNum = 0;
        int[] array = new int[10];
        for(int i = 0;i <= 10; i++){
            array[i] = 0;
        }

        String number = "";
        for(int i= 0;i <= formula.length();i++){
            if(formula.charAt(i) >= '9' || formula.charAt(i) <= '0'){
                array[operatorNum] = Integer.parseInt(number);
                number = "";
                operator[operatorNum] = formula.charAt(i);
                operatorNum++;
            }
            else
                number = number + String.valueOf(formula.charAt(i));
        }
        for(int element : array)
            System.out.print(element + " ");
        for(char element2 : operator)
            System.out.print(element2 + " ");
        in.close();
    }
}
