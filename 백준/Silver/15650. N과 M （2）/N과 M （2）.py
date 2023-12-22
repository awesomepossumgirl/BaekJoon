N, M = map(int, input().split())
li = []

def dfs(start):
    if len(li)==M:
        print(' '.join(map(str,li)))
        return
    for i in range(start, N+1):
        if i not in li:
            li.append(i)
            dfs(i+1)
            li.pop()
dfs(1)

"""
#조합을 이용한 풀이
from itertools import combinations

N, M = map(int, input().split())

numList = [i for i in range(1, N+1)]
# [1, 2, 3, 4]

for seq in combinations(numList, M):
    print(*seq)
"""
