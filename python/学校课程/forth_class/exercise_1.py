year = int(input("input year"))
month = int(input("input month"))
day = int(input("input day"))
num = 0

year_366 = 0
year_365 = 0
this_year = 0

if year == 2021 :
    for m in range(4,month-1):
        if m == 1 or m == 3 or m == 5 or m == 7 or m == 8 or m == 10 or m == 12:
            num = num + 31
        else:
            num = num + 30
    num = num + day + 29

else:
    num = num + 274
    for y in range(2021, year-1):
        if (y % 4 == 0 and y % 100 != 0 )or y % 400 == 0:
            year_366 = year_366 + 1
            if y == year:
                year_366 = year_366 -1 
                this_year = this_year + 1
            else:
                year_365 = year_365 + 1
        else:
            year_365 = year_365 + 1
    num = num + year_365 * 365 + year_366 * 366
    
    for m in range(0,month-1):
        if m == 1 or m == 3 or m == 5 or m == 7 or m == 8 or m == 10 or m == 12:
            num = num + 31
        elif m == 2:
            if this_year == 1:
                num = num + 29
            else:
                num = num + 28
        else:
            num = num + 30
    num = num + day



result = num % 5
print(num)
if result <= 3:
    print("dayu")
else:
    print("shaiwang")        
