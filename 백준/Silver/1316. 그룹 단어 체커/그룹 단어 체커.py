def search(word):
    # 있는지 확인하는 집합
    visitied = set()
    # 이전 문자
    before = " "

    for char in word:
        # 현재 문자 char와 이전 문자 before 같지 않다면 새로운 문자 등장. 즉, 연속하지 않음
        if(char != before):
            # char가 visited 집합에 존재하지 않았던 새로운 문자라면
            if(char not in visitied):
                visitied.add(char) # visited 집합에 char를 넣고
                before = char # before는 다음을 위해 현재 문자 char가 된다
            else:
                return False
    return True

n = int(input())
count = 0

# n번 반복
for _ in range(n):
    word = input()
    if(search(word)):
        count +=1
print(count)
