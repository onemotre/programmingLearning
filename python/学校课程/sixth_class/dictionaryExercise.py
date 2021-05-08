dic = {'k1':'v1','k2':'v2','k3':'v3'}
print(dic['k2'])
try:
    print(dic['k6'])
except Exception as err:
    print(err ," is not exist")
    

dic2 = {'k1':'v111','a':'b'}
dic2['k1'] = 'v1'
dic2['k2'] = 'v2'
dic2['k3'] = 'v3'
for x in dic:
    print(x,":",dic[x])