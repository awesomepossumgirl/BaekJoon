import sys
input = sys.stdin.readline

N = int(input())
data = []

_sum = 0
count = dict()
for i in range(N):
    x = int(input())
    data.append(x)

    _sum+=x

    if x not in count:
        count[x]=1
    else:
        count[x]+=1

data.sort()

print(round(_sum/N))

print(data[N//2])

freq = max(count.values())
nums = []
for key, value in count.items():
    if value==freq:
        nums.append(key)
if len(nums)==1:
    print(nums[0])
else:
    print(sorted(nums)[1])

print(data[-1]-data[0])
    