import sys
input = sys.stdin.readline

#소수 골라내기 (에라토스테네스의 체 활용)
primeNum = [False, False] + [True]*999999

for i in range(2, 1000001):
    if primeNum[i]:
        for j in range(i*2, 1000001, i):
            primeNum[j] = False

T = int(input())
for i in range(T):
    count = 0
    N = int(input())
    for j in range(2, N//2+1):
        if primeNum[j] and primeNum[N-j]:
            count+=1
    print(count)
    
"""for j in range(i*2, 1000001, i)에서 
range 함수의 첫 번째 인자는 시작 값, 
두 번째 인자는 끝 값(범위에 포함되지 않음), 
세 번째 인자는 간격"""

"""이 range 함수는 4부터 1000000까지의 모든 정수를 2씩 증가시키면서 반복합니다. 
이는 2의 배수를 나타내며, 실제로는 4, 6, 8, 10, ..., 1000000까지의 값들을 생성합니다. 
이들은 모두 2의 배수이며, 소수가 아닌 숫자로 간주됩니다."""

"""중복 방지: 범위를 range(2, N//2+1)으로 설정함으로써, 
루프에서는 N의 절반까지만 반복하면서 중복을 피할 수 있습니다. 
예를 들어 N이 10인 경우, (3, 7)을 찾았을 때 
(7, 3)은 이미 고려된 경우이므로 중복이 발생하지 않게 됩니다."""
