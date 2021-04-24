def getSum(a,b):
    sum = a + b
    return sum

list1 = []
for x in range(0,9):
    list1.append(x)
tup = tuple(list1)
print(tup)
sum = 0
for x in range(0,9):
    sum = getSum(sum, tup[x])
print(sum)
    