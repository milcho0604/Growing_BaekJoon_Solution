n = int(input())

m = 666
count = 0

while True:
    if '666' in str(m):
        count += 1
    
    if count == n:
        break

    m +=1 

print(m)
