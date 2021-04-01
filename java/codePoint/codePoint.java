package codePoint;

import java.util.*;

/**
 * This is transformmer for code point and string
 * @version 02.07.2021
 * @author onemotre
 */

public class codePoint{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        //问候语
        String greeting = "Welcome";
        System.out.println(greeting);
        for(int i = 0; i <= greeting.length() - 1; i++)
            System.out.print('=');
        System.out.println();
        
        //作为工具循环使用，防止每一次都进行编译重新启动
        while(true){
        
        	//简单说明
            System.out.println("'1' is for code point to string");
            System.out.println("'2' is for string to code point");
            System.out.println("'3' is to exit");
             
            int model = in.nextInt(); //模式选取
            if (model == 1){
                //输入编码
                String str = in.next();
                
                //创建与字符串编码长度相同的数组
                int[] codePoints = new int[str.codePointCount(0, str.length())];
                for (int i = 0; i<=str.length() - 1; i=i+3){
                    
                    //将字符的编码写入数组
                    codePoints[i] = Integer.parseInt(str.substring(i, i+3));
                }
                
                //将编码转化为字符串   
                String str2 = new String(codePoints,0,codePoints.length);
                System.out.println(str2);
            }

            if (model == 2){
                String sentence = in.next();
                
                //将字符串转化为编码
                for(int i = 0; i<=sentence.length()-1; ){
                    int cp = sentence.codePointAt(i);
                    if(Character.isSupplementaryCodePoint(cp))  i+=2;
                    else i++;
                    System.out.println(cp);
                }
            }
            else{
                break;
            }
        }
        in.close();       
   }
}