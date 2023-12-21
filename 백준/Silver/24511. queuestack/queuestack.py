import sys
from collections import deque
input = sys.stdin.readline

N = int(input())
list_A = list(map(int, input().split()))
list_B = list(map(int, input().split()))

M = int(input())
list_C = list(map(int, input().split()))

# list_a에서 0인 경우 deque의 왼쪽에 추가 (큐)
result = deque()

# 스택에 원소를 새로 넣었다 빼는 것은 무의미하므로 무시하고 큐만 고려하면 된다.
# 큐에 해당하는 원소들을 하나의 큐로 만든다.
# list_c의 원소를 deque에 차례로 추가하고, 왼쪽 끝의 원소를 출력하며 제거 (큐)
for q in range(N):
    if list_A[q]==0:
        result.appendleft(list_B[q])

for i in range(M):
    result.append(list_C[i])
    print(result.popleft())
