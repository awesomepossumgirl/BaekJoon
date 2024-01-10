import sys
input = sys.stdin.readline

N = int(input())
roads = list(map(int,input().split()))
cost = list(map(int,input().split()))

min_price = roads[0]*cost[0]
min_cost = cost[0]

for i in range(1, N-1):
    if min_cost > cost[i]:
        min_cost = cost[i]

    min_price += min_cost * roads[i]

print(min_price)