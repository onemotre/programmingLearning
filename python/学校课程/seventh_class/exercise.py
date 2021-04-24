table_head = {0:'姓名',1:'语文',2:'数学',3:'英语',4:'体育',5:'编程'}
dic = {"Bob":101101,'Alice':101102,'Han':101103,'Lice':101104,'Cen':101105,'Piby':101106,'Qiuly':101107,'Xiao':101108,'Jay':101109,'Yin':101110}
students = (['Bob',90,95,87,100,95],['Alice',78,98,92,100,100],['Han',87,88,73,89,88],['Lice',86,100,88,95,92],['Cen',79,88,82,100,100],['Piby',88,92,99,93,68],['Qiuly',95,97,100,97,75],['Xiao',94,94,85,85,86],['Jay',98,88,91,92,87],['Yin',89,100,84,98,94])

def getSum(students):
    sum = 0
    for i in students[1:]:
        sum = sum + i
    return sum

# 打印表单
def getTable():
    for i in students:
        for j in i:
            num = i.index(j)
            print(table_head[num],end=" ")
            print(j,end=" ")
        print(' 总分:',getSum(i) , ' 平均分:', (getSum(i)/5))

def getSumLowestAndHighest(students):
    min = 601
    max = 0
    nameOfMin = ' '
    nameOfMax = ' '
    for i in students:
        getSum(i)
        if getSum(i) < min:
            min = getSum(i)
            nameOfMin = i[0]
        if getSum(i) > max:
            max = getSum(i)
            nameOfMax = i[0]
    print("最高：",nameOfMax,dic[nameOfMax],max)
    print("最低：",nameOfMin,dic[nameOfMin],min)

def getSubjectHighestAndLowest(students):
    # each subjects
    chinese = []
    math = []
    english = []
    pe = []
    program = []
    for i in students:
        chinese.append(i[1])
        math.append(i[2])
        english.append(i[3])
        pe.append(i[4])
        program.append(i[5])
    chinese.sort()
    math.sort()
    english.sort()
    pe.sort()
    program.sort()
    
    # get the highest
    chineseMax = chinese[len(chinese)-1]
    mathMax = math[len(math)-1]
    englishMax = english[len(english)-1]
    peMax = pe[len(pe)-1]
    programMax = program[len(program)-1]

    # get the hightest students's name 
    for i in students:
        if i[1] == chineseMax:
            print("Chinese highist student is :", i[0])
            break
    for i in students:
        if i[2] == mathMax:
            print("Math highist student is :",i[0])
            break
    for i in students:
        if i[3] == englishMax:
            print("English highist student is :", i[0])
            break
    for i in students:
        if i[4] == peMax:
            print("PE highist student is :", i[0])
            break
    for i in students:
        if i[5] == programMax:
            print("Program highist student is :",i[0])
            break
    
    

def getNumAbove(students,score):
    for i in students:
        if getSum(i) >= score:
            print(dic[i[0]],i,getSum(i))

def sortSum(students):
    stu = []
    for i in students:
        stu.append(getSum(i))
    stu.sort()
    return stu

# print table
print("students:")
print("---------")
getTable()

# get the hightist socre
print(" ")
print("get subject highist :")
print("---------------------")
getSubjectHighestAndLowest(students)

# get the hightest
print(" ")
print("highest student and lowest student")
print("----------------------------------")
getSumLowestAndHighest(students)

# get sum above
print(" ")
print('the students above 460:')
print("-----------------------")
getNumAbove(students,460)

# sort arrays
print(" ")
print("sort:")
print("-----")
afterSort = sortSum(students)
for i in afterSort:
    for n in range(0,10):
        if getSum(students[n]) == i:
            print(str(students[n]), "总分：",getSum(students[n]))