import sys
input = sys.stdin.readline

n = int(input())
temp = []
for _ in range(n):
    name, korea, english, math = input().split()
    temp.append((name, int(korea), int(english), int(math)))

# -를 붙이면 내림차순
temp.sort(key=lambda x: (-x[1], x[2], -x[3], x[0]))

# 이름만을 출력하기 위해 아래와 같이 temp에서 요소를 name에 하나 넣고
# 거기서 0번째를 꺼낸다
for name in temp:
    print(name[0])

