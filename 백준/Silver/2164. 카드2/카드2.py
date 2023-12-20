from collections import deque

N = int(input())
deque = deque([i for i in range(1, N+1)])

while(len(deque)>1):
    deque.popleft()
    temp = deque.popleft()
    deque.append(temp)
print(deque[0])
"""
#시간초과난 코드

N = int(input())
L = list(range(1,N+1))

while len(L)>1:
    L.pop(0)
    temp = L.pop(0)
    L.append(temp)

print(L.pop(0))
"""
