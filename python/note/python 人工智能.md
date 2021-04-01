# python 人工智能 

> by school
>
> acquire:
>
> 1. 程序设计
> 2. 人工智能的实现
>
> work：
>
> 1. 智能程序设计

## 1.first class

### 1.1 python程序设计语言

执行小路高；大数据，人工智能结合；

解释型语言

#### 1.1.1 python的使用：

抓取人物面部特征；数位版；数据可视化（按照标准分类）；游戏制作



#### 1.1.2 输出

```python
a = 1
b = 2
c = a + b
print(c)
```

- 字符串输出

  `print("this is a String output!")`

#### 1.1.3 变量

```python
myname = "myname"
print("hello" + " " + myname)
```

##### 变量名

1. 变量名不能包含空格
2. 变量名只包含字母、数字、下划线
3. 不能使用Python关键字和函数名用作变量名
4. 变量名应既简短又具有描述性



#### 1.1.2 算术运算符

| 运算符 | 描述 | 实例 |
| ------ | ---- | ---- |
| +      |      |      |
| -      |      |      |
| *      |      |      |
| /      |      |      |
| %      |      |      |
| ^      |      |      |



###  1.2 数学运算

- 算术运算
- 关系运算
- 赋值运算符
- 逻辑运算符
- 身份运算符
- 成员运算符
- 位运算符



### 1.3 输入

```python
username = intput("Enter your name here")
print("Welcome", username)
```



## 2. second class

### 2.1培养优秀的程序员（代码分块）

### 2.2 多重分支语句

### 2.2.1 if语句

```python
age = 21

if age > 20:
    print('你太过分了')
```

### 2.2.2 强制类型转换 

```python
//judge if you can get into internet bar
age = int(input("type your age here"))
if age >= 18:
    print("you are allowed")
else:
    print("you are not allowed")
```

**import:** 同种类型的变量不能进行强制类型转换：

```python
a = int(1)
b = int(a)//ERROR:SyntaxError
```

报错：

```bash
File "rty.py", line 4
    print b
          ^
SyntaxError: Missing parentheses in call to 'print'. Did you mean print(b)?
```



