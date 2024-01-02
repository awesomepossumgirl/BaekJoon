import sys
input = sys.stdin.readline
N = int(input())
list = []
for _ in range(N):
    num = int(input())
    list.append(num)

stack=[]
max_value=0
for i in range(N):
    idx = i
    while stack and stack[-1][1] > list[i]:
        idx, height = stack.pop()
        rst = (i - idx) * height
        max_value = max(max_value, rst)
    stack.append([idx, list[i]])

while stack:
    idx, height = stack.pop()
    rst = (N -idx)*height
    max_value = max(max_value,rst)
print(max_value)