# Core Java Volume

> summery important point in this book

## 第三章 Java 的基本程序设计结构

### 3.1 简单的Java应用程序

```java
public class FirstSample
{
    public static void main(String[] args)
    {
        System.out.println("Hello World");
    }
}
```

`public`用于标记代码的访问权限

`class`表明类

`static`静态字段的标记符`private`表示只有这个类能访问

`void`表示该类返回值的类型(表示不返回任何值)`int`表示返回一个整型的值

### 3.2 注释

注释的类型分为行与单行

```java
/**
*这是单行注释
*/
//这是单行注释
```

### 3.3 数据类型

> 八种基本类型(primitive type)

#### 3.3.1 整型

|  类型   | 储存需求 | 取值范围 |
| :-----: | :------: | :------: |
|  `int`  |  4字节   |          |
| `short` |  2字节   |          |
| `long`  |  8字节   |          |
| `byte`  |  1字节   | -128~127 |

##### warning: 整型的后缀

`L`或`l`:表示长整数型;  _example_:`400000000L`;

`0x`或`0X`:表示十六进制; _example_:`0xCAFE`;

`0`:表示八进制 _example_:`010`表示十进制中的8;

`0b`或`0B`:表示二进制中 _example_:`0b1001`表示9;

`_`加在数字之间让数字更加易读 _example_:`0b1111_0100_0010_0100_0000`表示100万

#### 3.3.2浮点类型

|  类型  | 储存需求 |
| :----: | :------: |
| float  |  4字节   |
| double |  8字节   |

`float`类型之后都有一个`F` `f`后缀

##### warning 浮点数值的溢出

- 正无穷大
- 负无穷大
- NaN _example_:0/0或负数的平方更的计算结果为NaN

`Double.POSITIVE_INFINITY`与`Double.NEGATIVE_INFINITY` `Double.NaN`可以分别表示这些数字

#### 3.3.3 char类型

可以用来表示Unicode值

特殊字符的转义序列

| 转义序列 |  名称  | Unicode值 |
| :------: | :----: | :-------: |
|   `\b`   |  退格  |  \u0008   |
|   `\t`   |  制表  |  \u0009   |
|   `\n`   |  换行  |  \u000a   |
|   `\r`   |  回车  |  \u000d   |
|   `\"`   | 双引号 |  \u0022   |
|   `\'`   | 单引号 |  \u0027   |
|   `\\`   | 反斜杠 |  \u005c   |

#### 3.3.4 Unicode 与 char 类型

null

#### 3.3.5 boolean类型

用于判断逻辑条件

### 3.4 变量与常量

#### 3.4.1 声明变量

可以在类型之前声明变量的可访问性以及状态等等 

_example:_`public static final var pi = 3.14;`

#### 3.4.2 变量的初始化

- 在声明变量后直接赋值 _example:_ `int vacationDays = 1;`
- `var`不需要指定类型的变量声明 _example:_`var i = 1; //i is an int`

#### 3.4.3 常量

`final`表示的变量只能被赋值一次

#### 3.4.4 枚举类型

`enum`变量的取值值限于一个集合之内 _example:_衣服的尺寸

```java
enum Size{SMALL, MEDIUM, LARGE, EXTRA_LARGE};
Size s = Size.MEDIUM;
```

### 3.5 运算符

#### 3.5.1 算术运算符

null

#### 3.5.2 数学函数与常量

若要是养Math中的方法需要在文件头标记`import static java.lang.Math.*`

##### Math API

> `import static java.lang.Math.*`

`Math.sin` sin

`Math.cos` cos

`Math.tan` tan

`Math.atan` 函数返回一个数值的反正切（以弧度为单位）

`math.atan2(y,x)` 返回从原点(0,0)到(x,y)点的线段与x轴正方向之间的平面角度(弧度值)，也就是Math.atan2(y,x)

`Math.exp(x)` 返回自然对数$e$的x次方  $e^x$

`Math.log(x)` 返回$\ln x$

```java
function getBaseLog(x, y) {
    return Math.log(y) / Math.log(x);
}
```

调用可返回$\log_x y$

`Math.PI` 常量 $\pi$ 的近似值

`Math.E` 常量 e 的近似值

`Math.roud(x)` 对x进行舍入运算，得到最接近的整数

`Math.random` 生成一个0，1之间的随机浮点数



#### 3.5.3 数据类型之间的转换

null



#### 3.5.4 强制类型转换

```java
double x = 9.997;
int nx = (int) Math .roud(x) //Math.round 可搜索
```



#### 3.5.5 结合赋值和运算符

```java
x += 4;
x = x + 4; //两者等价
```



#### 3.5.6 自增与自减运算 

`x++`  `x--` 先运算后加减；

 `++x` `--x` 先加减后运算；



#### 3.5.7 关系和boolean运算

`==` 相等；`&&` 和，并；`!=` 不等； `||` 或； 

`condition ?: expression1 :expression2 ` codition 为 ture 则返回第一个表达式的值；为 false 则返回第二个表达式的值

```java
x < y ? x : y //返回x，y中较小的与一个
```

 

#### 3.5.8 位运算符

##### 位的概念

位是一个数字用一个字节来表示的值（二进制）eg：12 = 0b1101

A = 60 = 0b0011 1100 ; B = 13 = 0b0000 1101

| 操作符 |                             描述                             |              例子              |
| :----: | :----------------------------------------------------------: | :----------------------------: |
|   ＆   |            如果相对应位都是1，则结果为1，否则为0             | （A＆B），得到12，即0000 1100  |
|   \|   |           如果相对应位都是 0，则结果为 0，否则为 1           | （A \| B）得到61，即 0011 1101 |
|   ^    |            如果相对应位值相同，则结果为0，否则为1            | （A ^ B）得到49，即 0011 0001  |
|   〜   |     按位取反运算符翻转操作数的每一位，即0变成1，1变成0。     |  （〜A）得到-61，即1100 0011   |
|   <<   |     按位左移运算符。左操作数按位左移右操作数指定的位数。     |  A << 2得到240，即 1111 0000   |
|   >>   |     按位右移运算符。左操作数按位右移右操作数指定的位数。     |      A >> 2得到15即 1111       |
|  >>>   | 按位右移补零操作符。左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充。 |     A>>>2得到15即0000 1111     |



### 3.6 字符串

#### 3.6.1 子串 && 3.6.2 拼接 

`s.substring(a,b)` 的长度为 b-a;

可直接用加号进行字符串的拼接



#### 3.6.3 不可变字符串

java中不能直接修改单个字符，只能进行`substring` 操作后进行拼接



#### 3.6.4 检测字符串是否相等

检测字符串是否相等 `s.equals(t)`

忽略大小写 `equalsIgnoreCase` 进行检测



#### 3.6.5空字符串与null

空串为长度为0的字符串；检测是否为空串 `if(str.length() == 0)` 或 `if(str.equals(""))`

null 表示目前没有任何对象与该变量关联；检测是否为null `if(str == null)` 



#### 3.6.6 码点与代码单元

Java字符串由char值序列组成

__Note：__空格等特殊转义字符也算是码点

__Note：__

##### length 方法通过计算 UTF-16 编码数量计算

```java
String greeting = 'hello';
int n = greeting.length(); //is 5
```

##### 得到实际长度（码点数量）（编码数量）

```java
int cpCount = greeting.codePointCount(0,greeting.length()); //返回从零开始到字符串最后一个字符码点的数量 （可以计算该字符串所占内存？）
```

##### 返回位置n的代码单元的值（为具体字符）

```java
char first = greeting.charAt(0); //first is "h"
char last = greeting.charAt(4); //last is 'o'
```

获取最后一个字符可以使用计算 `last = greeting.charAt(string.length(greeting) - 1);`

##### 返回第 i 个码点

```java
int index = greeting.offsetByCodePoints(0,i); //从第0个码点开始进行检索，直到第i个停下
int cp = greeting.codePointAt(index); //获取第index的码点
```

 $\omicron$ (omicron) （也写作𝕆）是一个[八元数](https://zh.wikipedia.org/wiki/%E5%85%AB%E5%85%83%E6%95%B0) 码点：U+1D546 需要两个代码单元 

###### 遍历字符串（并查看每一个码点）的方法

- 遍历一个字符串，并查看每一个码点

```java
int cp = sentence.codePointAt(i);
if (Character.isSupplementaryCodePoint(cp)) i += 2;
else i++
```

- 进行反向遍历

```java
i--;
if (Character.isSurrogate(sentence.charAt(i))) i--; //surrogate 意味替代
int cp = sentence.codePiontAt(i);
```

- 将字符串转换为一个数组，在进行遍历

```java
int[] codePoints = str.codePoints().toArrat();
```

- 用 _构造器_ 将一个码点数组转换成一个字符串

```java
String str = new String(codePoints, 0, codePoints.length);
```







##### String API

> `java.lang.String`

- `char charAt(int index)` 

  返回给定位置的代码单元。

- `int codePointAt(int index)` 

  返回从给定位置开始的码点

- `int offsetByCodePoints(int staetIndex, int cpCount)` 

  返回从`starIndex`码点开始，`cpCount`个码点后的码点索引

  码点索引（`index`）：某字符在某点的数字位置

  ```java
  String greeting = "welcome";
  int index = greeting.offsetByCodePoints(0,3);
  System.out.println(index);
  int cp = greeting.codePointAt(index);
  System.out.println(cp);
  ```

  运行结果：

  ```bash
  3
  99
  ```

- `int copareTo(String other)` 

  按照字典顺序，如果字符串位于`other`之前吗，返回一个负数，如果字符串位于`other`之后，返回一个正数；如果两个字符串相等则返回0

- `IntSteam coidePoints()` 

  将一个字符串的码点作为一个流返回。调用`toArray`将它们放在一个数组中

- `new String(int[] codePoints, int offset, int count)`

  同数组中从`offset`开始的`count`个码点构造一个字符串

- `boolean empty()` 与 `boolean blank()` 

  如果字符串为空，或者有空格组成，则返回`true`

- `boolean equals(Object other)`

  如果字符串与`other`相等，返回`true`

- `booleanequalsIgnoreCase(String other =)` 

  如果字符串与`other`相同（忽略大小写），返回`true`

- `boolean startsWith(String prefix)` 与 `boolean endsWith(String suffix)` 

  如果字符串以`prefix`开头或`suffix`结束，则返回`true`

- `int indexOf(String str)`、 `int indexOf(String str, int fromIndex)`、 `int indexOf(int cp)`、 `int indexOf(int cp, int fromIndex)`

  返回与字符串`str`或码点`cp`匹配的第一个字符串的开始位置。从索引0或`fromIndex`开始匹配。如果原始字符串中不存在`str`则返回-1

- `int lastIndexOf(String str)`、 `int lastIndexOf(String str, int fromIndex)`、 `int lastindexOf(int cp)`、 `int lastindexOf(int cp, int fromIndex)`

  返回与字符串`str`或码点`cp`匹配的最后一个字串的开始位置。从原始字符串末尾或`fromIndex`开始匹配

- `int length()` 

  返回字符串代码单元的个数

- `int codePointCount(int startIndex, int endIndex)` 

  返回`startPointCount`和`endIndex - 1`之间的码点个数

- `String replace(CharSequence oldString, CharSequence newString)`

  返回一个新字符串。这个字符串同`newString`代替原始字符中所有的`oldString`可以用`String`或`StringBuilder`对象作为`CharSequence` 参数

- `String substring(int beginIndex)` 与 `String substring(int beginIndex, int endIndex)`

  返回一个新字符串。这个字符串包含原始字符串中从`beginIndex`到字符串末尾或`endIndex - 1`的所有代码单元

- `String toLowerCase()` 与 `String toUpperCase()`

  返回一个新字符串。这个字符串将删除原始字符串中的大写字母改为小写，或者将原始字符串中的所有小写字母改为大写字母

- `String trim()`与 `String strip()` 

  返回一个新字符串。这个字符串将删除原始字符串头部和尾部小于等于U+0020的字符（`trim`）和空格（`strip`）

- `String join(CharSequence delimiter, CharSequence... elements)`

  返回一个新字符串，用给定的定界符链接所有元素 __Note：__charsequence 意为字符序列；delimiter 意为定界符；charsequence...elements 意思是字符序列组

  具体实例1：给日期加上分隔符

  ```java
  String date = String.join("/","2021","02","08");
  ```

  输出：

  ```bash
  2021/02/09
  ```

  具体实例2：在单词之间增加空格

  ```java
  String[] greeting = {"welcome", "to", "my", "blog"};
  String dilimiter = " ";
  String after = String.join(dilimiter, greeting);
  
  for (String elemet : greeting)
  	System.out.print(elemet);
  System.out.println(" "); //输出：welcometomyblog
  
  System.out.println(after); //输出：welcome to my blog
  ```

- `String repeat(int cout)` 

  返回一个字符串将当前字符串重复`count`次



#### 3.6.8 阅读联机API文档

jdk15 官方API文档 [link](https://docs.oracle.com/en/java/javase/15/docs/api/index.html)



### 3.7输入与输出

#### 3.7.1 读取输入

`Scanner` 与“标准输入流`System.in`”关联

```java
import java.util.*;
Scanner in = new Scanner(System.in);
String str = in.next(); //以空格为分隔符
String str = in.nextLine(); //以换行符为分隔符
```

#### Scanner API

- `Scanner(InputStream in)`

  用给定的输入流创建一个`Scanner`对象（一般为标准输入流`System.in`）

- `String nextLine()`

  读取下一行的内容

- `String next()`

  读取输入的下一个单词（以空格为分隔符）

- `int nextInt()` 与 `double nextDouble()`

  读取并转换下一个表示正数或浮点数的字符序列

- `boolean hasNext()`

  检测输入中是否还有其他单词

- `boolean hasNextInt()` 与 `boolean hasNextDouble()`

  检测是否还有下一个表示整数或浮点数的字符序列



#### 3.7.2 格式化输出

- 进制转换

  | 转换符 |              类型              |       示例        |
  | :----: | :----------------------------: | :---------------: |
  |   d    |           十进制正数           |        159        |
  |   x    |          十六进制正数          |        9f         |
  |   o    |           八进制正数           |        237        |
  |   f    |           定点浮点数           |       15.9        |
  |   e    |           指数浮点数           |     1.59e+01      |
  |   g    | 通用浮点数（e和f中较短的一个） |        --         |
  |   a    |         十六进制浮点数         |    0x1.fccdp3     |
  |   s    |             字符串             |       hello       |
  |   c    |              字符              |         h         |
  |   b    |              布尔              |       true        |
  |   n    |             散列码             |      42628b2      |
  | tx或Tx |     日期时间（T强制大写）      | 应当使用java.time |
  |   %    |             百分号             |         %         |
  |   n    |         与平台有关的行         |        --         |



- 用于`printf`的表标志

  |      标志       |          目的          | 示例 |
  | :-------------: | :--------------------: | :--: |
  |        +        |  打印正数和负数的符号  |      |
  | 空格（stricp）  |   在正数之前添加空格   |      |
  |        0        |      数字前面补0       |      |
  |        -        |         左对齐         |      |
  |        (        |    将负数括在括号里    |      |
  |        ,        |     添加分组分隔符     |      |
  | #（对有f格式）  |       包含小数点       |      |
  | #（对x或0格式） |     添加前缀0x或0      |      |
  |        $        | 指定要格式化的参数索引 |      |
  |        <        |  格式化前面说明的数值  |      |



#### 3.7.3 文件输入与输出

- 读取一个文件需要构造一个Scanner对象

  ```java
  Scanner in = new Scanner(Path.of("myfile.txt"),StandardCharsets.UTF_8);
  ```

  __Note：__如果文件名中包含反斜杠符号，要在每个满斜杠之前再加一个额外的反斜杠转义

- 写入一个文件需要`PrintWriter`对象

  ```java
  PrintWriter out = new PrintWriter("myfile.txt", StandaedCharsets.UTF_8);
  ```

**important：**不能用不存在的文件构造一个Scanner或PrintWriter。建议在main方法中用`throw`来进行标记

```java
public static void main(String[] args) throw IOException {
    Scanner in = new Scanner(Path.of("myfile.txt"),StandardCharsets.UTF_8);
    ...
}
```

得到当前文件所在位置：

```java
String dir = System.getProperty("user.dir");
```

或在命令行中输入

```bash
java MyProg
```



### 3.8 控制流程

#### 3.8.1 块的作用域

不能再嵌套的两个块中声明同名的变量



#### 3.8.2 条件语句

```java
if (condition) statement

if (condition) statement1 
else statement2
```



#### 3.8.3 循环

```java
while (condition) statement //当condition判定为true时进行
    
do statement while(condition) //先执行语句再进行循环体哦阿健
```



#### 3.8.4 确定循环 

```java
for(int i = 0; i <= 10; i++)
```



#### 3.8.5 多重选择：`switch`语句

- 示例：菜单系统

```java
Scanner in = new Scanner(System.in);
System.out.println("select an option (1,2,3,4)");
int choice = in.nextInt();
switch (choice){
    case 1:
        ...
        break;
    case 2:
        ...
        break;
    case 3:
        ...
        break;
    case 4:
        ...
        break;
    default:
        //bad input
        ... 
        break;
}
```

__Note：__如果没有相应的`case`与参数对应，则会执行`default`中的语句；`case`中用`break`代替了块的作用

__WARNING：__避免触发多个`case`分支（或者没有在最后添加break）编译代码（shell）中，添加`-Xlint:fallthrough`

```bash
java -Xlint:fallthrough Test.java
```



#### 3.8.6 中断控制流程的语句

- `break` 带标签的操作

  可用于检测一些额外的不可预料的事（用户输入错误等等）

  ```java
  Scanner in = new Scanner(System.in);
  int n;
  read_data:
  while(...){
      for(...){
          System.out.println("Enter anumber >=0:");
          n = in.nextInt();
          if(n < 0)
              	break read_data; //将跳转到第三行
      }
  }
  //可在这里检测额外条件
  if(n>0){
      //处理
  }
  else{
      //处理
  }
  ```

- ` continue`可将控制转移到最内层循环的首部

  ```java
  Scanner in = new Scanner(System.in);
  while(sum < goal){
      System.out.print("Enter a number:");
      n = in.nextInt();
      if (n > 0) continue; //跳过之后的所有语句到该首部
      sum += n;
  }
  ```

  

### 3.9 大数（`BigInteger`）

用大数内中的`add` `multiply`方法对大数进行操作

大数位于包`java.math.*`

```java
import java.math.*;

BigInteger c = a.add();
BigInteger d = c.multiply(b.add(BigInteger.valueOf(2))); //d = c * （b + 2）
```



#### `BigInteger` API

- `BigInteger add(BigInteger other)` `BigInteger substract(BigInteger other)` `BigIntegeer multiply(BigInteger other)` `BigIntegeer divide(BigInteger other)` `BigInteger mod(BigInteger other)`

  返回这个大整数和另一个大整数的和、差、积、商以及余数

- `BigInteger sqrt()`

  得到这个`BigInteger`的平方根

- `int compareTo(BigInteger other)`

  比较这两个大数与另一个大整数，相等返回0；这个大整数小于`other`返回负数；否则返回正数

- `static BigInteger valueOf(long x)` 

  返回值等于x的大整数




### 3.10 数组

#### 3.10.1 声明数组 

```java
int[] a; //不完整，需要初始化
int[] a = new int[100]; //数组大小可用参数指定
int[] smallPrimes = {2,3,4,5,6,};
new int[]{1,2,3,4}; //匿名数组
```



#### 3.10.2 访问数组元素

- 添加元素（示例初始化数组）

  ```java
  int[] a= new int[100];
  for(int i = 0;i < 100; i++)
      a[i] = 0;
  ```



#### 3.10.3 `for each` 循环

- 遍历数组

  ```java
  for(variable : collection) statement //parm variable用来暂时储存collection中单独的元素
  ```

- 遍历数组并打印所有值

  ```java
  //for each
  for(element : a)
      System.out.println(element);
  
  //传统for循环
  for(int i = 0; i < a.length;i++)
      System.out.println(a[i]);
  
  //Array类中的toString方法
  System.out.println(Array.toString(a));
  ```

  Array类中的toString方法：返回一个包含中括号，逗号，数组所有值的字符串

  ```java
  Array.toString(collection)
  ```



#### 3.10.4 数组拷贝

__Note：__如果只是用等号来进行拷贝的话，两个数组的值不管什么时候都将相同

```java
int[] luckNumber = smallPrimes;
luckyNumbers[5] = 12; //现在smallPrimes[5]的值也为12
```

- 如果只希望拷贝数组

  ```java
  int[] copiedLuckyNumbers = Arrays.copyOf(luckNumbers, luckyNumbers.length);
  ```

  如果长度小于原始数组的长度，只拷贝前面的值



#### 3.10.5 命令行参数 

源代码：

```java
public class Message
{
    public static void main(String[] atgs)
    {
        if(args.length == 0|| args[0].equals("-h"))
            System.out.print("hello");
        else if (args[0].equals("-g"))
            System.out.print("Goodbye,");
        for(int i = 1; i < args.length;i++)
            System.out.print(" " + args[i]);
        System.out.println("!");
    }
}
```

调用程序时如果使用参数`-g`

```bash
java Message -g cruel wolrd
```

则args数组包含内容：

```bash
args[0]:"-g"
args[1]:"cruel"
args[2]:"world"
```

这个程序显示下面消息

```bash
Goodbye, cruel world!
```



#### 3.10.6 数组排序

- 用sort方法进行数组排序

  ```java
  int[] a= new int[100];
  ...
  Arras.sort(a)
  ```

note:`Math.random`方法可返回一个0，1之间的浮点数



##### Array API

在方法返回类型之前加上`static`表示这个方法是静态的

- `static String toString(xxx[] a)`

  返回包含a中元素的一个字符串，这些元素用中括号包围，用逗号隔开，在这个方法以及后面的方法中类型xxx个意识`int` `long` `short` `char` `byte` `boolean` `float` 或 `double`

- `static xxx[] copy Of(xxx[] a, int end)` `static xxx[] copuOfRange(xxx[] a,int start, int end)`

  返回与a类型相同的一个数组，其长度为length或者end-start，数组元素为a的值。如果end大于a.length，就会填充0或false

- `static void sort(xxx[] a)`

  使用优化的快速排序算法对数组进行排序。

- `static int binarySearch(xxx[] a,xxx v)` `static int binarySearch(xxx[] a, int start, int end, xxx v)`

  使用二分查找算法在有序数组a中查找值v如果找到v，则返回对应的下标；否则，注意返回一个负数值r。-r-1 是v应插入的位置（保持a的有序性）

- `static void fill(xxx[] a,xxx v)`

  将数组的所有数据元素设置为v

- `static boolean equals(xxx[] a, xxx[] b)`

  如果两个数组大小相同，并且下标相同的元素都对应相等，返回`true`



#### 3.10.7 多维数组

二维数组也称为举证，可以用来储存信息

- 声明多维数组

  ```java
  int[][] a = new int[NUMBER][NUMBER];
  ```

- 为多维数组赋值

  ```java
  int[][] magicSquare = 
  {
      {16, 3, 2, 13},
      {5, 10, 11, 8},
      {9, 6, 7, 12},
      {4, 15, 14, 1}
  };
  ```

  

## 第四章 对象与类

> - 面向对象程序设计入门；
> - 如何创建标准java类库中类的对象；
> - 如何编写自己的类

### 4.1 面对对象程序设计概述

面对对象程序设计（object-oriented programming, OOP）

#### 4.1.1 类（class）

##### 概念

- 类（class）

  是构造对象的模板或蓝图

  由类_构造_（construct）对象的过程称为创建类的_示例_（instance）

- 封装（encapsulation）

  将数据和行为组合在一个包中，并对对象的使用这隐藏具体的实现方式。

  对象中的数据称为_实例字段_（instance field）

  操作数据的过程称为_方法_（method）

  特定的对象都有一组特点过的示例字段值，这些值组成的集合叫做这个对象的_状态_（state）

  __Note：__可将这些示例字段比作c++中的数据结构，



### 4.2 使用预定义类

#### 4.2.1 对象与对象变量

> 以Date类为例子

- 构造一个新的对象

  ```java
  new Date()
  ```

- 将这个对象传递给另一个方法

  ```java
  System.out.println(new Date());
  ```

- 对刚刚创建的对象应用一个方法

  ```java
  String s = new Date().toString;
  ```

- 将对象储存在另一个变量中

  ```java
  Date birthday = new Date();
  ```

- 对一个对象进行初始化

  note：每一个对象都应该先进行初始化。否则不能对该对象应用方法。example：`Date deadLine; s = deadLine.toString;`会报错

  ```java
  deadLine = new Date();
  Date deadLine = new Date();
  //两种方法皆可
  ```



#### 4.2.2 java类库中的LocalDate类

> Date类的时间用距离一个固定时间点的毫秒数，这个时间点为GMT：1970年1月1日00：00：00（格林尼治时间/纪元）

- 使用静态*工厂方法（factory method）*构造对象

  ```java
  LocalDate.now()
  ```

  提供年月日来构造特定日期的对象

  ```java
  LocalDate.of(1999,12,31)
  ```

  将构造的对象储存在变量中

  ```java
  LocalDate newYearEve = LocalDate.of(1999,12,31);
  ```

- LocalDate类方法

  ```java
  int year = newYearEve.getYear(); //1999
  int month = newYearEve.getMonthValue(); //12
int day = newYearEve.getDatOf();//31
  LacalDate aThousandDaysLater = newYearEve.plusDays(1000); //newYearEve isn't changed
  ```
  



#### 4.2.3 更改器方法 

> 可以更改对象的状态的方法

- LocalDate.plusDays与GregoriancCalendar.add的不同

  ```java
  LacalDate aThousandDaysLater = newYearEve.plusDays(1000); //newYearEve isn't changed
  GregorianCalendar someDay = new GregorianCanlendar(1999,11,31);
  someDay.add(Calendar.DAY_OF_MONTH, 1000); //someDay的对象的状态会改变
  ```



### 4.3 用户自定义类

> 以工资管理系统中的Employee类为例子

#### 4.3.1 Employee类

```java
class Employee
{
    //instance fields
    private String name;
    private double ssalary;
    private LocalDate hireDay;
    
    //constructor
    public Employee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year,month,day);
    }
    
    //a method
    public String getName()
    {
        return name;
    }
    
    //more method
}
```



- 创建Employee对象

  ```java
  Employee[] staff = new Employee[3];
  
  staff[0] = new Employee("...",...);
  staff[1] = new Employee("...",...);
  staff[2] = new Employee("...",...);
  ```

- 应用Employee类中的方法

  ```java
  //print each employee's name
  for (Employee e: staff)
      System.out.println("name=" + e.getName()
                        + ",salary=" + e.getSalary()
                        + ",hireDay=" + e.getHireDay());
  ```

**Note：**源文件名必须与public类的名字相匹配



#### 4.3.2 多个源文件的使用

##### 编译源程序的方法

- 使用通配符调用Java编译器：

  ```bash
  javac Employee*.java
  ```

- 当java编译器发现某一源文件中引用了其他类时会自行编译

  ```bash
  javac EmployeeTest.java
  ```



#### 4.3.3 剖析Employee类

```java
public Employee (String n, double s, int year, int month, int day) //构造器
public String getName() //方法
```

**Note：**`public`任何类的任何方法都可以调用这些方法；`private`确保只有该类自身的方法能够访问这些实例字段



#### 4.3.4 构造器

- 构造器与类同名

- 构造器总是结合`new`运算符来调用

- 不能对已存在的对象调用构造器来达到重新设置实例字段的目的

- 每个类可以有一个以上的构造器

- 构造器可以有0个及以上参数

- 构造器没有返回值

- **Note：** 不能在构造器中定义与实例字段同名局部变量

  ```java
  public Employee(String n, double s, ...)
  {
      String name = n; //ERROR
      double salary = s; //ERROR
      ...
  }
  ```



#### 4.3.5 用var声明局部变量

- 优点：可以避免重复写类名

  ```java
  Employee harry = new Employee("Harry Hacker", 50000, 1989, 10,1);
  //equals
  var harry = new Employee("Harry Hacker", 50000, 1989, 10,1);
  ```

##### 注意：

1. 不对数值类型使用`var`
2. `var`关键字只能用于方法中的 *局部* 变量，参数和字段类型必须声明



#### 4.3.6 使用null引用

- 对`null`值的对象应用方法会产生`NullPointerException`异常；

  该异常会导致程序终止

##### 拒绝接受null参数 “严格型”

```java
public Employee(String n, double s, int year, int month, int day)
{
    Object.requireNoNull(n, "The name cannot be null");
    name = n;
    ...
}
```

1. 异常报告会提供这个问题的描述
2. 异常报告会准确地指出问题所在的位置



#### 4.3.7 隐式参数与显式参数

```java
public void raiseSalary(double byPercent)
{
    double raise = salary * byPrecent / 100;
    salary += raise;
}
```

##### 隐式（implict）参数

出现在方法名前的Employee类型的对象（如：salary）

##### 显式参数（explict）

方法名后面括号中的数值（如：byPrecent）



**Note：**`this`可以指代隐式参数

*example:*

```java
public void raiseSalary(double byPrecent)
{
    double rase = this.salary * byPercent / 100;
    this.salary += raise;
}
```



#### 4.3.8 封装的优点

- 字段访问器；

  > 返回实例字段值

  ```java
  public String getName()
  {
      return name;
  }
  public double getSalary()
  {
      return salary;
  }
  ```

- 私有的数据字段

  用 *访问器访问的方式* 访问类中的字段而不是将类中的字段标记为**公共**

  优点：保护字段不被外界破坏

- 修改类中的字段

  一般通过 *公共的更改器方法* 进行修改
  
  

**Note：**不编写返回可变对象引用的访问其方法，否则会破坏封装性

*example:*

```java
class Employee
{
    private Date hireDay;
    ...
    public Date getHireDay()
    {
        return hireDay;
    }
    ...
}
```

其中Date类中包含更改器方法，因此可以通过Date中的方法对hireDay进行修改

```java
Employee harry;
Date d = harry.getHireDay();
double tenYearInMilliSecond = 10 * 365.25 * 24 *60 * 60 * 1000;
d.setTime(d.getTime() - (long)tenYearsInMilliSeconds);
```

此时harry.hireDay与d引用了同一个Date类中的对象；（改变了d的字段则harry.hireDay的字段也会因此改变



#### 4.3.9 基于类的访问权限

`private`中标记的对象能被同一类中的方法访问

`public`标记的字段能被包中的任何类访问



#### 4.3.10 私有方法

不能成为公共接口一部分的方法（通常为一些辅助方法），需通过一个特殊的协议或者调用次序，最好将这些方法设计成私有方法

另外如果该方法的数据发生变化会使方法难以实现，或者不再需要（Date类）就可以将这个类标记为私有



#### 4.3.11 final实例字段 

定义为`final`的实例字段必须在构造对象时进行初始化，将这个对象的这个状态初始化以后，这个状态就不会发生变化，不能对其进行修改

```java
class Employee
{
    private final String name;
    ...
}
```

`final`修饰符对于类型为基本类型或和不可变类尤其有用

- 对于可变类

  ```java
  private final StringBuilder evaluations;
  evaluations = new StringBuilder();
  
  //对这个对象进行修改
  public void giveGoldStar()
  {
      evaluations.append(LocalDate.now() + ": Gold Star!\n");
  }
  ```

  `final`字段只表示储存在`ebaluations`变量中的对象引用不会再指示另一个不同`StringBuilder`对象。



### 4.4 静态字段与静态方法

> `static`修饰符的含义

#### 4.4.1 静态字段 

> 以Employee类中每一个员工的员工标识码（Id）为例

- 每个类只有一个这样的字段

  这个字段为这个类独有的；这个类的所有实例都共享一个字段；这各类属于类而不是任意一个对象

  ```java
  class Employee
  {
      private static int nextId = 1;
      
      private int id;
      ...
  }
  ```

- 设置员工的标识码

  ```java
  public void setId()
  {
      id = nextId;
      nextId++;
  }
  ```

  其中因为`nextId`属于Employee这个类，因此`nextId++;`实现即使是**不同的对象**也能共享id的值

- 设置harry的员工标识码

  ```java
  harry.setId();
  //equals
  harry.id = Employee.nextId;
  Employee.nextId++;
  ```



#### 4.4.2 静态常量

*example：*Math类中的PI

```java
public class Math
{
    ...
    public static final double PI = 3.14159265358979323846;
}
```

因此可以通过`Math.PI`来访问这个常量，而不用通过一个类的方法来访问PI



#### 4.4.3 静态方法

静态方法没有隐式参数==没有this这个参数的方法

##### 两种使用静态方法的情况：

1. 方法不需要访问对象状态
2. 方法只需要访问类的静态字段



#### 4.4.4 工厂方法（factory method）

##### 使用静态工厂方法的两种情况 

- 无法命名构造器

  构造器的名字必须与类的名字相同，但是希望两种构造器分别完成不同的功能

- 使用构造器的时候无法更改改变构造对象的类型

*example：*

```java
NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
NumberFormat precentFormatter = NumberFormat.getPrecentInstance();
double x = 0.1;
System.out.println(currencyFormatter.format(x)); //prints $0.10
System.out.println(percentFormatter.format(x)); //prints 10%
```

总而言之，若希望一个类有两种不同的构造方法（传入数据类型，构造器的功能与名字），则可以使用工厂方法



#### 4.4.5 main方法

- main方法是一个静态方法，但不需要任何对象就可以运行

  在程序刚刚启动的时候就会执行并构造main方法中的对象

##### 在类中设置一个测试方法 

```java
class Employee
{
    public Employee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }
    ...
    
    public static void main(String[] args)
    {
        var e = new Employee(...);
        e.raiseSalary(10);
        System.out.println(e.getName() + " " + e.getSalary());
    }
    ...
}
```

独立运行Emloyee类：

```bash
java Employee
```

若Employee只是大型应用的一部分，则使用语句：

```bash
java Application
```

则Employee中的main方法永远不会执行



### 4.5 方法参数 

Java程序设计语言中**总是**采用按值调用；

方法的到一个所有参数值的副本；

方法不能修改传递给它的任何参数变量的内容

##### 方法参数的特点

*example*

```java
public static void tripleValue(double x)
{
    x = x*3;
}
double percent = 10;
tripleValue(percent); //percent still 10
```

过程：

1. `x`初始化为一个`percent`的副本
2. `x`乘以3后等于30，但是`percent`仍然为10
3. 方法结束以后，方法变量`x`不再使用

*example2：交换员工编号*

```java
public static void swap(Employee x, Employee y)
{
    Employee temp = x;
    x = y;
    y = temp;
}

var a = new Employee("Alice",...);
var b = new Employee("Bob",...);
swap(a,b);
```

不会将a与b进行交换，swap方法中交换的是x，y这两个**副本**，在方法结束之后会被销毁



##### 对象引用作为参数

```java
public static void tripleSalary(Emloyee x)
{
    x.raiseSalary(200);
}
```

当调用

```java
harry = new Employee(...);
tripleSalary(harry);
```

可改变harry的salary值

具体过程：

1. `x`初始化为harry的一个副本
2. `raiseSalary`方法引用与这个对象的引用，x与harry同时引用Employee对象，将工资提高200%
3. 方法结束后，参数变量x不再使用



##### 总结

- 方法不能修改基本数据类型的参数（数值型或布尔型）
- 方法可以改变对象参数的状态
- 方法不能让一个对象参数引用一个新的对象



### 4.6 对象构造 

> 编写构造器的机制

#### 4.6.1 重载

概念：一个类中有多个构造器，这多个构造器方法有相同的名字、不同的参数

*example：*

```java
//可以构造空的或有初始字符串
var messages = new StringBuilder();
var todoList = new StringBuilder("To do:\n");
```

##### 方法签名（signature）

```java
//indexOf方法
indexOf(int)
indexOf(int, int)
indexOf(String)
indexOf(String, int)
```



#### 4.6.2 默认字段初始化

在构造器中没有显示地为字段设置初值，那么会自动的赋为默认值：

数值为0、布尔值为false、对象引用null



#### 4.6.3 无参数的构造器

*example：employee类的无参数构造器*

```java
public Employee() //非employee这个类
{
    name = "";
    salary = 0;
    hireDay = LocalDate.now();
}
```

Note：类中至少提供了一个构造器方法，但没有无参数构造器，则构造对象时没有引用参数就是不合法的



#### 4.6.4 显式字段初始化

在类的定义中直接为任何字段赋值。

*example：*

```java
class Employee
{
    private String name = "";
    ...
}
```

*example：为id进行初始化*

```java
class Employee
{
    private static inr nextId;
    private int id = assignId();
    ...
    private static int assignId()
    {
        int r = nextId;
        nextId++;
        return r;
    }
    ...
}
```



#### 4.6.5 参数名

- 构造器中，在每个参数前加“a” `name = aName;`
- `this`指示饮隐式参数



#### 4.6.6 调用另一个构造器

> `this`的含义

1. 指代隐式参数

2. 构造器的第一个语句如`this(...)`，这个构造器将调用同一个类的另一个构造器

   ```java
   public Employee(double s)
   {
       //calls Employee(String, double)
       this("Employee #" + nextId, s);
       nextId++;
}
   ```
   



#### 4.6.7 初始化块

##### 初始化数据字段的方法

- 在构造器中设置值
- 在声明中赋值
- 初始化块（initialization block）

##### 初始化块

在一个类的声明中，包含任意多个代码块，则只要构造这个类的对象时，这些块就会被执行

```java
class Employee
{
    private static int nextId;
    
    private int id;
    private String name;
    private double salary;
    
    //object initialization block
    {
        id = nextId;
        nextId++;
    }
    
    public Employee(String n, double s)
    {
        name = n;
        salary = s;
    }
    
    public Employee()
    {
        name = "";
        salary = 0;
    }
    ...
}
```

无论使用哪个构造器构造对象，id字段都会在初始化块中初始化，然后再运行构造器的主体部分

##### 调用构造器的具体处理步骤：

1. 如果构造器的第一行调用了另一个构造器，则基于所提供的参数执行第二个构造器
2. 否则
   1. 所有数据字段初始化为默认值（0，false或null）
   2. 按照在类声明中出现的顺序执行所有字段初始化方法和初始化块
3. 执行构造器主体代码

静态字段的初始化：（初始化员工id）

```java
//static initialization blocks
static
{
    var generator = new Random();
    nextId = generator.nextId(10000);
}
```



#### 总结

- 重载构造器
- 用`this(...)`调用另一个构造器
- 无参数构造器
- 对象初始化块
- 静态初始化块
- 实例字段初始化



#### 4.6.8 对象析构与finalize方法

在析构器中对常见的操作是**回收分配给对象的储存空间** （java会自动的垃圾回收，因此不支持对象析构器方法）

如果一个资源一旦使用完就需要立即关闭，那么应当提供一个close方法来完成必要的清理工作

如果需要等到虚拟机退出，那么可以使用方法`Runtime.addShutdownHook`增加一个关闭钩。java9中可以使用`Cleaner`来完成这个动作

##### warning：不要用`finalize`方法进行清理

这个方法原本要在垃圾回收期清理对象之前调用，而且这个方法已经废弃



### 4.7 包

#### 4.7.1 包名

主要原因：确保类名的唯一性

方法：用一个因特网域名*example：*horstmann.com -->com.horstmann（包名）

对于不同的工程使用不同的工程名：com.horstmann.corejava

再将Employee类放在这个包类，完成“完全限定”名：com.horstmann.corejava.Employee



#### 4.7.2 类的导入

一个类可以使用所属包中的所有类，以及其他包中的*公共类（public class）*

##### 访问一个包中公共类的方法：

1. 使用*完全限定名（fully qualified name）*例如：`java.time.LocalDate today = java.time.LocalDate.now();`

2. 使用`import`语句

   可以使用`import`语句导入一个特定的类或者整个包

   **Important：**如果导入的包中都有同一个类会产生错误

   ```java
   //都有Date类
   import java.util.*;
   import java.sql.*;
   //ERROR--java.util.Date or java.sql.Date?
   ```

   *解决方法：在每个类名的前面加上完整的包名

   ```java
   var deadLine = new java.util.Date();
   var today = new java.util.Date(...);
   ```



#### 4.7.3 静态导入

导入静态方法和静态字段，而不只是类

```java
import static java.lang.System.*;
```

这样在使用System类的静态方法与静态字段时就不必加类名前缀：

```java
out.println("Goodbye, world!");
exit(0);//i.e; System.exit
```

可以导入特定的方法和字段：

```java
import static java.lang.System.out;
println("Hello, Wolrd!");
```



#### 4.7.4 在包中增加类

将类放入包中，就必须将包的名字放在元文件的开头

```java
package com.horstmann.corejava;

public class Employee
{
    ....
}
```

**Note：**如果没有在源文件中放置`package`语句，这个源文件中的类就属于*无名包（unnamed package）*

将源文件放置在与完整包名的子目录中。例如，`com.horstmann.corejava`包中的所有文件放在子目录`./com/horstmann/corejava/`中（windows则是在`\com\horstmann\corejava`编译器也将类文件放置在相同的目录结构中

测试包放在`./`目录中，可以检验`./com/.../`的类

##### warning

编译器在编译源文件的时候**不**检查目录结构。假定一个源文件开头有以下命令：

```java
package com.mycompany;
```

即使这个文件不再子目录`com/mycompany`下，也可以进行编译，如果不依赖其他包就可以通过编译，但如果包与目录不匹配虚拟机就找不到类



#### 4.7.4 包访问 

`public`的部分可以由任意类使用

`private`的部分只能由定义他们的类使用

若果没有标记`public`或`private`，则可以被同一个包中的所有方法访问

让JAR文件声明包为*密封的（ealed）*以防止第三方修改，但这种机制已经过失，应当使用模块封装包



#### 4.7.6 类路径

##### 为了类能够被多个程序共享，需要做到以下几点 ：

1. 把类文件放到一个目录中，例如`/home/user/classdir`，这个目录是包书状结构的*基*目录，如果希望那个增加`com.horstmann.corejava.Employee`类，那么Employee.class类文件必须位于目录`/home/user/clasdir/com/horstmann/corejava中

2. JAR文件放在一个目录中，例如：`home/user/archives/`

3. 设置*类路径（clas path）*。类路径是所有包含类文件的路径的集合

   在UNIX中用`:`隔开 *example：*`c:/classdir:.:/home/user/archives/archive.jar`

   在Windows中用`;`隔开 *example：*`c:\classdir;.;c:\archives\archive.jar`

   不论UNIX还是Windows都用`.`表示当前路径

##### 类路径需要包括：

1. 基目录`/home/user/classdir`或`c:\classdir`

2. 当前目录`.`

3. JAR文件`/home/user/archives/archive.jar`或`c:\archives\archive.jar`

   可以在JAR文件目录中制定通配符：

   `/home/user/archives/'*'`或`c:\archives\*`

   UNIX中必须加`''`防止shell扩展



#### 4.7.7 设置类路径

通过`-classpath(或-cp或者java9中的--class-path)`选项选择指定类的目录

```bash
java -classpath c:/classdir:.:/home/user/archives/archive.jar Myprog
```

- 在bash中

  ```bash
  export CLASSPATH=/home/user/archives/archive.jar
  ```

- 在Windows shell中

  ```shell
  set CLASSPATH=c:\archives\archive.jar
  ```



### 4.8 JAR文件

#### 4.8.1 创建一个JAR文件

使用默认`jar`制作

```bash
jar cvf 【jarFileName】 【file1】 【file2】
```

*example：*

```bash
jar cvf CalculatorClasses.jar *.class icon.gif
```

通常命令格式：

```bash
jar options file1 file2
```

| 选项 |                             说明                             |
| :--: | :----------------------------------------------------------: |
|  c   | 创建一个新的或者空的存档文件并加入文件。如果制定文件名是目录，jar会对他们进行归档处理 |
|  C   | 临时改变目录例如`jar cvf jarFileName.jar -C classes *.class`切换到classes子目录以便增加类文件 |
|  e   |                  在清单文件中创建一个入口点                  |
|  f   | 指定JAR文件名作为第二个命令行参数（如果没有这个参数jar命令会将结果写至标准输出（创建jar文件时）或者从标准输入读取（在解压或者列出JAR内容时） |
|  i   |           建立索引文件（用于加快大型归档中的查找）           |
|  m   | 将一个清单文件添加到jar文件中，清单是对归档内容和来源的一个说明。每个归档有一个默认的清单文件。但是，如果想验证归档文件的内容，可以提供自己的清单文件 |
|  M   |                     不为条目创建清单文件                     |
|  t   |                          显示内容表                          |
|  u   |                    更新一个已有的JAR文件                     |
|  v   |                      生成详细的输出结果                      |
|  x   | 解压文件，如果提供一个或多个文件名，只解压这些文件；否则解压所有文件 |
|  0   |                    储存，但不进行ZIP压缩                     |



#### 4.8.2 清单文件

清单文件一般被命名为`MANIFEST.MF`，位于特殊目录`META.INF`子目录中

第一节称为*主节（main section）*，作用于整个JAR文件。随后的条目用来制定命名实体的属性，如但个文件、包或者URL。他们必须以一个Name条目开始。节与节之间用空行分开

```
Mainfest-Version: 1.0
【lines descibeing this archive】

Name: Woozle.class
【lines descibeing this file】
Name: com/mycompany/mypkg/
【lines descibeing this package】
```

如果想编辑清单文件，需要将希望添加到清单文件中的行放到文本文件中，运行：

```bash
jar cfm jarFileName manifestFileName
```

例如创建一个包含清单文件的JAR文件：

```bash
jar cfm Myarchive.jar manifest.mf com/mycompany/mypkg/*.class
```

更新一个已有的JAR文件的清单，则需要将增加的部分放到一个文本文件中，然后执行：

```bash
jar ufm Myarchive.jar manifest.mf
```



#### 4.8.3 可执行JAR文件

可以使用jar命令中的e选项指定程序的入口点

```bash
jar cvfe Myprogram.jar com.myconpany.mypkg,MainAppClass 【files to add】
```

或者在清单文件中制定程序的主类，包括以下形式的语句

```bash
Main-Class: com.mycompany.mypkg.MainAppClass
```

**Note：**不要为主类名增加扩展名：`.class`

##### warning：

清单文件的最后一行必须以换行符结束。否则，清单文件将无法被正确的读取。常见的一个错误是创建了一个只包含`Main-Class`行而没有行结束符的文本文件



不论用哪种方法，用户可以简单的通过下面的命令启动程序：

```bash
java -jar MyProgram.jar
```

- 在Windows中，java运行时安装程序将为`.jar`扩展名创建一个文件关联，会用`javaw -jar`命令启动文件（`javaw`不会打开shell窗口）
- 在Mac OS X中，操作系统可以直接识别`jar`文件，双击文件就可执行程序



#### 4.8.4 多版本JAR文件（multi-release JAR）

为了保证向后兼容，额外的文件放在`META-INF/version`目录中

##### 不同版本的类文件打包

- 增加

  ```bash
  jar uf Myprogram.jar --release 9 Application.class
  ```

- 从头构建多版本JAR文件，可以使用`-C`标识

  ```bash
  jar cf Myprogram.jar -C bin/8 . --release 9 -C bin/9 Application.class
  ```

- 面向不同版本进行编译

  ```bash
  javac -d bin/8 --release 8 ...
  ```

  

#### 4.8.5 关于命令行选项的说明

java开发包选项一直以来都使用但个短横线加多个字母选项名的形式：

```bash
java -jar ...
javac -Xlint.unchecked -classpath ...
```

jar命令是例外