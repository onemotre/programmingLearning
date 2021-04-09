package lambdaTest;

import java.lang.annotation.Repeatable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class runnable{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Runnable outputPow = ()->
        {
            int x = in.nextInt();
            int t = in.nextInt();
            int result = x + t;
            System.out.println(result);
        };
        outputPow.run();
        Runnable lambdaTest = ()->{
            System.out.println("htllo");
        };
        lambdaTest.run();
        in.close();
    }
}