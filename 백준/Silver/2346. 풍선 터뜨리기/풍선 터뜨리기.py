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

"""https://velog.io/@hygge/Python-%EB%B0%B1%EC%A4%80-2346-%ED%92%8D%EC%84%A0-%ED%84%B0%EB%9C%A8%EB%A6%AC%EA%B8%B0-deque"""
