def say_hello():
    print("hello")

say_hello()

## diliver a parm
def say_sentence(sentence):
    return print(sentence)

sentence = "hello, my friend"
say_sentence(sentence)

## return a parm 
def sum(a,b):
    result = a + b
    return result

a = 1
b = 2
print(sum(a,b))