import sys
input = sys.stdin.readline

N, K = map(int, input().split())

def factorial(n):
    while n>1:
        return n*factorial(n-1)
    else:
        return 1

print(factorial(N)//(factorial(N-K)*factorial(K)))