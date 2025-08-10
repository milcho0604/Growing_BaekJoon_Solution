n = int(input().strip())
result = []

for _ in range(n):
    x, y = input().split()
    # y = input().split() - 이렇게 적으면 틀림
    intx = int(x)
    inty = int(y)
    result.append((intx, inty))

result.sort() # x 오름차순, 같다면 y 오름차순

# 반드시 아래와 같이 출력
for i in range(len(result)):
    print(result[i][0], result[i][1])

