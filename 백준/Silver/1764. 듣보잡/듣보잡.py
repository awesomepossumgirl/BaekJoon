N, M = map(int,input().split())
no_see = set()
no_listen = set()

for _ in range(N):
    no_see.add(input())
for _ in range(M):
    no_listen.add(input())

no_see_listen = sorted(list(no_see&no_listen))

print(len(no_see_listen))
for i in no_see_listen:
    print(i)