height = float(input("how high you are(m)"))
weight = float(input("how heavy you are(kg)"))
result = (weight/(height * height))
if result < 18.5:
    print("beyond average")
elif result < 26:
    print("normal")
elif result < 28:
    print("heavy")
elif result < 32:
    print("obesity")
else:
    print("over obesity")