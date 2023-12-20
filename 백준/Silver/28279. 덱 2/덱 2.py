import sys
from collections import deque

N = int(input())
deq = deque()
for i in range(N):
    num = list(map(int, sys.stdin.readline().rstrip().split()))
    l = len(deq)
    if num[0] == 1:
        deq.appendleft(num[1])
    elif num[0] == 2:
        deq.append(num[1])
    elif num[0] == 3:
        print(deq.popleft() if l else -1)
    elif num[0] == 4:
        print(deq.pop() if l else -1)
    elif num[0] == 5:
        print(l)
    elif num[0] == 6:
        print(0 if l else 1)
    elif num[0] == 7:
        print(deq[0] if l else -1)
    elif num[0] == 8:
        print(deq[-1] if l else -1)