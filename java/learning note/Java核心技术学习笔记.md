## Core Java Volume

> summery important point in this book

### Java 的基本程序设计结构

#### 3.1 简单的Java应用程序

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

#### 3.2 注释

注释的类型分为行与单行

```java
/**
*这是单行注释
*/
//这是单行注释
```

#### 3.3 数据类型

> 八种基本类型(primitive type)

##### 3.3.1 整型

|  类型   | 储存需求 | 取值范围 |
| :-----: | :------: | :------: |
|  `int`  |  4字节   |          |
| `short` |  2字节   |          |
| `long`  |  8字节   |          |
| `byte`  |  1字节   | -128~127 |

###### warning: 整型的后缀

`L`或`l`:表示长整数型;  _example_:`400000000L`;

`0x`或`0X`:表示十六进制; _example_:`0xCAFE`;

`0`:表示八进制 _example_:`010`表示十进制中的8;

`0b`或`0B`:表示二进制中 _example_:`0b1001`表示9;

`_`加在数字之间让数字更加易读 _example_:`0b1111_0100_0010_0100_0000`表示100万

##### 3.3.2浮点类型

|  类型  | 储存需求 |
| :----: | :------: |
| float  |  4字节   |
| double |  8字节   |

`float`类型之后都有一个`F` `f`后缀

###### warning 浮点数值的溢出

- 正无穷大
- 负无穷大
- NaN _example_:0/0或负数的平方更的计算结果为NaN

`Double.POSITIVE_INFINITY`与`Double.NEGATIVE_INFINITY` `Double.NaN`可以分别表示这些数字

##### 3.3.3 char类型

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

##### 3.3.4 Unicode 与 char 类型

null

##### 3.3.5 boolean类型

用于判断逻辑条件

#### 3.4 变量与常量

##### 3.4.1 声明变量

可以在类型之前声明变量的可访问性以及状态等等 

_example:_`public static final var pi = 3.14;`

##### 3.4.2 变量的初始化

- 在声明变量后直接赋值 _example:_ `int vacationDays = 1;`
- `var`不需要指定类型的变量声明 _example:_`var i = 1; //i is an int`

##### 3.4.3 常量

`final`表示的变量只能被赋值一次

##### 3.4.4 枚举类型

`enum`变量的取值值限于一个集合之内 _example:_衣服的尺寸

```java
enum Size{SMALL, MEDIUM, LARGE, EXTRA_LARGE};
Size s = Size.MEDIUM;
```

#### 3.5 运算符

##### 3.5.1 算术运算符

null

##### 3.5.2 数学函数与常量

若要是养Math中的方法需要在文件头标记`import static java.lang.Math.*`

###### Math API

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



##### 3.5.3 数据类型之间的转换

null



##### 3.5.4 强制类型转换

```java
double x = 9.997;
int nx = (int) Math .roud(x) //Math.round 可搜索
```



##### 3.5.5 结合赋值和运算符

```java
x += 4;
x = x + 4; //两者等价
```



##### 3.5.6 自增与自减运算 

`x++`  `x--` 先运算后加减；

 `++x` `--x` 先加减后运算；



##### 3.5.7 关系和boolean运算

`==` 相等；`&&` 和，并；`!=` 不等； `||` 或； 

`condition ?: expression1 :expression2 ` codition 为 ture 则返回第一个表达式的值；为 false 则返回第二个表达式的值

```java
x < y ? x : y //返回x，y中较小的与一个
```

 

##### 3.5.8 位运算符

###### 位的概念

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



#### 3.6 字符串

##### 3.6.1 子串 && 3.6.2 拼接 

`s.substring(a,b)` 的长度为 b-a;

可直接用加号进行字符串的拼接



##### 3.6.3 不可变字符串

java中不能直接修改单个字符，只能进行`substring` 操作后进行拼接



##### 3.6.4 检测字符串是否相等

检测字符串是否相等 `s.equals(t)`

忽略大小写 `equalsIgnoreCase` 进行检测



##### 3.6.5空字符串与null

空串为长度为0的字符串；检测是否为空串 `if(str.length() == 0)` 或 `if(str.equals(""))`

null 表示目前没有任何对象与该变量关联；检测是否为null `if(str == null)` 



##### 3.6.6 码点与代码单元

Java字符串由char值序列组成

__Note：__空格等特殊转义字符也算是码点

__Note：__

###### length 方法通过计算 UTF-16 编码数量计算

```java
String greeting = 'hello';
int n = greeting.length(); //is 5
```

###### 得到实际长度（码点数量）（编码数量）

```java
int cpCount = greeting.codePointCount(0,greeting.length()); //返回从零开始到字符串最后一个字符码点的数量 （可以计算该字符串所占内存？）
```

###### 返回位置n的代码单元的值（为具体字符）

```java
char first = greeting.charAt(0); //first is "h"
char last = greeting.charAt(4); //last is 'o'
```

获取最后一个字符可以使用计算 `last = greeting.charAt(string.length(greeting) - 1);`

###### 返回第 i 个码点

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



##### 3.6.8 阅读联机API文档

jdk15 官方API文档 [link](https://docs.oracle.com/en/java/javase/15/docs/api/index.html)



#### 3.7输入与输出

##### 3.7.1 读取输入

`Scanner` 与“标准输入流`System.in`”关联

```java
import java.util.*;
Scanner in = new Scanner(System.in);
String str = in.next(); //以空格为分隔符
String str = in.nextLine(); //以换行符为分隔符
```

##### Scanner API

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



##### 3.7.2 格式化输出

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



##### 3.7.3 文件输入与输出

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