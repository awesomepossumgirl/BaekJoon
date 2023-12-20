import sys
from collections import deque

N, K = map(int, input().split())

deq = deque([i for i in range(1, N+1)])

result = []
while len(deq) !=0:
    for _ in range(K-1):
        deq.append(deq.popleft())
    result.append(str(deq.popleft()))

print('<'+', '.join(result)+'>')