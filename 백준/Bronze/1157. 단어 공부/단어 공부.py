word = input().strip().upper() # 단어 입력 + 공백 제거 + 대문자 변경
alpha_count = [0] * 26; # 26개 리스트로 선언

# word 만큼 반복문 시작 
for char in word: 
    # alpha_count[n]이 반복되는 횟수에 따라 +1 값을 줌
    # key-value 형식으로 이해할 것 (ord는 숫자로 변경)
    alpha_count[ord(char) - ord('A')] += 1 

# max 사용해서 alpha_count에서 value가 가장 큰 수를 찾음(+1이니까 커진 수 중에서 가장 큰 수) 
max_count = max(alpha_count) # 예로, max = 2로 가정 

# count 사용해서 alpha_count에서 max_count라는 value를 가진 key의 개수를 찾음 
# 1보다 크다면 2개 이상 '?' 출력
if(alpha_count.count(max_count) > 1):
    print('?')
else:
    max_index = alpha_count.index(max_count) # index를 사용해서 max_count를 갖고 있는 key(index)를 찾음
    temp = max_index + ord('A') # max_index의 값에 앞서 ord['A']를 빼줬던 값을 다시 더하기
    result = chr(temp) # 결과를 숫자에서 문자로 변경
    print(result)