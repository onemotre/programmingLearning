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