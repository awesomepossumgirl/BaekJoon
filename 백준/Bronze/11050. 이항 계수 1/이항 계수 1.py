import sys
input = sys.stdin.readline

N, K = map(int, input().split())

def factorial(n):
    while n>1:
        return n*factorial(n-1)
    else:
        return 1

print(factorial(N)//(factorial(N-K)*factorial(K)))

***(팩토리얼 재귀 함수를 정의해서 푸는 문제)
조합 공식 nCk = n!/(n-k)!k!로 풀기. 팩토리얼 값을 구해주는 재귀 함수 정의***
