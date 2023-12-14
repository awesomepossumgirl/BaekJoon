
n = int(input())
mem_list=[]

for i in range(n):
    age, name = map(str, input().split())
    age=int(age)
    mem_list.append((age, name))

mem_list.sort(key=lambda x : x[0])

for i in mem_list:
    print(i[0],i[1])