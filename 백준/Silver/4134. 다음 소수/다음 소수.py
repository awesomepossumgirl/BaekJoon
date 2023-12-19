import sys
input = sys.stdin.readline
N = int(input())

def check(x):
    for i in range(2, int(x**0.5)+1):
        if x%i ==0:
            return False
    return True

for i in range(N):
    n = int(input())
    while True:
        if n==0 or n==1:
            print(2)
            break
        if check(n):
            print(n)
            break
        else:
            n+=1

"""정수론을 이용해 해결하는 문제이다.
에라토스테네스의 체로 소수들을 미리 뽑아놓고 찾는방식으로 진행하려했지만 범위가 너무커서 시간초과가 떴다 ㅠㅠ
정수론에서 "임의의 양수 M이 합성수이면 √m 보다 작거나 같은 약수를 가진다." 라는 정리를 이용해
"임의의 양수 M이 √m 보다 작거나 같은 양수를 가지지 않으면 소수이다." 라는 결과를 이용한다

n이 0 또는 1일경우, 2 출력후 끝.
n이 √m 보다 작거나 같은 약수를 가지지 않으면 n 출력후 끝.
n이 √m 보다 작거나 같은 약수를 가지면 n+=1 후 2번으로 되돌아가기.
import sys"""
