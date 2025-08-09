import sys

def compute_rank(people):
    n = len(people)
    ranks = [0] * n # rank를 담을 리스트

    for i in range(n):
        w_i, h_i = people[i]
        rank = 1 # 기본 1등으로 설정을 하고 비교하면서 +1 하는 방식
        for j in range(n):
            w_j, h_j = people[j]
            if i == j: # 자기 자신과 비교할 경우는 continue
                continue
            if w_j > w_i and h_j > h_i:
                rank += 1 # j와 i를 무게와 키를 비교해서 나보다 더 큰 덩치가 있다면 rank +1
        ranks[i] = rank # 이 rank를 ranks에 넣어줌
    return ranks # 모든 반복이 끝나고 return

n = int(input())
# tuple 사용 파이썬 자료형 -> 리스트 사용해도 괜찮을 것 같음
# input().split()을 통해 공백 기준으로 문자열을 나눠서 리스트로 반환 -> "55 185".split()라면 ["55", "185"]
# map(int)는 리스트에 들어간 문자열을 int 정수로 변환
people = [tuple(map(int, input().split())) for _ in range (n)] 

result = compute_rank(people)
# *를 통해 출력 시에 공백을 추가해서 출력
print(*result)
