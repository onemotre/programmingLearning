# Self-Try

> to record some knowledge and experiences while I'm trying by myself

## Code Point

>  @version 2021.02.07

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



## turn code point into a package documents 

> @version 2021.03.16

> some tipics that create a package docunments must remmber
>
> - how to add class to a package
> - how to import a class
> - how to compile and run a packed class
> - some problem from method(how to send an array to the main class)
> - jar格式文件打包

### 1. Add Class to a package 

在源文件前添加语句

```java
package 【包名】;
```

包名一般为`com.mypkg`



### 2. import a class

```java
import 【类名】;
//for example 
import com.mykg.aClass
```



### 3. run a packed class

**Note：**必须在包的路径下运行程序，若`a.class`在包`com.mypkg`中

```bash
//编译文件
javac com/mypkg/a.java
//在com文件前运行以下命令
java com.myg.a
```



### 4. jar文件打包

- 创建jar文件包

  ```bash
  jar cvf 【文件名.jar】 【添加文件1】 【添加文件2】……
  ```

- 给文件添加入口

  ```bash
  jar uvfe 【文件名.jar】 【文件名】
  ```

  **Note：**`jar`命令后的参数必须有`u`或者`c`才能对文件进行操作，对已有文件进行修改用`u`，创建用`c`

- 运行jar文件

  ```bash
  java -jar 【文件名.jar】
  ```



## interface Comparable

> @version 2021.03.31 

> use my project Schedual

### class: schedual

```java
package interfaceTry;

import java.time.LocalDate;

/**
 * A {@code schedual} object reprsent timetable
 * include 
 * "level" value of the importance of a event
 * "contest" value of the specific plan
 * "time" value of the time when the user need to finish it 
 */
public class schedual implements Comparable<schedual> {

    /**@parm 'level' used to show the importance,range '1' to '4', the less the more important;
     * contest is a plan
     * time is a time of a plan
     */
    private int level;
    private String contest;
    private LocalDate time;

    public schedual(){
        level = 0;
        contest = " ";
        time = LocalDate.now();
    }
    public schedual(String contest){
        this.contest = contest;
        level = 0;
        time = LocalDate.now();
    }
    public schedual(int level, String contest){
        this.level = level;
        this.contest = contest;
        time = LocalDate.now();
    }
    
    public void setTime(LocalDate time){
        this.time = time;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public void reviseContest(String contest){
        this.contest = contest;
    }

    /**@return level of a contest*/
    public String getLevel(){
        return String.valueOf(level);
    }
    /**@return time of a contest */
    public String getTime(){
        return (String.valueOf(time.getMonth()) + " " + String.valueOf(time.getDayOfMonth()));
    }
    /**@return contest */
    public String getContest(){
        return contest;
    }
    /**
     * Compare schedual by level
     * @param object another scheldual object
     * @return 0 if the level is the same, negative is this scheedual has a lower
     */
    public int compareTo(schedual object) {
        return Double.compare(this.level, object.level);
    }
    
}
```



### mian class: SchedualSortTest

```java
package interfaceTry;

import java.util.*;

/**
 * This program is used to try and understand interface
 * this program use Compareable interface
 * @version 2021.3.30
 * @author onemotre
 */
public class SchedualSortTest
{
    public static void main(String[] args){
        var timeTable = new schedual[3];

        timeTable[0] = new schedual(1, "do my homework");
        timeTable[1] = new schedual(3, "go to play with my friend");
        timeTable[2] = new schedual(2, "listen to music");

        Arrays.sort(timeTable);

        for(schedual s : timeTable){
            System.out.println(s.getLevel() + "." + s.getContest() + " in " + s.getTime());
        }
    }
}
```



### import point in this project

****

#### meaning of "interface"

**接口（interface）**是为了使用某个服务而需要使用者编写的特殊的类，这个类中包含某种特定的方法

> 例：为在类schedual中t实现java.util.Arrays类中的sort服务（使用时需引用这个类），需要在schedual中提供一个`compareTo`方法；
>
> 并在类名前添加一个接口的标识`implenments Comparable`



#### use Comparable interface 

为类提供**接口标识**

```java
public class schedual implements Comparable{}
```

`Comparable`实际上是一个数组`Object[]`； 因此可以将Comparable定义成一个**泛型类型**

```java
public class schedual implements Comparable<schedual>{}
```

#### interface warning:

如果为类添加了接口，那么这个类中必须有接口中要求的字段或方法

```java
public class schedual implements Comparable<schedual>
{
    public int compareTo(schedual object)
    {
        return Double.compare(this.level, object)
    }
}
```

#### other thought:

- `java.time.LocalDate`类表示时间

  > s 为LocalDate类型

  `[int] s.getDayofMonth()`返回 *天*

  `[enum] s.getMonth()`返回 *月份*

- 编写类的心得：

  1. 类中包含构造器；构造器中包含初始化（空）

  2. 类中包含访问器可以减少数据转换的麻烦

  3. 为类添加注释

     ```java
     /**
      * This program is used to try and understand interface
      * this program use Compareable interface
      * @version 2021.3.30
      * @author onemotre
      */
     ```

     1. 包含对类的描述、`@version`、`@author`让类更加清晰

  4. 为方法添加注释

     ```java
     /**@return level of a contest
     *value of {@code String}
     */
     ```
     
     1. 包含对方法具体行为的大体描述
     2. 对返回变量的说明
     
  5. 如果有必要，对变量进行表述
  
     ```java
     /**@parm 'level' used to show the importance,range '1' to '4', the less the more important;
      * contest is a plan
      * time is a time of a plan
      */
     ```



## herit

> @ version: 2021.4.20
>
> manage family members
>
> this is a program to calculate how much herit will a son get

### logical construct

- @class: son

  a object to discribe a son

- input information

  - number of sons
  - the sum of money you have
  - sons' name 
  - the rate a son get

### class: son

> using for manage sons in a family

#### @parm:

- name
  - discribe a name's name
- rate
  - the rate
- money
  - the money your son will get

