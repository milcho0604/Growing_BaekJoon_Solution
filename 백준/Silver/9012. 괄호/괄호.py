# 괄호 검사 함수 -> temp는 앞에 문자열
def check(temp):
    stack = []
    for i in temp:
        if i == '(':
            stack.append(i)
        else: # ')'인 경우
            if stack: # stack 비어있지 않다면 pop
                stack.pop()
            else:
                return False # stack이 비었는데 ')'라면 False retrun
    # temp 문자열 ()()을 전부 순회했는데도 stack이 비어있지 않다면 False return
    if stack:
        return False
    else:
        return True



n = int(input())
# 결과를 담을 배열
result = []

for _ in range(n):
    # ()() 와 같은 전체 문자열을 입력
    temp = input().strip()
    # 이 문자와 함께 check 함수 호출
    isVaild = check(temp)
    if isVaild:
        result.append('YES')
    else:
        result.append('NO')


for i in range(len(result)):
    print(result[i])