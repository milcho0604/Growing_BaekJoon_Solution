import sys
# for문에서 input()과 같은 역할로 입력을 받음
# sys.stdin은 
for line in sys.stdin:
    line = line.rstrip('\n') # 줄바꿈 제거
    lower = 0 
    upper = 0
    digit = 0
    space = 0
    for char in line:
        if char.islower():
            lower +=1
        elif char.isupper():
            upper +=1
        elif char.isdigit():
            digit +=1
        elif char == ' ':
            space +=1
    print(lower, upper, digit, space)