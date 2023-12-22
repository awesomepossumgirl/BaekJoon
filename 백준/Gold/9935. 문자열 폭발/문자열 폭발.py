import sys

S = sys.stdin.readline().rstrip()
boom = sys.stdin.readline().rstrip()

stack = []
boom_len = len(boom)

for i in range(len(S)):
    stack.append(S[i])
    if ''.join(stack[-boom_len:])==boom:
        for _ in range(boom_len):
            stack.pop()

if stack:
    print(''.join(stack))
else:
    print('FRULA')