print('first test')
a = 0
while a<10:
    a = a+1
    if a == 7:
        continue
    print(a)

print("")
print('second test')
sum = 0
for i in range(1,101):
    sum = i+sum
print(sum)

print("")
print('third test')
num = 1
for i in range(1,101):
    if i % 2 != 0:
        print(i)
    
print('')
print('fourth exercise')
for i in range(1,101):
    if i % 2 == 0:
        print(i)