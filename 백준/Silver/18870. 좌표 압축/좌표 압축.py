import sys
n = int(sys.stdin.readline())
num = list(map(int, sys.stdin.readline().split())) 
"""표를 공백을 기준으로 분리하여 리스트형식으로 입력받는다."""
arr = sorted(set(num)) 
"""입력받은 좌표들을 중복을 제거하기 위해서 set형으로 바꿔준다."""
dic={arr[i]: i for i in range(len(arr))}
for i in num:
    print(dic[i], end=" ")