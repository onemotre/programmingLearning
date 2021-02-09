# Self-Try

> to record some knowledge and experiences while I'm trying by myself

## 2021.02.07 Code Point

 源代码

```java
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
   }
}

```

### record

#### 输入不同数据类型

```java
/**
*构造器构造输入对象
**/
import java.util.*
Scanner in = new Scanner(System.in);
```

##### String

```java
String typeString = in.next();
```



##### Integer

```java
int typeInteger = in.nextInt():
```



#### 用键盘输入数组

```java
import java.util.*
Scanner in = new Scanner(System.in);

int lengthOfInteger = in.nextInt();
int[] number = new int[lengthOfInteger];
for (int i = 0; i<=lengthOfInterger; i++){
    nember[i] = x.nextInt();
}
```



#### 字符串转换成其他格式

```java
String s = "123";

byte b = Byte.parseByte(s);
short t = Short.parseShort(s);
int i = Integer.parseInt(s);
long l = Long.parseLong(s);
Float f = Float.parseFloat(s);
Double d = Double.parseDouble(s);
boolean bo = Boolean.parseBoolean(s);
char c = Character.parseCharacter(s);
```



#### 数字转化成字符串

```java
String s = String.valueOf(value);
```



#### 遍历字符串码点 

```java
for(int i = 0; i<=sentence.length()-1; ){
	int cp = sentence.codePointAt(i);
	if(Character.isSupplementaryCodePoint(cp))  i+=2;
	else i++;
	System.out.println(cp);
}
```



#### 将码点转换成字符串 

```java
String str2 = new String(codePoints,0,codePoints.length); //codePoints为每一个组为单独编码的数组
```

