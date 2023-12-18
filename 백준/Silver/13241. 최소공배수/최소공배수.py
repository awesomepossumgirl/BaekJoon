import sys

A, B = map(int, sys.stdin.readline().split())
ab = A * B

while B:
    A = A % B
    A, B = B, A

print(ab // A)