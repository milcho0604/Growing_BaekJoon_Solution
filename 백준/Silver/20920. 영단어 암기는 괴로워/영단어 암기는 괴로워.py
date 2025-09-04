import sys

input = sys.stdin.readline

# 이 방식으로 사용 X 
# n = int(input().split())
# m = int(input().split())

# 자바에서 st.nextToken() 사용하는 것과 거의 같은 방식
n, m = map(int, input().split())

myMap = {}

for _ in range(n):
    word = input().strip()
    if len(word) >= m:
        if word in myMap:
            myMap[word] +=1
        else:
            myMap[word] =1

# myList = list(myMap)
# 적용한 map을 정렬을 위해 list로 변환
myList = list(myMap.items())

# 정렬 1. 내림차순, 2. 길이 내림차순(길이가 긴 것 우선), 3. 알파벳 사전 순서
myList.sort(key=lambda x: (-x[1], -len(x[0]), x[0]))

# 앞 요소를 word에 넣어줌, 단어만(key만) 출력하기 위해서
for word, _ in myList:
    print(word)

