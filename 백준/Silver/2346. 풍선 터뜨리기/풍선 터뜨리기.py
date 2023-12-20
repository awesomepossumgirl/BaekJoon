import sys
from collections import deque
input = sys.stdin.readline

N = int(input())
deq = deque(enumerate(map(int, input().split())))
result = []

while deq:
    idx, paper = deq.popleft()
    result.append(idx+1)

    if paper > 0:
        deq.rotate(-(paper-1))
    elif paper < 0:
        deq.rotate(-paper)

print(' '.join(map(str, result)))