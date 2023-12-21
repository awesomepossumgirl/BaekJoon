import sys
from collections import deque
input = sys.stdin.readline

N = int(input())
list_A = list(map(int, input().split()))
list_B = list(map(int, input().split()))

M = int(input())
list_C = list(map(int, input().split()))

result = deque()
for q in range(N):
    if list_A[q]==0:
        result.appendleft(list_B[q])

for i in range(M):
    result.append(list_C[i])
    print(result.popleft())