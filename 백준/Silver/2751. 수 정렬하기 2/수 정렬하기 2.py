import sys

input = sys.stdin.readline
n = int(input())

result = []

for _ in range(n):
    result.append(int(input()))

result.sort()

for i in result:
    print(i)

# for i in range(len(result)):
    # print(result[i])
    
    # 만약 한 줄로 1 2 3 4 5와 같이 출력하고 싶다면 아래 end 추가
    # print(result[i], end=' ')