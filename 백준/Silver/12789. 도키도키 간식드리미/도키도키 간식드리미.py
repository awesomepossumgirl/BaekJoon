import sys

N = int(input())
stack2 = []
count = 1

line = list(map(int,sys.stdin.readline().split()))
while line:
    if count == line[0]:
        count += 1
        line.pop(0)
    else:
        stack2.append(line.pop(0))

    while stack2:
        if stack2[-1] == count:
            stack2.pop()
            count += 1
        else:
            break

if len(stack2) == 0:
    print('Nice')
else:
    print('Sad')