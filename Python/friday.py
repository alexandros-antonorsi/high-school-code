n = 20
week = [1,0,0,0,0,0,0]
index = 0
for x in range(0,n):
    for y in range(1,13):
        days = 31
        if y == 2 and (x+1900)%4 == 0 and ((x+1900)%100 !=0 or (x+1900)%400==0):
            days = 29
        elif y==2:
            days = 28
        if y == 4 or y == 6 or y == 9 or y == 11:
            days = 30
        index += (days % 28)
        index %= 7
        week[index] += 1
week[index]-=1

print week