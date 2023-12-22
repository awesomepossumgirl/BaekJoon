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