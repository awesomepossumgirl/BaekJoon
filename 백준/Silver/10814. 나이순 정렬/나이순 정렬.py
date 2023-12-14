
n = int(input())
mem_list=[]

for i in range(n):
    age, name = map(str, input().split())
    age=int(age)
    mem_list.append((age, name))

mem_list.sort(key=lambda x : x[0])

for i in mem_list:
    print(i[0],i[1])

"""
이 문제에서 짚고 넘어가야 하는 점은, stable 정렬과 unstable 정렬 방식이다.
stable 정렬은 말 그대로 안정 정렬이다. 안정 정렬에서는 입력 받은 값들 중에 같은 값이 있는 경우 해당 값의 순서를 그대로 유지한다.
예를 들어, [1, 2, 3(X), 4, 5, 3(Y)] 을 오름차순 정렬한다면, [1, 2, 3(X), 3(Y), 4, 5]순으로 세 번째 위치한 3의 위치와 여섯 번째 위치한 3의 위치가 바뀌지 않는다. unstalbe 정렬에서는 이러한 정렬을 장담할 수 없다.
파이썬은 기본적으로 stable 정렬을 한다는 점을 알아두면 좋다.

n = int(input())
member_lst = []

for i in range(n):
    member_lst.append(input())

member_lst.sort(key = lambda x : x[:3])	## 입력값 앞 세자리만 비교해 정렬

for i in member_lst:
    print(i)
입력값 맨 앞에는 나이가 자리하니까, 맨 앞 세자리만 비교해 정렬하면 되겠지, 하는 안일한 생각으로 제출한 오답.
나이를 한 자릿수만 입력하는 경우엔, 문자열 맨 앞 첫 자리까지 비교값으로 들어오기 때문에 오답으로 분류됐다.
"""
