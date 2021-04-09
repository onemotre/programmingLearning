def judgement(year):
    if (year % 4 == 0 and year % 100 != 0) or year % 400 == 0:
        return True
    else:
        return False


print(type(judgement(2020)))
print(judgement(int(input("type a num"))))

