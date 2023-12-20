import sys
input = sys.stdin.readline

N, M = map(int, input().strip().split())
word_list = {}

for _ in range(N):
    word = input().rstrip()
    if len(word) >= M:
        if word in word_list:
            word_list[word]+=1
        else:
            word_list[word] = 1
word_list = sorted(word_list.items(), key=lambda x:(-x[1], -len(x[0]), x[0]))

for word,count in word_list:
    print(word)

# x[0] = 단어, x[1] = 단어 빈도수
# -x[1] = 자주 나오는 단어 앞에 배치
# -len(x[0]) = 단어 길이 길수록 앞에 배치
# x[0] = 단어 사전 순 정렬

"""sorted 사용 시 다중 조건으로 정렬 가능하니 알아두자"""

