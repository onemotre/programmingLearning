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

