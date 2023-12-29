import sys
input = sys.stdin.readline

n = int(input())
peoples = list(map(int, input().split()))

peoples.sort()
result=0

for x in range(1,n+1):
    result+=sum(peoples[0:x])
print(result)