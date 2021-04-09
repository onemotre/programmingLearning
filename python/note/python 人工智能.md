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
File "try.py", line 4
    print b
          ^
SyntaxError: Missing parentheses in call to 'print'. Did you mean print(b)?
```



## 4. 函数的使用

- `return` 

  返回函数的数据，可以返回方法

  ```python
  def say_sentence(sentence):
      return print(sentence)
  sentence = "hello, my friend"
  say_sentence(sentence)
  ```

### 4.1 函数的定义规则

1. 以`def`关键词开头，后接标识符的名称和圆括号()
2. 任何传入参数的自变量必须放在圆括号中，圆括号之间可以用于定义参数
3. 函数的第一行语句可以选择性使用文档字符用于存放函数说明
4. 函数内容以冒号起始，并且缩进
5. `return [statement]` 结束函数，选择性返回一个值给调用方。（不带表达式return相当于返回None）

```python
def name (parm):
    sentence...
    return parm
```

### 4.2 函数的引用

```python
## menthod
def say_hello():
    print("hello")

say_hello()

## diliver a parm
def say_sentence(sentence):
    print(sentence)

sentence = "hello, my friend"
say_sentence(sentence)

## return a parm 
def sum(a,b):
    result = a + b
    return result

a = 1
b = 2
print(sum(a,b))
```

### lambda 匿名函数

1. python用lambda创建匿名函数
2. 不用def进行定义
3. lambda只是一个表达式
4. lambda是一个表达式
5. lambda有自己的命名空间
6. lambda不利用栈内存

```python
sum = lambda a,b : a+b
sum(10,20)
```



## 5.参数

### 5.1 传递参数的方法

- 必须参数

  参数按照正确顺序传入函数

- 关键字参数

  调用参数的名字与函数中定义的参数相同，不要求顺序一致

  ```python
  def printOf(name,age):
      print(name + age)
  ## 以下结果相同
  printOf(name="alen", age = 4)
  pirntOf(age = 4, name="alen")
  ```

- 默认参数

  如果不填入数据时默认的值

  ```python
  def printOf(name = "null", age = 1):
      pirnt(name + age)
  printOf(name = "alen") # age default 1; name is "alen"
  printOf(age = 35) # age is "35"; name default "null"
  ```



## 6. 序列

> 解决一类数据的方法

### 6.1 序列

每个数字分配位置与位置；（列表与元组都是序列，序列是python的基本数据类型）

### 6.2 列表

- 列表的创建

  ```python
  list1 = ["name1", "name2", 1995,1992]
  list2 = [1,2,3,4]
  ```

- 列表的访问

  ```python
  list1 = [1,2,3,4]
  print(list1[0]) # is 1
  print(list1[1:5]) # is [2,3,4] include "[]"
  ```

- 修改元素

  ```python
  list1 = [1,2,3,4]
  list1[3] = 1 # list1 is [1,2,3,1] now
  ```

exercise 1

```python
score = ["Chinese", "Math", "History", "English"]
print("the class before : " , score)
score[2] = "Physics"
print("the classes after : " , score)
```



- 添加元素

  `insert`

  ```python
  list1 = []
  list1.append("Google")
  list1.append("Runoob")
  print(list1) # list1 is ["Google","Runoob"]
  
  # 在特定位置添加
  list1.insert(1,"my name") # list1 is ["Google","my name","Runoob"] now
  ```

- 删除元素

  ```python
  score = ["Chinese", "Math", "History", "English"]
  del score[2]
  print(score) # now score is ["Chinese", "Math", "English"] and score[2] is English now
  ```

- 其他

  ```python
  list1 = [1,2,3,4,5]
  list2 = [6,7,8,9,0]
  list1 + list2 # = [1,2,3,4,5,6,7,8,9]
  list1 * 2 # list1 = [1,2,3,4,5,1,2,3,4,5]
  3 in list1 # return <bool> True
  for x in list1 : print(x) # print" 1 2 3 4 5 " 迭代
  ```

- 截取

  ```python
  list1 = [1,2,3,4,5]
  print(list1[2])
  print(list1[-1]) # 倒数 print "4"
  print(list1[2:]) # 从list1[2]到结束
  print(list1[2:5]) # 从list1[1]到list1[4]的值
  ```

  